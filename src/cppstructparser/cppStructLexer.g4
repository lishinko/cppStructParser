/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
lexer grammar cppStructLexer;

//structName : INDENTIFIER ;//结构体名称是一个标识符

KEYWORD : INT | FLOAT | DOUBLE ;//['int'|'float'|'double'] ;
SEMICOLON : ';' ;
STRUCT : 'struct' ;
LEFTPARANS : '{' ;
RIGHTPARANS : '}' ;
INT : 'int' ;
FLOAT : 'float' ;
DOUBLE : 'double' ;
INDENTIFIER : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;//关键字：


WS : [ \t\r\n]+ -> skip ;//channel(HIDDEN) ; // skip spaces, tabs, newlines
COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;
