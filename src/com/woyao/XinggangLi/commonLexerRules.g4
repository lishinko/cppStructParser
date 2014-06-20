/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
lexer grammar commonLexerRules;
@lexer::members {
    public static final int WHITESPACE = HIDDEN + 1;
    public static final int COMMENTS = HIDDEN + 2;
}
LEFT_CURLY_BRACE : '{' ;
RIGHT_CURLY_BRACE: '}' ;

fragment
DOUBLE_COLON : '::';
fragment
COLON : ':' ;

Digit : ('0'..'9')+ ;
        
LEFT_ANGLE_BRACKET : '<';
RIGHT_ANGLE_BRACKET : '>';
SEMICOLON : ';' ;
COMMA : ',';
LEFTBRACKET : '[' ;
RIGHTBRACKET : ']' ;

LEFT_PARANS : '(' ;
RIGHT_PARANS : ')' ;

INDENTIFIER : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;//标识符

WS : [ \t\r\n]+ -> channel(WHITESPACE) ; // skip spaces, tabs, newlines
COMMENT
    :   '/*' .*? '*/' -> channel(COMMENTS)
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> channel(COMMENTS)
    ;
