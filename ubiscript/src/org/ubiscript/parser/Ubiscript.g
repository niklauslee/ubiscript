grammar Ubiscript;

options {
	output=AST;
}

tokens {
	EXPR;
	BLOCK;
	VARDEF;
	FUNDEF;
	IF;
	FOR;
	INIT;
	VARS;
	COND;
	UPD;
	FOREACH;
	WHILE;
	RETURN;
	BREAK;
	CONTINUE;
	ON;
	CALL;
	ARGS;
	INDEX;
	FIELD;
	FUN;
	PARAMS;
	UMINUS;
	UPLUS;
	NEW;
	ARRAY;
	DELETE;
	TYPEOF;
}

@header {
package org.ubiscript.parser;
}

@lexer::header {
package org.ubiscript.parser;
}

@members {
protected void mismatch(IntStream input, int ttype, BitSet follow) throws RecognitionException {
	throw new MismatchedTokenException(ttype, input);
}
public void recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow) throws RecognitionException {
	throw e;
}
}

@rulecatch {
catch (RecognitionException e) {
	throw e;
}
}

lineInput
	:	(statement) => statement
	|	expression
	;

program
	:	statement*
		-> ^(BLOCK statement*)
	;

statement
	:	emptyStatement
	|	expressionStatement
	|	block
	|	ifStatement
	|	iterationStatement
	|	variableStatement
	|	functionStatement
	|	jumpStatement
	|	onStatement	
	;

emptyStatement
	:	';'!
	;

expressionStatement
	:	expression ';'
		-> ^(EXPR expression)
	;
	
block
	:	'{' statement* '}'
		-> ^(BLOCK statement*)
	;	

ifStatement
	:	'if' '(' expr=expression ')' th=statement ( 'else' el=statement )?
		-> ^(IF $expr $th $el?)
	;

iterationStatement
	:	'for' '(' init=expression? ';' cond=expression? ';' upd=expression? ')' statement
		-> ^(FOR ^(INIT $init?) ^(COND $cond?) ^(UPD $upd?) statement)
	|	'for' '(' 'var' vars=variableDeclarationList ';' cond=expression? ';' upd=expression? ')' statement
		-> ^(FOR ^(VARS $vars) ^(COND $cond?) ^(UPD $upd?) statement)
	|	'foreach' '(' id=identifier 'in' expr=expression ')' statement
		-> ^(FOREACH $id $expr statement)
	|	'while' '(' expression ')' statement
		-> ^(WHILE expression statement)
	;

variableStatement
	:	'var' variableDeclaration ( ',' variableDeclaration )* ';'
		-> variableDeclaration+
	;
	
variableDeclarationList
	:	variableDeclaration ( ',' variableDeclaration )*
		-> variableDeclaration+
	;

variableDeclaration
	:	identifier ('=' assignmentExpression)?
		-> ^(VARDEF identifier assignmentExpression?)
	;

functionStatement
	:	'function' identifier '(' formalParameters? ')' block
		-> ^(FUNDEF identifier ^(PARAMS formalParameters?) block)
	;

jumpStatement
	:	'return' expression? ';'
		-> ^(RETURN expression?)
	|	'break' ';'
		-> ^(BREAK)
	|	'continue' ';'
		-> ^(CONTINUE)
	;

onStatement
	:	'on' '(' expression ')' block
		-> ^(ON expression block)
	;

// The operators in Ubiscript have the following precedences:
//		lowest	(10) , (sequential evaluation)
//				(09) = (assignment)
//				(09) ||
//				(08) &&
//				(07) ==, !=
//				(06) <, <=, >, >=
//				(05) +, -
//				(04) *, /, %
//				(03) - (unary minus), + (unary plus) ! (not), -- (prefix), ++ (prefix)
//				(02) ++, -- (postfix operators)
//				(01) . (identifier qualification), [] (array access), () (function call), new (instantiation)
//				(00) literals, (expression), identifier, function expression

expression
	:	assignmentExpression ( COMMA^ assignmentExpression )*
	;

assignmentExpression
	:	conditionalExpression ( assignmentOperator^ conditionalExpression )*
	;

assignmentOperator
	:	EQ
	|	PLUSEQ
	|	MINUSEQ
	|	MULTEQ
	|	DIVEQ
	|	PERCENTEQ
	;

