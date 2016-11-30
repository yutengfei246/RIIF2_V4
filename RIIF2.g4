grammar RIIF2;
//TODO: some of the attribute tokens are necessary some of them are not
//TODO: table access
//TODO: Build Object with HashTable (VariableTable)
//TODO: predicate ?

/*Programmar File RIIF-2 */
program
    : typeDeclaration+ EOF
    ;

/*Declarations in RIIF-2 */
typeDeclaration
    : componentDeclaration
    | templateDeclaration      //RIIF-2: template
    | environmentDeclaration
    | requirementDeclaration
    ;

componentDeclaration
    : COMPONENT comId=Identifier
      (EXTENDS comEx=Identifier (',' comEx1+=Identifier)*)?
      (IMPLEMENTS comImpl=Identifier (',' comImpl1+=Identifier)*)?  ';'
      componentBodyElement*
      END_COMPONENT
    ;

componentBodyElement
    : fieldDeclaration
    | childComponentDeclaration
    | failModeDeclaration
    | assignment
    | setTemplate
    | assertion
    ;

fieldDeclaration
    : typeType fieldElement ';'
    ;

fieldElement
    : variableDeclarator
    | associativeDeclarator
    | associativeInstanceDeclarator
    ;

childComponentDeclaration
    : CHILD_COMPONENT childComponentDeclarator ';'
    ;

childComponentDeclarator
    : Identifier childComponentDeclaratorId vector?
    ;

childComponentDeclaratorId
    : variableId
    ;

failModeDeclaration
    : FAIL_MODE failModeDeclarator ';'
    ;

failModeDeclarator
    : variableDeclaratorId
    | associativeDeclaratorId
    ;

assignment
    : ASSIGN assignmentDeclarator ';'
    ;

setTemplate
    : SET assignmentDeclarator ';'
    ;

assertion
    : ASSERT (assignmentVariableAttributeId) ('<' | '>') expression ';'
    ;

templateDeclaration
    : TEMPLATE Identifier ( EXTENDS Identifier)? ';'
      templateBodyElement*
      END_TEMPLATE
    ;

templateBodyElement
    : abstractFieldDeclaration
    | abstractFailModeDeclaration
    | abstractPlatformDeclaration
    | imposeDeclaration
    ;

abstractFieldDeclaration
    : ABSTRACT (fieldDeclaration|associativeDeclaration)
    ;

associativeDeclaration
    : associativeInstanceDeclarator ';'
    ;

abstractFailModeDeclaration
    : ABSTRACT failModeDeclaration
    ;

abstractPlatformDeclaration
    : ABSTRACT PLATFORM Identifier ';'
    ;

imposeDeclaration
    : IMPOSE imposeDeclarator ';'
    ;

imposeDeclarator
    : imposeDeclaratorId '=' imposeInitializer
    ;

imposeDeclaratorId
    : assignmentDeclaratorId
    ;

imposeInitializer
    : assignmentInitializer
    ;

variableDeclarator
    : variableDeclaratorId
      ( ':' primitiveType ( ':=' variableInitializer )?
      | ':' TYPE_TABLE            //Tables are not allowed assigned in-line ?
      | ':=' listInitializer
      )
    ;

associativeInstanceDeclarator
    : associativeInstanceDeclaratorId ('=' associativeInstanceDeclaratorInitializer )?
    ;

associativeInstanceDeclaratorId  // both associtiave instance and associative attribute
    : associativeInstanceId
    | associativeInstanceAttributeId
    ;

associativeInstanceDeclaratorInitializer
    : assignmentInitializer
    ;

associativeDeclarator
    : associativeDeclaratorId
    ;

variableInitializer
    :  expression
    ;

listInitializer
    : '{' item ( ','item )* '}'
    ;

arrayInitializer
    : '[' item ( ',' item )* ']'
    ;

item
    : arrayInitializer
    | listInitializer
    | expression
    ;

assignmentDeclarator
    : assignmentDeclaratorId vector? '=' assignmentInitializer
    ;

assignmentDeclaratorId
    : assignmentVariableId
    | assignmentVariableAttributeId
    | assignmentTableId
    ;

assignmentVariableId
    : ( variableId '.' )* variableId //either variables in current scope or hierachical
    ;

assignmentVariableAttributeId
    : assignmentVariableId
      '\'' Identifier  // notice that some of the identifier should be necessarily required
    ;

assignmentInitializer
    : item
    ;

environmentDeclaration
    : ENVIRONMENT Identifier ';'
      environmentBodyElement*
      END_ENVIRONMENT
    ;

environmentBodyElement
    : assignment
    | envParameterDeclaration
    ;

envParameterDeclaration
    : (INPUT|OUTPUT) PARAMETER variableId ':' primitiveType (':=' expression)? ';'
    ;

requirementDeclaration
    : REQUIREMENT Identifier ';'
      assertion*
      END_REQUIREMENT
    ;

variableId
    : variableDeclaratorId
    | associativeInstanceId
    ;

vector
    : '[' expression ':' expression ']'
    ;

variableDeclaratorId
    : Identifier
    ;

associativeDeclaratorId
    : Identifier '[' ']'
    ;

associativeInstanceId
    : Identifier '[' Identifier ']'
    ;

