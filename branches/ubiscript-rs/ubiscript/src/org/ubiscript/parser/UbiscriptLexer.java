// $ANTLR 3.0.1 C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g 2008-05-11 14:25:43

package org.ubiscript.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class UbiscriptLexer extends Lexer {
    public static final int LT=44;
    public static final int EXPONENT=64;
    public static final int WHILE=15;
    public static final int LETTER=62;
    public static final int NEW=28;
    public static final int NOT=53;
    public static final int EOF=-1;
    public static final int BREAK=17;
    public static final int UPD=13;
    public static final int RETURN=16;
    public static final int ARGS=21;
    public static final int MINUS2=54;
    public static final int EQ=33;
    public static final int VARDEF=6;
    public static final int ARRAY=29;
    public static final int LINE_COMMENT=66;
    public static final int MULTEQ=36;
    public static final int NULL=57;
    public static final int ON=19;
    public static final int DELETE=30;
    public static final int MULT=50;
    public static final int WS=67;
    public static final int TYPEOF=31;
    public static final int FUNDEF=7;
    public static final int OR=40;
    public static final int GT=46;
    public static final int FIELD=23;
    public static final int FOREACH=14;
    public static final int CALL=20;
    public static final int FUN=24;
    public static final int INIT=10;
    public static final int MINUSEQ=35;
    public static final int T75=75;
    public static final int T76=76;
    public static final int T73=73;
    public static final int T74=74;
    public static final int T79=79;
    public static final int T77=77;
    public static final int T78=78;
    public static final int ESC=65;
    public static final int DIVEQ=37;
    public static final int LTEQ=45;
    public static final int FOR=9;
    public static final int FLOAT=60;
    public static final int ID=56;
    public static final int AND=41;
    public static final int PLUSEQ=34;
    public static final int T72=72;
    public static final int T71=71;
    public static final int IF=8;
    public static final int T70=70;
    public static final int INDEX=22;
    public static final int EXPR=4;
    public static final int BOOLEAN=58;
    public static final int T68=68;
    public static final int T69=69;
    public static final int CONTINUE=18;
    public static final int COMMA=32;
    public static final int PLUS=48;
    public static final int DIGIT=63;
    public static final int PLUS2=55;
    public static final int PARAMS=25;
    public static final int INTEGER=59;
    public static final int PERCENT=52;
    public static final int UPLUS=27;
    public static final int VARS=11;
    public static final int UMINUS=26;
    public static final int MINUS=49;
    public static final int GTEQ=47;
    public static final int Tokens=92;
    public static final int T91=91;
    public static final int T90=90;
    public static final int EQ2=42;
    public static final int T88=88;
    public static final int T89=89;
    public static final int NOTEQ=43;
    public static final int T84=84;
    public static final int T85=85;
    public static final int QUESTION=39;
    public static final int T86=86;
    public static final int PERCENTEQ=38;
    public static final int T87=87;
    public static final int BLOCK=5;
    public static final int DIV=51;
    public static final int T81=81;
    public static final int COND=12;
    public static final int T80=80;
    public static final int T83=83;
    public static final int T82=82;
    public static final int STRING=61;
    public UbiscriptLexer() {;} 
    public UbiscriptLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g"; }

    // $ANTLR start T68
    public final void mT68() throws RecognitionException {
        try {
            int _type = T68;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:6:5: ( ';' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:6:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T68

    // $ANTLR start T69
    public final void mT69() throws RecognitionException {
        try {
            int _type = T69;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:7:5: ( '{' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:7:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T69

    // $ANTLR start T70
    public final void mT70() throws RecognitionException {
        try {
            int _type = T70;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:8:5: ( '}' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:8:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T70

    // $ANTLR start T71
    public final void mT71() throws RecognitionException {
        try {
            int _type = T71;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:9:5: ( 'if' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:9:7: 'if'
            {
            match("if"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T71

    // $ANTLR start T72
    public final void mT72() throws RecognitionException {
        try {
            int _type = T72;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:10:5: ( '(' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:10:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T72

    // $ANTLR start T73
    public final void mT73() throws RecognitionException {
        try {
            int _type = T73;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:11:5: ( ')' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:11:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T73

    // $ANTLR start T74
    public final void mT74() throws RecognitionException {
        try {
            int _type = T74;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:12:5: ( 'else' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:12:7: 'else'
            {
            match("else"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T74

    // $ANTLR start T75
    public final void mT75() throws RecognitionException {
        try {
            int _type = T75;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:13:5: ( 'for' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:13:7: 'for'
            {
            match("for"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T75

    // $ANTLR start T76
    public final void mT76() throws RecognitionException {
        try {
            int _type = T76;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:14:5: ( 'var' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:14:7: 'var'
            {
            match("var"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T76

    // $ANTLR start T77
    public final void mT77() throws RecognitionException {
        try {
            int _type = T77;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:15:5: ( 'foreach' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:15:7: 'foreach'
            {
            match("foreach"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T77

    // $ANTLR start T78
    public final void mT78() throws RecognitionException {
        try {
            int _type = T78;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:16:5: ( 'in' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:16:7: 'in'
            {
            match("in"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T78

    // $ANTLR start T79
    public final void mT79() throws RecognitionException {
        try {
            int _type = T79;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:17:5: ( 'while' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:17:7: 'while'
            {
            match("while"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T79

    // $ANTLR start T80
    public final void mT80() throws RecognitionException {
        try {
            int _type = T80;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:18:5: ( 'function' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:18:7: 'function'
            {
            match("function"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T80

    // $ANTLR start T81
    public final void mT81() throws RecognitionException {
        try {
            int _type = T81;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:19:5: ( 'return' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:19:7: 'return'
            {
            match("return"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T81

    // $ANTLR start T82
    public final void mT82() throws RecognitionException {
        try {
            int _type = T82;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:20:5: ( 'break' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:20:7: 'break'
            {
            match("break"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T82

    // $ANTLR start T83
    public final void mT83() throws RecognitionException {
        try {
            int _type = T83;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:21:5: ( 'continue' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:21:7: 'continue'
            {
            match("continue"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T83

    // $ANTLR start T84
    public final void mT84() throws RecognitionException {
        try {
            int _type = T84;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:22:5: ( 'on' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:22:7: 'on'
            {
            match("on"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T84

    // $ANTLR start T85
    public final void mT85() throws RecognitionException {
        try {
            int _type = T85;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:23:5: ( ':' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:23:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T85

    // $ANTLR start T86
    public final void mT86() throws RecognitionException {
        try {
            int _type = T86;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:24:5: ( 'delete' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:24:7: 'delete'
            {
            match("delete"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T86

    // $ANTLR start T87
    public final void mT87() throws RecognitionException {
        try {
            int _type = T87;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:25:5: ( 'typeof' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:25:7: 'typeof'
            {
            match("typeof"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T87

    // $ANTLR start T88
    public final void mT88() throws RecognitionException {
        try {
            int _type = T88;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:26:5: ( '[' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:26:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T88

    // $ANTLR start T89
    public final void mT89() throws RecognitionException {
        try {
            int _type = T89;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:27:5: ( ']' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:27:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T89

    // $ANTLR start T90
    public final void mT90() throws RecognitionException {
        try {
            int _type = T90;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:28:5: ( '.' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:28:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T90

    // $ANTLR start T91
    public final void mT91() throws RecognitionException {
        try {
            int _type = T91;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:29:5: ( 'new' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:29:7: 'new'
            {
            match("new"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T91

    // $ANTLR start PLUS2
    public final void mPLUS2() throws RecognitionException {
        try {
            int _type = PLUS2;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:274:8: ( '++' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:274:10: '++'
            {
            match("++"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PLUS2

    // $ANTLR start MINUS2
    public final void mMINUS2() throws RecognitionException {
        try {
            int _type = MINUS2;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:275:9: ( '--' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:275:11: '--'
            {
            match("--"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MINUS2

    // $ANTLR start MINUS
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:276:8: ( '-' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:276:10: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MINUS

    // $ANTLR start PLUS
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:277:7: ( '+' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:277:9: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PLUS

    // $ANTLR start MULT
    public final void mMULT() throws RecognitionException {
        try {
            int _type = MULT;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:278:7: ( '*' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:278:9: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MULT

    // $ANTLR start DIV
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:279:7: ( '/' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:279:9: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DIV

    // $ANTLR start PERCENT
    public final void mPERCENT() throws RecognitionException {
        try {
            int _type = PERCENT;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:280:10: ( '%' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:280:12: '%'
            {
            match('%'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PERCENT

    // $ANTLR start AND
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:281:7: ( '&&' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:281:9: '&&'
            {
            match("&&"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end AND

    // $ANTLR start OR
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:282:6: ( '||' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:282:8: '||'
            {
            match("||"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end OR

    // $ANTLR start NOT
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:283:7: ( '!' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:283:9: '!'
            {
            match('!'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NOT

    // $ANTLR start EQ
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:284:6: ( '=' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:284:8: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EQ

    // $ANTLR start PLUSEQ
    public final void mPLUSEQ() throws RecognitionException {
        try {
            int _type = PLUSEQ;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:285:9: ( '+=' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:285:11: '+='
            {
            match("+="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PLUSEQ

    // $ANTLR start MINUSEQ
    public final void mMINUSEQ() throws RecognitionException {
        try {
            int _type = MINUSEQ;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:286:10: ( '-=' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:286:12: '-='
            {
            match("-="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MINUSEQ

    // $ANTLR start MULTEQ
    public final void mMULTEQ() throws RecognitionException {
        try {
            int _type = MULTEQ;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:287:9: ( '*=' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:287:11: '*='
            {
            match("*="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MULTEQ

    // $ANTLR start DIVEQ
    public final void mDIVEQ() throws RecognitionException {
        try {
            int _type = DIVEQ;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:288:8: ( '/=' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:288:10: '/='
            {
            match("/="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DIVEQ

    // $ANTLR start PERCENTEQ
    public final void mPERCENTEQ() throws RecognitionException {
        try {
            int _type = PERCENTEQ;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:289:11: ( '%=' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:289:13: '%='
            {
            match("%="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PERCENTEQ

    // $ANTLR start EQ2
    public final void mEQ2() throws RecognitionException {
        try {
            int _type = EQ2;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:290:7: ( '==' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:290:9: '=='
            {
            match("=="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EQ2

    // $ANTLR start NOTEQ
    public final void mNOTEQ() throws RecognitionException {
        try {
            int _type = NOTEQ;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:291:8: ( '!=' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:291:10: '!='
            {
            match("!="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NOTEQ

    // $ANTLR start GT
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:292:6: ( '>' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:292:8: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GT

    // $ANTLR start LT
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:293:6: ( '<' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:293:8: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LT

    // $ANTLR start GTEQ
    public final void mGTEQ() throws RecognitionException {
        try {
            int _type = GTEQ;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:294:7: ( '>=' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:294:9: '>='
            {
            match(">="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GTEQ

    // $ANTLR start LTEQ
    public final void mLTEQ() throws RecognitionException {
        try {
            int _type = LTEQ;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:295:7: ( '<=' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:295:9: '<='
            {
            match("<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LTEQ

    // $ANTLR start QUESTION
    public final void mQUESTION() throws RecognitionException {
        try {
            int _type = QUESTION;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:296:10: ( '?' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:296:12: '?'
            {
            match('?'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end QUESTION

    // $ANTLR start COMMA
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:297:8: ( ',' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:297:10: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMMA

    // $ANTLR start NULL
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:300:2: ( 'null' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:300:4: 'null'
            {
            match("null"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NULL

    // $ANTLR start BOOLEAN
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:304:2: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("303:1: BOOLEAN : ( 'true' | 'false' );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:304:4: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:305:4: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BOOLEAN

    // $ANTLR start ID
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:309:2: ( LETTER ( LETTER | DIGIT )* )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:309:4: LETTER ( LETTER | DIGIT )*
            {
            mLETTER(); 
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:309:11: ( LETTER | DIGIT )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }
                else if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:309:13: LETTER
            	    {
            	    mLETTER(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:309:22: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ID

    // $ANTLR start INTEGER
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:313:2: ( ( DIGIT )+ )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:313:4: ( DIGIT )+
            {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:313:4: ( DIGIT )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:313:4: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end INTEGER

    // $ANTLR start FLOAT
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:317:2: ( ( DIGIT )+ ( '.' ( DIGIT )* )? ( EXPONENT )? )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:317:4: ( DIGIT )+ ( '.' ( DIGIT )* )? ( EXPONENT )?
            {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:317:4: ( DIGIT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:317:4: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:317:11: ( '.' ( DIGIT )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='.') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:317:13: '.' ( DIGIT )*
                    {
                    match('.'); 
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:317:17: ( DIGIT )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:317:17: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:317:27: ( EXPONENT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='E'||LA7_0=='e') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:317:29: EXPONENT
                    {
                    mEXPONENT(); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FLOAT

    // $ANTLR start EXPONENT
    public final void mEXPONENT() throws RecognitionException {
        try {
            int _type = EXPONENT;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:321:2: ( ( 'e' | 'E' ) ( '+' | '-' )? ( DIGIT )+ )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:321:4: ( 'e' | 'E' ) ( '+' | '-' )? ( DIGIT )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:321:18: ( '+' | '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='+'||LA8_0=='-') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }
                    break;

            }

            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:321:33: ( DIGIT )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:321:33: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EXPONENT

    // $ANTLR start STRING
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:325:2: ( '\"' ( ESC | ~ ( '\"' | '\\\\' | '\\n' | '\\r' | '\\t' | '\\b' | '\\f' ) )* '\"' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:325:4: '\"' ( ESC | ~ ( '\"' | '\\\\' | '\\n' | '\\r' | '\\t' | '\\b' | '\\f' ) )* '\"'
            {
            match('\"'); 
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:325:8: ( ESC | ~ ( '\"' | '\\\\' | '\\n' | '\\r' | '\\t' | '\\b' | '\\f' ) )*
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\\') ) {
                    alt10=1;
                }
                else if ( ((LA10_0>='\u0000' && LA10_0<='\u0007')||LA10_0=='\u000B'||(LA10_0>='\u000E' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFE')) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:325:10: ESC
            	    {
            	    mESC(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:325:16: ~ ( '\"' | '\\\\' | '\\n' | '\\r' | '\\t' | '\\b' | '\\f' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\u0007')||input.LA(1)=='\u000B'||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match('\"'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STRING

    // $ANTLR start ESC
    public final void mESC() throws RecognitionException {
        try {
            int _type = ESC;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:329:2: ( '\\\\' ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\\\' ) )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:329:4: '\\\\' ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\\\' )
            {
            match('\\'); 
            if ( input.LA(1)=='\"'||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ESC

    // $ANTLR start LETTER
    public final void mLETTER() throws RecognitionException {
        try {
            int _type = LETTER;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:333:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:333:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LETTER

    // $ANTLR start DIGIT
    public final void mDIGIT() throws RecognitionException {
        try {
            int _type = DIGIT;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:337:2: ( ( '0' .. '9' ) )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:337:4: ( '0' .. '9' )
            {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:337:4: ( '0' .. '9' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:337:6: '0' .. '9'
            {
            matchRange('0','9'); 

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DIGIT

    // $ANTLR start LINE_COMMENT
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:341:2: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:341:4: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:341:9: (~ ( '\\n' | '\\r' ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFE')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:341:9: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:341:27: ( '\\r' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:341:27: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LINE_COMMENT

    // $ANTLR start WS
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:345:2: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:345:4: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:345:4: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WS

    public void mTokens() throws RecognitionException {
        // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:8: ( T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | PLUS2 | MINUS2 | MINUS | PLUS | MULT | DIV | PERCENT | AND | OR | NOT | EQ | PLUSEQ | MINUSEQ | MULTEQ | DIVEQ | PERCENTEQ | EQ2 | NOTEQ | GT | LT | GTEQ | LTEQ | QUESTION | COMMA | NULL | BOOLEAN | ID | INTEGER | FLOAT | EXPONENT | STRING | ESC | LETTER | DIGIT | LINE_COMMENT | WS )
        int alt14=60;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:10: T68
                {
                mT68(); 

                }
                break;
            case 2 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:14: T69
                {
                mT69(); 

                }
                break;
            case 3 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:18: T70
                {
                mT70(); 

                }
                break;
            case 4 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:22: T71
                {
                mT71(); 

                }
                break;
            case 5 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:26: T72
                {
                mT72(); 

                }
                break;
            case 6 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:30: T73
                {
                mT73(); 

                }
                break;
            case 7 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:34: T74
                {
                mT74(); 

                }
                break;
            case 8 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:38: T75
                {
                mT75(); 

                }
                break;
            case 9 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:42: T76
                {
                mT76(); 

                }
                break;
            case 10 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:46: T77
                {
                mT77(); 

                }
                break;
            case 11 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:50: T78
                {
                mT78(); 

                }
                break;
            case 12 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:54: T79
                {
                mT79(); 

                }
                break;
            case 13 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:58: T80
                {
                mT80(); 

                }
                break;
            case 14 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:62: T81
                {
                mT81(); 

                }
                break;
            case 15 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:66: T82
                {
                mT82(); 

                }
                break;
            case 16 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:70: T83
                {
                mT83(); 

                }
                break;
            case 17 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:74: T84
                {
                mT84(); 

                }
                break;
            case 18 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:78: T85
                {
                mT85(); 

                }
                break;
            case 19 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:82: T86
                {
                mT86(); 

                }
                break;
            case 20 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:86: T87
                {
                mT87(); 

                }
                break;
            case 21 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:90: T88
                {
                mT88(); 

                }
                break;
            case 22 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:94: T89
                {
                mT89(); 

                }
                break;
            case 23 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:98: T90
                {
                mT90(); 

                }
                break;
            case 24 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:102: T91
                {
                mT91(); 

                }
                break;
            case 25 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:106: PLUS2
                {
                mPLUS2(); 

                }
                break;
            case 26 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:112: MINUS2
                {
                mMINUS2(); 

                }
                break;
            case 27 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:119: MINUS
                {
                mMINUS(); 

                }
                break;
            case 28 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:125: PLUS
                {
                mPLUS(); 

                }
                break;
            case 29 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:130: MULT
                {
                mMULT(); 

                }
                break;
            case 30 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:135: DIV
                {
                mDIV(); 

                }
                break;
            case 31 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:139: PERCENT
                {
                mPERCENT(); 

                }
                break;
            case 32 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:147: AND
                {
                mAND(); 

                }
                break;
            case 33 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:151: OR
                {
                mOR(); 

                }
                break;
            case 34 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:154: NOT
                {
                mNOT(); 

                }
                break;
            case 35 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:158: EQ
                {
                mEQ(); 

                }
                break;
            case 36 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:161: PLUSEQ
                {
                mPLUSEQ(); 

                }
                break;
            case 37 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:168: MINUSEQ
                {
                mMINUSEQ(); 

                }
                break;
            case 38 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:176: MULTEQ
                {
                mMULTEQ(); 

                }
                break;
            case 39 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:183: DIVEQ
                {
                mDIVEQ(); 

                }
                break;
            case 40 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:189: PERCENTEQ
                {
                mPERCENTEQ(); 

                }
                break;
            case 41 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:199: EQ2
                {
                mEQ2(); 

                }
                break;
            case 42 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:203: NOTEQ
                {
                mNOTEQ(); 

                }
                break;
            case 43 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:209: GT
                {
                mGT(); 

                }
                break;
            case 44 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:212: LT
                {
                mLT(); 

                }
                break;
            case 45 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:215: GTEQ
                {
                mGTEQ(); 

                }
                break;
            case 46 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:220: LTEQ
                {
                mLTEQ(); 

                }
                break;
            case 47 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:225: QUESTION
                {
                mQUESTION(); 

                }
                break;
            case 48 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:234: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 49 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:240: NULL
                {
                mNULL(); 

                }
                break;
            case 50 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:245: BOOLEAN
                {
                mBOOLEAN(); 

                }
                break;
            case 51 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:253: ID
                {
                mID(); 

                }
                break;
            case 52 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:256: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 53 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:264: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 54 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:270: EXPONENT
                {
                mEXPONENT(); 

                }
                break;
            case 55 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:279: STRING
                {
                mSTRING(); 

                }
                break;
            case 56 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:286: ESC
                {
                mESC(); 

                }
                break;
            case 57 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:290: LETTER
                {
                mLETTER(); 

                }
                break;
            case 58 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:297: DIGIT
                {
                mDIGIT(); 

                }
                break;
            case 59 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:303: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;
            case 60 :
                // C:\\Documents and Settings\\niklaus\\workspace\\ubiscript\\src\\org\\ubiscript\\parser\\Ubiscript.g:1:316: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\4\uffff\1\53\2\uffff\10\53\1\uffff\2\53\3\uffff\1\53\1\77\1\102"+
        "\1\104\1\107\1\111\2\uffff\1\113\1\115\1\117\1\121\2\uffff\1\53"+
        "\1\122\4\uffff\1\125\1\126\1\uffff\1\53\1\uffff\11\53\1\140\5\53"+
        "\27\uffff\1\122\2\uffff\1\53\1\150\2\53\1\153\4\53\1\uffff\3\53"+
        "\1\163\1\53\1\165\1\53\1\uffff\2\53\1\uffff\6\53\1\177\1\uffff\1"+
        "\u0080\1\uffff\2\53\1\177\1\u0083\1\53\1\u0085\3\53\2\uffff\2\53"+
        "\1\uffff\1\u008b\1\uffff\1\53\1\u008d\1\u008e\1\u008f\1\53\1\uffff"+
        "\1\53\3\uffff\1\u0092\1\u0093\2\uffff";
    static final String DFA14_eofS =
        "\u0094\uffff";
    static final String DFA14_minS =
        "\1\11\3\uffff\1\146\2\uffff\1\53\2\141\1\150\1\145\1\162\1\157\1"+
        "\156\1\uffff\1\145\1\162\3\uffff\1\145\1\53\1\55\1\75\1\57\1\75"+
        "\2\uffff\4\75\2\uffff\1\53\1\56\4\uffff\2\60\1\uffff\1\163\1\uffff"+
        "\1\60\1\162\1\156\1\154\1\162\1\151\1\164\1\145\1\156\1\60\1\154"+
        "\1\160\1\165\1\167\1\154\27\uffff\1\56\2\uffff\1\145\1\60\1\143"+
        "\1\163\1\60\1\154\1\165\1\141\1\164\1\uffff\3\145\1\60\1\154\1\60"+
        "\1\141\1\uffff\1\164\1\145\1\uffff\1\145\1\162\1\153\1\151\1\164"+
        "\1\157\1\60\1\uffff\1\60\1\uffff\1\143\1\151\2\60\1\156\1\60\1\156"+
        "\1\145\1\146\2\uffff\1\150\1\157\1\uffff\1\60\1\uffff\1\165\3\60"+
        "\1\156\1\uffff\1\145\3\uffff\2\60\2\uffff";
    static final String DFA14_maxS =
        "\1\175\3\uffff\1\156\2\uffff\1\154\1\165\1\141\1\150\1\145\1\162"+
        "\1\157\1\156\1\uffff\1\145\1\171\3\uffff\1\165\5\75\2\uffff\4\75"+
        "\2\uffff\1\71\1\145\4\uffff\2\172\1\uffff\1\163\1\uffff\1\71\1\162"+
        "\1\156\1\154\1\162\1\151\1\164\1\145\1\156\1\172\1\154\1\160\1\165"+
        "\1\167\1\154\27\uffff\1\145\2\uffff\1\145\1\172\1\143\1\163\1\172"+
        "\1\154\1\165\1\141\1\164\1\uffff\3\145\1\172\1\154\1\172\1\141\1"+
        "\uffff\1\164\1\145\1\uffff\1\145\1\162\1\153\1\151\1\164\1\157\1"+
        "\172\1\uffff\1\172\1\uffff\1\143\1\151\2\172\1\156\1\172\1\156\1"+
        "\145\1\146\2\uffff\1\150\1\157\1\uffff\1\172\1\uffff\1\165\3\172"+
        "\1\156\1\uffff\1\145\3\uffff\2\172\2\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\6\10\uffff\1\22\2\uffff\1\25"+
        "\1\26\1\27\6\uffff\1\40\1\41\4\uffff\1\57\1\60\2\uffff\1\63\1\67"+
        "\1\70\1\74\2\uffff\1\63\1\uffff\1\66\17\uffff\1\31\1\44\1\34\1\32"+
        "\1\45\1\33\1\46\1\35\1\73\1\47\1\36\1\50\1\37\1\52\1\42\1\51\1\43"+
        "\1\55\1\53\1\56\1\54\1\64\1\65\1\uffff\1\4\1\13\11\uffff\1\21\7"+
        "\uffff\1\10\2\uffff\1\11\7\uffff\1\30\1\uffff\1\7\11\uffff\1\62"+
        "\1\61\2\uffff\1\14\1\uffff\1\17\5\uffff\1\16\1\uffff\1\23\1\24\1"+
        "\12\2\uffff\1\15\1\20";
    static final String DFA14_specialS =
        "\u0094\uffff}>";
    static final String[] DFA14_transitionS = {
            "\2\50\2\uffff\1\50\22\uffff\1\50\1\35\1\46\2\uffff\1\32\1\33"+
            "\1\uffff\1\5\1\6\1\30\1\26\1\42\1\27\1\24\1\31\12\44\1\17\1"+
            "\1\1\40\1\36\1\37\1\41\1\uffff\4\45\1\43\25\45\1\22\1\47\1\23"+
            "\1\uffff\1\45\1\uffff\1\45\1\14\1\15\1\20\1\7\1\10\2\45\1\4"+
            "\4\45\1\25\1\16\2\45\1\13\1\45\1\21\1\45\1\11\1\12\3\45\1\2"+
            "\1\34\1\3",
            "",
            "",
            "",
            "\1\51\7\uffff\1\52",
            "",
            "",
            "\1\55\1\uffff\1\55\2\uffff\12\56\62\uffff\1\54",
            "\1\61\15\uffff\1\57\5\uffff\1\60",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "",
            "\1\70",
            "\1\72\6\uffff\1\71",
            "",
            "",
            "",
            "\1\73\17\uffff\1\74",
            "\1\75\21\uffff\1\76",
            "\1\100\17\uffff\1\101",
            "\1\103",
            "\1\105\15\uffff\1\106",
            "\1\110",
            "",
            "",
            "\1\112",
            "\1\114",
            "\1\116",
            "\1\120",
            "",
            "",
            "\1\55\1\uffff\1\55\2\uffff\12\56",
            "\1\123\1\uffff\12\124\13\uffff\1\123\37\uffff\1\123",
            "",
            "",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\127",
            "",
            "\12\56",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
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
            "",
            "",
            "",
            "\1\123\1\uffff\12\124\13\uffff\1\123\37\uffff\1\123",
            "",
            "",
            "\1\146",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\147\25\53",
            "\1\151",
            "\1\152",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "",
            "\1\160",
            "\1\161",
            "\1\162",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\164",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\166",
            "",
            "\1\167",
            "\1\170",
            "",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u0081",
            "\1\u0082",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0084",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "",
            "",
            "\1\u0089",
            "\1\u008a",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u008c",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0090",
            "",
            "\1\u0091",
            "",
            "",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | PLUS2 | MINUS2 | MINUS | PLUS | MULT | DIV | PERCENT | AND | OR | NOT | EQ | PLUSEQ | MINUSEQ | MULTEQ | DIVEQ | PERCENTEQ | EQ2 | NOTEQ | GT | LT | GTEQ | LTEQ | QUESTION | COMMA | NULL | BOOLEAN | ID | INTEGER | FLOAT | EXPONENT | STRING | ESC | LETTER | DIGIT | LINE_COMMENT | WS );";
        }
    }
 

}