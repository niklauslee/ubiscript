// $ANTLR 3.0 C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g 2008-04-29 23:34:57

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "EXPR", "BLOCK", "VARDEF", "FUNDEF", "IF", "FOR", "INIT", "VARS", "COND", "UPD", "FOREACH", "WHILE", "RETURN", "BREAK", "CONTINUE", "ON", "CALL", "ARGS", "INDEX", "FIELD", "FUN", "PARAMS", "UMINUS", "UPLUS", "NEW", "ARRAY", "COMMA", "EQ", "PLUSEQ", "MINUSEQ", "MULTEQ", "DIVEQ", "PERCENTEQ", "QUESTION", "OR", "AND", "EQ2", "NOTEQ", "LT", "LTEQ", "GT", "GTEQ", "PLUS", "MINUS", "MULT", "DIV", "PERCENT", "NOT", "MINUS2", "PLUS2", "ID", "NULL", "BOOLEAN", "INTEGER", "FLOAT", "STRING", "LETTER", "DIGIT", "EXPONENT", "ESC", "LINE_COMMENT", "WS", "';'", "'{'", "'}'", "'if'", "'('", "')'", "'else'", "'for'", "'var'", "'foreach'", "'in'", "'while'", "'function'", "'return'", "'break'", "'continue'", "'on'", "':'", "'['", "']'", "'.'", "'new'"
    };
    public static final int EXPONENT=62;
    public static final int LT=42;
    public static final int WHILE=15;
    public static final int LETTER=60;
    public static final int ESC=63;
    public static final int DIVEQ=35;
    public static final int LTEQ=43;
    public static final int NEW=28;
    public static final int FOR=9;
    public static final int FLOAT=58;
    public static final int NOT=51;
    public static final int ID=54;
    public static final int AND=39;
    public static final int EOF=-1;
    public static final int BREAK=17;
    public static final int PLUSEQ=32;
    public static final int UPD=13;
    public static final int IF=8;
    public static final int INDEX=22;
    public static final int BOOLEAN=56;
    public static final int EXPR=4;
    public static final int CONTINUE=18;
    public static final int COMMA=30;
    public static final int RETURN=16;
    public static final int ARGS=21;
    public static final int PLUS=46;
    public static final int DIGIT=61;
    public static final int MINUS2=52;
    public static final int EQ=31;
    public static final int VARDEF=6;
    public static final int PLUS2=53;
    public static final int ARRAY=29;
    public static final int PARAMS=25;
    public static final int INTEGER=57;
    public static final int PERCENT=50;
    public static final int LINE_COMMENT=64;
    public static final int UPLUS=27;
    public static final int VARS=11;
    public static final int MULTEQ=34;
    public static final int NULL=55;
    public static final int ON=19;
    public static final int UMINUS=26;
    public static final int MULT=48;
    public static final int MINUS=47;
    public static final int GTEQ=45;
    public static final int EQ2=40;
    public static final int NOTEQ=41;
    public static final int WS=65;
    public static final int QUESTION=37;
    public static final int PERCENTEQ=36;
    public static final int FUNDEF=7;
    public static final int BLOCK=5;
    public static final int OR=38;
    public static final int GT=44;
    public static final int FIELD=23;
    public static final int FOREACH=14;
    public static final int CALL=20;
    public static final int DIV=49;
    public static final int FUN=24;
    public static final int COND=12;
    public static final int INIT=10;
    public static final int STRING=59;
    public static final int MINUSEQ=33;

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
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:59:1: lineInput : ( ( statement )=> statement | expression );
    public final lineInput_return lineInput() throws RecognitionException {
        lineInput_return retval = new lineInput_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        statement_return statement1 = null;

        expression_return expression2 = null;



        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:60:2: ( ( statement )=> statement | expression )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:60:4: ( statement )=> statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_lineInput164);
                    statement1=statement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, statement1.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:61:4: expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_lineInput169);
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
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:64:1: program : ( statement )* -> ^( BLOCK ( statement )* ) ;
    public final program_return program() throws RecognitionException {
        program_return retval = new program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        statement_return statement3 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:65:2: ( ( statement )* -> ^( BLOCK ( statement )* ) )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:65:4: ( statement )*
            {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:65:4: ( statement )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=PLUS && LA2_0<=MINUS)||(LA2_0>=NOT && LA2_0<=STRING)||(LA2_0>=66 && LA2_0<=67)||(LA2_0>=69 && LA2_0<=70)||(LA2_0>=73 && LA2_0<=75)||(LA2_0>=77 && LA2_0<=82)||LA2_0==84||LA2_0==87) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:65:4: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_program180);
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
            // 66:3: -> ^( BLOCK ( statement )* )
            {
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:66:6: ^( BLOCK ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(BLOCK, "BLOCK"), root_1);

                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:66:14: ( statement )*
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
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:69:1: statement : ( emptyStatement | expressionStatement | block | ifStatement | iterationStatement | variableStatement | functionStatement | jumpStatement | onStatement );
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
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:70:2: ( emptyStatement | expressionStatement | block | ifStatement | iterationStatement | variableStatement | functionStatement | jumpStatement | onStatement )
            int alt3=9;
            switch ( input.LA(1) ) {
            case 66:
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
            case 70:
            case 84:
            case 87:
                {
                alt3=2;
                }
                break;
            case 78:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==70) ) {
                    alt3=2;
                }
                else if ( (LA3_3==ID) ) {
                    alt3=7;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("69:1: statement : ( emptyStatement | expressionStatement | block | ifStatement | iterationStatement | variableStatement | functionStatement | jumpStatement | onStatement );", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case 67:
                {
                alt3=3;
                }
                break;
            case 69:
                {
                alt3=4;
                }
                break;
            case 73:
            case 75:
            case 77:
                {
                alt3=5;
                }
                break;
            case 74:
                {
                alt3=6;
                }
                break;
            case 79:
            case 80:
            case 81:
                {
                alt3=8;
                }
                break;
            case 82:
                {
                alt3=9;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("69:1: statement : ( emptyStatement | expressionStatement | block | ifStatement | iterationStatement | variableStatement | functionStatement | jumpStatement | onStatement );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:70:4: emptyStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_emptyStatement_in_statement203);
                    emptyStatement4=emptyStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, emptyStatement4.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:71:4: expressionStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expressionStatement_in_statement208);
                    expressionStatement5=expressionStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expressionStatement5.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:72:4: block
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_block_in_statement213);
                    block6=block();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, block6.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:73:4: ifStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifStatement_in_statement218);
                    ifStatement7=ifStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ifStatement7.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:74:4: iterationStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iterationStatement_in_statement223);
                    iterationStatement8=iterationStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, iterationStatement8.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:75:4: variableStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableStatement_in_statement228);
                    variableStatement9=variableStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, variableStatement9.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:76:4: functionStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionStatement_in_statement233);
                    functionStatement10=functionStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, functionStatement10.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:77:4: jumpStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_jumpStatement_in_statement238);
                    jumpStatement11=jumpStatement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, jumpStatement11.getTree());

                    }
                    break;
                case 9 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:78:4: onStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_onStatement_in_statement243);
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
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:81:1: emptyStatement : ';' ;
    public final emptyStatement_return emptyStatement() throws RecognitionException {
        emptyStatement_return retval = new emptyStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal13=null;

        Object char_literal13_tree=null;

        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:82:2: ( ';' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:82:4: ';'
            {
            root_0 = (Object)adaptor.nil();

            char_literal13=(Token)input.LT(1);
            match(input,66,FOLLOW_66_in_emptyStatement255); if (failed) return retval;

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
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:85:1: expressionStatement : expression ';' -> ^( EXPR expression ) ;
    public final expressionStatement_return expressionStatement() throws RecognitionException {
        expressionStatement_return retval = new expressionStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal15=null;
        expression_return expression14 = null;


        Object char_literal15_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:86:2: ( expression ';' -> ^( EXPR expression ) )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:86:4: expression ';'
            {
            pushFollow(FOLLOW_expression_in_expressionStatement267);
            expression14=expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_expression.add(expression14.getTree());
            char_literal15=(Token)input.LT(1);
            match(input,66,FOLLOW_66_in_expressionStatement269); if (failed) return retval;
            if ( backtracking==0 ) stream_66.add(char_literal15);


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
            // 87:3: -> ^( EXPR expression )
            {
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:87:6: ^( EXPR expression )
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
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:90:1: block : '{' ( statement )* '}' -> ^( BLOCK ( statement )* ) ;
    public final block_return block() throws RecognitionException {
        block_return retval = new block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal16=null;
        Token char_literal18=null;
        statement_return statement17 = null;


        Object char_literal16_tree=null;
        Object char_literal18_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:91:2: ( '{' ( statement )* '}' -> ^( BLOCK ( statement )* ) )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:91:4: '{' ( statement )* '}'
            {
            char_literal16=(Token)input.LT(1);
            match(input,67,FOLLOW_67_in_block291); if (failed) return retval;
            if ( backtracking==0 ) stream_67.add(char_literal16);

            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:91:8: ( statement )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=PLUS && LA4_0<=MINUS)||(LA4_0>=NOT && LA4_0<=STRING)||(LA4_0>=66 && LA4_0<=67)||(LA4_0>=69 && LA4_0<=70)||(LA4_0>=73 && LA4_0<=75)||(LA4_0>=77 && LA4_0<=82)||LA4_0==84||LA4_0==87) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:91:8: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block293);
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
            match(input,68,FOLLOW_68_in_block296); if (failed) return retval;
            if ( backtracking==0 ) stream_68.add(char_literal18);


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
            // 92:3: -> ^( BLOCK ( statement )* )
            {
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:92:6: ^( BLOCK ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(BLOCK, "BLOCK"), root_1);

                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:92:14: ( statement )*
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
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:95:1: ifStatement : 'if' '(' expr= expression ')' th= statement ( 'else' el= statement )? -> ^( IF $expr $th ( $el)? ) ;
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
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:96:2: ( 'if' '(' expr= expression ')' th= statement ( 'else' el= statement )? -> ^( IF $expr $th ( $el)? ) )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:96:4: 'if' '(' expr= expression ')' th= statement ( 'else' el= statement )?
            {
            string_literal19=(Token)input.LT(1);
            match(input,69,FOLLOW_69_in_ifStatement319); if (failed) return retval;
            if ( backtracking==0 ) stream_69.add(string_literal19);

            char_literal20=(Token)input.LT(1);
            match(input,70,FOLLOW_70_in_ifStatement321); if (failed) return retval;
            if ( backtracking==0 ) stream_70.add(char_literal20);

            pushFollow(FOLLOW_expression_in_ifStatement325);
            expr=expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_expression.add(expr.getTree());
            char_literal21=(Token)input.LT(1);
            match(input,71,FOLLOW_71_in_ifStatement327); if (failed) return retval;
            if ( backtracking==0 ) stream_71.add(char_literal21);

            pushFollow(FOLLOW_statement_in_ifStatement331);
            th=statement();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_statement.add(th.getTree());
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:96:46: ( 'else' el= statement )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==72) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:96:48: 'else' el= statement
                    {
                    string_literal22=(Token)input.LT(1);
                    match(input,72,FOLLOW_72_in_ifStatement335); if (failed) return retval;
                    if ( backtracking==0 ) stream_72.add(string_literal22);

                    pushFollow(FOLLOW_statement_in_ifStatement339);
                    el=statement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_statement.add(el.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: th, el, expr
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
            // 97:3: -> ^( IF $expr $th ( $el)? )
            {
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:97:6: ^( IF $expr $th ( $el)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(IF, "IF"), root_1);

                adaptor.addChild(root_1, stream_expr.next());
                adaptor.addChild(root_1, stream_th.next());
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:97:21: ( $el)?
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
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:100:1: iterationStatement : ( 'for' '(' (init= expression )? ';' (cond= expression )? ';' (upd= expression )? ')' statement -> ^( FOR ^( INIT ( $init)? ) ^( COND ( $cond)? ) ^( UPD ( $upd)? ) statement ) | 'for' '(' 'var' vars= variableDeclarationList ';' (cond= expression )? ';' (upd= expression )? ')' statement -> ^( FOR ^( VARS $vars) ^( COND ( $cond)? ) ^( UPD ( $upd)? ) statement ) | 'foreach' '(' id= identifier 'in' expr= expression ')' statement -> ^( FOREACH $id $expr statement ) | 'while' '(' expression ')' statement -> ^( WHILE expression statement ) );
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
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_variableDeclarationList=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarationList");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:101:2: ( 'for' '(' (init= expression )? ';' (cond= expression )? ';' (upd= expression )? ')' statement -> ^( FOR ^( INIT ( $init)? ) ^( COND ( $cond)? ) ^( UPD ( $upd)? ) statement ) | 'for' '(' 'var' vars= variableDeclarationList ';' (cond= expression )? ';' (upd= expression )? ')' statement -> ^( FOR ^( VARS $vars) ^( COND ( $cond)? ) ^( UPD ( $upd)? ) statement ) | 'foreach' '(' id= identifier 'in' expr= expression ')' statement -> ^( FOREACH $id $expr statement ) | 'while' '(' expression ')' statement -> ^( WHILE expression statement ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 73:
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==70) ) {
                    int LA11_4 = input.LA(3);

                    if ( (LA11_4==74) ) {
                        alt11=2;
                    }
                    else if ( ((LA11_4>=PLUS && LA11_4<=MINUS)||(LA11_4>=NOT && LA11_4<=STRING)||LA11_4==66||LA11_4==70||LA11_4==78||LA11_4==84||LA11_4==87) ) {
                        alt11=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("100:1: iterationStatement : ( 'for' '(' (init= expression )? ';' (cond= expression )? ';' (upd= expression )? ')' statement -> ^( FOR ^( INIT ( $init)? ) ^( COND ( $cond)? ) ^( UPD ( $upd)? ) statement ) | 'for' '(' 'var' vars= variableDeclarationList ';' (cond= expression )? ';' (upd= expression )? ')' statement -> ^( FOR ^( VARS $vars) ^( COND ( $cond)? ) ^( UPD ( $upd)? ) statement ) | 'foreach' '(' id= identifier 'in' expr= expression ')' statement -> ^( FOREACH $id $expr statement ) | 'while' '(' expression ')' statement -> ^( WHILE expression statement ) );", 11, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("100:1: iterationStatement : ( 'for' '(' (init= expression )? ';' (cond= expression )? ';' (upd= expression )? ')' statement -> ^( FOR ^( INIT ( $init)? ) ^( COND ( $cond)? ) ^( UPD ( $upd)? ) statement ) | 'for' '(' 'var' vars= variableDeclarationList ';' (cond= expression )? ';' (upd= expression )? ')' statement -> ^( FOR ^( VARS $vars) ^( COND ( $cond)? ) ^( UPD ( $upd)? ) statement ) | 'foreach' '(' id= identifier 'in' expr= expression ')' statement -> ^( FOREACH $id $expr statement ) | 'while' '(' expression ')' statement -> ^( WHILE expression statement ) );", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case 75:
                {
                alt11=3;
                }
                break;
            case 77:
                {
                alt11=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("100:1: iterationStatement : ( 'for' '(' (init= expression )? ';' (cond= expression )? ';' (upd= expression )? ')' statement -> ^( FOR ^( INIT ( $init)? ) ^( COND ( $cond)? ) ^( UPD ( $upd)? ) statement ) | 'for' '(' 'var' vars= variableDeclarationList ';' (cond= expression )? ';' (upd= expression )? ')' statement -> ^( FOR ^( VARS $vars) ^( COND ( $cond)? ) ^( UPD ( $upd)? ) statement ) | 'foreach' '(' id= identifier 'in' expr= expression ')' statement -> ^( FOREACH $id $expr statement ) | 'while' '(' expression ')' statement -> ^( WHILE expression statement ) );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:101:4: 'for' '(' (init= expression )? ';' (cond= expression )? ';' (upd= expression )? ')' statement
                    {
                    string_literal23=(Token)input.LT(1);
                    match(input,73,FOLLOW_73_in_iterationStatement371); if (failed) return retval;
                    if ( backtracking==0 ) stream_73.add(string_literal23);

                    char_literal24=(Token)input.LT(1);
                    match(input,70,FOLLOW_70_in_iterationStatement373); if (failed) return retval;
                    if ( backtracking==0 ) stream_70.add(char_literal24);

                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:101:18: (init= expression )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=PLUS && LA6_0<=MINUS)||(LA6_0>=NOT && LA6_0<=STRING)||LA6_0==70||LA6_0==78||LA6_0==84||LA6_0==87) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:101:18: init= expression
                            {
                            pushFollow(FOLLOW_expression_in_iterationStatement377);
                            init=expression();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) stream_expression.add(init.getTree());

                            }
                            break;

                    }

                    char_literal25=(Token)input.LT(1);
                    match(input,66,FOLLOW_66_in_iterationStatement380); if (failed) return retval;
                    if ( backtracking==0 ) stream_66.add(char_literal25);

                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:101:39: (cond= expression )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>=PLUS && LA7_0<=MINUS)||(LA7_0>=NOT && LA7_0<=STRING)||LA7_0==70||LA7_0==78||LA7_0==84||LA7_0==87) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:101:39: cond= expression
                            {
                            pushFollow(FOLLOW_expression_in_iterationStatement384);
                            cond=expression();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) stream_expression.add(cond.getTree());

                            }
                            break;

                    }

                    char_literal26=(Token)input.LT(1);
                    match(input,66,FOLLOW_66_in_iterationStatement387); if (failed) return retval;
                    if ( backtracking==0 ) stream_66.add(char_literal26);

                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:101:59: (upd= expression )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0>=PLUS && LA8_0<=MINUS)||(LA8_0>=NOT && LA8_0<=STRING)||LA8_0==70||LA8_0==78||LA8_0==84||LA8_0==87) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:101:59: upd= expression
                            {
                            pushFollow(FOLLOW_expression_in_iterationStatement391);
                            upd=expression();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) stream_expression.add(upd.getTree());

                            }
                            break;

                    }

                    char_literal27=(Token)input.LT(1);
                    match(input,71,FOLLOW_71_in_iterationStatement394); if (failed) return retval;
                    if ( backtracking==0 ) stream_71.add(char_literal27);

                    pushFollow(FOLLOW_statement_in_iterationStatement396);
                    statement28=statement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_statement.add(statement28.getTree());

                    // AST REWRITE
                    // elements: upd, cond, statement, init
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
                    // 102:3: -> ^( FOR ^( INIT ( $init)? ) ^( COND ( $cond)? ) ^( UPD ( $upd)? ) statement )
                    {
                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:102:6: ^( FOR ^( INIT ( $init)? ) ^( COND ( $cond)? ) ^( UPD ( $upd)? ) statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FOR, "FOR"), root_1);

                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:102:12: ^( INIT ( $init)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(INIT, "INIT"), root_2);

                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:102:19: ( $init)?
                        if ( stream_init.hasNext() ) {
                            adaptor.addChild(root_2, stream_init.next());

                        }
                        stream_init.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:102:27: ^( COND ( $cond)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(COND, "COND"), root_2);

                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:102:34: ( $cond)?
                        if ( stream_cond.hasNext() ) {
                            adaptor.addChild(root_2, stream_cond.next());

                        }
                        stream_cond.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:102:42: ^( UPD ( $upd)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(UPD, "UPD"), root_2);

                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:102:48: ( $upd)?
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
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:103:4: 'for' '(' 'var' vars= variableDeclarationList ';' (cond= expression )? ';' (upd= expression )? ')' statement
                    {
                    string_literal29=(Token)input.LT(1);
                    match(input,73,FOLLOW_73_in_iterationStatement435); if (failed) return retval;
                    if ( backtracking==0 ) stream_73.add(string_literal29);

                    char_literal30=(Token)input.LT(1);
                    match(input,70,FOLLOW_70_in_iterationStatement437); if (failed) return retval;
                    if ( backtracking==0 ) stream_70.add(char_literal30);

                    string_literal31=(Token)input.LT(1);
                    match(input,74,FOLLOW_74_in_iterationStatement439); if (failed) return retval;
                    if ( backtracking==0 ) stream_74.add(string_literal31);

                    pushFollow(FOLLOW_variableDeclarationList_in_iterationStatement443);
                    vars=variableDeclarationList();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_variableDeclarationList.add(vars.getTree());
                    char_literal32=(Token)input.LT(1);
                    match(input,66,FOLLOW_66_in_iterationStatement445); if (failed) return retval;
                    if ( backtracking==0 ) stream_66.add(char_literal32);

                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:103:57: (cond= expression )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( ((LA9_0>=PLUS && LA9_0<=MINUS)||(LA9_0>=NOT && LA9_0<=STRING)||LA9_0==70||LA9_0==78||LA9_0==84||LA9_0==87) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:103:57: cond= expression
                            {
                            pushFollow(FOLLOW_expression_in_iterationStatement449);
                            cond=expression();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) stream_expression.add(cond.getTree());

                            }
                            break;

                    }

                    char_literal33=(Token)input.LT(1);
                    match(input,66,FOLLOW_66_in_iterationStatement452); if (failed) return retval;
                    if ( backtracking==0 ) stream_66.add(char_literal33);

                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:103:77: (upd= expression )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( ((LA10_0>=PLUS && LA10_0<=MINUS)||(LA10_0>=NOT && LA10_0<=STRING)||LA10_0==70||LA10_0==78||LA10_0==84||LA10_0==87) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:103:77: upd= expression
                            {
                            pushFollow(FOLLOW_expression_in_iterationStatement456);
                            upd=expression();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) stream_expression.add(upd.getTree());

                            }
                            break;

                    }

                    char_literal34=(Token)input.LT(1);
                    match(input,71,FOLLOW_71_in_iterationStatement459); if (failed) return retval;
                    if ( backtracking==0 ) stream_71.add(char_literal34);

                    pushFollow(FOLLOW_statement_in_iterationStatement461);
                    statement35=statement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_statement.add(statement35.getTree());

                    // AST REWRITE
                    // elements: upd, cond, vars, statement
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
                    // 104:3: -> ^( FOR ^( VARS $vars) ^( COND ( $cond)? ) ^( UPD ( $upd)? ) statement )
                    {
                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:104:6: ^( FOR ^( VARS $vars) ^( COND ( $cond)? ) ^( UPD ( $upd)? ) statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(FOR, "FOR"), root_1);

                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:104:12: ^( VARS $vars)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(VARS, "VARS"), root_2);

                        adaptor.addChild(root_2, stream_vars.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:104:26: ^( COND ( $cond)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(COND, "COND"), root_2);

                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:104:33: ( $cond)?
                        if ( stream_cond.hasNext() ) {
                            adaptor.addChild(root_2, stream_cond.next());

                        }
                        stream_cond.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:104:41: ^( UPD ( $upd)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(UPD, "UPD"), root_2);

                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:104:47: ( $upd)?
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
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:105:4: 'foreach' '(' id= identifier 'in' expr= expression ')' statement
                    {
                    string_literal36=(Token)input.LT(1);
                    match(input,75,FOLLOW_75_in_iterationStatement499); if (failed) return retval;
                    if ( backtracking==0 ) stream_75.add(string_literal36);

                    char_literal37=(Token)input.LT(1);
                    match(input,70,FOLLOW_70_in_iterationStatement501); if (failed) return retval;
                    if ( backtracking==0 ) stream_70.add(char_literal37);

                    pushFollow(FOLLOW_identifier_in_iterationStatement505);
                    id=identifier();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_identifier.add(id.getTree());
                    string_literal38=(Token)input.LT(1);
                    match(input,76,FOLLOW_76_in_iterationStatement507); if (failed) return retval;
                    if ( backtracking==0 ) stream_76.add(string_literal38);

                    pushFollow(FOLLOW_expression_in_iterationStatement511);
                    expr=expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_expression.add(expr.getTree());
                    char_literal39=(Token)input.LT(1);
                    match(input,71,FOLLOW_71_in_iterationStatement513); if (failed) return retval;
                    if ( backtracking==0 ) stream_71.add(char_literal39);

                    pushFollow(FOLLOW_statement_in_iterationStatement515);
                    statement40=statement();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_statement.add(statement40.getTree());

                    // AST REWRITE
                    // elements: expr, statement, id
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
                    // 106:3: -> ^( FOREACH $id $expr statement )
                    {
                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:106:6: ^( FOREACH $id $expr statement )
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
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:107:4: 'while' '(' expression ')' statement
                    {
                    string_literal41=(Token)input.LT(1);
                    match(input,77,FOLLOW_77_in_iterationStatement536); if (failed) return retval;
                    if ( backtracking==0 ) stream_77.add(string_literal41);

                    char_literal42=(Token)input.LT(1);
                    match(input,70,FOLLOW_70_in_iterationStatement538); if (failed) return retval;
                    if ( backtracking==0 ) stream_70.add(char_literal42);

                    pushFollow(FOLLOW_expression_in_iterationStatement540);
                    expression43=expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_expression.add(expression43.getTree());
                    char_literal44=(Token)input.LT(1);
                    match(input,71,FOLLOW_71_in_iterationStatement542); if (failed) return retval;
                    if ( backtracking==0 ) stream_71.add(char_literal44);

                    pushFollow(FOLLOW_statement_in_iterationStatement544);
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
                    // 108:3: -> ^( WHILE expression statement )
                    {
                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:108:6: ^( WHILE expression statement )
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
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:111:1: variableStatement : 'var' variableDeclaration ( ',' variableDeclaration )* ';' -> ( variableDeclaration )+ ;
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
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:112:2: ( 'var' variableDeclaration ( ',' variableDeclaration )* ';' -> ( variableDeclaration )+ )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:112:4: 'var' variableDeclaration ( ',' variableDeclaration )* ';'
            {
            string_literal46=(Token)input.LT(1);
            match(input,74,FOLLOW_74_in_variableStatement567); if (failed) return retval;
            if ( backtracking==0 ) stream_74.add(string_literal46);

            pushFollow(FOLLOW_variableDeclaration_in_variableStatement569);
            variableDeclaration47=variableDeclaration();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_variableDeclaration.add(variableDeclaration47.getTree());
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:112:30: ( ',' variableDeclaration )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==COMMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:112:32: ',' variableDeclaration
            	    {
            	    char_literal48=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_variableStatement573); if (failed) return retval;
            	    if ( backtracking==0 ) stream_COMMA.add(char_literal48);

            	    pushFollow(FOLLOW_variableDeclaration_in_variableStatement575);
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
            match(input,66,FOLLOW_66_in_variableStatement580); if (failed) return retval;
            if ( backtracking==0 ) stream_66.add(char_literal50);


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
            // 113:3: -> ( variableDeclaration )+
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
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:116:1: variableDeclarationList : variableDeclaration ( ',' variableDeclaration )* -> ( variableDeclaration )+ ;
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
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:117:2: ( variableDeclaration ( ',' variableDeclaration )* -> ( variableDeclaration )+ )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:117:4: variableDeclaration ( ',' variableDeclaration )*
            {
            pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationList599);
            variableDeclaration51=variableDeclaration();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_variableDeclaration.add(variableDeclaration51.getTree());
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:117:24: ( ',' variableDeclaration )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==COMMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:117:26: ',' variableDeclaration
            	    {
            	    char_literal52=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_variableDeclarationList603); if (failed) return retval;
            	    if ( backtracking==0 ) stream_COMMA.add(char_literal52);

            	    pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationList605);
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
            // 118:3: -> ( variableDeclaration )+
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
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:121:1: variableDeclaration : identifier ( '=' assignmentExpression )? -> ^( VARDEF identifier ( assignmentExpression )? ) ;
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
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:122:2: ( identifier ( '=' assignmentExpression )? -> ^( VARDEF identifier ( assignmentExpression )? ) )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:122:4: identifier ( '=' assignmentExpression )?
            {
            pushFollow(FOLLOW_identifier_in_variableDeclaration626);
            identifier54=identifier();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_identifier.add(identifier54.getTree());
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:122:15: ( '=' assignmentExpression )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==EQ) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:122:16: '=' assignmentExpression
                    {
                    char_literal55=(Token)input.LT(1);
                    match(input,EQ,FOLLOW_EQ_in_variableDeclaration629); if (failed) return retval;
                    if ( backtracking==0 ) stream_EQ.add(char_literal55);

                    pushFollow(FOLLOW_assignmentExpression_in_variableDeclaration631);
                    assignmentExpression56=assignmentExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_assignmentExpression.add(assignmentExpression56.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: identifier, assignmentExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 123:3: -> ^( VARDEF identifier ( assignmentExpression )? )
            {
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:123:6: ^( VARDEF identifier ( assignmentExpression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(VARDEF, "VARDEF"), root_1);

                adaptor.addChild(root_1, stream_identifier.next());
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:123:26: ( assignmentExpression )?
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
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:126:1: functionStatement : 'function' identifier '(' ( formalParameters )? ')' block -> ^( FUNDEF identifier ^( PARAMS ( formalParameters )? ) block ) ;
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
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:127:2: ( 'function' identifier '(' ( formalParameters )? ')' block -> ^( FUNDEF identifier ^( PARAMS ( formalParameters )? ) block ) )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:127:4: 'function' identifier '(' ( formalParameters )? ')' block
            {
            string_literal57=(Token)input.LT(1);
            match(input,78,FOLLOW_78_in_functionStatement657); if (failed) return retval;
            if ( backtracking==0 ) stream_78.add(string_literal57);

            pushFollow(FOLLOW_identifier_in_functionStatement659);
            identifier58=identifier();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_identifier.add(identifier58.getTree());
            char_literal59=(Token)input.LT(1);
            match(input,70,FOLLOW_70_in_functionStatement661); if (failed) return retval;
            if ( backtracking==0 ) stream_70.add(char_literal59);

            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:127:30: ( formalParameters )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:127:30: formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_functionStatement663);
                    formalParameters60=formalParameters();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_formalParameters.add(formalParameters60.getTree());

                    }
                    break;

            }

            char_literal61=(Token)input.LT(1);
            match(input,71,FOLLOW_71_in_functionStatement666); if (failed) return retval;
            if ( backtracking==0 ) stream_71.add(char_literal61);

            pushFollow(FOLLOW_block_in_functionStatement668);
            block62=block();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_block.add(block62.getTree());

            // AST REWRITE
            // elements: identifier, block, formalParameters
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 128:3: -> ^( FUNDEF identifier ^( PARAMS ( formalParameters )? ) block )
            {
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:128:6: ^( FUNDEF identifier ^( PARAMS ( formalParameters )? ) block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(FUNDEF, "FUNDEF"), root_1);

                adaptor.addChild(root_1, stream_identifier.next());
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:128:26: ^( PARAMS ( formalParameters )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(adaptor.create(PARAMS, "PARAMS"), root_2);

                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:128:35: ( formalParameters )?
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
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:131:1: jumpStatement : ( 'return' ( expression )? ';' -> ^( RETURN ( expression )? ) | 'break' ';' -> ^( BREAK ) | 'continue' ';' -> ^( CONTINUE ) );
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
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:132:2: ( 'return' ( expression )? ';' -> ^( RETURN ( expression )? ) | 'break' ';' -> ^( BREAK ) | 'continue' ';' -> ^( CONTINUE ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt17=1;
                }
                break;
            case 80:
                {
                alt17=2;
                }
                break;
            case 81:
                {
                alt17=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("131:1: jumpStatement : ( 'return' ( expression )? ';' -> ^( RETURN ( expression )? ) | 'break' ';' -> ^( BREAK ) | 'continue' ';' -> ^( CONTINUE ) );", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:132:4: 'return' ( expression )? ';'
                    {
                    string_literal63=(Token)input.LT(1);
                    match(input,79,FOLLOW_79_in_jumpStatement698); if (failed) return retval;
                    if ( backtracking==0 ) stream_79.add(string_literal63);

                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:132:13: ( expression )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=PLUS && LA16_0<=MINUS)||(LA16_0>=NOT && LA16_0<=STRING)||LA16_0==70||LA16_0==78||LA16_0==84||LA16_0==87) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:132:13: expression
                            {
                            pushFollow(FOLLOW_expression_in_jumpStatement700);
                            expression64=expression();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) stream_expression.add(expression64.getTree());

                            }
                            break;

                    }

                    char_literal65=(Token)input.LT(1);
                    match(input,66,FOLLOW_66_in_jumpStatement703); if (failed) return retval;
                    if ( backtracking==0 ) stream_66.add(char_literal65);


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
                    // 133:3: -> ^( RETURN ( expression )? )
                    {
                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:133:6: ^( RETURN ( expression )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(RETURN, "RETURN"), root_1);

                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:133:15: ( expression )?
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
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:134:4: 'break' ';'
                    {
                    string_literal66=(Token)input.LT(1);
                    match(input,80,FOLLOW_80_in_jumpStatement719); if (failed) return retval;
                    if ( backtracking==0 ) stream_80.add(string_literal66);

                    char_literal67=(Token)input.LT(1);
                    match(input,66,FOLLOW_66_in_jumpStatement721); if (failed) return retval;
                    if ( backtracking==0 ) stream_66.add(char_literal67);


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
                    // 135:3: -> ^( BREAK )
                    {
                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:135:6: ^( BREAK )
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
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:136:4: 'continue' ';'
                    {
                    string_literal68=(Token)input.LT(1);
                    match(input,81,FOLLOW_81_in_jumpStatement734); if (failed) return retval;
                    if ( backtracking==0 ) stream_81.add(string_literal68);

                    char_literal69=(Token)input.LT(1);
                    match(input,66,FOLLOW_66_in_jumpStatement736); if (failed) return retval;
                    if ( backtracking==0 ) stream_66.add(char_literal69);


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
                    // 137:3: -> ^( CONTINUE )
                    {
                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:137:6: ^( CONTINUE )
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
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:140:1: onStatement : 'on' '(' expression ')' block -> ^( ON expression block ) ;
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
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:141:2: ( 'on' '(' expression ')' block -> ^( ON expression block ) )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:141:4: 'on' '(' expression ')' block
            {
            string_literal70=(Token)input.LT(1);
            match(input,82,FOLLOW_82_in_onStatement755); if (failed) return retval;
            if ( backtracking==0 ) stream_82.add(string_literal70);

            char_literal71=(Token)input.LT(1);
            match(input,70,FOLLOW_70_in_onStatement757); if (failed) return retval;
            if ( backtracking==0 ) stream_70.add(char_literal71);

            pushFollow(FOLLOW_expression_in_onStatement759);
            expression72=expression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_expression.add(expression72.getTree());
            char_literal73=(Token)input.LT(1);
            match(input,71,FOLLOW_71_in_onStatement761); if (failed) return retval;
            if ( backtracking==0 ) stream_71.add(char_literal73);

            pushFollow(FOLLOW_block_in_onStatement763);
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
            // 142:3: -> ^( ON expression block )
            {
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:142:6: ^( ON expression block )
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
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:159:1: expression : assignmentExpression ( COMMA assignmentExpression )* ;
    public final expression_return expression() throws RecognitionException {
        expression_return retval = new expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA76=null;
        assignmentExpression_return assignmentExpression75 = null;

        assignmentExpression_return assignmentExpression77 = null;


        Object COMMA76_tree=null;

        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:160:2: ( assignmentExpression ( COMMA assignmentExpression )* )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:160:4: assignmentExpression ( COMMA assignmentExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_assignmentExpression_in_expression800);
            assignmentExpression75=assignmentExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, assignmentExpression75.getTree());
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:160:25: ( COMMA assignmentExpression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==COMMA) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:160:27: COMMA assignmentExpression
            	    {
            	    COMMA76=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_expression804); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    COMMA76_tree = (Object)adaptor.create(COMMA76);
            	    root_0 = (Object)adaptor.becomeRoot(COMMA76_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_assignmentExpression_in_expression807);
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
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:163:1: assignmentExpression : conditionalExpression ( assignmentOperator conditionalExpression )* ;
    public final assignmentExpression_return assignmentExpression() throws RecognitionException {
        assignmentExpression_return retval = new assignmentExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        conditionalExpression_return conditionalExpression78 = null;

        assignmentOperator_return assignmentOperator79 = null;

        conditionalExpression_return conditionalExpression80 = null;



        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:164:2: ( conditionalExpression ( assignmentOperator conditionalExpression )* )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:164:4: conditionalExpression ( assignmentOperator conditionalExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditionalExpression_in_assignmentExpression821);
            conditionalExpression78=conditionalExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, conditionalExpression78.getTree());
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:164:26: ( assignmentOperator conditionalExpression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=EQ && LA19_0<=PERCENTEQ)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:164:28: assignmentOperator conditionalExpression
            	    {
            	    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpression825);
            	    assignmentOperator79=assignmentOperator();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(assignmentOperator79.getTree(), root_0);
            	    pushFollow(FOLLOW_conditionalExpression_in_assignmentExpression828);
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
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:167:1: assignmentOperator : ( EQ | PLUSEQ | MINUSEQ | MULTEQ | DIVEQ | PERCENTEQ );
    public final assignmentOperator_return assignmentOperator() throws RecognitionException {
        assignmentOperator_return retval = new assignmentOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set81=null;

        Object set81_tree=null;

        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:168:2: ( EQ | PLUSEQ | MINUSEQ | MULTEQ | DIVEQ | PERCENTEQ )
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
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:176:1: conditionalExpression : logicalOrExpression ( QUESTION expression ':' expression )? ;
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
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:177:2: ( logicalOrExpression ( QUESTION expression ':' expression )? )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:177:4: logicalOrExpression ( QUESTION expression ':' expression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalOrExpression_in_conditionalExpression878);
            logicalOrExpression82=logicalOrExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, logicalOrExpression82.getTree());
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:177:24: ( QUESTION expression ':' expression )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==QUESTION) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:177:26: QUESTION expression ':' expression
                    {
                    QUESTION83=(Token)input.LT(1);
                    match(input,QUESTION,FOLLOW_QUESTION_in_conditionalExpression882); if (failed) return retval;
                    if ( backtracking==0 ) {
                    QUESTION83_tree = (Object)adaptor.create(QUESTION83);
                    root_0 = (Object)adaptor.becomeRoot(QUESTION83_tree, root_0);
                    }
                    pushFollow(FOLLOW_expression_in_conditionalExpression885);
                    expression84=expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expression84.getTree());
                    char_literal85=(Token)input.LT(1);
                    match(input,83,FOLLOW_83_in_conditionalExpression887); if (failed) return retval;
                    pushFollow(FOLLOW_expression_in_conditionalExpression890);
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
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:180:1: logicalOrExpression : logicalAndExpression ( OR logicalAndExpression )* ;
    public final logicalOrExpression_return logicalOrExpression() throws RecognitionException {
        logicalOrExpression_return retval = new logicalOrExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR88=null;
        logicalAndExpression_return logicalAndExpression87 = null;

        logicalAndExpression_return logicalAndExpression89 = null;


        Object OR88_tree=null;

        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:181:2: ( logicalAndExpression ( OR logicalAndExpression )* )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:181:4: logicalAndExpression ( OR logicalAndExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression904);
            logicalAndExpression87=logicalAndExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, logicalAndExpression87.getTree());
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:181:25: ( OR logicalAndExpression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==OR) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:181:27: OR logicalAndExpression
            	    {
            	    OR88=(Token)input.LT(1);
            	    match(input,OR,FOLLOW_OR_in_logicalOrExpression908); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    OR88_tree = (Object)adaptor.create(OR88);
            	    root_0 = (Object)adaptor.becomeRoot(OR88_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression911);
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
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:184:1: logicalAndExpression : equalityExpression ( AND equalityExpression )* ;
    public final logicalAndExpression_return logicalAndExpression() throws RecognitionException {
        logicalAndExpression_return retval = new logicalAndExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND91=null;
        equalityExpression_return equalityExpression90 = null;

        equalityExpression_return equalityExpression92 = null;


        Object AND91_tree=null;

        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:185:2: ( equalityExpression ( AND equalityExpression )* )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:185:4: equalityExpression ( AND equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_logicalAndExpression925);
            equalityExpression90=equalityExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, equalityExpression90.getTree());
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:185:23: ( AND equalityExpression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==AND) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:185:25: AND equalityExpression
            	    {
            	    AND91=(Token)input.LT(1);
            	    match(input,AND,FOLLOW_AND_in_logicalAndExpression929); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    AND91_tree = (Object)adaptor.create(AND91);
            	    root_0 = (Object)adaptor.becomeRoot(AND91_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_equalityExpression_in_logicalAndExpression932);
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
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:188:1: equalityExpression : relationalExpression ( ( EQ2 | NOTEQ ) relationalExpression )* ;
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
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:189:2: ( relationalExpression ( ( EQ2 | NOTEQ ) relationalExpression )* )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:189:4: relationalExpression ( ( EQ2 | NOTEQ ) relationalExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression946);
            relationalExpression93=relationalExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, relationalExpression93.getTree());
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:189:25: ( ( EQ2 | NOTEQ ) relationalExpression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=EQ2 && LA24_0<=NOTEQ)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:189:27: ( EQ2 | NOTEQ ) relationalExpression
            	    {
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:189:27: ( EQ2 | NOTEQ )
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
            	            new NoViableAltException("189:27: ( EQ2 | NOTEQ )", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:189:29: EQ2
            	            {
            	            EQ294=(Token)input.LT(1);
            	            match(input,EQ2,FOLLOW_EQ2_in_equalityExpression952); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            EQ294_tree = (Object)adaptor.create(EQ294);
            	            root_0 = (Object)adaptor.becomeRoot(EQ294_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:189:36: NOTEQ
            	            {
            	            NOTEQ95=(Token)input.LT(1);
            	            match(input,NOTEQ,FOLLOW_NOTEQ_in_equalityExpression957); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            NOTEQ95_tree = (Object)adaptor.create(NOTEQ95);
            	            root_0 = (Object)adaptor.becomeRoot(NOTEQ95_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression962);
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
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:192:1: relationalExpression : additiveExpression ( ( LT | LTEQ | GT | GTEQ ) additiveExpression )* ;
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
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:193:2: ( additiveExpression ( ( LT | LTEQ | GT | GTEQ ) additiveExpression )* )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:193:4: additiveExpression ( ( LT | LTEQ | GT | GTEQ ) additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_relationalExpression976);
            additiveExpression97=additiveExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, additiveExpression97.getTree());
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:193:23: ( ( LT | LTEQ | GT | GTEQ ) additiveExpression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=LT && LA26_0<=GTEQ)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:193:25: ( LT | LTEQ | GT | GTEQ ) additiveExpression
            	    {
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:193:25: ( LT | LTEQ | GT | GTEQ )
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
            	            new NoViableAltException("193:25: ( LT | LTEQ | GT | GTEQ )", 25, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt25) {
            	        case 1 :
            	            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:193:27: LT
            	            {
            	            LT98=(Token)input.LT(1);
            	            match(input,LT,FOLLOW_LT_in_relationalExpression982); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            LT98_tree = (Object)adaptor.create(LT98);
            	            root_0 = (Object)adaptor.becomeRoot(LT98_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:193:33: LTEQ
            	            {
            	            LTEQ99=(Token)input.LT(1);
            	            match(input,LTEQ,FOLLOW_LTEQ_in_relationalExpression987); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            LTEQ99_tree = (Object)adaptor.create(LTEQ99);
            	            root_0 = (Object)adaptor.becomeRoot(LTEQ99_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:193:41: GT
            	            {
            	            GT100=(Token)input.LT(1);
            	            match(input,GT,FOLLOW_GT_in_relationalExpression992); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            GT100_tree = (Object)adaptor.create(GT100);
            	            root_0 = (Object)adaptor.becomeRoot(GT100_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:193:47: GTEQ
            	            {
            	            GTEQ101=(Token)input.LT(1);
            	            match(input,GTEQ,FOLLOW_GTEQ_in_relationalExpression997); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            GTEQ101_tree = (Object)adaptor.create(GTEQ101);
            	            root_0 = (Object)adaptor.becomeRoot(GTEQ101_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression1002);
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
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:196:1: additiveExpression : multiplicativeExpression ( ( PLUS | MINUS ) multiplicativeExpression )* ;
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
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:197:2: ( multiplicativeExpression ( ( PLUS | MINUS ) multiplicativeExpression )* )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:197:4: multiplicativeExpression ( ( PLUS | MINUS ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1015);
            multiplicativeExpression103=multiplicativeExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression103.getTree());
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:197:29: ( ( PLUS | MINUS ) multiplicativeExpression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=PLUS && LA28_0<=MINUS)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:197:31: ( PLUS | MINUS ) multiplicativeExpression
            	    {
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:197:31: ( PLUS | MINUS )
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
            	            new NoViableAltException("197:31: ( PLUS | MINUS )", 27, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:197:33: PLUS
            	            {
            	            PLUS104=(Token)input.LT(1);
            	            match(input,PLUS,FOLLOW_PLUS_in_additiveExpression1021); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            PLUS104_tree = (Object)adaptor.create(PLUS104);
            	            root_0 = (Object)adaptor.becomeRoot(PLUS104_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:197:41: MINUS
            	            {
            	            MINUS105=(Token)input.LT(1);
            	            match(input,MINUS,FOLLOW_MINUS_in_additiveExpression1026); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            MINUS105_tree = (Object)adaptor.create(MINUS105);
            	            root_0 = (Object)adaptor.becomeRoot(MINUS105_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1031);
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
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:200:1: multiplicativeExpression : unaryExpression ( ( MULT | DIV | PERCENT ) unaryExpression )* ;
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
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:201:2: ( unaryExpression ( ( MULT | DIV | PERCENT ) unaryExpression )* )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:201:4: unaryExpression ( ( MULT | DIV | PERCENT ) unaryExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1044);
            unaryExpression107=unaryExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, unaryExpression107.getTree());
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:201:20: ( ( MULT | DIV | PERCENT ) unaryExpression )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=MULT && LA30_0<=PERCENT)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:201:22: ( MULT | DIV | PERCENT ) unaryExpression
            	    {
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:201:22: ( MULT | DIV | PERCENT )
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
            	            new NoViableAltException("201:22: ( MULT | DIV | PERCENT )", 29, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt29) {
            	        case 1 :
            	            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:201:24: MULT
            	            {
            	            MULT108=(Token)input.LT(1);
            	            match(input,MULT,FOLLOW_MULT_in_multiplicativeExpression1050); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            MULT108_tree = (Object)adaptor.create(MULT108);
            	            root_0 = (Object)adaptor.becomeRoot(MULT108_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:201:32: DIV
            	            {
            	            DIV109=(Token)input.LT(1);
            	            match(input,DIV,FOLLOW_DIV_in_multiplicativeExpression1055); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            DIV109_tree = (Object)adaptor.create(DIV109);
            	            root_0 = (Object)adaptor.becomeRoot(DIV109_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:201:39: PERCENT
            	            {
            	            PERCENT110=(Token)input.LT(1);
            	            match(input,PERCENT,FOLLOW_PERCENT_in_multiplicativeExpression1060); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            PERCENT110_tree = (Object)adaptor.create(PERCENT110);
            	            root_0 = (Object)adaptor.becomeRoot(PERCENT110_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1065);
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
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:204:1: unaryExpression : ( postfixExpression | MINUS unaryExpression -> ^( UMINUS unaryExpression ) | PLUS unaryExpression -> ^( UPLUS unaryExpression ) | ( NOT | MINUS2 | PLUS2 ) unaryExpression );
    public final unaryExpression_return unaryExpression() throws RecognitionException {
        unaryExpression_return retval = new unaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MINUS113=null;
        Token PLUS115=null;
        Token NOT117=null;
        Token MINUS2118=null;
        Token PLUS2119=null;
        postfixExpression_return postfixExpression112 = null;

        unaryExpression_return unaryExpression114 = null;

        unaryExpression_return unaryExpression116 = null;

        unaryExpression_return unaryExpression120 = null;


        Object MINUS113_tree=null;
        Object PLUS115_tree=null;
        Object NOT117_tree=null;
        Object MINUS2118_tree=null;
        Object PLUS2119_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:205:2: ( postfixExpression | MINUS unaryExpression -> ^( UMINUS unaryExpression ) | PLUS unaryExpression -> ^( UPLUS unaryExpression ) | ( NOT | MINUS2 | PLUS2 ) unaryExpression )
            int alt32=4;
            switch ( input.LA(1) ) {
            case ID:
            case NULL:
            case BOOLEAN:
            case INTEGER:
            case FLOAT:
            case STRING:
            case 70:
            case 78:
            case 84:
            case 87:
                {
                alt32=1;
                }
                break;
            case MINUS:
                {
                alt32=2;
                }
                break;
            case PLUS:
                {
                alt32=3;
                }
                break;
            case NOT:
            case MINUS2:
            case PLUS2:
                {
                alt32=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("204:1: unaryExpression : ( postfixExpression | MINUS unaryExpression -> ^( UMINUS unaryExpression ) | PLUS unaryExpression -> ^( UPLUS unaryExpression ) | ( NOT | MINUS2 | PLUS2 ) unaryExpression );", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:205:4: postfixExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression1078);
                    postfixExpression112=postfixExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, postfixExpression112.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:206:4: MINUS unaryExpression
                    {
                    MINUS113=(Token)input.LT(1);
                    match(input,MINUS,FOLLOW_MINUS_in_unaryExpression1083); if (failed) return retval;
                    if ( backtracking==0 ) stream_MINUS.add(MINUS113);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1085);
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
                    // 207:3: -> ^( UMINUS unaryExpression )
                    {
                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:207:6: ^( UMINUS unaryExpression )
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
                case 3 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:208:4: PLUS unaryExpression
                    {
                    PLUS115=(Token)input.LT(1);
                    match(input,PLUS,FOLLOW_PLUS_in_unaryExpression1100); if (failed) return retval;
                    if ( backtracking==0 ) stream_PLUS.add(PLUS115);

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1102);
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
                    // 209:3: -> ^( UPLUS unaryExpression )
                    {
                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:209:6: ^( UPLUS unaryExpression )
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
                case 4 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:210:4: ( NOT | MINUS2 | PLUS2 ) unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:210:4: ( NOT | MINUS2 | PLUS2 )
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
                            new NoViableAltException("210:4: ( NOT | MINUS2 | PLUS2 )", 31, 0, input);

                        throw nvae;
                    }

                    switch (alt31) {
                        case 1 :
                            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:210:6: NOT
                            {
                            NOT117=(Token)input.LT(1);
                            match(input,NOT,FOLLOW_NOT_in_unaryExpression1119); if (failed) return retval;
                            if ( backtracking==0 ) {
                            NOT117_tree = (Object)adaptor.create(NOT117);
                            root_0 = (Object)adaptor.becomeRoot(NOT117_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:210:13: MINUS2
                            {
                            MINUS2118=(Token)input.LT(1);
                            match(input,MINUS2,FOLLOW_MINUS2_in_unaryExpression1124); if (failed) return retval;
                            if ( backtracking==0 ) {
                            MINUS2118_tree = (Object)adaptor.create(MINUS2118);
                            root_0 = (Object)adaptor.becomeRoot(MINUS2118_tree, root_0);
                            }

                            }
                            break;
                        case 3 :
                            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:210:23: PLUS2
                            {
                            PLUS2119=(Token)input.LT(1);
                            match(input,PLUS2,FOLLOW_PLUS2_in_unaryExpression1129); if (failed) return retval;
                            if ( backtracking==0 ) {
                            PLUS2119_tree = (Object)adaptor.create(PLUS2119);
                            root_0 = (Object)adaptor.becomeRoot(PLUS2119_tree, root_0);
                            }

                            }
                            break;

                    }

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1134);
                    unaryExpression120=unaryExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, unaryExpression120.getTree());

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
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:213:1: postfixExpression : callExpression ( MINUS2 | PLUS2 )* ;
    public final postfixExpression_return postfixExpression() throws RecognitionException {
        postfixExpression_return retval = new postfixExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MINUS2122=null;
        Token PLUS2123=null;
        callExpression_return callExpression121 = null;


        Object MINUS2122_tree=null;
        Object PLUS2123_tree=null;

        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:214:2: ( callExpression ( MINUS2 | PLUS2 )* )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:214:4: callExpression ( MINUS2 | PLUS2 )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_callExpression_in_postfixExpression1145);
            callExpression121=callExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, callExpression121.getTree());
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:214:19: ( MINUS2 | PLUS2 )*
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
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:214:21: MINUS2
            	    {
            	    MINUS2122=(Token)input.LT(1);
            	    match(input,MINUS2,FOLLOW_MINUS2_in_postfixExpression1149); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    MINUS2122_tree = (Object)adaptor.create(MINUS2122);
            	    root_0 = (Object)adaptor.becomeRoot(MINUS2122_tree, root_0);
            	    }

            	    }
            	    break;
            	case 2 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:214:31: PLUS2
            	    {
            	    PLUS2123=(Token)input.LT(1);
            	    match(input,PLUS2,FOLLOW_PLUS2_in_postfixExpression1154); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    PLUS2123_tree = (Object)adaptor.create(PLUS2123);
            	    root_0 = (Object)adaptor.becomeRoot(PLUS2123_tree, root_0);
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
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:217:1: callExpression : ( primaryExpression -> primaryExpression ) ( '[' idx= expression ']' -> ^( INDEX $callExpression $idx) | '.' id= identifier -> ^( FIELD $callExpression $id) | '(' (args= expressionList )? ')' -> ^( CALL $callExpression ^( ARGS ( $args)? ) ) )* ;
    public final callExpression_return callExpression() throws RecognitionException {
        callExpression_return retval = new callExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal125=null;
        Token char_literal126=null;
        Token char_literal127=null;
        Token char_literal128=null;
        Token char_literal129=null;
        expression_return idx = null;

        identifier_return id = null;

        expressionList_return args = null;

        primaryExpression_return primaryExpression124 = null;


        Object char_literal125_tree=null;
        Object char_literal126_tree=null;
        Object char_literal127_tree=null;
        Object char_literal128_tree=null;
        Object char_literal129_tree=null;
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
        RewriteRuleSubtreeStream stream_primaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule primaryExpression");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:218:2: ( ( primaryExpression -> primaryExpression ) ( '[' idx= expression ']' -> ^( INDEX $callExpression $idx) | '.' id= identifier -> ^( FIELD $callExpression $id) | '(' (args= expressionList )? ')' -> ^( CALL $callExpression ^( ARGS ( $args)? ) ) )* )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:218:4: ( primaryExpression -> primaryExpression ) ( '[' idx= expression ']' -> ^( INDEX $callExpression $idx) | '.' id= identifier -> ^( FIELD $callExpression $id) | '(' (args= expressionList )? ')' -> ^( CALL $callExpression ^( ARGS ( $args)? ) ) )*
            {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:218:4: ( primaryExpression -> primaryExpression )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:218:5: primaryExpression
            {
            pushFollow(FOLLOW_primaryExpression_in_callExpression1170);
            primaryExpression124=primaryExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_primaryExpression.add(primaryExpression124.getTree());

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
            // 218:23: -> primaryExpression
            {
                adaptor.addChild(root_0, stream_primaryExpression.next());

            }

            }

            }

            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:219:3: ( '[' idx= expression ']' -> ^( INDEX $callExpression $idx) | '.' id= identifier -> ^( FIELD $callExpression $id) | '(' (args= expressionList )? ')' -> ^( CALL $callExpression ^( ARGS ( $args)? ) ) )*
            loop35:
            do {
                int alt35=4;
                switch ( input.LA(1) ) {
                case 84:
                    {
                    alt35=1;
                    }
                    break;
                case 86:
                    {
                    alt35=2;
                    }
                    break;
                case 70:
                    {
                    alt35=3;
                    }
                    break;

                }

                switch (alt35) {
            	case 1 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:219:5: '[' idx= expression ']'
            	    {
            	    char_literal125=(Token)input.LT(1);
            	    match(input,84,FOLLOW_84_in_callExpression1181); if (failed) return retval;
            	    if ( backtracking==0 ) stream_84.add(char_literal125);

            	    pushFollow(FOLLOW_expression_in_callExpression1185);
            	    idx=expression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_expression.add(idx.getTree());
            	    char_literal126=(Token)input.LT(1);
            	    match(input,85,FOLLOW_85_in_callExpression1187); if (failed) return retval;
            	    if ( backtracking==0 ) stream_85.add(char_literal126);


            	    // AST REWRITE
            	    // elements: callExpression, idx
            	    // token labels: 
            	    // rule labels: retval, idx
            	    // token list labels: 
            	    // rule list labels: 
            	    if ( backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_idx=new RewriteRuleSubtreeStream(adaptor,"token idx",idx!=null?idx.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 220:4: -> ^( INDEX $callExpression $idx)
            	    {
            	        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:220:7: ^( INDEX $callExpression $idx)
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
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:221:5: '.' id= identifier
            	    {
            	    char_literal127=(Token)input.LT(1);
            	    match(input,86,FOLLOW_86_in_callExpression1208); if (failed) return retval;
            	    if ( backtracking==0 ) stream_86.add(char_literal127);

            	    pushFollow(FOLLOW_identifier_in_callExpression1212);
            	    id=identifier();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_identifier.add(id.getTree());

            	    // AST REWRITE
            	    // elements: id, callExpression
            	    // token labels: 
            	    // rule labels: id, retval
            	    // token list labels: 
            	    // rule list labels: 
            	    if ( backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"token id",id!=null?id.tree:null);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 222:4: -> ^( FIELD $callExpression $id)
            	    {
            	        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:222:7: ^( FIELD $callExpression $id)
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
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:223:5: '(' (args= expressionList )? ')'
            	    {
            	    char_literal128=(Token)input.LT(1);
            	    match(input,70,FOLLOW_70_in_callExpression1233); if (failed) return retval;
            	    if ( backtracking==0 ) stream_70.add(char_literal128);

            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:223:13: (args= expressionList )?
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( ((LA34_0>=PLUS && LA34_0<=MINUS)||(LA34_0>=NOT && LA34_0<=STRING)||LA34_0==70||LA34_0==78||LA34_0==84||LA34_0==87) ) {
            	        alt34=1;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:223:13: args= expressionList
            	            {
            	            pushFollow(FOLLOW_expressionList_in_callExpression1237);
            	            args=expressionList();
            	            _fsp--;
            	            if (failed) return retval;
            	            if ( backtracking==0 ) stream_expressionList.add(args.getTree());

            	            }
            	            break;

            	    }

            	    char_literal129=(Token)input.LT(1);
            	    match(input,71,FOLLOW_71_in_callExpression1240); if (failed) return retval;
            	    if ( backtracking==0 ) stream_71.add(char_literal129);


            	    // AST REWRITE
            	    // elements: callExpression, args
            	    // token labels: 
            	    // rule labels: retval, args
            	    // token list labels: 
            	    // rule list labels: 
            	    if ( backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"token args",args!=null?args.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 224:4: -> ^( CALL $callExpression ^( ARGS ( $args)? ) )
            	    {
            	        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:224:7: ^( CALL $callExpression ^( ARGS ( $args)? ) )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(CALL, "CALL"), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:224:30: ^( ARGS ( $args)? )
            	        {
            	        Object root_2 = (Object)adaptor.nil();
            	        root_2 = (Object)adaptor.becomeRoot(adaptor.create(ARGS, "ARGS"), root_2);

            	        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:224:37: ( $args)?
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
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:228:1: primaryExpression : ( identifier | arrayLiteral | literal | functionExpression | 'new' callExpression -> ^( NEW callExpression ) | '(' expression ')' );
    public final primaryExpression_return primaryExpression() throws RecognitionException {
        primaryExpression_return retval = new primaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal134=null;
        Token char_literal136=null;
        Token char_literal138=null;
        identifier_return identifier130 = null;

        arrayLiteral_return arrayLiteral131 = null;

        literal_return literal132 = null;

        functionExpression_return functionExpression133 = null;

        callExpression_return callExpression135 = null;

        expression_return expression137 = null;


        Object string_literal134_tree=null;
        Object char_literal136_tree=null;
        Object char_literal138_tree=null;
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleSubtreeStream stream_callExpression=new RewriteRuleSubtreeStream(adaptor,"rule callExpression");
        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:229:2: ( identifier | arrayLiteral | literal | functionExpression | 'new' callExpression -> ^( NEW callExpression ) | '(' expression ')' )
            int alt36=6;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt36=1;
                }
                break;
            case 84:
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
            case 78:
                {
                alt36=4;
                }
                break;
            case 87:
                {
                alt36=5;
                }
                break;
            case 70:
                {
                alt36=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("228:1: primaryExpression : ( identifier | arrayLiteral | literal | functionExpression | 'new' callExpression -> ^( NEW callExpression ) | '(' expression ')' );", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:229:4: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_primaryExpression1276);
                    identifier130=identifier();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, identifier130.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:230:4: arrayLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arrayLiteral_in_primaryExpression1281);
                    arrayLiteral131=arrayLiteral();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, arrayLiteral131.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:231:4: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_primaryExpression1286);
                    literal132=literal();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, literal132.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:232:4: functionExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionExpression_in_primaryExpression1291);
                    functionExpression133=functionExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, functionExpression133.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:233:4: 'new' callExpression
                    {
                    string_literal134=(Token)input.LT(1);
                    match(input,87,FOLLOW_87_in_primaryExpression1296); if (failed) return retval;
                    if ( backtracking==0 ) stream_87.add(string_literal134);

                    pushFollow(FOLLOW_callExpression_in_primaryExpression1298);
                    callExpression135=callExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_callExpression.add(callExpression135.getTree());

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
                    // 234:3: -> ^( NEW callExpression )
                    {
                        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:234:6: ^( NEW callExpression )
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
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:235:4: '(' expression ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal136=(Token)input.LT(1);
                    match(input,70,FOLLOW_70_in_primaryExpression1313); if (failed) return retval;
                    pushFollow(FOLLOW_expression_in_primaryExpression1316);
                    expression137=expression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expression137.getTree());
                    char_literal138=(Token)input.LT(1);
                    match(input,71,FOLLOW_71_in_primaryExpression1318); if (failed) return retval;

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
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:238:1: functionExpression : 'function' '(' ( formalParameters )? ')' block -> ^( FUN ^( PARAMS ( formalParameters )? ) block ) ;
    public final functionExpression_return functionExpression() throws RecognitionException {
        functionExpression_return retval = new functionExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal139=null;
        Token char_literal140=null;
        Token char_literal142=null;
        formalParameters_return formalParameters141 = null;

        block_return block143 = null;


        Object string_literal139_tree=null;
        Object char_literal140_tree=null;
        Object char_literal142_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:239:2: ( 'function' '(' ( formalParameters )? ')' block -> ^( FUN ^( PARAMS ( formalParameters )? ) block ) )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:239:4: 'function' '(' ( formalParameters )? ')' block
            {
            string_literal139=(Token)input.LT(1);
            match(input,78,FOLLOW_78_in_functionExpression1330); if (failed) return retval;
            if ( backtracking==0 ) stream_78.add(string_literal139);

            char_literal140=(Token)input.LT(1);
            match(input,70,FOLLOW_70_in_functionExpression1332); if (failed) return retval;
            if ( backtracking==0 ) stream_70.add(char_literal140);

            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:239:19: ( formalParameters )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==ID) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:239:19: formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_functionExpression1334);
                    formalParameters141=formalParameters();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_formalParameters.add(formalParameters141.getTree());

                    }
                    break;

            }

            char_literal142=(Token)input.LT(1);
            match(input,71,FOLLOW_71_in_functionExpression1337); if (failed) return retval;
            if ( backtracking==0 ) stream_71.add(char_literal142);

            pushFollow(FOLLOW_block_in_functionExpression1339);
            block143=block();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_block.add(block143.getTree());

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
            // 240:3: -> ^( FUN ^( PARAMS ( formalParameters )? ) block )
            {
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:240:6: ^( FUN ^( PARAMS ( formalParameters )? ) block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(FUN, "FUN"), root_1);

                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:240:12: ^( PARAMS ( formalParameters )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(adaptor.create(PARAMS, "PARAMS"), root_2);

                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:240:21: ( formalParameters )?
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
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:243:1: formalParameters : identifier ( ',' identifier )* ;
    public final formalParameters_return formalParameters() throws RecognitionException {
        formalParameters_return retval = new formalParameters_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal145=null;
        identifier_return identifier144 = null;

        identifier_return identifier146 = null;


        Object char_literal145_tree=null;

        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:244:2: ( identifier ( ',' identifier )* )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:244:4: identifier ( ',' identifier )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_formalParameters1368);
            identifier144=identifier();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, identifier144.getTree());
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:244:15: ( ',' identifier )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==COMMA) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:244:17: ',' identifier
            	    {
            	    char_literal145=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_formalParameters1372); if (failed) return retval;
            	    pushFollow(FOLLOW_identifier_in_formalParameters1375);
            	    identifier146=identifier();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, identifier146.getTree());

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
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:247:1: arrayLiteral : '[' ( expressionList )? ']' -> ^( ARRAY ( expressionList )? ) ;
    public final arrayLiteral_return arrayLiteral() throws RecognitionException {
        arrayLiteral_return retval = new arrayLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal147=null;
        Token char_literal149=null;
        expressionList_return expressionList148 = null;


        Object char_literal147_tree=null;
        Object char_literal149_tree=null;
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_expressionList=new RewriteRuleSubtreeStream(adaptor,"rule expressionList");
        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:248:2: ( '[' ( expressionList )? ']' -> ^( ARRAY ( expressionList )? ) )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:248:4: '[' ( expressionList )? ']'
            {
            char_literal147=(Token)input.LT(1);
            match(input,84,FOLLOW_84_in_arrayLiteral1389); if (failed) return retval;
            if ( backtracking==0 ) stream_84.add(char_literal147);

            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:248:8: ( expressionList )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=PLUS && LA39_0<=MINUS)||(LA39_0>=NOT && LA39_0<=STRING)||LA39_0==70||LA39_0==78||LA39_0==84||LA39_0==87) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:248:8: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_arrayLiteral1391);
                    expressionList148=expressionList();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_expressionList.add(expressionList148.getTree());

                    }
                    break;

            }

            char_literal149=(Token)input.LT(1);
            match(input,85,FOLLOW_85_in_arrayLiteral1394); if (failed) return retval;
            if ( backtracking==0 ) stream_85.add(char_literal149);


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
            // 249:3: -> ^( ARRAY ( expressionList )? )
            {
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:249:6: ^( ARRAY ( expressionList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ARRAY, "ARRAY"), root_1);

                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:249:14: ( expressionList )?
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
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:252:1: expressionList : assignmentExpression ( ',' assignmentExpression )* ;
    public final expressionList_return expressionList() throws RecognitionException {
        expressionList_return retval = new expressionList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal151=null;
        assignmentExpression_return assignmentExpression150 = null;

        assignmentExpression_return assignmentExpression152 = null;


        Object char_literal151_tree=null;

        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:253:2: ( assignmentExpression ( ',' assignmentExpression )* )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:253:4: assignmentExpression ( ',' assignmentExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_assignmentExpression_in_expressionList1416);
            assignmentExpression150=assignmentExpression();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, assignmentExpression150.getTree());
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:253:25: ( ',' assignmentExpression )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==COMMA) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:253:27: ',' assignmentExpression
            	    {
            	    char_literal151=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_expressionList1420); if (failed) return retval;
            	    pushFollow(FOLLOW_assignmentExpression_in_expressionList1423);
            	    assignmentExpression152=assignmentExpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, assignmentExpression152.getTree());

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
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:256:1: identifier : ID ;
    public final identifier_return identifier() throws RecognitionException {
        identifier_return retval = new identifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID153=null;

        Object ID153_tree=null;

        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:257:2: ( ID )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:257:4: ID
            {
            root_0 = (Object)adaptor.nil();

            ID153=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_identifier1437); if (failed) return retval;
            if ( backtracking==0 ) {
            ID153_tree = (Object)adaptor.create(ID153);
            adaptor.addChild(root_0, ID153_tree);
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
    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:260:1: literal : ( NULL | BOOLEAN | INTEGER | FLOAT | STRING );
    public final literal_return literal() throws RecognitionException {
        literal_return retval = new literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set154=null;

        Object set154_tree=null;

        try {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:261:2: ( NULL | BOOLEAN | INTEGER | FLOAT | STRING )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:
            {
            root_0 = (Object)adaptor.nil();

            set154=(Token)input.LT(1);
            if ( (input.LA(1)>=NULL && input.LA(1)<=STRING) ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set154));
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
        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:60:4: ( statement )
        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:60:5: statement
        {
        pushFollow(FOLLOW_statement_in_synpred1159);
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
        "\56\uffff";
    static final String DFA1_eofS =
        "\2\uffff\1\54\1\uffff\1\54\51\uffff";
    static final String DFA1_minS =
        "\1\56\1\uffff\1\36\1\0\1\36\10\0\12\uffff\25\0\2\uffff";
    static final String DFA1_maxS =
        "\1\127\1\uffff\1\126\1\0\1\126\10\0\12\uffff\25\0\2\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\13\uffff\12\1\25\uffff\1\2\1\1";
    static final String DFA1_specialS =
        "\1\2\1\uffff\1\3\1\0\1\1\51\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\11\1\10\3\uffff\1\12\1\13\1\14\1\2\5\4\6\uffff\1\1\1\15\1"+
            "\uffff\1\16\1\7\2\uffff\1\17\1\22\1\20\1\uffff\1\21\1\5\1\23"+
            "\1\24\1\25\1\26\1\uffff\1\3\2\uffff\1\6",
            "",
            "\1\53\6\52\1\51\1\50\1\47\1\45\1\46\1\41\1\42\1\43\1\44\1\37"+
            "\1\40\1\34\1\35\1\36\1\uffff\1\32\1\33\14\uffff\1\55\3\uffff"+
            "\1\31\15\uffff\1\27\1\uffff\1\30",
            "\1\uffff",
            "\1\53\6\52\1\51\1\50\1\47\1\45\1\46\1\41\1\42\1\43\1\44\1\37"+
            "\1\40\1\34\1\35\1\36\1\uffff\1\32\1\33\14\uffff\1\55\3\uffff"+
            "\1\31\15\uffff\1\27\1\uffff\1\30",
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
            return "59:1: lineInput : ( ( statement )=> statement | expression );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_3 = input.LA(1);

                         
                        int index1_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 45;}

                        else if ( (true) ) {s = 44;}

                         
                        input.seek(index1_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA1_4 = input.LA(1);

                         
                        int index1_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_4==84) ) {s = 23;}

                        else if ( (LA1_4==86) ) {s = 24;}

                        else if ( (LA1_4==70) ) {s = 25;}

                        else if ( (LA1_4==MINUS2) ) {s = 26;}

                        else if ( (LA1_4==PLUS2) ) {s = 27;}

                        else if ( (LA1_4==MULT) ) {s = 28;}

                        else if ( (LA1_4==DIV) ) {s = 29;}

                        else if ( (LA1_4==PERCENT) ) {s = 30;}

                        else if ( (LA1_4==PLUS) ) {s = 31;}

                        else if ( (LA1_4==MINUS) ) {s = 32;}

                        else if ( (LA1_4==LT) ) {s = 33;}

                        else if ( (LA1_4==LTEQ) ) {s = 34;}

                        else if ( (LA1_4==GT) ) {s = 35;}

                        else if ( (LA1_4==GTEQ) ) {s = 36;}

                        else if ( (LA1_4==EQ2) ) {s = 37;}

                        else if ( (LA1_4==NOTEQ) ) {s = 38;}

                        else if ( (LA1_4==AND) ) {s = 39;}

                        else if ( (LA1_4==OR) ) {s = 40;}

                        else if ( (LA1_4==QUESTION) ) {s = 41;}

                        else if ( ((LA1_4>=EQ && LA1_4<=PERCENTEQ)) ) {s = 42;}

                        else if ( (LA1_4==COMMA) ) {s = 43;}

                        else if ( (LA1_4==66) && (synpred1())) {s = 45;}

                        else if ( (LA1_4==EOF) ) {s = 44;}

                         
                        input.seek(index1_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA1_0 = input.LA(1);

                         
                        int index1_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_0==66) && (synpred1())) {s = 1;}

                        else if ( (LA1_0==ID) ) {s = 2;}

                        else if ( (LA1_0==84) ) {s = 3;}

                        else if ( ((LA1_0>=NULL && LA1_0<=STRING)) ) {s = 4;}

                        else if ( (LA1_0==78) ) {s = 5;}

                        else if ( (LA1_0==87) ) {s = 6;}

                        else if ( (LA1_0==70) ) {s = 7;}

                        else if ( (LA1_0==MINUS) ) {s = 8;}

                        else if ( (LA1_0==PLUS) ) {s = 9;}

                        else if ( (LA1_0==NOT) ) {s = 10;}

                        else if ( (LA1_0==MINUS2) ) {s = 11;}

                        else if ( (LA1_0==PLUS2) ) {s = 12;}

                        else if ( (LA1_0==67) && (synpred1())) {s = 13;}

                        else if ( (LA1_0==69) && (synpred1())) {s = 14;}

                        else if ( (LA1_0==73) && (synpred1())) {s = 15;}

                        else if ( (LA1_0==75) && (synpred1())) {s = 16;}

                        else if ( (LA1_0==77) && (synpred1())) {s = 17;}

                        else if ( (LA1_0==74) && (synpred1())) {s = 18;}

                        else if ( (LA1_0==79) && (synpred1())) {s = 19;}

                        else if ( (LA1_0==80) && (synpred1())) {s = 20;}

                        else if ( (LA1_0==81) && (synpred1())) {s = 21;}

                        else if ( (LA1_0==82) && (synpred1())) {s = 22;}

                         
                        input.seek(index1_0);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA1_2 = input.LA(1);

                         
                        int index1_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_2==84) ) {s = 23;}

                        else if ( (LA1_2==86) ) {s = 24;}

                        else if ( (LA1_2==70) ) {s = 25;}

                        else if ( (LA1_2==MINUS2) ) {s = 26;}

                        else if ( (LA1_2==PLUS2) ) {s = 27;}

                        else if ( (LA1_2==MULT) ) {s = 28;}

                        else if ( (LA1_2==DIV) ) {s = 29;}

                        else if ( (LA1_2==PERCENT) ) {s = 30;}

                        else if ( (LA1_2==PLUS) ) {s = 31;}

                        else if ( (LA1_2==MINUS) ) {s = 32;}

                        else if ( (LA1_2==LT) ) {s = 33;}

                        else if ( (LA1_2==LTEQ) ) {s = 34;}

                        else if ( (LA1_2==GT) ) {s = 35;}

                        else if ( (LA1_2==GTEQ) ) {s = 36;}

                        else if ( (LA1_2==EQ2) ) {s = 37;}

                        else if ( (LA1_2==NOTEQ) ) {s = 38;}

                        else if ( (LA1_2==AND) ) {s = 39;}

                        else if ( (LA1_2==OR) ) {s = 40;}

                        else if ( (LA1_2==QUESTION) ) {s = 41;}

                        else if ( ((LA1_2>=EQ && LA1_2<=PERCENTEQ)) ) {s = 42;}

                        else if ( (LA1_2==COMMA) ) {s = 43;}

                        else if ( (LA1_2==EOF) ) {s = 44;}

                        else if ( (LA1_2==66) && (synpred1())) {s = 45;}

                         
                        input.seek(index1_2);
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
 

    public static final BitSet FOLLOW_statement_in_lineInput164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_lineInput169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_program180 = new BitSet(new long[]{0x0FF8C00000000002L,0x000000000097EE6CL});
    public static final BitSet FOLLOW_emptyStatement_in_statement203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStatement_in_statement208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterationStatement_in_statement223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableStatement_in_statement228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionStatement_in_statement233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jumpStatement_in_statement238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_onStatement_in_statement243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_emptyStatement255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionStatement267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_expressionStatement269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_block291 = new BitSet(new long[]{0x0FF8C00000000000L,0x000000000097EE7CL});
    public static final BitSet FOLLOW_statement_in_block293 = new BitSet(new long[]{0x0FF8C00000000000L,0x000000000097EE7CL});
    public static final BitSet FOLLOW_68_in_block296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ifStatement319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ifStatement321 = new BitSet(new long[]{0x0FF8C00000000000L,0x0000000000904040L});
    public static final BitSet FOLLOW_expression_in_ifStatement325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ifStatement327 = new BitSet(new long[]{0x0FF8C00000000000L,0x000000000097EE6CL});
    public static final BitSet FOLLOW_statement_in_ifStatement331 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ifStatement335 = new BitSet(new long[]{0x0FF8C00000000000L,0x000000000097EE6CL});
    public static final BitSet FOLLOW_statement_in_ifStatement339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_iterationStatement371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_iterationStatement373 = new BitSet(new long[]{0x0FF8C00000000000L,0x0000000000904044L});
    public static final BitSet FOLLOW_expression_in_iterationStatement377 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_iterationStatement380 = new BitSet(new long[]{0x0FF8C00000000000L,0x0000000000904044L});
    public static final BitSet FOLLOW_expression_in_iterationStatement384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_iterationStatement387 = new BitSet(new long[]{0x0FF8C00000000000L,0x00000000009040C0L});
    public static final BitSet FOLLOW_expression_in_iterationStatement391 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_iterationStatement394 = new BitSet(new long[]{0x0FF8C00000000000L,0x000000000097EE6CL});
    public static final BitSet FOLLOW_statement_in_iterationStatement396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_iterationStatement435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_iterationStatement437 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_iterationStatement439 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_variableDeclarationList_in_iterationStatement443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_iterationStatement445 = new BitSet(new long[]{0x0FF8C00000000000L,0x0000000000904044L});
    public static final BitSet FOLLOW_expression_in_iterationStatement449 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_iterationStatement452 = new BitSet(new long[]{0x0FF8C00000000000L,0x00000000009040C0L});
    public static final BitSet FOLLOW_expression_in_iterationStatement456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_iterationStatement459 = new BitSet(new long[]{0x0FF8C00000000000L,0x000000000097EE6CL});
    public static final BitSet FOLLOW_statement_in_iterationStatement461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_iterationStatement499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_iterationStatement501 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_identifier_in_iterationStatement505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_iterationStatement507 = new BitSet(new long[]{0x0FF8C00000000000L,0x0000000000904040L});
    public static final BitSet FOLLOW_expression_in_iterationStatement511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_iterationStatement513 = new BitSet(new long[]{0x0FF8C00000000000L,0x000000000097EE6CL});
    public static final BitSet FOLLOW_statement_in_iterationStatement515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_iterationStatement536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_iterationStatement538 = new BitSet(new long[]{0x0FF8C00000000000L,0x0000000000904040L});
    public static final BitSet FOLLOW_expression_in_iterationStatement540 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_iterationStatement542 = new BitSet(new long[]{0x0FF8C00000000000L,0x000000000097EE6CL});
    public static final BitSet FOLLOW_statement_in_iterationStatement544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_variableStatement567 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableStatement569 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_COMMA_in_variableStatement573 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableStatement575 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_variableStatement580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationList599 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_variableDeclarationList603 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationList605 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_identifier_in_variableDeclaration626 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_EQ_in_variableDeclaration629 = new BitSet(new long[]{0x0FF8C00000000000L,0x0000000000904040L});
    public static final BitSet FOLLOW_assignmentExpression_in_variableDeclaration631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_functionStatement657 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_identifier_in_functionStatement659 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_functionStatement661 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_formalParameters_in_functionStatement663 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_functionStatement666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_functionStatement668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_jumpStatement698 = new BitSet(new long[]{0x0FF8C00000000000L,0x0000000000904044L});
    public static final BitSet FOLLOW_expression_in_jumpStatement700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_jumpStatement703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_jumpStatement719 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_jumpStatement721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_jumpStatement734 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_jumpStatement736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_onStatement755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_onStatement757 = new BitSet(new long[]{0x0FF8C00000000000L,0x0000000000904040L});
    public static final BitSet FOLLOW_expression_in_onStatement759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_onStatement761 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_onStatement763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression800 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_expression804 = new BitSet(new long[]{0x0FF8C00000000000L,0x0000000000904040L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression807 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignmentExpression821 = new BitSet(new long[]{0x0000001F80000002L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpression825 = new BitSet(new long[]{0x0FF8C00000000000L,0x0000000000904040L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignmentExpression828 = new BitSet(new long[]{0x0000001F80000002L});
    public static final BitSet FOLLOW_set_in_assignmentOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOrExpression_in_conditionalExpression878 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_QUESTION_in_conditionalExpression882 = new BitSet(new long[]{0x0FF8C00000000000L,0x0000000000904040L});
    public static final BitSet FOLLOW_expression_in_conditionalExpression885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_conditionalExpression887 = new BitSet(new long[]{0x0FF8C00000000000L,0x0000000000904040L});
    public static final BitSet FOLLOW_expression_in_conditionalExpression890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression904 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_OR_in_logicalOrExpression908 = new BitSet(new long[]{0x0FF8C00000000000L,0x0000000000904040L});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression911 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalAndExpression925 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_AND_in_logicalAndExpression929 = new BitSet(new long[]{0x0FF8C00000000000L,0x0000000000904040L});
    public static final BitSet FOLLOW_equalityExpression_in_logicalAndExpression932 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression946 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_EQ2_in_equalityExpression952 = new BitSet(new long[]{0x0FF8C00000000000L,0x0000000000904040L});
    public static final BitSet FOLLOW_NOTEQ_in_equalityExpression957 = new BitSet(new long[]{0x0FF8C00000000000L,0x0000000000904040L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression962 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression976 = new BitSet(new long[]{0x00003C0000000002L});
    public static final BitSet FOLLOW_LT_in_relationalExpression982 = new BitSet(new long[]{0x0FF8C00000000000L,0x0000000000904040L});
    public static final BitSet FOLLOW_LTEQ_in_relationalExpression987 = new BitSet(new long[]{0x0FF8C00000000000L,0x0000000000904040L});
    public static final BitSet FOLLOW_GT_in_relationalExpression992 = new BitSet(new long[]{0x0FF8C00000000000L,0x0000000000904040L});
    public static final BitSet FOLLOW_GTEQ_in_relationalExpression997 = new BitSet(new long[]{0x0FF8C00000000000L,0x0000000000904040L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1002 = new BitSet(new long[]{0x00003C0000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1015 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_PLUS_in_additiveExpression1021 = new BitSet(new long[]{0x0FF8C00000000000L,0x0000000000904040L});
    public static final BitSet FOLLOW_MINUS_in_additiveExpression1026 = new BitSet(new long[]{0x0FF8C00000000000L,0x0000000000904040L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1031 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1044 = new BitSet(new long[]{0x0007000000000002L});
    public static final BitSet FOLLOW_MULT_in_multiplicativeExpression1050 = new BitSet(new long[]{0x0FF8C00000000000L,0x0000000000904040L});
    public static final BitSet FOLLOW_DIV_in_multiplicativeExpression1055 = new BitSet(new long[]{0x0FF8C00000000000L,0x0000000000904040L});
    public static final BitSet FOLLOW_PERCENT_in_multiplicativeExpression1060 = new BitSet(new long[]{0x0FF8C00000000000L,0x0000000000904040L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1065 = new BitSet(new long[]{0x0007000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unaryExpression1083 = new BitSet(new long[]{0x0FF8C00000000000L,0x0000000000904040L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unaryExpression1100 = new BitSet(new long[]{0x0FF8C00000000000L,0x0000000000904040L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unaryExpression1119 = new BitSet(new long[]{0x0FF8C00000000000L,0x0000000000904040L});
    public static final BitSet FOLLOW_MINUS2_in_unaryExpression1124 = new BitSet(new long[]{0x0FF8C00000000000L,0x0000000000904040L});
    public static final BitSet FOLLOW_PLUS2_in_unaryExpression1129 = new BitSet(new long[]{0x0FF8C00000000000L,0x0000000000904040L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callExpression_in_postfixExpression1145 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_MINUS2_in_postfixExpression1149 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_PLUS2_in_postfixExpression1154 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_callExpression1170 = new BitSet(new long[]{0x0000000000000002L,0x0000000000500040L});
    public static final BitSet FOLLOW_84_in_callExpression1181 = new BitSet(new long[]{0x0FF8C00000000000L,0x0000000000904040L});
    public static final BitSet FOLLOW_expression_in_callExpression1185 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_callExpression1187 = new BitSet(new long[]{0x0000000000000002L,0x0000000000500040L});
    public static final BitSet FOLLOW_86_in_callExpression1208 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_identifier_in_callExpression1212 = new BitSet(new long[]{0x0000000000000002L,0x0000000000500040L});
    public static final BitSet FOLLOW_70_in_callExpression1233 = new BitSet(new long[]{0x0FF8C00000000000L,0x00000000009040C0L});
    public static final BitSet FOLLOW_expressionList_in_callExpression1237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_callExpression1240 = new BitSet(new long[]{0x0000000000000002L,0x0000000000500040L});
    public static final BitSet FOLLOW_identifier_in_primaryExpression1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLiteral_in_primaryExpression1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpression1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionExpression_in_primaryExpression1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_primaryExpression1296 = new BitSet(new long[]{0x0FC0000000000000L,0x0000000000904040L});
    public static final BitSet FOLLOW_callExpression_in_primaryExpression1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_primaryExpression1313 = new BitSet(new long[]{0x0FF8C00000000000L,0x0000000000904040L});
    public static final BitSet FOLLOW_expression_in_primaryExpression1316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_primaryExpression1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_functionExpression1330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_functionExpression1332 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_formalParameters_in_functionExpression1334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_functionExpression1337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_functionExpression1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_formalParameters1368 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_formalParameters1372 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_identifier_in_formalParameters1375 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_84_in_arrayLiteral1389 = new BitSet(new long[]{0x0FF8C00000000000L,0x0000000000B04040L});
    public static final BitSet FOLLOW_expressionList_in_arrayLiteral1391 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_arrayLiteral1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_expressionList1416 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_expressionList1420 = new BitSet(new long[]{0x0FF8C00000000000L,0x0000000000904040L});
    public static final BitSet FOLLOW_assignmentExpression_in_expressionList1423 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ID_in_identifier1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_synpred1159 = new BitSet(new long[]{0x0000000000000002L});

}