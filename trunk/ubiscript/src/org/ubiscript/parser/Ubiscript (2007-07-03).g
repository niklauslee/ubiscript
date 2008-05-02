grammar Ubiscript;

options {
	backtrack=true;
}

@header {
package ubiscript.parser;
}

@lexer::header {
package ubiscript.parser;
}

program
	:	statement*
	;

statement
	:	block
	|	emptyStatement
	|	expressionStatement
	|	classStatement
	|	functionStatement
	|	variableStatement
	|	onStatement
	|	ifStatement
	|	iterationStatement
	|	throwStatement
	|	tryStatement
	|	jumpStatement
	;

block
	:	LBRACE statement* RBRACE
	;

emptyStatement
	:	SEMI
	;

expressionStatement
	:	expression SEMI
	;

classStatement
	:	'class' identifier ('extends' identifier)? classBody
	;

classBody
	:	LBRACE classField* RBRACE
	;

classField
	:	variableStatement	
	|	functionStatement
	;

functionStatement
	:	'function' identifier LPAREN formalParameters? RPAREN block
	;

variableStatement
	:	'var' variableDeclaration (COMMA variableDeclaration)* SEMI
	;

variableDeclaration
	:	identifier (EQ assignmentExpression)?
	;

onStatement
	:	'on' LPAREN expression RPAREN block
	;

ifStatement
	:	'if' LPAREN expression RPAREN statement ('else' statement)?
	;

iterationStatement
	:	'for' LPAREN expression? SEMI expression? SEMI expression? RPAREN statement
	|	'foreach' LPAREN identifier 'in' expression RPAREN statement
	|	'while' LPAREN expression RPAREN statement
	;

throwStatement
	:	'throw' expression SEMI
	;

tryStatement
	:	'try' block catchClause
	|	'try' block finallyClause
	|	'try' block catchClause finallyClause
	;

catchClause
	:	'catch' LPAREN identifier RPAREN block
	;

finallyClause
	:	'finally' block
	;

jumpStatement
	:	'return' expression? SEMI
	|	'break' SEMI
	;

// The operators in Ubiscript have the following precedences:
//		lowest	(10) = (assignment)
//				(09) ||
//				(08) &&
//				(07) ==, !=
//				(06) <, <=, >, >=
//				(05) +, -
//				(04) *, /, %
//				(03) - (unary minus), + (unary plus) ! (not), -- (prefix), ++ (prefix)
//				(02) ++, -- (postfix operators)
//				(01) . (identifier qualification), [] (array access), () (function call), new (instantiation)
//				(00) literals, (expression), identifier

expression
	:	assignmentExpression
	;

assignmentExpression
	:	logicalOrExpression
	|	identifier EQ expression
	;

logicalOrExpression
	:	logicalAndExpression ( OR logicalAndExpression)*
	;

logicalAndExpression
	:	equalityExpression ( AND equalityExpression)*
	;

equalityExpression
	:	relationalExpression ( (EQ2 | NOTEQ ) relationalExpression)*
	;

relationalExpression
	:	additiveExpression ( ( LT | LTEQ | GT | GTEQ ) additiveExpression)*
	;

additiveExpression
	:	multiplicativeExpression ( ( PLUS | MINUS ) multiplicativeExpression)*
	;

multiplicativeExpression
	:	unaryExpression ( ( MULT | DIV | PERCENT ) unaryExpression)*
	;

unaryExpression
	:	postfixExpression	
	|	MINUS unaryExpression
	|	PLUS unaryExpression
	|	NOT unaryExpression
	|	MINUS2 unaryExpression
	|	PLUS2 unaryExpression
	;

postfixExpression
	:	primaryExpression
		(	LBRACK expression RBRACK
		|	arguments
		|	DOT identifier
		|	PLUS2
		|	MINUS2
		)*
	;

primaryExpression
	:	identifier
	|	literal
	|	functionExpression
	|	LPAREN expression RPAREN
	;

functionExpression
	:	'function' LPAREN formalParameters? RPAREN block
	;

formalParameters
	:	identifier (COMMA identifier)*
	;

arguments
	:	LPAREN expressionList? RPAREN
	;

expressionList
	:	expression (COMMA expression)*
	;

identifier
	:	ID
	;

literal
	:	nullLiteral
	|	booleanLiteral
	|	numericLiteral
	|	stringLiteral
	;

nullLiteral
	:	'null'
	;

booleanLiteral
	:	'true'
	|	'false'	
	;

numericLiteral
	:	INTEGER_LITERAL
	|	FLOAT_LITERAL
	;

stringLiteral
	:	STRING_LITERAL
	;

PLUS2	:	'++';
MINUS2	:	'--';
LPAREN	:	'(';
RPAREN	:	')';
LBRACE	:	'{';
RBRACE	:	'}';
LBRACK	:	'[';
RBRACK	:	']';
MINUS	:	'-';
PLUS	:	'+';
MULT	:	'*';
DIV		:	'/';
PERCENT	:	'%';
AND		:	'&&';
OR		:	'||';
EQ2		:	'==';
NOT		:	'!';
EQ		:	'=';
NOTEQ	:	'!=';
GT		:	'>';
LT		:	'<';
GTEQ	:	'>=';
LTEQ	:	'<=';
DOT		:	'.';
SEMI	:	';';
COMMA	:	',';

BOOLEAN_LITERAL
	:	'true'
	|	'false'
	;

ID
	:	LETTER (LETTER | DIGIT)*
	;

INTEGER_LITERAL
	:	DIGIT+
	;

FLOAT_LITERAL
	:	DIGIT+ (DOT DIGIT*)? (EXPONENT)?
	;

EXPONENT
	:	('e'|'E') ('+'|'-')? DIGIT+
	;

STRING_LITERAL
	:	'"' (ESC | ~('"'|'\\'|'\n'|'\r'|'\t'|'\b'|'\f'))* '"'	
	;

ESC
	:	'\\' ('n'|'r'|'t'|'b'|'f'|'"'|'\\')
	;

LETTER
	:	('a'..'z' | 'A'..'Z' | '_')
	;

DIGIT
	:	('0'..'9')
	;

LINE_COMMENT
	:	'//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	;

WS
	:	(' ' | '\t' | '\r' | '\n')+ {$channel=HIDDEN;}
	;
