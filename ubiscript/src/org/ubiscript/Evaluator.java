package org.ubiscript;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.*;
import org.ubiscript.parser.*;
import java.util.*;

// TODO "."와 "()"의 모호성 문제 (".", "[]" 이 "()" 보다 우선순위에서 높아야할듯)
// TODO 전반적인 Ubiscript 런타임  오류 처리하기.
// TODO "typeof" 연산자 구문에 추가하고 구현하기. (Ref. ECMAScript Spec: 46 page)
// TODO try.catch.finally 구문 구현하기.
// TODO putValue에서 NetRef일 때 문제가 있을 가능성이 있음. 확인필요.

/**
 * An Evaluator for Ubiscript Code.
 * @author niklaus 
 */
public class Evaluator {
	
	private Tree currentNode;
	private EvaluatorDelegate evaluatorDelegate;
	
	public Evaluator() {
		currentNode = null;
		evaluatorDelegate = null;
	}
	
	public Tree getCurrentNode() {
		return currentNode;
	}
	
	public EvaluatorDelegate getEvaluatorDelegate() {
		return evaluatorDelegate;
	}
	
	public void setEvaluatorDelegate(EvaluatorDelegate evaluatorDelegate) {
		this.evaluatorDelegate = evaluatorDelegate;
	}
	
	private UbiObject getValue(UbiObject obj) throws UbiException {
		if (obj instanceof UbiRef) {
			UbiRef ref = (UbiRef) obj;
			UbiObject base = ref.getBase();
			if (base == null)
				UbiError.throwReferenceError(
						currentNode.getLine(), currentNode.getCharPositionInLine(), ref);
			if (ref.getNameOrIndex() == UbiRef.REF_BY_NAME)
				return getValue(base.get(ref.getName()));
			else
				return getValue(base.get(ref.getIndex()));
		} else if (obj instanceof UbiNetRef) {
			UbiNetRef ref = (UbiNetRef) obj;
			if (evaluatorDelegate == null)
				UbiError.throwRuntimeError(
						currentNode.getLine(), currentNode.getCharPositionInLine(),
						Messages.getString("error.runtime.nodelegate"));
			return evaluatorDelegate.delegateGet(ref);
		} else {
			return obj;
		}
	}
	
	private void putValue(UbiObject ref, UbiObject value) throws UbiException {
		if (ref instanceof UbiRef) {
			UbiRef r = (UbiRef) ref;
			UbiObject o = r.getBase();
			if (o == null)
				UbiError.throwReferenceError(
						currentNode.getLine(), currentNode.getCharPositionInLine(), r);
			if (r.getNameOrIndex() == UbiRef.REF_BY_NAME)
				o.put(r.getName(), value, Property.EMPTY);
			else
				o.put(r.getIndex(), value, Property.EMPTY);
		} else if (ref instanceof UbiNetRef) {
			UbiNetRef r = (UbiNetRef) ref;
			if (evaluatorDelegate == null)
				UbiError.throwRuntimeError(-1, -1,
						Messages.getString("error.runtime.nodelegate"));
			evaluatorDelegate.delegatePut(r, value);
		}
	}
	
	public UbiObject evaluateExpression(Environment env, String code) throws UbiException {
		UbiscriptLexer lex = new UbiscriptLexer(new ANTLRStringStream(code));
		CommonTokenStream tokens = new CommonTokenStream(lex);
		UbiscriptParser parser = new UbiscriptParser(tokens);
		try {
			UbiscriptParser.program_return r = parser.program();
			CommonTree tree = (CommonTree) r.getTree();            
			return evaluateExpression(env, tree);
		} catch (RecognitionException e) {
			UbiError.throwSyntaxError(e.line, e.charPositionInLine,
					parser.getErrorMessage(e, parser.getTokenNames()));
		}
		return null;
	}
	
	public void evaluateStatement(Environment env, String code) throws UbiException {
		UbiscriptLexer lex = new UbiscriptLexer(new ANTLRStringStream(code));
		CommonTokenStream tokens = new CommonTokenStream(lex);
		UbiscriptParser parser = new UbiscriptParser(tokens);
		try {
			UbiscriptParser.program_return r = parser.program();
			CommonTree tree = (CommonTree) r.getTree();            
			evaluateStatement(env, tree);
		} catch (RecognitionException e) {
			UbiError.throwSyntaxError(e.line, e.charPositionInLine, 
					parser.getErrorMessage(e, parser.getTokenNames()));
		}
	}
	
