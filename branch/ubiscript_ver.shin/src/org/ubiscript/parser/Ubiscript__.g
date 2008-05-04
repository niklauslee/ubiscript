lexer grammar Ubiscript;
@header {
package org.ubiscript.parser;
}

T66 : ';' ;
T67 : '{' ;
T68 : '}' ;
T69 : 'if' ;
T70 : '(' ;
T71 : ')' ;
T72 : 'else' ;
T73 : 'for' ;
T74 : 'var' ;
T75 : 'foreach' ;
T76 : 'in' ;
T77 : 'while' ;
T78 : 'function' ;
T79 : 'return' ;
T80 : 'break' ;
T81 : 'continue' ;
T82 : 'on' ;
T83 : ':' ;
T84 : '[' ;
T85 : ']' ;
T86 : '.' ;
T87 : 'new' ;

// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 268
PLUS2		:	'++';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 269
MINUS2		:	'--';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 270
MINUS		:	'-';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 271
PLUS		:	'+';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 272
MULT		:	'*';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 273
DIV			:	'/';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 274
PERCENT		:	'%';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 275
AND			:	'&&';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 276
OR			:	'||';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 277
NOT			:	'!';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 278
EQ			:	'=';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 279
PLUSEQ		:	'+=';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 280
MINUSEQ		:	'-=';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 281
MULTEQ		:	'*=';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 282
DIVEQ		:	'/=';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 283
PERCENTEQ	:	'%=';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 284
EQ2			:	'==';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 285
NOTEQ		:	'!=';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 286
GT			:	'>';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 287
LT			:	'<';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 288
GTEQ		:	'>=';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 289
LTEQ		:	'<=';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 290
QUESTION	:	'?';
// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 291
COMMA		:	',';

// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 293
NULL
	:	'null'
	;

// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 297
BOOLEAN
	:	'true'
	|	'false'
	;

// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 302
ID
	:	LETTER ( LETTER | DIGIT )*
	;

// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 306
INTEGER
	:	DIGIT+
	;

// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 310
FLOAT
	:	DIGIT+ ( '.' DIGIT* )? ( EXPONENT )?
	;

// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 314
EXPONENT
	:	( 'e' | 'E' ) ( '+' | '-' )? DIGIT+
	;

// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 318
STRING
	:	'"' ( ESC | ~( '"' | '\\' | '\n' | '\r' | '\t' | '\b' | '\f' ) )* '"'	
	;

// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 322
ESC
	:	'\\' ( 'n' | 'r' | 't' | 'b' | 'f' | '"' | '\\' )
	;

// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 326
LETTER
	:	( 'a'..'z' | 'A'..'Z' | '_' )
	;

// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 330
DIGIT
	:	( '0'..'9' )
	;

// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 334
LINE_COMMENT
	:	'//' ~( '\n' | '\r' )* '\r'? '\n' {$channel=HIDDEN;}
	;

// $ANTLR src "C:\Documents and Settings\niklaus\workspace\ubiscript\src\org\ubiscript\parser\Ubiscript.g" 338
WS
	:	( ' ' | '\t' | '\r' | '\n' )+ {$channel=HIDDEN;}
	;
