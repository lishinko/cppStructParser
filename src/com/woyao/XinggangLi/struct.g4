/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

grammar struct;
import cppLexerRules;

//structDefine : STRUCT structBody ; //struct由struct关键字和结构体内容组成
//structBody : name=INDENTIFIER '{' field+ '}' ';'; //结构体内容是一系列的字段
structDefine : 'struct' name=INDENTIFIER leftCurlyBrace='{' structField rightCurlyBrace='}' ';';
structField : (fieldDecl | structDefine)+;//struct内部可以是字段声明或者内嵌的struct定义

fieldDecl : fieldType INDENTIFIER ';' ;//字段声明：类型 字段名称 分号

fieldType : normalType | genericCollType ;

//模板类型：std::vector<int>这样的，std::可以去掉，
genericCollType : 'std::'? COLLTYPE '<' elementType '>'
                ;
elementType : fieldType | mapType;
normalType : KEYWORD | INDENTIFIER ;
mapType : normalType ',' normalType ;

COLLTYPE : MAP | VECTOR //目前支持std::map和std::vector
         ;