	public UbiObject evaluateExpression(Environment env, Tree t) throws UbiException {
		currentNode = t;
		UbiObject o1, o2;
		UbiObject[] args;
		Tree t1, t2, t3;
		switch (t.getType()) {
		case UbiscriptParser.INTEGER:
			return env.newNumber(Integer.parseInt(t.getText()));
		case UbiscriptParser.FLOAT:
			return env.newNumber(Double.parseDouble(t.getText()));
		case UbiscriptParser.STRING:
			return env.newString(UbiString.normalizeString(t.getText()));
		case UbiscriptParser.BOOLEAN:
			return env.newBoolean(Boolean.parseBoolean(t.getText()));
		case UbiscriptParser.ARRAY:
			args = new UbiObject[t.getChildCount()];
			for (int i = 0; i < t.getChildCount(); i++)
				args[i] = getValue(evaluateExpression(env, t.getChild(i)));
			return env.newArray(t.getChildCount(), args);
		case UbiscriptParser.FUN:
			t1 = t.getChild(0); // parameters (UbiscriptParser.PARAMS)
			t2 = t.getChild(1); // body
			String[] params = new String[t1.getChildCount()];
			for (int i = 0; i < t1.getChildCount(); i++) {
				params[i] = t1.getChild(i).getText();
			}
			return env.newFunction(params, t2, null);
		case UbiscriptParser.NULL:
			return env.getNull(); 
		case UbiscriptParser.ID:
			o1 = env.getCurrentScope().lookup(t.getText());
			if (o1 == null) {
				return env.getUndefined();
			} else {
				return env.newRef(o1, t.getText());
			}
		case UbiscriptParser.FIELD:
			o1 = getValue(evaluateExpression(env, t.getChild(0)));
			t1 = t.getChild(1);
			return env.newRef(o1, t1.getText());
		case UbiscriptParser.INDEX:
			o1 = getValue(evaluateExpression(env, t.getChild(0)));
			o2 = getValue(evaluateExpression(env, t.getChild(1)));
			if (o2 instanceof UbiString) {
				return env.newRef(o1, ((UbiString) o2).getValue());
			} else if (o2 instanceof UbiNumber) {
				return env.newRef(o1, ((UbiNumber) o2).toInt());
			} else {
				return env.newRef(o1, o2.toString());
			}
		case UbiscriptParser.CALL:
			o1 = evaluateExpression(env, t.getChild(0)); // function
			UbiObject thisObj = null;
			if (o1 instanceof UbiRef)
				thisObj = ((UbiRef) o1).getBase();
			if (o1 instanceof UbiActivation)
				thisObj = null;
			o1 = getValue(o1);
			// evaluate all arguments
			t1 = t.getChild(1); // UbiscriptParser.ARGS
			args = new UbiObject[t1.getChildCount()];
			for (int i = 0; i < t1.getChildCount(); i++) {
				args[i] = getValue(evaluateExpression(env, t1.getChild(i)));
			}
			UbiObject result = null;
			if (o1 instanceof UbiNetRef) { // remote function call
				if (evaluatorDelegate == null)
					UbiError.throwRuntimeError(t.getLine(), t.getCharPositionInLine(),
							Messages.getString("error.runtime.nodelegate"));
				result = evaluatorDelegate.delegateCall((UbiNetRef) o1, args);
			} else { // local function call
				result = o1.call(env, this, args, thisObj);
			}
			return result;
		case UbiscriptParser.NEW:
			t1 = t.getChild(0);
			if (t1.getType() != UbiscriptParser.CALL)
				UbiError.throwSyntaxError(t1.getLine(), t1.getCharPositionInLine(),
						Messages.getString("error.syntax.noconstructor"));
			t2 = t1.getChild(0); // function
			t3 = t1.getChild(1); // arguments (UbiscriptParser.ARGS)
			o1 = getValue(evaluateExpression(env, t2));
			// evaluate all arguments
			args = new UbiObject[t3.getChildCount()];
			for (int i = 0; i < t3.getChildCount(); i++) {
				args[i] = getValue(evaluateExpression(env, t3.getChild(i)));
			}
			// call constructor with arguments
			return o1.construct(env, this, args);
		case UbiscriptParser.UMINUS:
			o1 = getValue(evaluateExpression(env, t.getChild(0)));
			return env.newNumber(-o1.toInt());
		case UbiscriptParser.UPLUS:
			return getValue(evaluateExpression(env, t.getChild(0)));
		case UbiscriptParser.NOT:
			o1 = getValue(evaluateExpression(env, t.getChild(0)));
			return env.newBoolean(!o1.toBoolean());
		case UbiscriptParser.PLUS2:
			o1 = evaluateExpression(env, t.getChild(0));
			o2 = env.newNumber(getValue(o1).toNumber() + 1);
			putValue(o1, o2);
			return o2;
		case UbiscriptParser.MINUS2:
			o1 = evaluateExpression(env, t.getChild(0));
			o2 = env.newNumber((getValue(o1).toNumber() - 1));
			putValue(o1, o2);
			return o2;
		case UbiscriptParser.PLUS:
			o1 = getValue(evaluateExpression(env, t.getChild(0)));
			o2 = getValue(evaluateExpression(env, t.getChild(1)));
			if ((o1 instanceof UbiString) || (o2 instanceof UbiString)) {
				return env.newString(o1.toString() + o2.toString());
			} else {
				return env.newNumber(o1.toNumber() + o2.toNumber());
			}
		case UbiscriptParser.MINUS:
			o1 = getValue(evaluateExpression(env, t.getChild(0)));
			o2 = getValue(evaluateExpression(env, t.getChild(1)));
			return env.newNumber(o1.toNumber() - o2.toNumber());
		case UbiscriptParser.MULT:
			o1 = getValue(evaluateExpression(env, t.getChild(0)));
			o2 = getValue(evaluateExpression(env, t.getChild(1)));
			return env.newNumber(o1.toNumber() * o2.toNumber());
		case UbiscriptParser.DIV:
			o1 = getValue(evaluateExpression(env, t.getChild(0)));
			o2 = getValue(evaluateExpression(env, t.getChild(1)));
			return env.newNumber(o1.toNumber() / o2.toNumber());
		case UbiscriptParser.PERCENT:
			o1 = getValue(evaluateExpression(env, t.getChild(0)));
			o2 = getValue(evaluateExpression(env, t.getChild(1)));
			return env.newNumber(o1.toNumber() % o2.toNumber());
		case UbiscriptParser.EQ2:
			o1 = getValue(evaluateExpression(env, t.getChild(0)));
			o2 = getValue(evaluateExpression(env, t.getChild(1)));
			return env.newBoolean(o1.equals(o2));
		case UbiscriptParser.NOTEQ:
			o1 = getValue(evaluateExpression(env, t.getChild(0)));
			o2 = getValue(evaluateExpression(env, t.getChild(1)));
			return env.newBoolean(!o1.equals(o2));
		case UbiscriptParser.GT:
			o1 = getValue(evaluateExpression(env, t.getChild(0)));
			o2 = getValue(evaluateExpression(env, t.getChild(1)));
			return env.newBoolean(o1.toNumber() > o2.toNumber());
		case UbiscriptParser.GTEQ:
			o1 = getValue(evaluateExpression(env, t.getChild(0)));
			o2 = getValue(evaluateExpression(env, t.getChild(1)));
			return env.newBoolean(o1.toNumber() >= o2.toNumber());
		case UbiscriptParser.LT:
			o1 = getValue(evaluateExpression(env, t.getChild(0)));
			o2 = getValue(evaluateExpression(env, t.getChild(1)));
			return env.newBoolean(o1.toNumber() < o2.toNumber());
		case UbiscriptParser.LTEQ:
			o1 = getValue(evaluateExpression(env, t.getChild(0)));
			o2 = getValue(evaluateExpression(env, t.getChild(1)));
			return env.newBoolean(o1.toNumber() <= o2.toNumber());
		case UbiscriptParser.AND:
			o1 = getValue(evaluateExpression(env, t.getChild(0)));
			o2 = getValue(evaluateExpression(env, t.getChild(1)));
			return env.newBoolean(o1.toBoolean() && o2.toBoolean());
		case UbiscriptParser.OR:
			o1 = getValue(evaluateExpression(env, t.getChild(0)));
			o2 = getValue(evaluateExpression(env, t.getChild(1)));
			return env.newBoolean(o1.toBoolean() || o2.toBoolean());
		case UbiscriptParser.COMMA:
			o1 = getValue(evaluateExpression(env, t.getChild(0)));
			o2 = getValue(evaluateExpression(env, t.getChild(1)));
			return o2;
		case UbiscriptParser.EQ: // assignment
			Tree lhs = t.getChild(0);
			Tree rhs = t.getChild(1);
			o1 = evaluateExpression(env, lhs);
			o2 = getValue(evaluateExpression(env, rhs));
			putValue(o1, o2);
		default:
			return null;
		}
	}
	
