/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
lexer grammar cppLexerRules;
import commonLexerRules;

CLASS_KEYWORD : STRUCT | CLASS ;

STRUCT : 'struct' ;
CLASS : 'class' ;

PROTECTION_LEVEL : PUBLIC | PROTECTED | PRIVATE ;//我们先忽略这些信息,反正到时候我们会重写的
//lexer规则,会将FIELD_PROTECTION解析为一个token,即"public:"这样的,但是:"public :"这样有空格的,就不行了.这一点一定要注意!
FIELD_PROTECTION : PROTECTION_LEVEL ':' ->skip;
//INHERITANCE : ':' PROTECTION_LEVEL INDENTIFIER ->skip;//因为继承类的时候经常使用空格,所以就不能做成lexer规则了

PUBLIC : 'public' ;
PROTECTED : 'protected' ;
PRIVATE : 'private' ;



//KEYWORD : INT | FLOAT | DOUBLE ;//['int'|'float'|'double'] ;

//INT : 'int' ;
//FLOAT : 'float' ;
//DOUBLE : 'double' ;

STD_NAMESPACE : 'std' ;
MAP : 'map';
VECTOR : 'vector';
NAMESPACE_PREFIX : STD_NAMESPACE DOUBLE_COLON ;

