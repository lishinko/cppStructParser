/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
lexer grammar commonLexerRules;
@lexer::members {
    public static final int WHITESPACE = 1;
    public static final int COMMENTS = 2;
}
LEFTPARANS : '{' ;
RIGHTPARANS : '}' ;
DOUBLE_COLON : '::';
LEFT_ANGLE_BRACKET : '<';
RIGHT_ANGLE_BRACKET : '>';
SEMICOLON : ';' ;
COMMA : ',';


INDENTIFIER : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;//¹Ø¼ü×Ö£º

WS : [ \t\r\n]+ -> channel(WHITESPACE) ; // skip spaces, tabs, newlines
COMMENT
    :   '/*' .*? '*/' -> channel(COMMENTS)
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> channel(COMMENTS)
    ;