	public void evaluateStatement(Environment env, Tree t) throws UbiException {
		currentNode = t;
		UbiObject o1;
		String id;
		Tree t1, t2, t3, t4;
		switch (t.getType()) {
		case UbiscriptParser.EXPR:
			evaluateExpression(env, t.getChild(0));
			break;
		case UbiscriptParser.BLOCK:
			for (int i = 0; i < t.getChildCount(); i++) {
				evaluateStatement(env, t.getChild(i));
			}
			break;
		case UbiscriptParser.IF:
			t1 = t.getChild(0); // expression
			t2 = t.getChild(1); // then
			t3 = (t.getChildCount() > 2) ? t.getChild(2) : null; // else
			o1 = getValue(evaluateExpression(env, t1));
			if (o1.toBoolean()) {
				evaluateStatement(env, t2);
			} else {
				if (t3 != null) evaluateStatement(env, t3);
			}
			break;
		case UbiscriptParser.FOR:
			t1 = (t.getChildCount() > 0) ? t.getChild(0) : null; // for-init or for-vars
			t2 = (t.getChild(1).getChildCount() == 1) ? t.getChild(1).getChild(0) : null; // for-cond
			t3 = (t.getChild(2).getChildCount() == 1) ? t.getChild(2).getChild(0) : null; // for-update
			t4 = t.getChild(3); // statement
			if (t1.getType() == UbiscriptParser.INIT) { // for-init
				if (t1.getChildCount() > 0)
					evaluateExpression(env, t1.getChild(0));
			} else if (t1.getType() == UbiscriptParser.VARS) { // for-vars
				for (int i = 0; i < t1.getChildCount(); i++)
					evaluateStatement(env, t1.getChild(i));
			}
			UbiObject cond = getValue(evaluateExpression(env, t2));
			try {
				while (cond.toBoolean()) {
					evaluateStatement(env, t4);
					evaluateExpression(env, t3); // evaluate for-update
					cond = getValue(evaluateExpression(env, t2)); // evaluate for-cond
				}
			} catch(UbiBreak e) {
				// break the loop
			}
			break;
		case UbiscriptParser.FOREACH:
			t1 = t.getChild(0); // id
			t2 = t.getChild(1); // expression
			t3 = t.getChild(2); // statement
			o1 = getValue(evaluateExpression(env, t2));
			id = t1.getText();
			if (o1 instanceof NativeArray) {
				// enumerate elements in array
				NativeArray array = (NativeArray) o1;
				try {
					for (int i = 0; i < array.getLength(); i++) {
						try {
							env.getCurrentScope().put(id, array.get(i), Property.EMPTY);
							evaluateStatement(env, t3);
						} catch (UbiContinue e) {
							// continue the loop
						}
					}
				} catch(UbiBreak e) {
					// break the loop
				}
			} else {
				// enumerate properties in object
				Property[] props = o1.getProperties();
				for (int i = 0; i < props.length; i++)
					if (!props[i].hasAttribute(Property.DONTENUM)) {
						env.getCurrentScope().put(id, props[i].getValue(), Property.EMPTY);
						evaluateStatement(env, t3);
					}
			}
			break;
		case UbiscriptParser.WHILE:
			t1 = t.getChild(0); // expression
			t2 = t.getChild(1); // statement
			o1 = getValue(evaluateExpression(env, t1));
			try {
				while (o1.toBoolean()) {
					evaluateStatement(env, t2);
					o1 = getValue(evaluateExpression(env, t1));
				}
			} catch(UbiBreak e) {
				// break the loop
			}
			break;
		case UbiscriptParser.VARDEF:
			t1 = t.getChild(0); // identifier
			t2 = (t.getChildCount() > 1) ? t.getChild(1) : null; // expression
			id = t1.getText();
			if (t2 != null) {
				o1 = getValue(evaluateExpression(env, t2));
				env.getCurrentScope().put(id, o1, Property.EMPTY);
			} else {
				env.getCurrentScope().put(id, env.getUndefined(), Property.EMPTY);
			}
			break;
		case UbiscriptParser.FUNDEF:
			t1 = t.getChild(0); // identifier
			t2 = t.getChild(1); // parameters (UbiscriptParser.PARAMS)
			t3 = t.getChild(2); // body
			String funid = t1.getText();
			String[] params = new String[t2.getChildCount()];
			for (int i = 0; i < t2.getChildCount(); i++) {
				params[i] = t2.getChild(i).getText();
			}
			o1 = env.newFunction(params, t3, null);
			env.getCurrentScope().put(funid, o1, Property.EMPTY);
			break;
		case UbiscriptParser.RETURN:
			t1 = (t.getChildCount() > 0) ? t.getChild(0) : null;
			if (t1 != null) {
				o1 = getValue(evaluateExpression(env, t1));
				throw env.newReturn(o1);
			} else {
				throw env.newReturn(env.getUndefined());
			}
		case UbiscriptParser.BREAK:
			throw env.newBreak();
		case UbiscriptParser.CONTINUE:
			throw env.newContinue();
		case UbiscriptParser.ON:
			t1 = t.getChild(0); // expression
			t2 = t.getChild(1); // block
			o1 = getValue(evaluateExpression(env, t1));
			if (!(o1 instanceof NativePlace))
				UbiError.throwRuntimeError(t1.getLine(), t1.getCharPositionInLine(), 
						Messages.getString("error.runtime.type.place"));
			NativePlace p = (NativePlace) o1;
			String code = encodeTree(t2);
			// get free variables
			Set<String> vars = new HashSet<String>();
			FV(t2, vars);
			String[] names = vars.toArray(new String[0]);
			UbiObject[] values = new UbiObject[names.length];
			for (int i = 0; i < names.length; i++) {
				values[i] = env.getCurrentScope().lookup(names[i]);
			}
			if (evaluatorDelegate == null)
				UbiError.throwRuntimeError(t.getLine(), t.getCharPositionInLine(),
						Messages.getString("error.runtime.nodelegate"));
			evaluatorDelegate.delegateExecute(p, names, values, code);
			break;
		}
	}
	
