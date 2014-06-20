/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

grammar struct;
import cppLexerRules;

structDefine : CLASS_KEYWORD name=INDENTIFIER inheritance? leftCurlyBrace='{' structField rightCurlyBrace='}' ';' ;

inheritance : ':' PROTECTION_LEVEL INDENTIFIER ;//这里不能使用cppLexerRules.g4里面的INHERITANCE,否则会因为冒号找不到而导致不能通过解析.原因不清楚

structField : (fieldDecl | structDefine | method)+;//struct内部可以是字段声明或者内嵌的struct定义,或者方法定义也可以

fieldDecl : fieldType name=INDENTIFIER ('[' number=INDENTIFIER ']')? ';' ;//字段声明：类型 字段名称 分号

method : methodDecl | methodDefine;
methodDecl : methodSignature ';' ;
methodDefine : methodSignature '{' .*?  '}' ;//注意,这个方法定义,里面使用的.*?是不精确的,因为方法定义的里面也可能有括号.但是完整的定义很麻烦,我们就不那么弄了
methodSignature : returnType=INDENTIFIER name=INDENTIFIER '(' paramList? ')' ;
paramList : param (',' param)* | 'void'  ;
param : fieldType name=INDENTIFIER ;

fieldType : 'const'? concreteType ('*'|'&')? ;
concreteType : INDENTIFIER | nameInNamespace | genericCollType;

//模板类型：std::vector<int>这样的，std::可以去掉，
genericCollType : 'std::'? COLLTYPE '<' elementType '>'
                ;
nameInNamespace : 'std::'? INDENTIFIER ;
elementType : fieldType | mapType;
mapType : INDENTIFIER ',' INDENTIFIER ;

COLLTYPE : MAP | VECTOR //目前支持std::map和std::vector
         ;
