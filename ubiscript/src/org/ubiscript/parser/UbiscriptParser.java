// $ANTLR 3.0.1 C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g 2008-05-11 14:25:43

package org.ubiscript.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class UbiscriptParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "EXPR", "BLOCK", "VARDEF", "FUNDEF", "IF", "FOR", "INIT", "VARS", "COND", "UPD", "FOREACH", "WHILE", "RETURN", "BREAK", "CONTINUE", "ON", "CALL", "ARGS", "INDEX", "FIELD", "FUN", "PARAMS", "UMINUS", "UPLUS", "NEW", "ARRAY", "DELETE", "TYPEOF", "COMMA", "EQ", "PLUSEQ", "MINUSEQ", "MULTEQ", "DIVEQ", "PERCENTEQ", "QUESTION", "OR", "AND", "EQ2", "NOTEQ", "LT", "LTEQ", "GT", "GTEQ", "PLUS", "MINUS", "MULT", "DIV", "PERCENT", "NOT", "MINUS2", "PLUS2", "ID", "NULL", "BOOLEAN", "INTEGER", "FLOAT", "STRING", "LETTER", "DIGIT", "EXPONENT", "ESC", "LINE_COMMENT", "WS", "';'", "'{'", "'}'", "'if'", "'('", "')'", "'else'", "'for'", "'var'", "'foreach'", "'in'", "'while'", "'function'", "'return'", "'break'", "'continue'", "'on'", "':'", "'delete'", "'typeof'", "'['", "']'", "'.'", "'new'"
    };
    public static final int EXPONENT=64;
    public static final int LT=44;
    public static final int WHILE=15;
    public static final int LETTER=62;
    public static final int ESC=65;
    public static final int DIVEQ=37;
    public static final int LTEQ=45;
    public static final int NEW=28;
    public static final int FOR=9;
    public static final int FLOAT=60;
    public static final int NOT=53;
    public static final int ID=56;
    public static final int AND=41;
    public static final int EOF=-1;
    public static final int BREAK=17;
    public static final int PLUSEQ=34;
    public static final int UPD=13;
    public static final int IF=8;
    public static final int INDEX=22;
    public static final int BOOLEAN=58;
    public static final int EXPR=4;
    public static final int CONTINUE=18;
    public static final int COMMA=32;
    public static final int RETURN=16;
    public static final int ARGS=21;
    public static final int PLUS=48;
    public static final int DIGIT=63;
    public static final int MINUS2=54;
    public static final int EQ=33;
    public static final int VARDEF=6;
    public static final int PLUS2=55;
    public static final int ARRAY=29;
    public static final int PARAMS=25;
    public static final int INTEGER=59;
    public static final int PERCENT=52;
    public static final int LINE_COMMENT=66;
    public static final int UPLUS=27;
    public static final int VARS=11;
    public static final int MULTEQ=36;
    public static final int NULL=57;
    public static final int ON=19;
    public static final int UMINUS=26;
    public static final int DELETE=30;
    public static final int MULT=50;
    public static final int MINUS=49;
    public static final int GTEQ=47;
    public static final int EQ2=42;
    public static final int NOTEQ=43;
    public static final int WS=67;
    public static final int QUESTION=39;
    public static final int PERCENTEQ=38;
    public static final int TYPEOF=31;
    public static final int FUNDEF=7;
    public static final int BLOCK=5;
    public static final int OR=40;
    public static final int GT=46;
    public static final int FIELD=23;
    public static final int FOREACH=14;
    public static final int CALL=20;
    public static final int DIV=51;
    public static final int FUN=24;
    public static final int COND=12;
    public static final int INIT=10;
    public static final int STRING=61;
    public static final int MINUSEQ=35;

        public UbiscriptParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[35+1];
         }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g"; }

    
    protected void mismatch(IntStream input, int ttype, BitSet follow) throws RecognitionException {
    	throw new MismatchedTokenException(ttype, input);
    }
    public void recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow) throws RecognitionException {
    	throw e;
    }


    public static class lineInput_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start lineInput
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:61:1: lineInput : ( ( statement )=> statement | expression );
    public final lineInput_return lineInput() throws RecognitionException {
        lineInput_return retval = new lineInput_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        statement_return statement1 = null;

        expression_return expression2 = null;



        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:62:2: ( ( statement )=> statement | expression )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:62:4: ( statement )=> statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_lineInput172);
                    statement1=statement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, statement1.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:63:4: expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_lineInput177);
                    expression2=expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expression2.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        	throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end lineInput

    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start program
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:66:1: program : ( statement )* -> ^( BLOCK ( statement )* ) ;
    public final program_return program() throws RecognitionException {
        program_return retval = new program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        statement_return statement3 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:67:2: ( ( statement )* -> ^( BLOCK ( statement )* ) )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:67:4: ( statement )*
            {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:67:4: ( statement )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=PLUS && LA2_0<=MINUS)||(LA2_0>=NOT && LA2_0<=STRING)||(LA2_0>=68 && LA2_0<=69)||(LA2_0>=71 && LA2_0<=72)||(LA2_0>=75 && LA2_0<=77)||(LA2_0>=79 && LA2_0<=84)||(LA2_0>=86 && LA2_0<=88)||LA2_0==91) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:67:4: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_program188);
            	    statement3=statement();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_statement.add(statement3.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 68:3: -> ^( BLOCK ( statement )* )
            {
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:68:6: ^( BLOCK ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(BLOCK, "BLOCK"), root_1);

                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:68:14: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.next());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        	throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end program

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start statement
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:71:1: statement : ( emptyStatement | expressionStatement | block | ifStatement | iterationStatement | variableStatement | functionStatement | jumpStatement | onStatement );
    public final statement_return statement() throws RecognitionException {
        statement_return retval = new statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        emptyStatement_return emptyStatement4 = null;

        expressionStatement_return expressionStatement5 = null;

        block_return block6 = null;

        ifStatement_return ifStatement7 = null;

        iterationStatement_return iterationStatement8 = null;

        variableStatement_return variableStatement9 = null;

        functionStatement_return functionStatement10 = null;

        jumpStatement_return jumpStatement11 = null;

        onStatement_return onStatement12 = null;



        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:72:2: ( emptyStatement | expressionStatement | block | ifStatement | iterationStatement | variableStatement | functionStatement | jumpStatement | onStatement )
            int alt3=9;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt3=1;
                }
                break;
            case PLUS:
            case MINUS:
            case NOT:
            case MINUS2:
            case PLUS2:
            case ID:
            case NULL:
            case BOOLEAN:
            case INTEGER:
            case FLOAT:
            case STRING:
            case 72:
            case 86:
            case 87:
            case 88:
            case 91:
                {
                alt3=2;
                }
                break;
            case 80:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==72) ) {
                    alt3=2;
                }
                else if ( (LA3_3==ID) ) {
                    alt3=7;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("71:1: statement : ( emptyStatement | expressionStatement | block | ifStatement | iterationStatement | variableStatement | functionStatement | jumpStatement | onStatement );", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case 69:
                {
                alt3=3;
                }
                break;
            case 71:
                {
                alt3=4;
                }
                break;
            case 75:
            case 77:
            case 79:
                {
                alt3=5;
                }
                break;
            case 76:
                {
                alt3=6;
                }
                break;
            case 81:
            case 82:
            case 83:
                {
                alt3=8;
                }
                break;
            case 84:
                {
                alt3=9;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("71:1: statement : ( emptyStatement | expressionStatement | block | ifStatement | iterationStatement | variableStatement | functionStatement | jumpStatement | onStatement );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:72:4: emptyStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_emptyStatement_in_statement211);
                    emptyStatement4=emptyStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, emptyStatement4.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:73:4: expressionStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expressionStatement_in_statement216);
                    expressionStatement5=expressionStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expressionStatement5.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:74:4: block
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statement221);
                    block6=block();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, block6.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:75:4: ifStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifStatement_in_statement226);
                    ifStatement7=ifStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ifStatement7.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:76:4: iterationStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iterationStatement_in_statement231);
                    iterationStatement8=iterationStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, iterationStatement8.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:77:4: variableStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableStatement_in_statement236);
                    variableStatement9=variableStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, variableStatement9.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:78:4: functionStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionStatement_in_statement241);
                    functionStatement10=functionStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, functionStatement10.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:79:4: jumpStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_jumpStatement_in_statement246);
                    jumpStatement11=jumpStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, jumpStatement11.getTree());

                    }
                    break;
                case 9 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:80:4: onStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_onStatement_in_statement251);
                    onStatement12=onStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, onStatement12.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        	throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end statement

    public static class emptyStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start emptyStatement
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:83:1: emptyStatement : ';' ;
    public final emptyStatement_return emptyStatement() throws RecognitionException {
        emptyStatement_return retval = new emptyStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal13=null;

        Object char_literal13_tree=null;

        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:84:2: ( ';' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:84:4: ';'
            {
            root_0 = (Object)adaptor.nil();

            char_literal13=(Token)input.LT(1);
            match(input,68,FOLLOW_68_in_emptyStatement263); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        	throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end emptyStatement

    public static class expressionStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start expressionStatement
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:87:1: expressionStatement : expression ';' -> ^( EXPR expression ) ;
    public final expressionStatement_return expressionStatement() throws RecognitionException {
        expressionStatement_return retval = new expressionStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal15=null;
        expression_return expression14 = null;


        Object char_literal15_tree=null;
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:88:2: ( expression ';' -> ^( EXPR expression ) )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:88:4: expression ';'
            {
            pushFollow(FOLLOW_expression_in_expressionStatement275);
            expression14=expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_expression.add(expression14.getTree());
            char_literal15=(Token)input.LT(1);
            match(input,68,FOLLOW_68_in_expressionStatement277); if (failed) return retval;
            if ( backtracking==0 ) stream_68.add(char_literal15);


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 89:3: -> ^( EXPR expression )
            {
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:89:6: ^( EXPR expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(EXPR, "EXPR"), root_1);

                adaptor.addChild(root_1, stream_expression.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        	throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end expressionStatement

    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start block
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:92:1: block : '{' ( statement )* '}' -> ^( BLOCK ( statement )* ) ;
    public final block_return block() throws RecognitionException {
        block_return retval = new block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal16=null;
        Token char_literal18=null;
        statement_return statement17 = null;


        Object char_literal16_tree=null;
        Object char_literal18_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:93:2: ( '{' ( statement )* '}' -> ^( BLOCK ( statement )* ) )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:93:4: '{' ( statement )* '}'
            {
            char_literal16=(Token)input.LT(1);
            match(input,69,FOLLOW_69_in_block299); if (failed) return retval;
            if ( backtracking==0 ) stream_69.add(char_literal16);

            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:93:8: ( statement )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=PLUS && LA4_0<=MINUS)||(LA4_0>=NOT && LA4_0<=STRING)||(LA4_0>=68 && LA4_0<=69)||(LA4_0>=71 && LA4_0<=72)||(LA4_0>=75 && LA4_0<=77)||(LA4_0>=79 && LA4_0<=84)||(LA4_0>=86 && LA4_0<=88)||LA4_0==91) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:93:8: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block301);
            	    statement17=statement();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_statement.add(statement17.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            char_literal18=(Token)input.LT(1);
            match(input,70,FOLLOW_70_in_block304); if (failed) return retval;
            if ( backtracking==0 ) stream_70.add(char_literal18);


            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 94:3: -> ^( BLOCK ( statement )* )
            {
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:94:6: ^( BLOCK ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(BLOCK, "BLOCK"), root_1);

                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:94:14: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.next());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        	throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end block

    public static class ifStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ifStatement
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:97:1: ifStatement : 'if' '(' expr= expression ')' th= statement ( 'else' el= statement )? -> ^( IF $expr $th ( $el)? ) ;
    public final ifStatement_return ifStatement() throws RecognitionException {
        ifStatement_return retval = new ifStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal19=null;
        Token char_literal20=null;
        Token char_literal21=null;
        Token string_literal22=null;
        expression_return expr = null;

        statement_return th = null;

        statement_return el = null;


        Object string_literal19_tree=null;
        Object char_literal20_tree=null;
        Object char_literal21_tree=null;
        Object string_literal22_tree=null;
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:98:2: ( 'if' '(' expr= expression ')' th= statement ( 'else' el= statement )? -> ^( IF $expr $th ( $el)? ) )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:98:4: 'if' '(' expr= expression ')' th= statement ( 'else' el= statement )?
            {
            string_literal19=(Token)input.LT(1);
            match(input,71,FOLLOW_71_in_ifStatement327); if (failed) return retval;
            if ( backtracking==0 ) stream_71.add(string_literal19);

            char_literal20=(Token)input.LT(1);
            match(input,72,FOLLOW_72_in_ifStatement329); if (failed) return retval;
            if ( backtracking==0 ) stream_72.add(char_literal20);

            pushFollow(FOLLOW_expression_in_ifStatement333);
            expr=expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_expression.add(expr.getTree());
            char_literal21=(Token)input.LT(1);
            match(input,73,FOLLOW_73_in_ifStatement335); if (failed) return retval;
            if ( backtracking==0 ) stream_73.add(char_literal21);

            pushFollow(FOLLOW_statement_in_ifStatement339);
            th=statement();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_statement.add(th.getTree());
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:98:46: ( 'else' el= statement )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==74) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:98:48: 'else' el= statement
                    {
                    string_literal22=(Token)input.LT(1);
                    match(input,74,FOLLOW_74_in_ifStatement343); if (failed) return retval;
                    if ( backtracking==0 ) stream_74.add(string_literal22);

                    pushFollow(FOLLOW_statement_in_ifStatement347);
                    el=statement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_statement.add(el.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: el, expr, th
            // token labels: 
            // rule labels: retval, el, expr, th
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_el=new RewriteRuleSubtreeStream(adaptor,"token el",el!=null?el.tree:null);
            RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"token expr",expr!=null?expr.tree:null);
            RewriteRuleSubtreeStream stream_th=new RewriteRuleSubtreeStream(adaptor,"token th",th!=null?th.tree:null);

            root_0 = (Object)adaptor.nil();
            // 99:3: -> ^( IF $expr $th ( $el)? )
            {
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:99:6: ^( IF $expr $th ( $el)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(IF, "IF"), root_1);

                adaptor.addChild(root_1, stream_expr.next());
                adaptor.addChild(root_1, stream_th.next());
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:99:21: ( $el)?
                if ( stream_el.hasNext() ) {
                    adaptor.addChild(root_1, stream_el.next());

                }
                stream_el.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        	throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end ifStatement

    public static class iterationStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start iterationStatement
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:102:1: iterationStatement : ( 'for' '(' (init= expression )? ';' (cond= expression )? ';' (upd= expression )? ')' statement -> ^( FOR ^( INIT ( $init)? ) ^( COND ( $cond)? ) ^( UPD ( $upd)? ) statement ) | 'for' '(' 'var' vars= variableDeclarationList ';' (cond= expression )? ';' (upd= expression )? ')' statement -> ^( FOR ^( VARS $vars) ^( COND ( $cond)? ) ^( UPD ( $upd)? ) statement ) | 'foreach' '(' id= identifier 'in' expr= expression ')' statement -> ^( FOREACH $id $expr statement ) | 'while' '(' expression ')' statement -> ^( WHILE expression statement ) );
    public final iterationStatement_return iterationStatement() throws RecognitionException {
        iterationStatement_return retval = new iterationStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal23=null;
        Token char_literal24=null;
        Token char_literal25=null;
        Token char_literal26=null;
        Token char_literal27=null;
        Token string_literal29=null;
        Token char_literal30=null;
        Token string_literal31=null;
        Token char_literal32=null;
        Token char_literal33=null;
        Token char_literal34=null;
        Token string_literal36=null;
        Token char_literal37=null;
        Token string_literal38=null;
        Token char_literal39=null;
        Token string_literal41=null;
        Token char_literal42=null;
        Token char_literal44=null;
        expression_return init = null;

        expression_return cond = null;

        expression_return upd = null;

        variableDeclarationList_return vars = null;

        identifier_return id = null;

        expression_return expr = null;

        statement_return statement28 = null;

        statement_return statement35 = null;

        statement_return statement40 = null;

        expression_return expression43 = null;

        statement_return statement45 = null;


        Object string_literal23_tree=null;
        Object char_literal24_tree=null;
        Object char_literal25_tree=null;
        Object char_literal26_tree=null;
        Object char_literal27_tree=null;
        Object string_literal29_tree=null;
        Object char_literal30_tree=null;
        Object string_literal31_tree=null;
        Object char_literal32_tree=null;
        Object char_literal33_tree=null;
        Object char_literal34_tree=null;
        Object string_literal36_tree=null;
        Object char_literal37_tree=null;
        Object string_literal38_tree=null;
        Object char_literal39_tree=null;
        Object string_literal41_tree=null;
        Object char_literal42_tree=null;
        Object char_literal44_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_variableDeclarationList=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarationList");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:103:2: ( 'for' '(' (init= expression )? ';' (cond= expression )? ';' (upd= expression )? ')' statement -> ^( FOR ^( INIT ( $init)? ) ^( COND ( $cond)? ) ^( UPD ( $upd)? ) statement ) | 'for' '(' 'var' vars= variableDeclarationList ';' (cond= expression )? ';' (upd= expression )? ')' statement -> ^( FOR ^( VARS $vars) ^( COND ( $cond)? ) ^( UPD ( $upd)? ) statement ) | 'foreach' '(' id= identifier 'in' expr= expression ')' statement -> ^( FOREACH $id $expr statement ) | 'while' '(' expression ')' statement -> ^( WHILE expression statement ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 75:
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==72) ) {
                    int LA11_4 = input.LA(3);

                    if ( (LA11_4==76) ) {
                        alt11=2;
                    }
                    else if ( ((LA11_4>=PLUS && LA11_4<=MINUS)||(LA11_4>=NOT && LA11_4<=STRING)||LA11_4==68||LA11_4==72||LA11_4==80||(LA11_4>=86 && LA11_4<=88)||LA11_4==91) ) {
                        alt11=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("102:1: iterationStatement : ( 'for' '(' (init= expression )? ';' (cond= expression )? ';' (upd= expression )? ')' statement -> ^( FOR ^( INIT ( $init)? ) ^( COND ( $cond)? ) ^( UPD ( $upd)? ) statement ) | 'for' '(' 'var' vars= variableDeclarationList ';' (cond= expression )? ';' (upd= expression )? ')' statement -> ^( FOR ^( VARS $vars) ^( COND ( $cond)? ) ^( UPD ( $upd)? ) statement ) | 'foreach' '(' id= identifier 'in' expr= expression ')' statement -> ^( FOREACH $id $expr statement ) | 'while' '(' expression ')' statement -> ^( WHILE expression statement ) );", 11, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("102:1: iterationStatement : ( 'for' '(' (init= expression )? ';' (cond= expression )? ';' (upd= expression )? ')' statement -> ^( FOR ^( INIT ( $init)? ) ^( COND ( $cond)? ) ^( UPD ( $upd)? ) statement ) | 'for' '(' 'var' vars= variableDeclarationList ';' (cond= expression )? ';' (upd= expression )? ')' statement -> ^( FOR ^( VARS $vars) ^( COND ( $cond)? ) ^( UPD ( $upd)? ) statement ) | 'foreach' '(' id= identifier 'in' expr= expression ')' statement -> ^( FOREACH $id $expr statement ) | 'while' '(' expression ')' statement -> ^( WHILE expression statement ) );", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case 77:
                {
                alt11=3;
                }
                break;
            case 79:
                {
                alt11=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("102:1: iterationStatement : ( 'for' '(' (init= expression )? ';' (cond= expression )? ';' (upd= expression )? ')' statement -> ^( FOR ^( INIT ( $init)? ) ^( COND ( $cond)? ) ^( UPD ( $upd)? ) statement ) | 'for' '(' 'var' vars= variableDeclarationList ';' (cond= expression )? ';' (upd= expression )? ')' statement -> ^( FOR ^( VARS $vars) ^( COND ( $cond)? ) ^( UPD ( $upd)? ) statement ) | 'foreach' '(' id= identifier 'in' expr= expression ')' statement -> ^( FOREACH $id $expr statement ) | 'while' '(' expression ')' statement -> ^( WHILE expression statement ) );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:103:4: 'for' '(' (init= expression )? ';' (cond= expression )? ';' (upd= expression )? ')' statement
                    {
                    string_literal23=(Token)input.LT(1);
                    match(input,75,FOLLOW_75_in_iterationStatement379); if (failed) return retval;
                    if ( backtracking==0 ) stream_75.add(string_literal23);

                    char_literal24=(Token)input.LT(1);
                    match(input,72,FOLLOW_72_in_iterationStatement381); if (failed) return retval;
                    if ( backtracking==0 ) stream_72.add(char_literal24);

                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:103:18: (init= expression )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=PLUS && LA6_0<=MINUS)||(LA6_0>=NOT && LA6_0<=STRING)||LA6_0==72||LA6_0==80||(LA6_0>=86 && LA6_0<=88)||LA6_0==91) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:103:18: init= expression
                            {
                            pushFollow(FOLLOW_expression_in_iterationStatement385);
                            init=expression();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) stream_expression.add(init.getTree());

                            }
                            break;

                    }

                    char_literal25=(Token)input.LT(1);
                    match(input,68,FOLLOW_68_in_iterationStatement388); if (failed) return retval;
                    if ( backtracking==0 ) stream_68.add(char_literal25);

                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:103:39: (cond= expression )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>=PLUS && LA7_0<=MINUS)||(LA7_0>=NOT && LA7_0<=STRING)||LA7_0==72||LA7_0==80||(LA7_0>=86 && LA7_0<=88)||LA7_0==91) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:103:39: cond= expression
                            {
                            pushFollow(FOLLOW_expression_in_iterationStatement392);
                            cond=expression();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) stream_expression.add(cond.getTree());

                            }
                            break;

                    }

                    char_literal26=(Token)input.LT(1);
                    match(input,68,FOLLOW_68_in_iterationStatement395); if (failed) return retval;
                    if ( backtracking==0 ) stream_68.add(char_literal26);

                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:103:59: (upd= expression )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0>=PLUS && LA8_0<=MINUS)||(LA8_0>=NOT && LA8_0<=STRING)||LA8_0==72||LA8_0==80||(LA8_0>=86 && LA8_0<=88)||LA8_0==91) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:103:59: upd= expression
                            {
                            pushFollow(FOLLOW_expression_in_iterationStatement399);
                            upd=expression();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) stream_expression.add(upd.getTree());

                            }
                            break;

                    }

                    char_literal27=(Token)input.LT(1);
                    match(input,73,FOLLOW_73_in_iterationStatement402); if (failed) return retval;
                    if ( backtracking==0 ) stream_73.add(char_literal27);

                    pushFollow(FOLLOW_statement_in_iterationStatement404);
                    statement28=statement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_statement.add(statement28.getTree());

                    // AST REWRITE
                    // elements: statement, init, upd, cond
                    // token labels: 
                    // rule labels: retval, init, upd, cond
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_init=new RewriteRuleSubtreeStream(adaptor,"token init",init!=null?init.tree:null);
                    RewriteRuleSubtreeStream stream_upd=new RewriteRuleSubtreeStream(adaptor,"token upd",upd!=null?upd.tree:null);
                    RewriteRuleSubtreeStream stream_cond=new RewriteRuleSubtreeStream(adaptor,"token cond",cond!=null?cond.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 104:3: -> ^( FOR ^( INIT ( $init)? ) ^( COND ( $cond)? ) ^( UPD ( $upd)? ) statement )
                    {
                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:104:6: ^( FOR ^( INIT ( $init)? ) ^( COND ( $cond)? ) ^( UPD ( $upd)? ) statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FOR, "FOR"), root_1);

                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:104:12: ^( INIT ( $init)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(INIT, "INIT"), root_2);

                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:104:19: ( $init)?
                        if ( stream_init.hasNext() ) {
                            adaptor.addChild(root_2, stream_init.next());

                        }
                        stream_init.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:104:27: ^( COND ( $cond)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(COND, "COND"), root_2);

                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:104:34: ( $cond)?
                        if ( stream_cond.hasNext() ) {
                            adaptor.addChild(root_2, stream_cond.next());

                        }
                        stream_cond.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:104:42: ^( UPD ( $upd)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(UPD, "UPD"), root_2);

                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:104:48: ( $upd)?
                        if ( stream_upd.hasNext() ) {
                            adaptor.addChild(root_2, stream_upd.next());

                        }
                        stream_upd.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_statement.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:105:4: 'for' '(' 'var' vars= variableDeclarationList ';' (cond= expression )? ';' (upd= expression )? ')' statement
                    {
                    string_literal29=(Token)input.LT(1);
                    match(input,75,FOLLOW_75_in_iterationStatement443); if (failed) return retval;
                    if ( backtracking==0 ) stream_75.add(string_literal29);

                    char_literal30=(Token)input.LT(1);
                    match(input,72,FOLLOW_72_in_iterationStatement445); if (failed) return retval;
                    if ( backtracking==0 ) stream_72.add(char_literal30);

                    string_literal31=(Token)input.LT(1);
                    match(input,76,FOLLOW_76_in_iterationStatement447); if (failed) return retval;
                    if ( backtracking==0 ) stream_76.add(string_literal31);

                    pushFollow(FOLLOW_variableDeclarationList_in_iterationStatement451);
                    vars=variableDeclarationList();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_variableDeclarationList.add(vars.getTree());
                    char_literal32=(Token)input.LT(1);
                    match(input,68,FOLLOW_68_in_iterationStatement453); if (failed) return retval;
                    if ( backtracking==0 ) stream_68.add(char_literal32);

                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:105:57: (cond= expression )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( ((LA9_0>=PLUS && LA9_0<=MINUS)||(LA9_0>=NOT && LA9_0<=STRING)||LA9_0==72||LA9_0==80||(LA9_0>=86 && LA9_0<=88)||LA9_0==91) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:105:57: cond= expression
                            {
                            pushFollow(FOLLOW_expression_in_iterationStatement457);
                            cond=expression();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) stream_expression.add(cond.getTree());

                            }
                            break;

                    }

                    char_literal33=(Token)input.LT(1);
                    match(input,68,FOLLOW_68_in_iterationStatement460); if (failed) return retval;
                    if ( backtracking==0 ) stream_68.add(char_literal33);

                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:105:77: (upd= expression )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( ((LA10_0>=PLUS && LA10_0<=MINUS)||(LA10_0>=NOT && LA10_0<=STRING)||LA10_0==72||LA10_0==80||(LA10_0>=86 && LA10_0<=88)||LA10_0==91) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:105:77: upd= expression
                            {
                            pushFollow(FOLLOW_expression_in_iterationStatement464);
                            upd=expression();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) stream_expression.add(upd.getTree());

                            }
                            break;

                    }

                    char_literal34=(Token)input.LT(1);
                    match(input,73,FOLLOW_73_in_iterationStatement467); if (failed) return retval;
                    if ( backtracking==0 ) stream_73.add(char_literal34);

                    pushFollow(FOLLOW_statement_in_iterationStatement469);
                    statement35=statement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_statement.add(statement35.getTree());

                    // AST REWRITE
                    // elements: statement, upd, cond, vars
                    // token labels: 
                    // rule labels: vars, retval, upd, cond
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"token vars",vars!=null?vars.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_upd=new RewriteRuleSubtreeStream(adaptor,"token upd",upd!=null?upd.tree:null);
                    RewriteRuleSubtreeStream stream_cond=new RewriteRuleSubtreeStream(adaptor,"token cond",cond!=null?cond.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 106:3: -> ^( FOR ^( VARS $vars) ^( COND ( $cond)? ) ^( UPD ( $upd)? ) statement )
                    {
                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:106:6: ^( FOR ^( VARS $vars) ^( COND ( $cond)? ) ^( UPD ( $upd)? ) statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FOR, "FOR"), root_1);

                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:106:12: ^( VARS $vars)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(VARS, "VARS"), root_2);

                        adaptor.addChild(root_2, stream_vars.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:106:26: ^( COND ( $cond)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(COND, "COND"), root_2);

                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:106:33: ( $cond)?
                        if ( stream_cond.hasNext() ) {
                            adaptor.addChild(root_2, stream_cond.next());

                        }
                        stream_cond.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:106:41: ^( UPD ( $upd)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(UPD, "UPD"), root_2);

                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:106:47: ( $upd)?
                        if ( stream_upd.hasNext() ) {
                            adaptor.addChild(root_2, stream_upd.next());

                        }
                        stream_upd.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_statement.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:107:4: 'foreach' '(' id= identifier 'in' expr= expression ')' statement
                    {
                    string_literal36=(Token)input.LT(1);
                    match(input,77,FOLLOW_77_in_iterationStatement507); if (failed) return retval;
                    if ( backtracking==0 ) stream_77.add(string_literal36);

                    char_literal37=(Token)input.LT(1);
                    match(input,72,FOLLOW_72_in_iterationStatement509); if (failed) return retval;
                    if ( backtracking==0 ) stream_72.add(char_literal37);

                    pushFollow(FOLLOW_identifier_in_iterationStatement513);
                    id=identifier();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_identifier.add(id.getTree());
                    string_literal38=(Token)input.LT(1);
                    match(input,78,FOLLOW_78_in_iterationStatement515); if (failed) return retval;
                    if ( backtracking==0 ) stream_78.add(string_literal38);

                    pushFollow(FOLLOW_expression_in_iterationStatement519);
                    expr=expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_expression.add(expr.getTree());
                    char_literal39=(Token)input.LT(1);
                    match(input,73,FOLLOW_73_in_iterationStatement521); if (failed) return retval;
                    if ( backtracking==0 ) stream_73.add(char_literal39);

                    pushFollow(FOLLOW_statement_in_iterationStatement523);
                    statement40=statement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_statement.add(statement40.getTree());

                    // AST REWRITE
                    // elements: statement, expr, id
                    // token labels: 
                    // rule labels: id, retval, expr
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"token id",id!=null?id.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"token expr",expr!=null?expr.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 108:3: -> ^( FOREACH $id $expr statement )
                    {
                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:108:6: ^( FOREACH $id $expr statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FOREACH, "FOREACH"), root_1);

                        adaptor.addChild(root_1, stream_id.next());
                        adaptor.addChild(root_1, stream_expr.next());
                        adaptor.addChild(root_1, stream_statement.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:109:4: 'while' '(' expression ')' statement
                    {
                    string_literal41=(Token)input.LT(1);
                    match(input,79,FOLLOW_79_in_iterationStatement544); if (failed) return retval;
                    if ( backtracking==0 ) stream_79.add(string_literal41);

                    char_literal42=(Token)input.LT(1);
                    match(input,72,FOLLOW_72_in_iterationStatement546); if (failed) return retval;
                    if ( backtracking==0 ) stream_72.add(char_literal42);

                    pushFollow(FOLLOW_expression_in_iterationStatement548);
                    expression43=expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_expression.add(expression43.getTree());
                    char_literal44=(Token)input.LT(1);
                    match(input,73,FOLLOW_73_in_iterationStatement550); if (failed) return retval;
                    if ( backtracking==0 ) stream_73.add(char_literal44);

                    pushFollow(FOLLOW_statement_in_iterationStatement552);
                    statement45=statement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_statement.add(statement45.getTree());

                    // AST REWRITE
                    // elements: statement, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 110:3: -> ^( WHILE expression statement )
                    {
                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:110:6: ^( WHILE expression statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(WHILE, "WHILE"), root_1);

                        adaptor.addChild(root_1, stream_expression.next());
                        adaptor.addChild(root_1, stream_statement.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        	throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end iterationStatement

    public static class variableStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start variableStatement
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:113:1: variableStatement : 'var' variableDeclaration ( ',' variableDeclaration )* ';' -> ( variableDeclaration )+ ;
    public final variableStatement_return variableStatement() throws RecognitionException {
        variableStatement_return retval = new variableStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal46=null;
        Token char_literal48=null;
        Token char_literal50=null;
        variableDeclaration_return variableDeclaration47 = null;

        variableDeclaration_return variableDeclaration49 = null;


        Object string_literal46_tree=null;
        Object char_literal48_tree=null;
        Object char_literal50_tree=null;
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:114:2: ( 'var' variableDeclaration ( ',' variableDeclaration )* ';' -> ( variableDeclaration )+ )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:114:4: 'var' variableDeclaration ( ',' variableDeclaration )* ';'
            {
            string_literal46=(Token)input.LT(1);
            match(input,76,FOLLOW_76_in_variableStatement575); if (failed) return retval;
            if ( backtracking==0 ) stream_76.add(string_literal46);

            pushFollow(FOLLOW_variableDeclaration_in_variableStatement577);
            variableDeclaration47=variableDeclaration();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_variableDeclaration.add(variableDeclaration47.getTree());
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:114:30: ( ',' variableDeclaration )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==COMMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:114:32: ',' variableDeclaration
            	    {
            	    char_literal48=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_variableStatement581); if (failed) return retval;
            	    if ( backtracking==0 ) stream_COMMA.add(char_literal48);

            	    pushFollow(FOLLOW_variableDeclaration_in_variableStatement583);
            	    variableDeclaration49=variableDeclaration();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_variableDeclaration.add(variableDeclaration49.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            char_literal50=(Token)input.LT(1);
            match(input,68,FOLLOW_68_in_variableStatement588); if (failed) return retval;
            if ( backtracking==0 ) stream_68.add(char_literal50);


            // AST REWRITE
            // elements: variableDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 115:3: -> ( variableDeclaration )+
            {
                if ( !(stream_variableDeclaration.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_variableDeclaration.hasNext() ) {
                    adaptor.addChild(root_0, stream_variableDeclaration.next());

                }
                stream_variableDeclaration.reset();

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        	throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end variableStatement

    public static class variableDeclarationList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start variableDeclarationList
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:118:1: variableDeclarationList : variableDeclaration ( ',' variableDeclaration )* -> ( variableDeclaration )+ ;
    public final variableDeclarationList_return variableDeclarationList() throws RecognitionException {
        variableDeclarationList_return retval = new variableDeclarationList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal52=null;
        variableDeclaration_return variableDeclaration51 = null;

        variableDeclaration_return variableDeclaration53 = null;


        Object char_literal52_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:119:2: ( variableDeclaration ( ',' variableDeclaration )* -> ( variableDeclaration )+ )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:119:4: variableDeclaration ( ',' variableDeclaration )*
            {
            pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationList607);
            variableDeclaration51=variableDeclaration();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_variableDeclaration.add(variableDeclaration51.getTree());
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:119:24: ( ',' variableDeclaration )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==COMMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:119:26: ',' variableDeclaration
            	    {
            	    char_literal52=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_variableDeclarationList611); if (failed) return retval;
            	    if ( backtracking==0 ) stream_COMMA.add(char_literal52);

            	    pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationList613);
            	    variableDeclaration53=variableDeclaration();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_variableDeclaration.add(variableDeclaration53.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            // AST REWRITE
            // elements: variableDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 120:3: -> ( variableDeclaration )+
            {
                if ( !(stream_variableDeclaration.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_variableDeclaration.hasNext() ) {
                    adaptor.addChild(root_0, stream_variableDeclaration.next());

                }
                stream_variableDeclaration.reset();

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        	throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end variableDeclarationList

    public static class variableDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start variableDeclaration
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:123:1: variableDeclaration : identifier ( '=' assignmentExpression )? -> ^( VARDEF identifier ( assignmentExpression )? ) ;
    public final variableDeclaration_return variableDeclaration() throws RecognitionException {
        variableDeclaration_return retval = new variableDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal55=null;
        identifier_return identifier54 = null;

        assignmentExpression_return assignmentExpression56 = null;


        Object char_literal55_tree=null;
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:124:2: ( identifier ( '=' assignmentExpression )? -> ^( VARDEF identifier ( assignmentExpression )? ) )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:124:4: identifier ( '=' assignmentExpression )?
            {
            pushFollow(FOLLOW_identifier_in_variableDeclaration634);
            identifier54=identifier();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_identifier.add(identifier54.getTree());
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:124:15: ( '=' assignmentExpression )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==EQ) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:124:16: '=' assignmentExpression
                    {
                    char_literal55=(Token)input.LT(1);
                    match(input,EQ,FOLLOW_EQ_in_variableDeclaration637); if (failed) return retval;
                    if ( backtracking==0 ) stream_EQ.add(char_literal55);

                    pushFollow(FOLLOW_assignmentExpression_in_variableDeclaration639);
                    assignmentExpression56=assignmentExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_assignmentExpression.add(assignmentExpression56.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: assignmentExpression, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 125:3: -> ^( VARDEF identifier ( assignmentExpression )? )
            {
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:125:6: ^( VARDEF identifier ( assignmentExpression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(VARDEF, "VARDEF"), root_1);

                adaptor.addChild(root_1, stream_identifier.next());
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:125:26: ( assignmentExpression )?
                if ( stream_assignmentExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_assignmentExpression.next());

                }
                stream_assignmentExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        	throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end variableDeclaration

    public static class functionStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start functionStatement
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:128:1: functionStatement : 'function' identifier '(' ( formalParameters )? ')' block -> ^( FUNDEF identifier ^( PARAMS ( formalParameters )? ) block ) ;
    public final functionStatement_return functionStatement() throws RecognitionException {
        functionStatement_return retval = new functionStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal57=null;
        Token char_literal59=null;
        Token char_literal61=null;
        identifier_return identifier58 = null;

        formalParameters_return formalParameters60 = null;

        block_return block62 = null;


        Object string_literal57_tree=null;
        Object char_literal59_tree=null;
        Object char_literal61_tree=null;
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:129:2: ( 'function' identifier '(' ( formalParameters )? ')' block -> ^( FUNDEF identifier ^( PARAMS ( formalParameters )? ) block ) )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:129:4: 'function' identifier '(' ( formalParameters )? ')' block
            {
            string_literal57=(Token)input.LT(1);
            match(input,80,FOLLOW_80_in_functionStatement665); if (failed) return retval;
            if ( backtracking==0 ) stream_80.add(string_literal57);

            pushFollow(FOLLOW_identifier_in_functionStatement667);
            identifier58=identifier();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_identifier.add(identifier58.getTree());
            char_literal59=(Token)input.LT(1);
            match(input,72,FOLLOW_72_in_functionStatement669); if (failed) return retval;
            if ( backtracking==0 ) stream_72.add(char_literal59);

            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:129:30: ( formalParameters )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:129:30: formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_functionStatement671);
                    formalParameters60=formalParameters();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_formalParameters.add(formalParameters60.getTree());

                    }
                    break;

            }

            char_literal61=(Token)input.LT(1);
            match(input,73,FOLLOW_73_in_functionStatement674); if (failed) return retval;
            if ( backtracking==0 ) stream_73.add(char_literal61);

            pushFollow(FOLLOW_block_in_functionStatement676);
            block62=block();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_block.add(block62.getTree());

            // AST REWRITE
            // elements: formalParameters, block, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 130:3: -> ^( FUNDEF identifier ^( PARAMS ( formalParameters )? ) block )
            {
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:130:6: ^( FUNDEF identifier ^( PARAMS ( formalParameters )? ) block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(FUNDEF, "FUNDEF"), root_1);

                adaptor.addChild(root_1, stream_identifier.next());
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:130:26: ^( PARAMS ( formalParameters )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(adaptor.create(PARAMS, "PARAMS"), root_2);

                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:130:35: ( formalParameters )?
                if ( stream_formalParameters.hasNext() ) {
                    adaptor.addChild(root_2, stream_formalParameters.next());

                }
                stream_formalParameters.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_block.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        	throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end functionStatement

    public static class jumpStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start jumpStatement
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:133:1: jumpStatement : ( 'return' ( expression )? ';' -> ^( RETURN ( expression )? ) | 'break' ';' -> ^( BREAK ) | 'continue' ';' -> ^( CONTINUE ) );
    public final jumpStatement_return jumpStatement() throws RecognitionException {
        jumpStatement_return retval = new jumpStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal63=null;
        Token char_literal65=null;
        Token string_literal66=null;
        Token char_literal67=null;
        Token string_literal68=null;
        Token char_literal69=null;
        expression_return expression64 = null;


        Object string_literal63_tree=null;
        Object char_literal65_tree=null;
        Object string_literal66_tree=null;
        Object char_literal67_tree=null;
        Object string_literal68_tree=null;
        Object char_literal69_tree=null;
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:134:2: ( 'return' ( expression )? ';' -> ^( RETURN ( expression )? ) | 'break' ';' -> ^( BREAK ) | 'continue' ';' -> ^( CONTINUE ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt17=1;
                }
                break;
            case 82:
                {
                alt17=2;
                }
                break;
            case 83:
                {
                alt17=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("133:1: jumpStatement : ( 'return' ( expression )? ';' -> ^( RETURN ( expression )? ) | 'break' ';' -> ^( BREAK ) | 'continue' ';' -> ^( CONTINUE ) );", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:134:4: 'return' ( expression )? ';'
                    {
                    string_literal63=(Token)input.LT(1);
                    match(input,81,FOLLOW_81_in_jumpStatement706); if (failed) return retval;
                    if ( backtracking==0 ) stream_81.add(string_literal63);

                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:134:13: ( expression )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=PLUS && LA16_0<=MINUS)||(LA16_0>=NOT && LA16_0<=STRING)||LA16_0==72||LA16_0==80||(LA16_0>=86 && LA16_0<=88)||LA16_0==91) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:134:13: expression
                            {
                            pushFollow(FOLLOW_expression_in_jumpStatement708);
                            expression64=expression();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) stream_expression.add(expression64.getTree());

                            }
                            break;

                    }

                    char_literal65=(Token)input.LT(1);
                    match(input,68,FOLLOW_68_in_jumpStatement711); if (failed) return retval;
                    if ( backtracking==0 ) stream_68.add(char_literal65);


                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 135:3: -> ^( RETURN ( expression )? )
                    {
                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:135:6: ^( RETURN ( expression )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(RETURN, "RETURN"), root_1);

                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:135:15: ( expression )?
                        if ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.next());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:136:4: 'break' ';'
                    {
                    string_literal66=(Token)input.LT(1);
                    match(input,82,FOLLOW_82_in_jumpStatement727); if (failed) return retval;
                    if ( backtracking==0 ) stream_82.add(string_literal66);

                    char_literal67=(Token)input.LT(1);
                    match(input,68,FOLLOW_68_in_jumpStatement729); if (failed) return retval;
                    if ( backtracking==0 ) stream_68.add(char_literal67);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 137:3: -> ^( BREAK )
                    {
                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:137:6: ^( BREAK )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(BREAK, "BREAK"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:138:4: 'continue' ';'
                    {
                    string_literal68=(Token)input.LT(1);
                    match(input,83,FOLLOW_83_in_jumpStatement742); if (failed) return retval;
                    if ( backtracking==0 ) stream_83.add(string_literal68);

                    char_literal69=(Token)input.LT(1);
                    match(input,68,FOLLOW_68_in_jumpStatement744); if (failed) return retval;
                    if ( backtracking==0 ) stream_68.add(char_literal69);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 139:3: -> ^( CONTINUE )
                    {
                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:139:6: ^( CONTINUE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(CONTINUE, "CONTINUE"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        	throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end jumpStatement

    public static class onStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start onStatement
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:142:1: onStatement : 'on' '(' expression ')' block -> ^( ON expression block ) ;
    public final onStatement_return onStatement() throws RecognitionException {
        onStatement_return retval = new onStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal70=null;
        Token char_literal71=null;
        Token char_literal73=null;
        expression_return expression72 = null;

        block_return block74 = null;


        Object string_literal70_tree=null;
        Object char_literal71_tree=null;
        Object char_literal73_tree=null;
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:143:2: ( 'on' '(' expression ')' block -> ^( ON expression block ) )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:143:4: 'on' '(' expression ')' block
            {
            string_literal70=(Token)input.LT(1);
            match(input,84,FOLLOW_84_in_onStatement763); if (failed) return retval;
            if ( backtracking==0 ) stream_84.add(string_literal70);

            char_literal71=(Token)input.LT(1);
            match(input,72,FOLLOW_72_in_onStatement765); if (failed) return retval;
            if ( backtracking==0 ) stream_72.add(char_literal71);

            pushFollow(FOLLOW_expression_in_onStatement767);
            expression72=expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_expression.add(expression72.getTree());
            char_literal73=(Token)input.LT(1);
            match(input,73,FOLLOW_73_in_onStatement769); if (failed) return retval;
            if ( backtracking==0 ) stream_73.add(char_literal73);

            pushFollow(FOLLOW_block_in_onStatement771);
            block74=block();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_block.add(block74.getTree());

            // AST REWRITE
            // elements: block, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 144:3: -> ^( ON expression block )
            {
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:144:6: ^( ON expression block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ON, "ON"), root_1);

                adaptor.addChild(root_1, stream_expression.next());
                adaptor.addChild(root_1, stream_block.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        	throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end onStatement

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start expression
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:161:1: expression : assignmentExpression ( COMMA assignmentExpression )* ;
    public final expression_return expression() throws RecognitionException {
        expression_return retval = new expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA76=null;
        assignmentExpression_return assignmentExpression75 = null;

        assignmentExpression_return assignmentExpression77 = null;


        Object COMMA76_tree=null;

        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:162:2: ( assignmentExpression ( COMMA assignmentExpression )* )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:162:4: assignmentExpression ( COMMA assignmentExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_assignmentExpression_in_expression808);
            assignmentExpression75=assignmentExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, assignmentExpression75.getTree());
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:162:25: ( COMMA assignmentExpression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==COMMA) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:162:27: COMMA assignmentExpression
            	    {
            	    COMMA76=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_expression812); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    COMMA76_tree = (Object)adaptor.create(COMMA76);
            	    root_0 = (Object)adaptor.becomeRoot(COMMA76_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_assignmentExpression_in_expression815);
            	    assignmentExpression77=assignmentExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, assignmentExpression77.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        	throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end expression

    public static class assignmentExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start assignmentExpression
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:165:1: assignmentExpression : conditionalExpression ( assignmentOperator conditionalExpression )* ;
    public final assignmentExpression_return assignmentExpression() throws RecognitionException {
        assignmentExpression_return retval = new assignmentExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        conditionalExpression_return conditionalExpression78 = null;

        assignmentOperator_return assignmentOperator79 = null;

        conditionalExpression_return conditionalExpression80 = null;



        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:166:2: ( conditionalExpression ( assignmentOperator conditionalExpression )* )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:166:4: conditionalExpression ( assignmentOperator conditionalExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditionalExpression_in_assignmentExpression829);
            conditionalExpression78=conditionalExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, conditionalExpression78.getTree());
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:166:26: ( assignmentOperator conditionalExpression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=EQ && LA19_0<=PERCENTEQ)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:166:28: assignmentOperator conditionalExpression
            	    {
            	    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpression833);
            	    assignmentOperator79=assignmentOperator();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(assignmentOperator79.getTree(), root_0);
            	    pushFollow(FOLLOW_conditionalExpression_in_assignmentExpression836);
            	    conditionalExpression80=conditionalExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, conditionalExpression80.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        	throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end assignmentExpression

    public static class assignmentOperator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start assignmentOperator
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:169:1: assignmentOperator : ( EQ | PLUSEQ | MINUSEQ | MULTEQ | DIVEQ | PERCENTEQ );
    public final assignmentOperator_return assignmentOperator() throws RecognitionException {
        assignmentOperator_return retval = new assignmentOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set81=null;

        Object set81_tree=null;

        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:170:2: ( EQ | PLUSEQ | MINUSEQ | MULTEQ | DIVEQ | PERCENTEQ )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:
            {
            root_0 = (Object)adaptor.nil();

            set81=(Token)input.LT(1);
            if ( (input.LA(1)>=EQ && input.LA(1)<=PERCENTEQ) ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set81));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_assignmentOperator0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        	throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end assignmentOperator

    public static class conditionalExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start conditionalExpression
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:178:1: conditionalExpression : logicalOrExpression ( QUESTION expression ':' expression )? ;
    public final conditionalExpression_return conditionalExpression() throws RecognitionException {
        conditionalExpression_return retval = new conditionalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUESTION83=null;
        Token char_literal85=null;
        logicalOrExpression_return logicalOrExpression82 = null;

        expression_return expression84 = null;

        expression_return expression86 = null;


        Object QUESTION83_tree=null;
        Object char_literal85_tree=null;

        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:179:2: ( logicalOrExpression ( QUESTION expression ':' expression )? )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:179:4: logicalOrExpression ( QUESTION expression ':' expression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalOrExpression_in_conditionalExpression886);
            logicalOrExpression82=logicalOrExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, logicalOrExpression82.getTree());
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:179:24: ( QUESTION expression ':' expression )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==QUESTION) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:179:26: QUESTION expression ':' expression
                    {
                    QUESTION83=(Token)input.LT(1);
                    match(input,QUESTION,FOLLOW_QUESTION_in_conditionalExpression890); if (failed) return retval;
                    if ( backtracking==0 ) {
                    QUESTION83_tree = (Object)adaptor.create(QUESTION83);
                    root_0 = (Object)adaptor.becomeRoot(QUESTION83_tree, root_0);
                    }
                    pushFollow(FOLLOW_expression_in_conditionalExpression893);
                    expression84=expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expression84.getTree());
                    char_literal85=(Token)input.LT(1);
                    match(input,85,FOLLOW_85_in_conditionalExpression895); if (failed) return retval;
                    pushFollow(FOLLOW_expression_in_conditionalExpression898);
                    expression86=expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expression86.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        	throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end conditionalExpression

    public static class logicalOrExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start logicalOrExpression
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:182:1: logicalOrExpression : logicalAndExpression ( OR logicalAndExpression )* ;
    public final logicalOrExpression_return logicalOrExpression() throws RecognitionException {
        logicalOrExpression_return retval = new logicalOrExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR88=null;
        logicalAndExpression_return logicalAndExpression87 = null;

        logicalAndExpression_return logicalAndExpression89 = null;


        Object OR88_tree=null;

        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:183:2: ( logicalAndExpression ( OR logicalAndExpression )* )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:183:4: logicalAndExpression ( OR logicalAndExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression912);
            logicalAndExpression87=logicalAndExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, logicalAndExpression87.getTree());
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:183:25: ( OR logicalAndExpression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==OR) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:183:27: OR logicalAndExpression
            	    {
            	    OR88=(Token)input.LT(1);
            	    match(input,OR,FOLLOW_OR_in_logicalOrExpression916); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    OR88_tree = (Object)adaptor.create(OR88);
            	    root_0 = (Object)adaptor.becomeRoot(OR88_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression919);
            	    logicalAndExpression89=logicalAndExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, logicalAndExpression89.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        	throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end logicalOrExpression

    public static class logicalAndExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start logicalAndExpression
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:186:1: logicalAndExpression : equalityExpression ( AND equalityExpression )* ;
    public final logicalAndExpression_return logicalAndExpression() throws RecognitionException {
        logicalAndExpression_return retval = new logicalAndExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND91=null;
        equalityExpression_return equalityExpression90 = null;

        equalityExpression_return equalityExpression92 = null;


        Object AND91_tree=null;

        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:187:2: ( equalityExpression ( AND equalityExpression )* )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:187:4: equalityExpression ( AND equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_logicalAndExpression933);
            equalityExpression90=equalityExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, equalityExpression90.getTree());
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:187:23: ( AND equalityExpression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==AND) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:187:25: AND equalityExpression
            	    {
            	    AND91=(Token)input.LT(1);
            	    match(input,AND,FOLLOW_AND_in_logicalAndExpression937); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    AND91_tree = (Object)adaptor.create(AND91);
            	    root_0 = (Object)adaptor.becomeRoot(AND91_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_equalityExpression_in_logicalAndExpression940);
            	    equalityExpression92=equalityExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, equalityExpression92.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        	throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end logicalAndExpression

    public static class equalityExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start equalityExpression
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:190:1: equalityExpression : relationalExpression ( ( EQ2 | NOTEQ ) relationalExpression )* ;
    public final equalityExpression_return equalityExpression() throws RecognitionException {
        equalityExpression_return retval = new equalityExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EQ294=null;
        Token NOTEQ95=null;
        relationalExpression_return relationalExpression93 = null;

        relationalExpression_return relationalExpression96 = null;


        Object EQ294_tree=null;
        Object NOTEQ95_tree=null;

        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:191:2: ( relationalExpression ( ( EQ2 | NOTEQ ) relationalExpression )* )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:191:4: relationalExpression ( ( EQ2 | NOTEQ ) relationalExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression954);
            relationalExpression93=relationalExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, relationalExpression93.getTree());
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:191:25: ( ( EQ2 | NOTEQ ) relationalExpression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=EQ2 && LA24_0<=NOTEQ)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:191:27: ( EQ2 | NOTEQ ) relationalExpression
            	    {
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:191:27: ( EQ2 | NOTEQ )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==EQ2) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==NOTEQ) ) {
            	        alt23=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("191:27: ( EQ2 | NOTEQ )", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:191:29: EQ2
            	            {
            	            EQ294=(Token)input.LT(1);
            	            match(input,EQ2,FOLLOW_EQ2_in_equalityExpression960); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            EQ294_tree = (Object)adaptor.create(EQ294);
            	            root_0 = (Object)adaptor.becomeRoot(EQ294_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:191:36: NOTEQ
            	            {
            	            NOTEQ95=(Token)input.LT(1);
            	            match(input,NOTEQ,FOLLOW_NOTEQ_in_equalityExpression965); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            NOTEQ95_tree = (Object)adaptor.create(NOTEQ95);
            	            root_0 = (Object)adaptor.becomeRoot(NOTEQ95_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression970);
            	    relationalExpression96=relationalExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, relationalExpression96.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        	throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end equalityExpression

    public static class relationalExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start relationalExpression
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:194:1: relationalExpression : additiveExpression ( ( LT | LTEQ | GT | GTEQ ) additiveExpression )* ;
    public final relationalExpression_return relationalExpression() throws RecognitionException {
        relationalExpression_return retval = new relationalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LT98=null;
        Token LTEQ99=null;
        Token GT100=null;
        Token GTEQ101=null;
        additiveExpression_return additiveExpression97 = null;

        additiveExpression_return additiveExpression102 = null;


        Object LT98_tree=null;
        Object LTEQ99_tree=null;
        Object GT100_tree=null;
        Object GTEQ101_tree=null;

        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:195:2: ( additiveExpression ( ( LT | LTEQ | GT | GTEQ ) additiveExpression )* )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:195:4: additiveExpression ( ( LT | LTEQ | GT | GTEQ ) additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_relationalExpression984);
            additiveExpression97=additiveExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, additiveExpression97.getTree());
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:195:23: ( ( LT | LTEQ | GT | GTEQ ) additiveExpression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=LT && LA26_0<=GTEQ)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:195:25: ( LT | LTEQ | GT | GTEQ ) additiveExpression
            	    {
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:195:25: ( LT | LTEQ | GT | GTEQ )
            	    int alt25=4;
            	    switch ( input.LA(1) ) {
            	    case LT:
            	        {
            	        alt25=1;
            	        }
            	        break;
            	    case LTEQ:
            	        {
            	        alt25=2;
            	        }
            	        break;
            	    case GT:
            	        {
            	        alt25=3;
            	        }
            	        break;
            	    case GTEQ:
            	        {
            	        alt25=4;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("195:25: ( LT | LTEQ | GT | GTEQ )", 25, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt25) {
            	        case 1 :
            	            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:195:27: LT
            	            {
            	            LT98=(Token)input.LT(1);
            	            match(input,LT,FOLLOW_LT_in_relationalExpression990); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            LT98_tree = (Object)adaptor.create(LT98);
            	            root_0 = (Object)adaptor.becomeRoot(LT98_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:195:33: LTEQ
            	            {
            	            LTEQ99=(Token)input.LT(1);
            	            match(input,LTEQ,FOLLOW_LTEQ_in_relationalExpression995); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            LTEQ99_tree = (Object)adaptor.create(LTEQ99);
            	            root_0 = (Object)adaptor.becomeRoot(LTEQ99_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:195:41: GT
            	            {
            	            GT100=(Token)input.LT(1);
            	            match(input,GT,FOLLOW_GT_in_relationalExpression1000); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            GT100_tree = (Object)adaptor.create(GT100);
            	            root_0 = (Object)adaptor.becomeRoot(GT100_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:195:47: GTEQ
            	            {
            	            GTEQ101=(Token)input.LT(1);
            	            match(input,GTEQ,FOLLOW_GTEQ_in_relationalExpression1005); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            GTEQ101_tree = (Object)adaptor.create(GTEQ101);
            	            root_0 = (Object)adaptor.becomeRoot(GTEQ101_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression1010);
            	    additiveExpression102=additiveExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, additiveExpression102.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        	throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end relationalExpression

    public static class additiveExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start additiveExpression
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:198:1: additiveExpression : multiplicativeExpression ( ( PLUS | MINUS ) multiplicativeExpression )* ;
    public final additiveExpression_return additiveExpression() throws RecognitionException {
        additiveExpression_return retval = new additiveExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PLUS104=null;
        Token MINUS105=null;
        multiplicativeExpression_return multiplicativeExpression103 = null;

        multiplicativeExpression_return multiplicativeExpression106 = null;


        Object PLUS104_tree=null;
        Object MINUS105_tree=null;

        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:199:2: ( multiplicativeExpression ( ( PLUS | MINUS ) multiplicativeExpression )* )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:199:4: multiplicativeExpression ( ( PLUS | MINUS ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1023);
            multiplicativeExpression103=multiplicativeExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression103.getTree());
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:199:29: ( ( PLUS | MINUS ) multiplicativeExpression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=PLUS && LA28_0<=MINUS)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:199:31: ( PLUS | MINUS ) multiplicativeExpression
            	    {
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:199:31: ( PLUS | MINUS )
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==PLUS) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==MINUS) ) {
            	        alt27=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("199:31: ( PLUS | MINUS )", 27, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:199:33: PLUS
            	            {
            	            PLUS104=(Token)input.LT(1);
            	            match(input,PLUS,FOLLOW_PLUS_in_additiveExpression1029); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            PLUS104_tree = (Object)adaptor.create(PLUS104);
            	            root_0 = (Object)adaptor.becomeRoot(PLUS104_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:199:41: MINUS
            	            {
            	            MINUS105=(Token)input.LT(1);
            	            match(input,MINUS,FOLLOW_MINUS_in_additiveExpression1034); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            MINUS105_tree = (Object)adaptor.create(MINUS105);
            	            root_0 = (Object)adaptor.becomeRoot(MINUS105_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1039);
            	    multiplicativeExpression106=multiplicativeExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression106.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        	throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end additiveExpression

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start multiplicativeExpression
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:202:1: multiplicativeExpression : unaryExpression ( ( MULT | DIV | PERCENT ) unaryExpression )* ;
    public final multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        multiplicativeExpression_return retval = new multiplicativeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MULT108=null;
        Token DIV109=null;
        Token PERCENT110=null;
        unaryExpression_return unaryExpression107 = null;

        unaryExpression_return unaryExpression111 = null;


        Object MULT108_tree=null;
        Object DIV109_tree=null;
        Object PERCENT110_tree=null;

        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:203:2: ( unaryExpression ( ( MULT | DIV | PERCENT ) unaryExpression )* )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:203:4: unaryExpression ( ( MULT | DIV | PERCENT ) unaryExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1052);
            unaryExpression107=unaryExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, unaryExpression107.getTree());
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:203:20: ( ( MULT | DIV | PERCENT ) unaryExpression )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=MULT && LA30_0<=PERCENT)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:203:22: ( MULT | DIV | PERCENT ) unaryExpression
            	    {
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:203:22: ( MULT | DIV | PERCENT )
            	    int alt29=3;
            	    switch ( input.LA(1) ) {
            	    case MULT:
            	        {
            	        alt29=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt29=2;
            	        }
            	        break;
            	    case PERCENT:
            	        {
            	        alt29=3;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("203:22: ( MULT | DIV | PERCENT )", 29, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt29) {
            	        case 1 :
            	            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:203:24: MULT
            	            {
            	            MULT108=(Token)input.LT(1);
            	            match(input,MULT,FOLLOW_MULT_in_multiplicativeExpression1058); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            MULT108_tree = (Object)adaptor.create(MULT108);
            	            root_0 = (Object)adaptor.becomeRoot(MULT108_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:203:32: DIV
            	            {
            	            DIV109=(Token)input.LT(1);
            	            match(input,DIV,FOLLOW_DIV_in_multiplicativeExpression1063); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            DIV109_tree = (Object)adaptor.create(DIV109);
            	            root_0 = (Object)adaptor.becomeRoot(DIV109_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:203:39: PERCENT
            	            {
            	            PERCENT110=(Token)input.LT(1);
            	            match(input,PERCENT,FOLLOW_PERCENT_in_multiplicativeExpression1068); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            PERCENT110_tree = (Object)adaptor.create(PERCENT110);
            	            root_0 = (Object)adaptor.becomeRoot(PERCENT110_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1073);
            	    unaryExpression111=unaryExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, unaryExpression111.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        	throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end multiplicativeExpression

    public static class unaryExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start unaryExpression
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:206:1: unaryExpression : ( postfixExpression | 'delete' unaryExpression -> ^( DELETE unaryExpression ) | 'typeof' unaryExpression -> ^( TYPEOF unaryExpression ) | MINUS unaryExpression -> ^( UMINUS unaryExpression ) | PLUS unaryExpression -> ^( UPLUS unaryExpression ) | ( NOT | MINUS2 | PLUS2 ) unaryExpression );
    public final unaryExpression_return unaryExpression() throws RecognitionException {
        unaryExpression_return retval = new unaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal113=null;
        Token string_literal115=null;
        Token MINUS117=null;
        Token PLUS119=null;
        Token NOT121=null;
        Token MINUS2122=null;
        Token PLUS2123=null;
        postfixExpression_return postfixExpression112 = null;

        unaryExpression_return unaryExpression114 = null;

        unaryExpression_return unaryExpression116 = null;

        unaryExpression_return unaryExpression118 = null;

        unaryExpression_return unaryExpression120 = null;

        unaryExpression_return unaryExpression124 = null;


        Object string_literal113_tree=null;
        Object string_literal115_tree=null;
        Object MINUS117_tree=null;
        Object PLUS119_tree=null;
        Object NOT121_tree=null;
        Object MINUS2122_tree=null;
        Object PLUS2123_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:207:2: ( postfixExpression | 'delete' unaryExpression -> ^( DELETE unaryExpression ) | 'typeof' unaryExpression -> ^( TYPEOF unaryExpression ) | MINUS unaryExpression -> ^( UMINUS unaryExpression ) | PLUS unaryExpression -> ^( UPLUS unaryExpression ) | ( NOT | MINUS2 | PLUS2 ) unaryExpression )
            int alt32=6;
            switch ( input.LA(1) ) {
            case ID:
            case NULL:
            case BOOLEAN:
            case INTEGER:
            case FLOAT:
            case STRING:
            case 72:
            case 80:
            case 88:
            case 91:
                {
                alt32=1;
                }
                break;
            case 86:
                {
                alt32=2;
                }
                break;
            case 87:
                {
                alt32=3;
                }
                break;
            case MINUS:
                {
                alt32=4;
                }
                break;
            case PLUS:
                {
                alt32=5;
                }
                break;
            case NOT:
            case MINUS2:
            case PLUS2:
                {
                alt32=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("206:1: unaryExpression : ( postfixExpression | 'delete' unaryExpression -> ^( DELETE unaryExpression ) | 'typeof' unaryExpression -> ^( TYPEOF unaryExpression ) | MINUS unaryExpression -> ^( UMINUS unaryExpression ) | PLUS unaryExpression -> ^( UPLUS unaryExpression ) | ( NOT | MINUS2 | PLUS2 ) unaryExpression );", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:207:4: postfixExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression1086);
                    postfixExpression112=postfixExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, postfixExpression112.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:208:4: 'delete' unaryExpression
                    {
                    string_literal113=(Token)input.LT(1);
                    match(input,86,FOLLOW_86_in_unaryExpression1091); if (failed) return retval;
                    if ( backtracking==0 ) stream_86.add(string_literal113);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1093);
                    unaryExpression114=unaryExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_unaryExpression.add(unaryExpression114.getTree());

                    // AST REWRITE
                    // elements: unaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 209:3: -> ^( DELETE unaryExpression )
                    {
                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:209:6: ^( DELETE unaryExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(DELETE, "DELETE"), root_1);

                        adaptor.addChild(root_1, stream_unaryExpression.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:210:4: 'typeof' unaryExpression
                    {
                    string_literal115=(Token)input.LT(1);
                    match(input,87,FOLLOW_87_in_unaryExpression1108); if (failed) return retval;
                    if ( backtracking==0 ) stream_87.add(string_literal115);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1110);
                    unaryExpression116=unaryExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_unaryExpression.add(unaryExpression116.getTree());

                    // AST REWRITE
                    // elements: unaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 211:3: -> ^( TYPEOF unaryExpression )
                    {
                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:211:6: ^( TYPEOF unaryExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(TYPEOF, "TYPEOF"), root_1);

                        adaptor.addChild(root_1, stream_unaryExpression.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:212:4: MINUS unaryExpression
                    {
                    MINUS117=(Token)input.LT(1);
                    match(input,MINUS,FOLLOW_MINUS_in_unaryExpression1125); if (failed) return retval;
                    if ( backtracking==0 ) stream_MINUS.add(MINUS117);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1127);
                    unaryExpression118=unaryExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_unaryExpression.add(unaryExpression118.getTree());

                    // AST REWRITE
                    // elements: unaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 213:3: -> ^( UMINUS unaryExpression )
                    {
                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:213:6: ^( UMINUS unaryExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(UMINUS, "UMINUS"), root_1);

                        adaptor.addChild(root_1, stream_unaryExpression.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:214:4: PLUS unaryExpression
                    {
                    PLUS119=(Token)input.LT(1);
                    match(input,PLUS,FOLLOW_PLUS_in_unaryExpression1142); if (failed) return retval;
                    if ( backtracking==0 ) stream_PLUS.add(PLUS119);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1144);
                    unaryExpression120=unaryExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_unaryExpression.add(unaryExpression120.getTree());

                    // AST REWRITE
                    // elements: unaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 215:3: -> ^( UPLUS unaryExpression )
                    {
                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:215:6: ^( UPLUS unaryExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(UPLUS, "UPLUS"), root_1);

                        adaptor.addChild(root_1, stream_unaryExpression.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:216:4: ( NOT | MINUS2 | PLUS2 ) unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:216:4: ( NOT | MINUS2 | PLUS2 )
                    int alt31=3;
                    switch ( input.LA(1) ) {
                    case NOT:
                        {
                        alt31=1;
                        }
                        break;
                    case MINUS2:
                        {
                        alt31=2;
                        }
                        break;
                    case PLUS2:
                        {
                        alt31=3;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("216:4: ( NOT | MINUS2 | PLUS2 )", 31, 0, input);

                        throw nvae;
                    }

                    switch (alt31) {
                        case 1 :
                            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:216:6: NOT
                            {
                            NOT121=(Token)input.LT(1);
                            match(input,NOT,FOLLOW_NOT_in_unaryExpression1161); if (failed) return retval;
                            if ( backtracking==0 ) {
                            NOT121_tree = (Object)adaptor.create(NOT121);
                            root_0 = (Object)adaptor.becomeRoot(NOT121_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:216:13: MINUS2
                            {
                            MINUS2122=(Token)input.LT(1);
                            match(input,MINUS2,FOLLOW_MINUS2_in_unaryExpression1166); if (failed) return retval;
                            if ( backtracking==0 ) {
                            MINUS2122_tree = (Object)adaptor.create(MINUS2122);
                            root_0 = (Object)adaptor.becomeRoot(MINUS2122_tree, root_0);
                            }

                            }
                            break;
                        case 3 :
                            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:216:23: PLUS2
                            {
                            PLUS2123=(Token)input.LT(1);
                            match(input,PLUS2,FOLLOW_PLUS2_in_unaryExpression1171); if (failed) return retval;
                            if ( backtracking==0 ) {
                            PLUS2123_tree = (Object)adaptor.create(PLUS2123);
                            root_0 = (Object)adaptor.becomeRoot(PLUS2123_tree, root_0);
                            }

                            }
                            break;

                    }

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1176);
                    unaryExpression124=unaryExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, unaryExpression124.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        	throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end unaryExpression

    public static class postfixExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start postfixExpression
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:219:1: postfixExpression : callExpression ( MINUS2 | PLUS2 )* ;
    public final postfixExpression_return postfixExpression() throws RecognitionException {
        postfixExpression_return retval = new postfixExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MINUS2126=null;
        Token PLUS2127=null;
        callExpression_return callExpression125 = null;


        Object MINUS2126_tree=null;
        Object PLUS2127_tree=null;

        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:220:2: ( callExpression ( MINUS2 | PLUS2 )* )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:220:4: callExpression ( MINUS2 | PLUS2 )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_callExpression_in_postfixExpression1187);
            callExpression125=callExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, callExpression125.getTree());
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:220:19: ( MINUS2 | PLUS2 )*
            loop33:
            do {
                int alt33=3;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==MINUS2) ) {
                    alt33=1;
                }
                else if ( (LA33_0==PLUS2) ) {
                    alt33=2;
                }


                switch (alt33) {
            	case 1 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:220:21: MINUS2
            	    {
            	    MINUS2126=(Token)input.LT(1);
            	    match(input,MINUS2,FOLLOW_MINUS2_in_postfixExpression1191); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    MINUS2126_tree = (Object)adaptor.create(MINUS2126);
            	    root_0 = (Object)adaptor.becomeRoot(MINUS2126_tree, root_0);
            	    }

            	    }
            	    break;
            	case 2 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:220:31: PLUS2
            	    {
            	    PLUS2127=(Token)input.LT(1);
            	    match(input,PLUS2,FOLLOW_PLUS2_in_postfixExpression1196); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    PLUS2127_tree = (Object)adaptor.create(PLUS2127);
            	    root_0 = (Object)adaptor.becomeRoot(PLUS2127_tree, root_0);
            	    }

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        	throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end postfixExpression

    public static class callExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start callExpression
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:223:1: callExpression : ( primaryExpression -> primaryExpression ) ( '[' idx= expression ']' -> ^( INDEX $callExpression $idx) | '.' id= identifier -> ^( FIELD $callExpression $id) | '(' (args= expressionList )? ')' -> ^( CALL $callExpression ^( ARGS ( $args)? ) ) )* ;
    public final callExpression_return callExpression() throws RecognitionException {
        callExpression_return retval = new callExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal129=null;
        Token char_literal130=null;
        Token char_literal131=null;
        Token char_literal132=null;
        Token char_literal133=null;
        expression_return idx = null;

        identifier_return id = null;

        expressionList_return args = null;

        primaryExpression_return primaryExpression128 = null;


        Object char_literal129_tree=null;
        Object char_literal130_tree=null;
        Object char_literal131_tree=null;
        Object char_literal132_tree=null;
        Object char_literal133_tree=null;
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
        RewriteRuleSubtreeStream stream_primaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule primaryExpression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:224:2: ( ( primaryExpression -> primaryExpression ) ( '[' idx= expression ']' -> ^( INDEX $callExpression $idx) | '.' id= identifier -> ^( FIELD $callExpression $id) | '(' (args= expressionList )? ')' -> ^( CALL $callExpression ^( ARGS ( $args)? ) ) )* )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:224:4: ( primaryExpression -> primaryExpression ) ( '[' idx= expression ']' -> ^( INDEX $callExpression $idx) | '.' id= identifier -> ^( FIELD $callExpression $id) | '(' (args= expressionList )? ')' -> ^( CALL $callExpression ^( ARGS ( $args)? ) ) )*
            {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:224:4: ( primaryExpression -> primaryExpression )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:224:5: primaryExpression
            {
            pushFollow(FOLLOW_primaryExpression_in_callExpression1212);
            primaryExpression128=primaryExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_primaryExpression.add(primaryExpression128.getTree());

            // AST REWRITE
            // elements: primaryExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 224:23: -> primaryExpression
            {
                adaptor.addChild(root_0, stream_primaryExpression.next());

            }

            }

            }

            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:225:3: ( '[' idx= expression ']' -> ^( INDEX $callExpression $idx) | '.' id= identifier -> ^( FIELD $callExpression $id) | '(' (args= expressionList )? ')' -> ^( CALL $callExpression ^( ARGS ( $args)? ) ) )*
            loop35:
            do {
                int alt35=4;
                switch ( input.LA(1) ) {
                case 88:
                    {
                    alt35=1;
                    }
                    break;
                case 90:
                    {
                    alt35=2;
                    }
                    break;
                case 72:
                    {
                    alt35=3;
                    }
                    break;

                }

                switch (alt35) {
            	case 1 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:225:5: '[' idx= expression ']'
            	    {
            	    char_literal129=(Token)input.LT(1);
            	    match(input,88,FOLLOW_88_in_callExpression1223); if (failed) return retval;
            	    if ( backtracking==0 ) stream_88.add(char_literal129);

            	    pushFollow(FOLLOW_expression_in_callExpression1227);
            	    idx=expression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_expression.add(idx.getTree());
            	    char_literal130=(Token)input.LT(1);
            	    match(input,89,FOLLOW_89_in_callExpression1229); if (failed) return retval;
            	    if ( backtracking==0 ) stream_89.add(char_literal130);


            	    // AST REWRITE
            	    // elements: idx, callExpression
            	    // token labels: 
            	    // rule labels: retval, idx
            	    // token list labels: 
            	    // rule list labels: 
            	    if ( backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_idx=new RewriteRuleSubtreeStream(adaptor,"token idx",idx!=null?idx.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 226:4: -> ^( INDEX $callExpression $idx)
            	    {
            	        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:226:7: ^( INDEX $callExpression $idx)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(INDEX, "INDEX"), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        adaptor.addChild(root_1, stream_idx.next());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    }

            	    }
            	    break;
            	case 2 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:227:5: '.' id= identifier
            	    {
            	    char_literal131=(Token)input.LT(1);
            	    match(input,90,FOLLOW_90_in_callExpression1250); if (failed) return retval;
            	    if ( backtracking==0 ) stream_90.add(char_literal131);

            	    pushFollow(FOLLOW_identifier_in_callExpression1254);
            	    id=identifier();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_identifier.add(id.getTree());

            	    // AST REWRITE
            	    // elements: callExpression, id
            	    // token labels: 
            	    // rule labels: id, retval
            	    // token list labels: 
            	    // rule list labels: 
            	    if ( backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"token id",id!=null?id.tree:null);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 228:4: -> ^( FIELD $callExpression $id)
            	    {
            	        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:228:7: ^( FIELD $callExpression $id)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FIELD, "FIELD"), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        adaptor.addChild(root_1, stream_id.next());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    }

            	    }
            	    break;
            	case 3 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:229:5: '(' (args= expressionList )? ')'
            	    {
            	    char_literal132=(Token)input.LT(1);
            	    match(input,72,FOLLOW_72_in_callExpression1275); if (failed) return retval;
            	    if ( backtracking==0 ) stream_72.add(char_literal132);

            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:229:13: (args= expressionList )?
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( ((LA34_0>=PLUS && LA34_0<=MINUS)||(LA34_0>=NOT && LA34_0<=STRING)||LA34_0==72||LA34_0==80||(LA34_0>=86 && LA34_0<=88)||LA34_0==91) ) {
            	        alt34=1;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:229:13: args= expressionList
            	            {
            	            pushFollow(FOLLOW_expressionList_in_callExpression1279);
            	            args=expressionList();
            	            _fsp--;
            	            if (failed) return retval;
            	            if ( backtracking==0 ) stream_expressionList.add(args.getTree());

            	            }
            	            break;

            	    }

            	    char_literal133=(Token)input.LT(1);
            	    match(input,73,FOLLOW_73_in_callExpression1282); if (failed) return retval;
            	    if ( backtracking==0 ) stream_73.add(char_literal133);


            	    // AST REWRITE
            	    // elements: args, callExpression
            	    // token labels: 
            	    // rule labels: retval, args
            	    // token list labels: 
            	    // rule list labels: 
            	    if ( backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"token args",args!=null?args.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 230:4: -> ^( CALL $callExpression ^( ARGS ( $args)? ) )
            	    {
            	        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:230:7: ^( CALL $callExpression ^( ARGS ( $args)? ) )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(CALL, "CALL"), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:230:30: ^( ARGS ( $args)? )
            	        {
            	        Object root_2 = (Object)adaptor.nil();
            	        root_2 = (Object)adaptor.becomeRoot(adaptor.create(ARGS, "ARGS"), root_2);

            	        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:230:37: ( $args)?
            	        if ( stream_args.hasNext() ) {
            	            adaptor.addChild(root_2, stream_args.next());

            	        }
            	        stream_args.reset();

            	        adaptor.addChild(root_1, root_2);
            	        }

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    }

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        	throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end callExpression

    public static class primaryExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start primaryExpression
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:234:1: primaryExpression : ( identifier | arrayLiteral | literal | functionExpression | 'new' callExpression -> ^( NEW callExpression ) | '(' expression ')' );
    public final primaryExpression_return primaryExpression() throws RecognitionException {
        primaryExpression_return retval = new primaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal138=null;
        Token char_literal140=null;
        Token char_literal142=null;
        identifier_return identifier134 = null;

        arrayLiteral_return arrayLiteral135 = null;

        literal_return literal136 = null;

        functionExpression_return functionExpression137 = null;

        callExpression_return callExpression139 = null;

        expression_return expression141 = null;


        Object string_literal138_tree=null;
        Object char_literal140_tree=null;
        Object char_literal142_tree=null;
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleSubtreeStream stream_callExpression=new RewriteRuleSubtreeStream(adaptor,"rule callExpression");
        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:235:2: ( identifier | arrayLiteral | literal | functionExpression | 'new' callExpression -> ^( NEW callExpression ) | '(' expression ')' )
            int alt36=6;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt36=1;
                }
                break;
            case 88:
                {
                alt36=2;
                }
                break;
            case NULL:
            case BOOLEAN:
            case INTEGER:
            case FLOAT:
            case STRING:
                {
                alt36=3;
                }
                break;
            case 80:
                {
                alt36=4;
                }
                break;
            case 91:
                {
                alt36=5;
                }
                break;
            case 72:
                {
                alt36=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("234:1: primaryExpression : ( identifier | arrayLiteral | literal | functionExpression | 'new' callExpression -> ^( NEW callExpression ) | '(' expression ')' );", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:235:4: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_primaryExpression1318);
                    identifier134=identifier();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, identifier134.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:236:4: arrayLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arrayLiteral_in_primaryExpression1323);
                    arrayLiteral135=arrayLiteral();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, arrayLiteral135.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:237:4: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_primaryExpression1328);
                    literal136=literal();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, literal136.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:238:4: functionExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionExpression_in_primaryExpression1333);
                    functionExpression137=functionExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, functionExpression137.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:239:4: 'new' callExpression
                    {
                    string_literal138=(Token)input.LT(1);
                    match(input,91,FOLLOW_91_in_primaryExpression1338); if (failed) return retval;
                    if ( backtracking==0 ) stream_91.add(string_literal138);

                    pushFollow(FOLLOW_callExpression_in_primaryExpression1340);
                    callExpression139=callExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_callExpression.add(callExpression139.getTree());

                    // AST REWRITE
                    // elements: callExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 240:3: -> ^( NEW callExpression )
                    {
                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:240:6: ^( NEW callExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(NEW, "NEW"), root_1);

                        adaptor.addChild(root_1, stream_callExpression.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:241:4: '(' expression ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal140=(Token)input.LT(1);
                    match(input,72,FOLLOW_72_in_primaryExpression1355); if (failed) return retval;
                    pushFollow(FOLLOW_expression_in_primaryExpression1358);
                    expression141=expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expression141.getTree());
                    char_literal142=(Token)input.LT(1);
                    match(input,73,FOLLOW_73_in_primaryExpression1360); if (failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        	throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end primaryExpression

    public static class functionExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start functionExpression
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:244:1: functionExpression : 'function' '(' ( formalParameters )? ')' block -> ^( FUN ^( PARAMS ( formalParameters )? ) block ) ;
    public final functionExpression_return functionExpression() throws RecognitionException {
        functionExpression_return retval = new functionExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal143=null;
        Token char_literal144=null;
        Token char_literal146=null;
        formalParameters_return formalParameters145 = null;

        block_return block147 = null;


        Object string_literal143_tree=null;
        Object char_literal144_tree=null;
        Object char_literal146_tree=null;
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:245:2: ( 'function' '(' ( formalParameters )? ')' block -> ^( FUN ^( PARAMS ( formalParameters )? ) block ) )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:245:4: 'function' '(' ( formalParameters )? ')' block
            {
            string_literal143=(Token)input.LT(1);
            match(input,80,FOLLOW_80_in_functionExpression1372); if (failed) return retval;
            if ( backtracking==0 ) stream_80.add(string_literal143);

            char_literal144=(Token)input.LT(1);
            match(input,72,FOLLOW_72_in_functionExpression1374); if (failed) return retval;
            if ( backtracking==0 ) stream_72.add(char_literal144);

            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:245:19: ( formalParameters )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==ID) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:245:19: formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_functionExpression1376);
                    formalParameters145=formalParameters();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_formalParameters.add(formalParameters145.getTree());

                    }
                    break;

            }

            char_literal146=(Token)input.LT(1);
            match(input,73,FOLLOW_73_in_functionExpression1379); if (failed) return retval;
            if ( backtracking==0 ) stream_73.add(char_literal146);

            pushFollow(FOLLOW_block_in_functionExpression1381);
            block147=block();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_block.add(block147.getTree());

            // AST REWRITE
            // elements: formalParameters, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 246:3: -> ^( FUN ^( PARAMS ( formalParameters )? ) block )
            {
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:246:6: ^( FUN ^( PARAMS ( formalParameters )? ) block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(FUN, "FUN"), root_1);

                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:246:12: ^( PARAMS ( formalParameters )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(adaptor.create(PARAMS, "PARAMS"), root_2);

                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:246:21: ( formalParameters )?
                if ( stream_formalParameters.hasNext() ) {
                    adaptor.addChild(root_2, stream_formalParameters.next());

                }
                stream_formalParameters.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_block.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        	throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end functionExpression

    public static class formalParameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start formalParameters
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:249:1: formalParameters : identifier ( ',' identifier )* ;
    public final formalParameters_return formalParameters() throws RecognitionException {
        formalParameters_return retval = new formalParameters_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal149=null;
        identifier_return identifier148 = null;

        identifier_return identifier150 = null;


        Object char_literal149_tree=null;

        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:250:2: ( identifier ( ',' identifier )* )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:250:4: identifier ( ',' identifier )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_formalParameters1410);
            identifier148=identifier();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, identifier148.getTree());
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:250:15: ( ',' identifier )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==COMMA) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:250:17: ',' identifier
            	    {
            	    char_literal149=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_formalParameters1414); if (failed) return retval;
            	    pushFollow(FOLLOW_identifier_in_formalParameters1417);
            	    identifier150=identifier();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, identifier150.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        	throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end formalParameters

    public static class arrayLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start arrayLiteral
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:253:1: arrayLiteral : '[' ( expressionList )? ']' -> ^( ARRAY ( expressionList )? ) ;
    public final arrayLiteral_return arrayLiteral() throws RecognitionException {
        arrayLiteral_return retval = new arrayLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal151=null;
        Token char_literal153=null;
        expressionList_return expressionList152 = null;


        Object char_literal151_tree=null;
        Object char_literal153_tree=null;
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:254:2: ( '[' ( expressionList )? ']' -> ^( ARRAY ( expressionList )? ) )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:254:4: '[' ( expressionList )? ']'
            {
            char_literal151=(Token)input.LT(1);
            match(input,88,FOLLOW_88_in_arrayLiteral1431); if (failed) return retval;
            if ( backtracking==0 ) stream_88.add(char_literal151);

            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:254:8: ( expressionList )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=PLUS && LA39_0<=MINUS)||(LA39_0>=NOT && LA39_0<=STRING)||LA39_0==72||LA39_0==80||(LA39_0>=86 && LA39_0<=88)||LA39_0==91) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:254:8: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_arrayLiteral1433);
                    expressionList152=expressionList();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_expressionList.add(expressionList152.getTree());

                    }
                    break;

            }

            char_literal153=(Token)input.LT(1);
            match(input,89,FOLLOW_89_in_arrayLiteral1436); if (failed) return retval;
            if ( backtracking==0 ) stream_89.add(char_literal153);


            // AST REWRITE
            // elements: expressionList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 255:3: -> ^( ARRAY ( expressionList )? )
            {
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:255:6: ^( ARRAY ( expressionList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ARRAY, "ARRAY"), root_1);

                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:255:14: ( expressionList )?
                if ( stream_expressionList.hasNext() ) {
                    adaptor.addChild(root_1, stream_expressionList.next());

                }
                stream_expressionList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        	throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end arrayLiteral

    public static class expressionList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start expressionList
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:258:1: expressionList : assignmentExpression ( ',' assignmentExpression )* ;
    public final expressionList_return expressionList() throws RecognitionException {
        expressionList_return retval = new expressionList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal155=null;
        assignmentExpression_return assignmentExpression154 = null;

        assignmentExpression_return assignmentExpression156 = null;


        Object char_literal155_tree=null;

        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:259:2: ( assignmentExpression ( ',' assignmentExpression )* )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:259:4: assignmentExpression ( ',' assignmentExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_assignmentExpression_in_expressionList1458);
            assignmentExpression154=assignmentExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, assignmentExpression154.getTree());
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:259:25: ( ',' assignmentExpression )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==COMMA) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:259:27: ',' assignmentExpression
            	    {
            	    char_literal155=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_expressionList1462); if (failed) return retval;
            	    pushFollow(FOLLOW_assignmentExpression_in_expressionList1465);
            	    assignmentExpression156=assignmentExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, assignmentExpression156.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        	throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end expressionList

    public static class identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start identifier
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:262:1: identifier : ID ;
    public final identifier_return identifier() throws RecognitionException {
        identifier_return retval = new identifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID157=null;

        Object ID157_tree=null;

        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:263:2: ( ID )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:263:4: ID
            {
            root_0 = (Object)adaptor.nil();

            ID157=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_identifier1479); if (failed) return retval;
            if ( backtracking==0 ) {
            ID157_tree = (Object)adaptor.create(ID157);
            adaptor.addChild(root_0, ID157_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        	throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end identifier

    public static class literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start literal
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:266:1: literal : ( NULL | BOOLEAN | INTEGER | FLOAT | STRING );
    public final literal_return literal() throws RecognitionException {
        literal_return retval = new literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set158=null;

        Object set158_tree=null;

        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:267:2: ( NULL | BOOLEAN | INTEGER | FLOAT | STRING )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:
            {
            root_0 = (Object)adaptor.nil();

            set158=(Token)input.LT(1);
            if ( (input.LA(1)>=NULL && input.LA(1)<=STRING) ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set158));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_literal0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        
        catch (RecognitionException e) {
        	throw e;
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end literal

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:62:4: ( statement )
        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:62:5: statement
        {
        pushFollow(FOLLOW_statement_in_synpred1167);
        statement();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred1

    public final boolean synpred1() {
        backtracking++;
        int start = input.mark();
        try {
            synpred1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\60\uffff";
    static final String DFA1_eofS =
        "\2\uffff\1\56\1\uffff\1\56\53\uffff";
    static final String DFA1_minS =
        "\1\60\1\uffff\1\40\1\0\1\40\12\0\12\uffff\25\0\2\uffff";
    static final String DFA1_maxS =
        "\1\133\1\uffff\1\132\1\0\1\132\12\0\12\uffff\25\0\2\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\15\uffff\12\1\25\uffff\1\2\1\1";
    static final String DFA1_specialS =
        "\1\3\1\uffff\1\0\1\1\1\2\53\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\13\1\12\3\uffff\1\14\1\15\1\16\1\2\5\4\6\uffff\1\1\1\17\1"+
            "\uffff\1\20\1\7\2\uffff\1\21\1\24\1\22\1\uffff\1\23\1\5\1\25"+
            "\1\26\1\27\1\30\1\uffff\1\10\1\11\1\3\2\uffff\1\6",
            "",
            "\1\55\6\54\1\53\1\52\1\51\1\47\1\50\1\43\1\44\1\45\1\46\1\41"+
            "\1\42\1\36\1\37\1\40\1\uffff\1\34\1\35\14\uffff\1\57\3\uffff"+
            "\1\33\17\uffff\1\31\1\uffff\1\32",
            "\1\uffff",
            "\1\55\6\54\1\53\1\52\1\51\1\47\1\50\1\43\1\44\1\45\1\46\1\41"+
            "\1\42\1\36\1\37\1\40\1\uffff\1\34\1\35\14\uffff\1\57\3\uffff"+
            "\1\33\17\uffff\1\31\1\uffff\1\32",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "61:1: lineInput : ( ( statement )=> statement | expression );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_2 = input.LA(1);

                         
                        int index1_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_2==88) ) {s = 25;}

                        else if ( (LA1_2==90) ) {s = 26;}

                        else if ( (LA1_2==72) ) {s = 27;}

                        else if ( (LA1_2==MINUS2) ) {s = 28;}

                        else if ( (LA1_2==PLUS2) ) {s = 29;}

                        else if ( (LA1_2==MULT) ) {s = 30;}

                        else if ( (LA1_2==DIV) ) {s = 31;}

                        else if ( (LA1_2==PERCENT) ) {s = 32;}

                        else if ( (LA1_2==PLUS) ) {s = 33;}

                        else if ( (LA1_2==MINUS) ) {s = 34;}

                        else if ( (LA1_2==LT) ) {s = 35;}

                        else if ( (LA1_2==LTEQ) ) {s = 36;}

                        else if ( (LA1_2==GT) ) {s = 37;}

                        else if ( (LA1_2==GTEQ) ) {s = 38;}

                        else if ( (LA1_2==EQ2) ) {s = 39;}

                        else if ( (LA1_2==NOTEQ) ) {s = 40;}

                        else if ( (LA1_2==AND) ) {s = 41;}

                        else if ( (LA1_2==OR) ) {s = 42;}

                        else if ( (LA1_2==QUESTION) ) {s = 43;}

                        else if ( ((LA1_2>=EQ && LA1_2<=PERCENTEQ)) ) {s = 44;}

                        else if ( (LA1_2==COMMA) ) {s = 45;}

                        else if ( (LA1_2==EOF) ) {s = 46;}

                        else if ( (LA1_2==68) && (synpred1())) {s = 47;}

                         
                        input.seek(index1_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_3 = input.LA(1);

                         
                        int index1_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 47;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index1_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_4 = input.LA(1);

                         
                        int index1_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_4==88) ) {s = 25;}

                        else if ( (LA1_4==90) ) {s = 26;}

                        else if ( (LA1_4==72) ) {s = 27;}

                        else if ( (LA1_4==MINUS2) ) {s = 28;}

                        else if ( (LA1_4==PLUS2) ) {s = 29;}

                        else if ( (LA1_4==MULT) ) {s = 30;}

                        else if ( (LA1_4==DIV) ) {s = 31;}

                        else if ( (LA1_4==PERCENT) ) {s = 32;}

                        else if ( (LA1_4==PLUS) ) {s = 33;}

                        else if ( (LA1_4==MINUS) ) {s = 34;}

                        else if ( (LA1_4==LT) ) {s = 35;}

                        else if ( (LA1_4==LTEQ) ) {s = 36;}

                        else if ( (LA1_4==GT) ) {s = 37;}

                        else if ( (LA1_4==GTEQ) ) {s = 38;}

                        else if ( (LA1_4==EQ2) ) {s = 39;}

                        else if ( (LA1_4==NOTEQ) ) {s = 40;}

                        else if ( (LA1_4==AND) ) {s = 41;}

                        else if ( (LA1_4==OR) ) {s = 42;}

                        else if ( (LA1_4==QUESTION) ) {s = 43;}

                        else if ( ((LA1_4>=EQ && LA1_4<=PERCENTEQ)) ) {s = 44;}

                        else if ( (LA1_4==COMMA) ) {s = 45;}

                        else if ( (LA1_4==EOF) ) {s = 46;}

                        else if ( (LA1_4==68) && (synpred1())) {s = 47;}

                         
                        input.seek(index1_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_0 = input.LA(1);

                         
                        int index1_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_0==68) && (synpred1())) {s = 1;}

                        else if ( (LA1_0==ID) ) {s = 2;}

                        else if ( (LA1_0==88) ) {s = 3;}

                        else if ( ((LA1_0>=NULL && LA1_0<=STRING)) ) {s = 4;}

                        else if ( (LA1_0==80) ) {s = 5;}

                        else if ( (LA1_0==91) ) {s = 6;}

                        else if ( (LA1_0==72) ) {s = 7;}

                        else if ( (LA1_0==86) ) {s = 8;}

                        else if ( (LA1_0==87) ) {s = 9;}

                        else if ( (LA1_0==MINUS) ) {s = 10;}

                        else if ( (LA1_0==PLUS) ) {s = 11;}

                        else if ( (LA1_0==NOT) ) {s = 12;}

                        else if ( (LA1_0==MINUS2) ) {s = 13;}

                        else if ( (LA1_0==PLUS2) ) {s = 14;}

                        else if ( (LA1_0==69) && (synpred1())) {s = 15;}

                        else if ( (LA1_0==71) && (synpred1())) {s = 16;}

                        else if ( (LA1_0==75) && (synpred1())) {s = 17;}

                        else if ( (LA1_0==77) && (synpred1())) {s = 18;}

                        else if ( (LA1_0==79) && (synpred1())) {s = 19;}

                        else if ( (LA1_0==76) && (synpred1())) {s = 20;}

                        else if ( (LA1_0==81) && (synpred1())) {s = 21;}

                        else if ( (LA1_0==82) && (synpred1())) {s = 22;}

                        else if ( (LA1_0==83) && (synpred1())) {s = 23;}

                        else if ( (LA1_0==84) && (synpred1())) {s = 24;}

                         
                        input.seek(index1_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_statement_in_lineInput172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_lineInput177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_program188 = new BitSet(new long[]{0x3FE3000000000002L,0x0000000009DFB9B0L});
    public static final BitSet FOLLOW_emptyStatement_in_statement211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStatement_in_statement216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterationStatement_in_statement231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableStatement_in_statement236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionStatement_in_statement241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jumpStatement_in_statement246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_onStatement_in_statement251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_emptyStatement263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionStatement275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_expressionStatement277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_block299 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009DFB9F0L});
    public static final BitSet FOLLOW_statement_in_block301 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009DFB9F0L});
    public static final BitSet FOLLOW_70_in_block304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ifStatement327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ifStatement329 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009C10100L});
    public static final BitSet FOLLOW_expression_in_ifStatement333 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ifStatement335 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009DFB9B0L});
    public static final BitSet FOLLOW_statement_in_ifStatement339 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ifStatement343 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009DFB9B0L});
    public static final BitSet FOLLOW_statement_in_ifStatement347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_iterationStatement379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_iterationStatement381 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009C10110L});
    public static final BitSet FOLLOW_expression_in_iterationStatement385 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_iterationStatement388 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009C10110L});
    public static final BitSet FOLLOW_expression_in_iterationStatement392 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_iterationStatement395 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009C10300L});
    public static final BitSet FOLLOW_expression_in_iterationStatement399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_iterationStatement402 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009DFB9B0L});
    public static final BitSet FOLLOW_statement_in_iterationStatement404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_iterationStatement443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_iterationStatement445 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_iterationStatement447 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_variableDeclarationList_in_iterationStatement451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_iterationStatement453 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009C10110L});
    public static final BitSet FOLLOW_expression_in_iterationStatement457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_iterationStatement460 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009C10300L});
    public static final BitSet FOLLOW_expression_in_iterationStatement464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_iterationStatement467 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009DFB9B0L});
    public static final BitSet FOLLOW_statement_in_iterationStatement469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_iterationStatement507 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_iterationStatement509 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_identifier_in_iterationStatement513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_iterationStatement515 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009C10100L});
    public static final BitSet FOLLOW_expression_in_iterationStatement519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_iterationStatement521 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009DFB9B0L});
    public static final BitSet FOLLOW_statement_in_iterationStatement523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_iterationStatement544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_iterationStatement546 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009C10100L});
    public static final BitSet FOLLOW_expression_in_iterationStatement548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_iterationStatement550 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009DFB9B0L});
    public static final BitSet FOLLOW_statement_in_iterationStatement552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_variableStatement575 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableStatement577 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_COMMA_in_variableStatement581 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableStatement583 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_variableStatement588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationList607 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_COMMA_in_variableDeclarationList611 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationList613 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_identifier_in_variableDeclaration634 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_EQ_in_variableDeclaration637 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009C10100L});
    public static final BitSet FOLLOW_assignmentExpression_in_variableDeclaration639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_functionStatement665 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_identifier_in_functionStatement667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_functionStatement669 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_formalParameters_in_functionStatement671 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_functionStatement674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_functionStatement676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_jumpStatement706 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009C10110L});
    public static final BitSet FOLLOW_expression_in_jumpStatement708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_jumpStatement711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_jumpStatement727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_jumpStatement729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_jumpStatement742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_jumpStatement744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_onStatement763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_onStatement765 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009C10100L});
    public static final BitSet FOLLOW_expression_in_onStatement767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_onStatement769 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_onStatement771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression808 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_COMMA_in_expression812 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009C10100L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression815 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignmentExpression829 = new BitSet(new long[]{0x0000007E00000002L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpression833 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009C10100L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignmentExpression836 = new BitSet(new long[]{0x0000007E00000002L});
    public static final BitSet FOLLOW_set_in_assignmentOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOrExpression_in_conditionalExpression886 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_QUESTION_in_conditionalExpression890 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009C10100L});
    public static final BitSet FOLLOW_expression_in_conditionalExpression893 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_conditionalExpression895 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009C10100L});
    public static final BitSet FOLLOW_expression_in_conditionalExpression898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression912 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_OR_in_logicalOrExpression916 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009C10100L});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression919 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalAndExpression933 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_AND_in_logicalAndExpression937 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009C10100L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalAndExpression940 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression954 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_EQ2_in_equalityExpression960 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009C10100L});
    public static final BitSet FOLLOW_NOTEQ_in_equalityExpression965 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009C10100L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression970 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression984 = new BitSet(new long[]{0x0000F00000000002L});
    public static final BitSet FOLLOW_LT_in_relationalExpression990 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009C10100L});
    public static final BitSet FOLLOW_LTEQ_in_relationalExpression995 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009C10100L});
    public static final BitSet FOLLOW_GT_in_relationalExpression1000 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009C10100L});
    public static final BitSet FOLLOW_GTEQ_in_relationalExpression1005 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009C10100L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1010 = new BitSet(new long[]{0x0000F00000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1023 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_PLUS_in_additiveExpression1029 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009C10100L});
    public static final BitSet FOLLOW_MINUS_in_additiveExpression1034 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009C10100L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1039 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1052 = new BitSet(new long[]{0x001C000000000002L});
    public static final BitSet FOLLOW_MULT_in_multiplicativeExpression1058 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009C10100L});
    public static final BitSet FOLLOW_DIV_in_multiplicativeExpression1063 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009C10100L});
    public static final BitSet FOLLOW_PERCENT_in_multiplicativeExpression1068 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009C10100L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1073 = new BitSet(new long[]{0x001C000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_unaryExpression1091 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009C10100L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_unaryExpression1108 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009C10100L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unaryExpression1125 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009C10100L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unaryExpression1142 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009C10100L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unaryExpression1161 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009C10100L});
    public static final BitSet FOLLOW_MINUS2_in_unaryExpression1166 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009C10100L});
    public static final BitSet FOLLOW_PLUS2_in_unaryExpression1171 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009C10100L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callExpression_in_postfixExpression1187 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_MINUS2_in_postfixExpression1191 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_PLUS2_in_postfixExpression1196 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_callExpression1212 = new BitSet(new long[]{0x0000000000000002L,0x0000000005000100L});
    public static final BitSet FOLLOW_88_in_callExpression1223 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009C10100L});
    public static final BitSet FOLLOW_expression_in_callExpression1227 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_callExpression1229 = new BitSet(new long[]{0x0000000000000002L,0x0000000005000100L});
    public static final BitSet FOLLOW_90_in_callExpression1250 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_identifier_in_callExpression1254 = new BitSet(new long[]{0x0000000000000002L,0x0000000005000100L});
    public static final BitSet FOLLOW_72_in_callExpression1275 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009C10300L});
    public static final BitSet FOLLOW_expressionList_in_callExpression1279 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_callExpression1282 = new BitSet(new long[]{0x0000000000000002L,0x0000000005000100L});
    public static final BitSet FOLLOW_identifier_in_primaryExpression1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLiteral_in_primaryExpression1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpression1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionExpression_in_primaryExpression1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_primaryExpression1338 = new BitSet(new long[]{0x3F00000000000000L,0x0000000009010100L});
    public static final BitSet FOLLOW_callExpression_in_primaryExpression1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_primaryExpression1355 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009C10100L});
    public static final BitSet FOLLOW_expression_in_primaryExpression1358 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_primaryExpression1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_functionExpression1372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_functionExpression1374 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_formalParameters_in_functionExpression1376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_functionExpression1379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_functionExpression1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_formalParameters1410 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_COMMA_in_formalParameters1414 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_identifier_in_formalParameters1417 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_88_in_arrayLiteral1431 = new BitSet(new long[]{0x3FE3000000000000L,0x000000000BC10100L});
    public static final BitSet FOLLOW_expressionList_in_arrayLiteral1433 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_arrayLiteral1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_expressionList1458 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_COMMA_in_expressionList1462 = new BitSet(new long[]{0x3FE3000000000000L,0x0000000009C10100L});
    public static final BitSet FOLLOW_assignmentExpression_in_expressionList1465 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ID_in_identifier1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_synpred1167 = new BitSet(new long[]{0x0000000000000002L});

}