associativeInstanceAttributeId
    : associativeInstanceId ( '\'' Identifier )
    ;

assignmentTableId
    : variableDeclaratorId '\'' Identifier // this identifier has to be ITEMS
     '[' ('#'| Identifier) ']'
     '[' Identifier ']'
    ;

primitiveType
    : TYPE_FLOAT
    | TYPE_INTEGER
    | TYPE_STRING
    | Identifier
    | enumType
    ;

typeType
    : PARAMETER
    | CONSTANT
    ;

enumType
    : TYPE_ENUM '{' Identifier ( ',' Identifier)* '}'
    ;



/*RIIF-2: ANTlr.4 expression (Same with JAVA)*/
expression
    : primary
    | ('+'|'-') expression
    | ('~'|'!') expression
    | expression ( '*' | '/' | '%' ) expression
    | expression ( '-' | '+' ) expression
    | expression ('<' '<' | '>' '>' '>' | '>' '>') expression
    | expression ('<=' | '>=' | '>' | '<') expression
    | expression ('==' | '!=') expression
    | expression '&' expression
    | expression '^' expression
    | expression '|' expression
    | expression '&&' expression
    | expression '||' expression
    | expression '?' expression ':' expression
    | <assoc=right> expression
      (   '='
      |   '+='
      |   '-='
      |   '*='
      |   '/='
      |   '&='
      |   '|='
      |   '^='
      |   '>>='
      |   '>>>='
      |   '<<='
      |   '%='
      )
      expression
    ;

primary
    : '(' expression ')'
    | SELF
    | Identifier // for user defined or enum
    | assignmentDeclaratorId
    | literal
    | funcCall
    | arrayInitializer
    ;

funcCall
    : funcName '(' funcArg ( ',' funcArg ) ? ')'
    ;
funcName
    : FUNC_LOG
    | FUNC_EXP
    | FUNC_AGG_SINGLE
    | FUNC_GT_N_FAIL
    ;
funcArg
    : (assignmentDeclaratorId) vector
    | expression
    ;

/*Literal*/
literal
    : StringLiteral
    | DecimalLiteral
    | FloatingPointLiteral
    ;




// Lexer

// §RIIF-2-v4 Keywords

COMPONENT: 'component';
END_COMPONENT: 'endcomponent';
ENVIRONMENT: 'environment';
END_ENVIRONMENT: 'endenvironment';
REQUIREMENT: 'requirement';
END_REQUIREMENT: 'endrequirement';
CHILD_COMPONENT: 'child_component';
FAIL_MODE: 'fail_mode';
EXTENDS: 'extends';
ASSIGN: 'assign';
ASSERT: 'assert';
INPUT: 'input';
OUTPUT: 'output';
PARAMETER: 'parameter';
CONSTANT: 'constant';
TYPE_FLOAT: 'float';
TYPE_INTEGER: 'integer';
TYPE_STRING: 'string';
TYPE_ENUM: 'enum';
FUNC_AGG_SINGLE: 'agg_single_fail';
FUNC_GT_N_FAIL: 'agg_gt_n_fail';
FUNC_LOG: 'LOG';
FUNC_EXP: 'EXP';
//Second part
TEMPLATE: 'template';
END_TEMPLATE: 'endtemplate';
IMPOSE: 'impose';
ABSTRACT: 'abstract';
IMPLEMENTS: 'implements';
SELF: 'self';
SET: 'set';
TYPE_TABLE: 'table';
PLATFORM: 'platform';

/*Identification */
Identifier
    : (LETTER) (LETTER|DIGIT|UNDERSCORE)*
    ;

/*Literal Tokens */
StringLiteral
    : '"' ( ~('\\' | '"') )* '"'
    ;
FloatingPointLiteral
    : DIGIT+ '.' DIGIT* Exponent? FloatTypeSuffix?
    | '.' DIGIT+ Exponent? FloatTypeSuffix?
    | DIGIT+ Exponent FloatTypeSuffix?
    ;
DecimalLiteral
    : DIGIT+
    ;

WS: (' ' | '\r' | '\t' |' \u000C' | '\n' ) ->channel(HIDDEN) ;

COMMENT
    : '/*' .*? '*/'  ->channel(HIDDEN)
    ;
LINE_COMMENT
    : '//' ~('\n'|'\r')* '\r'? '\n' -> channel(HIDDEN)
    ;

fragment
DIGIT: '0'..'9';
fragment
LETTER: ( 'a'..'z' | 'A'..'Z' );
fragment
UNDERSCORE: '_';
fragment
EscapeSequence
    : '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    | UnicodeEscape
    | OctalEscape
    ;
fragment
OctalEscape
    : '\\' ('0'..'3')('0'..'7')('0'..'7')
    | '\\' ('0'..'7')('0'..'7')
    | '\\' ('0'..'7')
    ;
fragment
HexDigit
    : ('0'..'9' | 'a'..'f' | 'A'..'F')
    ;
fragment
UnicodeEscape
    : '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;
fragment
Exponent
    : ('e'|'E')('+'|'-')?DIGIT+
    ;
fragment
FloatTypeSuffix
    : ('f'|'F'|'d'|'D')
    ;