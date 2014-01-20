/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar struct;
import cppStructLexer;

structDefine : STRUCT structBody ; //struct由struct关键字和结构体内容组成
structBody : name=INDENTIFIER LEFTPARANS fields+ RIGHTPARANS SEMICOLON; //结构体内容是一系列的字段

fields : fieldDecl | structDefine ; //字段由关键字和后面的标识符组成
fieldDecl : type=KEYWORD name=INDENTIFIER SEMICOLON     #keywordDecl
              | type=INDENTIFIER name=INDENTIFIER SEMICOLON #structDecl
          ; //字段定义由关键字和后面的标识符组成