	public void FV(Tree t, Set<String> vars) throws UbiException {
		Tree t1, t2, t3, t4;
		if (t == null) return;
		switch (t.getType()) {
		case UbiscriptParser.INTEGER:
			break;
		case UbiscriptParser.FLOAT:
			break;
		case UbiscriptParser.STRING:
			break;
		case UbiscriptParser.BOOLEAN:
			break;
		case UbiscriptParser.ARRAY:
			for (int i = 0; i < t.getChildCount(); i++) {
				FV(t.getChild(i), vars);
			}
			break;
		case UbiscriptParser.FUN:
			t1 = t.getChild(0); // parameters
			t2 = t.getChild(1); // body
			FV(t2, vars);
			for (int i = 0; i < t1.getChildCount(); i++) {
				vars.remove(t1.getChild(i).getText());
			}
		case UbiscriptParser.NULL:
			break;
		case UbiscriptParser.ID:
			vars.add(t.getText());
			break;
		case UbiscriptParser.FIELD:
			t1 = t.getChild(0);
			FV(t1, vars);
			break;
		case UbiscriptParser.INDEX:
			t1 = t.getChild(0);
			FV(t1, vars);
			break;
		case UbiscriptParser.CALL:
			t1 = t.getChild(0); // function
			t2 = t.getChild(1); // arguments
			for (int i = 0; i < t2.getChildCount(); i++) {
				FV(t2.getChild(i), vars);
			}
			FV(t1, vars);
			break;
		case UbiscriptParser.NEW:
			t1 = t.getChild(0); // function call
			FV(t1, vars);
			break;
		case UbiscriptParser.UMINUS:
			FV(t.getChild(0), vars);
			break;
		case UbiscriptParser.UPLUS:
			FV(t.getChild(0), vars);
			break;
		case UbiscriptParser.NOT:
			FV(t.getChild(0), vars);
			break;
		case UbiscriptParser.PLUS2:
			FV(t.getChild(0), vars);
			break;
		case UbiscriptParser.MINUS2:
			FV(t.getChild(0), vars);
			break;
		case UbiscriptParser.PLUS:
			FV(t.getChild(0), vars);
			FV(t.getChild(1), vars);
			break;
		case UbiscriptParser.MINUS:
			FV(t.getChild(0), vars);
			FV(t.getChild(1), vars);
			break;
		case UbiscriptParser.MULT:
			FV(t.getChild(0), vars);
			FV(t.getChild(1), vars);
			break;
		case UbiscriptParser.DIV:
			FV(t.getChild(0), vars);
			FV(t.getChild(1), vars);
			break;
		case UbiscriptParser.PERCENT:
			FV(t.getChild(0), vars);
			FV(t.getChild(1), vars);
			break;
		case UbiscriptParser.EQ2:
			FV(t.getChild(0), vars);
			FV(t.getChild(1), vars);
			break;
		case UbiscriptParser.NOTEQ:
			FV(t.getChild(0), vars);
			FV(t.getChild(1), vars);
			break;
		case UbiscriptParser.GT:
			FV(t.getChild(0), vars);
			FV(t.getChild(1), vars);
			break;
		case UbiscriptParser.GTEQ:
			FV(t.getChild(0), vars);
			FV(t.getChild(1), vars);
			break;
		case UbiscriptParser.LT:
			FV(t.getChild(0), vars);
			FV(t.getChild(1), vars);
			break;
		case UbiscriptParser.LTEQ:
			FV(t.getChild(0), vars);
			FV(t.getChild(1), vars);
			break;
		case UbiscriptParser.AND:
			FV(t.getChild(0), vars);
			FV(t.getChild(1), vars);
			break;
		case UbiscriptParser.OR:
			FV(t.getChild(0), vars);
			FV(t.getChild(1), vars);
			break;
		case UbiscriptParser.COMMA:
			FV(t.getChild(0), vars);
			FV(t.getChild(1), vars);
			break;
		case UbiscriptParser.EQ:
			FV(t.getChild(0), vars);
			FV(t.getChild(1), vars);
			break;
		case UbiscriptParser.EXPR:
			FV(t.getChild(0), vars);
			break;
		case UbiscriptParser.BLOCK:
			for (int i = (t.getChildCount()-1); i >= 0; i--) {
				FV(t.getChild(i), vars);
			}
			break;
		case UbiscriptParser.IF:
			t1 = t.getChild(0); // expression
			t2 = t.getChild(1); // then
			t3 = (t.getChildCount() > 2) ? t.getChild(2) : null; // else
			FV(t3, vars);
			FV(t2, vars);
			FV(t1, vars);
			break;
		case UbiscriptParser.FOR:
			t1 = (t.getChildCount() > 0) ? t.getChild(0) : null; // for-init or for-vars
			t2 = (t.getChild(1).getChildCount() == 1) ? t.getChild(1).getChild(0) : null; // for-cond
			t3 = (t.getChild(2).getChildCount() == 1) ? t.getChild(2).getChild(0) : null; // for-update
			t4 = t.getChild(3); // statement
			FV(t4, vars);
			FV(t3, vars);
			FV(t2, vars);
			if (t1.getType() == UbiscriptParser.VARS) { // for-vars
				for (int i = 0; i < t1.getChildCount(); i++)
					FV(t1.getChild(i), vars);
			} else { // for-init
				if (t1.getChildCount() > 0)
					FV(t1.getChild(0), vars);
			}
			break;
		case UbiscriptParser.FOREACH:
			t1 = t.getChild(0); // id
			t2 = t.getChild(1); // expression
			t3 = t.getChild(2); // statement
			FV(t3, vars);
			FV(t2, vars);
			vars.remove(t1.getText());
			break;
		case UbiscriptParser.WHILE:
			t1 = t.getChild(0); // expression
			t2 = t.getChild(1); // statement
			FV(t2, vars);
			FV(t1, vars);
			break;
		case UbiscriptParser.VARDEF:
			t1 = t.getChild(0); // identifier
			t2 = (t.getChildCount() > 1) ? t.getChild(1) : null; // expression
			FV(t2, vars);
			vars.remove(t1.getText());
			break;
		case UbiscriptParser.FUNDEF:
			t1 = t.getChild(0); // identifier
			t2 = t.getChild(1); // parameters
			t3 = t.getChild(2); // body
			FV(t3, vars);
			for (int i = 0; i < t2.getChildCount(); i++) {
				vars.remove(t2.getChild(i).getText());
			}
			vars.remove(t1.getText());
			break;
		case UbiscriptParser.RETURN:
			t1 = (t.getChildCount() > 0) ? t.getChild(0) : null;
			FV(t1, vars);
			break;
		case UbiscriptParser.BREAK:
			break;
		case UbiscriptParser.CONTINUE:
			break;
		case UbiscriptParser.ON:
			t1 = t.getChild(0); // expression
			t2 = t.getChild(1); // block
			FV(t2, vars);
			FV(t1, vars);
			break;
		}
	}
	
