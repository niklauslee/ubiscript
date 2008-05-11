lexer grammar Ubiscript;
@header {
package org.ubiscript.parser;
}

T68 : ';' ;
T69 : '{' ;
T70 : '}' ;
T71 : 'if' ;
T72 : '(' ;
T73 : ')' ;
T74 : 'else' ;
T75 : 'for' ;
T76 : 'var' ;
T77 : 'foreach' ;
T78 : 'in' ;
T79 : 'while' ;
T80 : 'function' ;
T81 : 'return' ;
T82 : 'break' ;
T83 : 'continue' ;
T84 : 'on' ;
T85 : ':' ;
T86 : 'delete' ;
T87 : 'typeof' ;
T88 : '[' ;
T89 : ']' ;
T90 : '.' ;
T91 : 'new' ;

// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 274
PLUS2		:	'++';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 275
MINUS2		:	'--';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 276
MINUS		:	'-';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 277
PLUS		:	'+';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 278
MULT		:	'*';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 279
DIV			:	'/';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 280
PERCENT		:	'%';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 281
AND			:	'&&';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 282
OR			:	'||';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 283
NOT			:	'!';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 284
EQ			:	'=';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 285
PLUSEQ		:	'+=';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 286
MINUSEQ		:	'-=';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 287
MULTEQ		:	'*=';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 288
DIVEQ		:	'/=';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 289
PERCENTEQ	:	'%=';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 290
EQ2			:	'==';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 291
NOTEQ		:	'!=';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 292
GT			:	'>';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 293
LT			:	'<';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 294
GTEQ		:	'>=';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 295
LTEQ		:	'<=';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 296
QUESTION	:	'?';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 297
COMMA		:	',';

// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 299
NULL
	:	'null'
	;

// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 303
BOOLEAN
	:	'true'
	|	'false'
	;

// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 308
ID
	:	LETTER ( LETTER | DIGIT )*
	;

// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 312
INTEGER
	:	DIGIT+
	;

// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 316
FLOAT
	:	DIGIT+ ( '.' DIGIT* )? ( EXPONENT )?
	;

// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 320
EXPONENT
	:	( 'e' | 'E' ) ( '+' | '-' )? DIGIT+
	;

// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 324
STRING
	:	'"' ( ESC | ~( '"' | '\\' | '\n' | '\r' | '\t' | '\b' | '\f' ) )* '"'	
	;

// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 328
ESC
	:	'\\' ( 'n' | 'r' | 't' | 'b' | 'f' | '"' | '\\' )
	;

// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 332
LETTER
	:	( 'a'..'z' | 'A'..'Z' | '_' )
	;

// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 336
DIGIT
	:	( '0'..'9' )
	;

// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 340
LINE_COMMENT
	:	'//' ~( '\n' | '\r' )* '\r'? '\n' {$channel=HIDDEN;}
	;

// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 344
WS
	:	( ' ' | '\t' | '\r' | '\n' )+ {$channel=HIDDEN;}
	;
