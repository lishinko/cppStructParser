/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

grammar struct;
import cppLexerRules;

//structDefine : STRUCT structBody ; //struct��struct�ؼ��ֺͽṹ���������
//structBody : name=INDENTIFIER '{' field+ '}' ';'; //�ṹ��������һϵ�е��ֶ�
structDefine : 'struct' name=INDENTIFIER '{' structField '}' ';';
structField : (fieldDecl | structDefine)+;//struct�ڲ��������ֶ�����������Ƕ��struct����

fieldDecl : fieldType INDENTIFIER ';' ;//�ֶ����������� �ֶ����� �ֺ�

fieldType : normalType | genericCollType ;

//ģ�����ͣ�std::vector<int>�����ģ�std::����ȥ����
genericCollType : 'std::'? COLLTYPE '<' elementType '>'
                ;
elementType : fieldType | mapType;
normalType : KEYWORD | INDENTIFIER ;
mapType : normalType ',' normalType ;

COLLTYPE : MAP | VECTOR //Ŀǰ֧��std::map��std::vector
         ;