	public String encodeTree(Tree t) {
		String s = "";
		String params = "";
		Tree t1, t2, t3, t4;
		if (t == null) return "";
		switch (t.getType()) {
		// expression
		case UbiscriptParser.INTEGER:
			return t.getText();
		case UbiscriptParser.FLOAT:
			return t.getText();
		case UbiscriptParser.STRING:
			return t.getText();
		case UbiscriptParser.BOOLEAN:
			return t.getText();
		case UbiscriptParser.ARRAY:
			s = "";
			for (int i = 0; i < t.getChildCount(); i++) {
				if (i == 0)
					s = encodeTree(t.getChild(i));
				else
					s = s + ", " + encodeTree(t.getChild(i));
			}
			return "[" + s + "]";
		case UbiscriptParser.FUN:
			t1 = t.getChild(0); // parameters
			t2 = t.getChild(1); // body
			params = "";
			for (int i = 0; i < t1.getChildCount(); i++) {
				if (i == 0)
					params = t1.getChild(i).getText();
				else
					params = params + ", " + t1.getChild(i);
			}
			s = "function(" + params + ") {\n" + encodeTree(t2) + "\n}\n";
			return s;
		case UbiscriptParser.NULL:
			return t.getText();
		case UbiscriptParser.ID:
			return t.getText();
		case UbiscriptParser.FIELD:
			return "(" + encodeTree(t.getChild(0)) + "." + encodeTree(t.getChild(1)) + ")";
		case UbiscriptParser.INDEX:
			return encodeTree(t.getChild(0)) + "[" + encodeTree(t.getChild(1)) + "]";
		case UbiscriptParser.CALL:
			s = encodeTree(t.getChild(0));
			t1 = t.getChild(1);
			params = "";
			for (int i = 0; i < t1.getChildCount(); i++) {
				if (i == 0)
					params = encodeTree(t1.getChild(i));
				else
					params = params + ", " + encodeTree(t1.getChild(i));
			}
			return s + "(" + params + ")";
		case UbiscriptParser.NEW:
			return "(new " + encodeTree(t.getChild(0)) + ")";
		case UbiscriptParser.UMINUS:
			return "-" + encodeTree(t.getChild(0)) + "";
		case UbiscriptParser.UPLUS:
			return encodeTree(t.getChild(0));
		case UbiscriptParser.NOT:
			return "(!" + encodeTree(t.getChild(0)) + ")";
		case UbiscriptParser.PLUS2:
			return "(" + encodeTree(t.getChild(0)) + "++)";
		case UbiscriptParser.MINUS2:
			return "(" + encodeTree(t.getChild(0)) + "--)";
		case UbiscriptParser.PLUS:
			return "(" + encodeTree(t.getChild(0)) + "+" + encodeTree(t.getChild(1)) + ")";
		case UbiscriptParser.MINUS:
			return "(" + encodeTree(t.getChild(0)) + "-" + encodeTree(t.getChild(1)) + ")";
		case UbiscriptParser.MULT:
			return "(" + encodeTree(t.getChild(0)) + "*" + encodeTree(t.getChild(1)) + ")";
		case UbiscriptParser.DIV:
			return "(" + encodeTree(t.getChild(0)) + "/" + encodeTree(t.getChild(1)) + ")";
		case UbiscriptParser.PERCENT:
			return "(" + encodeTree(t.getChild(0)) + "%" + encodeTree(t.getChild(1)) + ")";
		case UbiscriptParser.EQ2:
			return "(" + encodeTree(t.getChild(0)) + "==" + encodeTree(t.getChild(1)) + ")";
		case UbiscriptParser.NOTEQ:
			return "(" + encodeTree(t.getChild(0)) + "!=" + encodeTree(t.getChild(1)) + ")";
		case UbiscriptParser.GT:
			return "(" + encodeTree(t.getChild(0)) + ">" + encodeTree(t.getChild(1)) + ")";
		case UbiscriptParser.GTEQ:
			return "(" + encodeTree(t.getChild(0)) + ">=" + encodeTree(t.getChild(1)) + ")";
		case UbiscriptParser.LT:
			return "(" + encodeTree(t.getChild(0)) + "<" + encodeTree(t.getChild(1)) + ")";
		case UbiscriptParser.LTEQ:
			return "(" + encodeTree(t.getChild(0)) + "<=" + encodeTree(t.getChild(1)) + ")";
		case UbiscriptParser.AND:
			return "(" + encodeTree(t.getChild(0)) + "&&" + encodeTree(t.getChild(1)) + ")";
		case UbiscriptParser.OR:
			return "(" + encodeTree(t.getChild(0)) + "||" + encodeTree(t.getChild(1)) + ")";
		case UbiscriptParser.COMMA:
			return "(" + encodeTree(t.getChild(0)) + ", " + encodeTree(t.getChild(1)) + ")";
		case UbiscriptParser.EQ:
			return "(" + encodeTree(t.getChild(0)) + "=" + encodeTree(t.getChild(1)) + ")";
		// statement
		case UbiscriptParser.EXPR:
			return encodeTree(t.getChild(0)) + ";\n";
		case UbiscriptParser.BLOCK:
			s = "";
			for (int i = 0; i < t.getChildCount(); i++) {
				s = s + encodeTree(t.getChild(i));
			}
			return s;
		case UbiscriptParser.IF:
			t1 = t.getChild(0); // expression
			t2 = t.getChild(1); // then
			t3 = (t.getChildCount() > 2) ? t.getChild(2) : null; // else
			s = "if (" + encodeTree(t1) + ") {\n";
			s = s + encodeTree(t2) + "{";
			if (t3 != null)
				s = s + " else {\n" + encodeTree(t3) + "}";
			else
				s = s + "\n";
			return s;
		case UbiscriptParser.FOR:
			t1 = (t.getChildCount() > 0) ? t.getChild(0) : null; // for-init or for-vars
			// t1 = (t.getChild(0).getChildCount() == 1) ? t.getChild(0).getChild(0) : null; // for-init
			t2 = (t.getChild(1).getChildCount() == 1) ? t.getChild(1).getChild(0) : null; // for-cond
			t3 = (t.getChild(2).getChildCount() == 1) ? t.getChild(2).getChild(0) : null; // for-update
			t4 = t.getChild(3); // statement
			if (t1.getType() == UbiscriptParser.VARS) { // for-vars
				s = "for(var ";
				for (int i = 0; i < t1.getChildCount(); i++) {
					s = s + encodeTree(t1.getChild(i).getChild(0)); // VARDEF (id)
					s = s + "=" + encodeTree(t1.getChild(i).getChild(1)); // VARDEF (expr)
					if (i < (t1.getChildCount() - 1))
						s = s + ",";
				}
				s = s + ";" + encodeTree(t2) + ";" + encodeTree(t3) + ") {\n";
				s = s + encodeTree(t4) + "}\n";
			} else { // for-init
				s = "for(" + encodeTree(t1.getChild(0)) + ";" + encodeTree(t2) + ";" + encodeTree(t3) + ") {\n";
				s = s + encodeTree(t4) + "}\n";
			}
			return s;
		case UbiscriptParser.FOREACH:
			t1 = t.getChild(0); // id
			t2 = t.getChild(1); // expression
			t3 = t.getChild(2); // statement
			s = "foreach(" + encodeTree(t1) + " in " + encodeTree(t2) + ") {\n";
			s = s + encodeTree(t3) + "}\n";
			return s;
		case UbiscriptParser.WHILE:
			t1 = t.getChild(0); // expression
			t2 = t.getChild(1); // statement
			s = "while(" + encodeTree(t1) + ") {\n";
			s = s + encodeTree(t2) + "}\n";
			return s;
		case UbiscriptParser.VARDEF:
			t1 = t.getChild(0); // identifier
			t2 = (t.getChildCount() > 1) ? t.getChild(1) : null; // expression
			s = "var " + encodeTree(t1);
			if (t2 != null)
				s = s + " = " + encodeTree(t2) + ";\n";
			else
				s = s + ";\n";
			return s;
		case UbiscriptParser.FUNDEF:
			t1 = t.getChild(0); // identifier
			t2 = t.getChild(1); // parameters
			t3 = t.getChild(2); // body
			params = "";
			for (int i = 0; i < t2.getChildCount(); i++) {
				if (i == 0)
					params = t2.getChild(i).getText();
				else
					params = params + ", " + t2.getChild(i);
			}
			s = "function " + encodeTree(t1) + "(" + params + ") {\n";
			s = s + encodeTree(t3) + "}\n";
			return s;
		case UbiscriptParser.RETURN:
			return "return (" + encodeTree(t.getChild(0)) + ");";
		case UbiscriptParser.BREAK:
			return "break;";
		case UbiscriptParser.CONTINUE:
			return "continue;";
		case UbiscriptParser.ON:
			t1 = t.getChild(0); // expression
			t2 = t.getChild(1); // block
			s = "on(" + encodeTree(t1) + ") {\n";
			s = s + encodeTree(t2) + "}\n";
			return s;
		default:
			return "";
		}
	}
}
