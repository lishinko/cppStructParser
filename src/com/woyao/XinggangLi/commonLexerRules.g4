/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
lexer grammar commonLexerRules;

LEFTPARANS : '{' ;
RIGHTPARANS : '}' ;
DOUBLE_COLON : '::';
LEFT_ANGLE_BRACKET : '<';
RIGHT_ANGLE_BRACKET : '>';
SEMICOLON : ';' ;
COMMA : ',';


INDENTIFIER : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;//¹Ø¼ü×Ö£º

WS : [ \t\r\n]+ -> channel(HIDDEN) ; // skip spaces, tabs, newlines
COMMENT
    :   '/*' .*? '*/' -> channel(HIDDEN)
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> channel(HIDDEN)
    ;
