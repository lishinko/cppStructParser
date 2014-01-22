/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
lexer grammar cppLexerRules;
import commonLexerRules;


STRUCT : 'struct' ;

KEYWORD : INT | FLOAT | DOUBLE ;//['int'|'float'|'double'] ;

INT : 'int' ;
FLOAT : 'float' ;
DOUBLE : 'double' ;

STD_NAMESPACE : 'std' ;
MAP : 'map';
VECTOR : 'vector';
NAMESPACE_PREFIX : STD_NAMESPACE DOUBLE_COLON ;