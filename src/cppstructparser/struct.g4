/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar struct;
import cppStructLexer;

structDefine : STRUCT structBody ; //struct由struct关键字和结构体内容组成
structBody : name=INDENTIFIER LEFTPARANS fields+ RIGHTPARANS SEMICOLON; //结构体内容是一系列的字段

fields : fieldDecl2 | structDefine ; //字段由声明和内嵌struct的定义组成
fieldDecl2 : normalDecl | genericDecl ;//字段定义由普通定义和模板定义组成
normalDecl : type=KEYWORD name=INDENTIFIER SEMICOLON     #keywordDecl
              | type=INDENTIFIER name=INDENTIFIER SEMICOLON #structDecl
           ;
genericDecl :
              genericCollType name=INDENTIFIER SEMICOLON
            ;
//字段由关键字和后面的标识符组成
//fieldDecl : type=KEYWORD name=INDENTIFIER SEMICOLON     #keywordDecl
 //             | type=INDENTIFIER name=INDENTIFIER SEMICOLON #structDecl
  //            | genericCollType name=INDENTIFIER SEMICOLON #collDecl
 //         ; //字段定义由关键字和后面的标识符组成

genericCollType : collFullType elements
               ;
elements : LEFT_ANGLE_BRACKET elementType RIGHT_ANGLE_BRACKET ;
collFullType : (STD_NAMESPACE DOUBLE_COLON)? collType ;
elementType : KEYWORD | INDENTIFIER ;
collType : MAP | VECTOR //目前支持std::map和std::vector
         ;