conditionalExpression
	:	logicalOrExpression ( QUESTION^ expression ':'! expression )?
	;

logicalOrExpression
	:	logicalAndExpression ( OR^ logicalAndExpression )*
	;

logicalAndExpression
	:	equalityExpression ( AND^ equalityExpression )*
	;

equalityExpression
	:	relationalExpression ( ( EQ2^ | NOTEQ^ ) relationalExpression )*
	;

relationalExpression
	:	additiveExpression ( ( LT^ | LTEQ^ | GT^ | GTEQ^ ) additiveExpression)*
	;

additiveExpression
	:	multiplicativeExpression ( ( PLUS^ | MINUS^ ) multiplicativeExpression)*
	;

multiplicativeExpression
	:	unaryExpression ( ( MULT^ | DIV^ | PERCENT^ ) unaryExpression)*
	;

unaryExpression
	:	postfixExpression
	|	'delete' unaryExpression
		-> ^(DELETE unaryExpression)
	|	'typeof' unaryExpression
		-> ^(TYPEOF unaryExpression)
	|	MINUS unaryExpression
		-> ^(UMINUS unaryExpression)
	|	PLUS unaryExpression
		-> ^(UPLUS unaryExpression)
	|	( NOT^ | MINUS2^ | PLUS2^ ) unaryExpression
	;

postfixExpression
	:	callExpression ( MINUS2^ | PLUS2^ )*
	;

callExpression
	:	(primaryExpression -> primaryExpression)
		(	'[' idx=expression ']'
			-> ^(INDEX $callExpression $idx)
		|	'.' id=identifier
			-> ^(FIELD $callExpression $id)
		|	'(' args=expressionList? ')'
			-> ^(CALL $callExpression ^(ARGS $args?))
		)*
	;

primaryExpression
	:	identifier
	|	arrayLiteral
	|	literal
	|	functionExpression
	|	'new' callExpression
		-> ^(NEW callExpression)
	|	'('! expression ')'!
	;

functionExpression
	:	'function' '(' formalParameters? ')' block
		-> ^(FUN ^(PARAMS formalParameters?) block)
	;
	
formalParameters
	:	identifier ( ','! identifier )*
	;

arrayLiteral
	:	'[' expressionList? ']'
		-> ^(ARRAY expressionList?)
	;

expressionList
	:	assignmentExpression ( ','! assignmentExpression )*
	;

identifier
	:	ID
	;

literal
	:	NULL
	|	BOOLEAN
	|	INTEGER
	|	FLOAT
	|	STRING
	;

PLUS2		:	'++';
MINUS2		:	'--';
MINUS		:	'-';
PLUS		:	'+';
MULT		:	'*';
DIV			:	'/';
PERCENT		:	'%';
AND			:	'&&';
OR			:	'||';
NOT			:	'!';
EQ			:	'=';
PLUSEQ		:	'+=';
MINUSEQ		:	'-=';
MULTEQ		:	'*=';
DIVEQ		:	'/=';
PERCENTEQ	:	'%=';
EQ2			:	'==';
NOTEQ		:	'!=';
GT			:	'>';
LT			:	'<';
GTEQ		:	'>=';
LTEQ		:	'<=';
QUESTION	:	'?';
COMMA		:	',';

NULL
	:	'null'
	;

BOOLEAN
	:	'true'
	|	'false'
	;

ID
	:	LETTER ( LETTER | DIGIT )*
	;

INTEGER
	:	DIGIT+
	;

FLOAT
	:	DIGIT+ ( '.' DIGIT* )? ( EXPONENT )?
	;

EXPONENT
	:	( 'e' | 'E' ) ( '+' | '-' )? DIGIT+
	;

STRING
	:	'"' ( ESC | ~( '"' | '\\' | '\n' | '\r' | '\t' | '\b' | '\f' ) )* '"'	
	;

ESC
	:	'\\' ( 'n' | 'r' | 't' | 'b' | 'f' | '"' | '\\' )
	;

LETTER
	:	( 'a'..'z' | 'A'..'Z' | '_' )
	;

DIGIT
	:	( '0'..'9' )
	;

LINE_COMMENT
	:	'//' ~( '\n' | '\r' )* '\r'? '\n' {$channel=HIDDEN;}
	;

WS
	:	( ' ' | '\t' | '\r' | '\n' )+ {$channel=HIDDEN;}
	;
