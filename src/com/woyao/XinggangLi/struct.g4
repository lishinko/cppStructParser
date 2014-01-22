/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

grammar struct;
import cppLexerRules;

structDefine : STRUCT structBody ; //struct由struct关键字和结构体内容组成
structBody : name=INDENTIFIER LEFTPARANS fields+ RIGHTPARANS SEMICOLON; //结构体内容是一系列的字段

fields : fieldDecl3 | structDefine ; //struct内部可以是字段声明或者内嵌的struct定义

fieldDecl3 : fieldType fieldName SEMICOLON ;//字段声明：类型 字段名称 分号

fieldType : normalType | genericCollType ;
fieldName : INDENTIFIER ;

//模板类型：std::vector<int>这样的，std::可以去掉，
genericCollType : NAMESPACE_PREFIX? CollType LEFT_ANGLE_BRACKET elementType RIGHT_ANGLE_BRACKET
                ;
elementType : fieldType | mapType;
normalType : KEYWORD | INDENTIFIER ;
mapType : normalType COMMA normalType ;

CollType : MAP | VECTOR //目前支持std::map和std::vector
         ;
