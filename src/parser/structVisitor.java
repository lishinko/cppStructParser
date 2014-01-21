// Generated from E:\My Documents\NetBeansProjects\cppStructParser\src\cppstructparser\struct.g4 by ANTLR 4.0
package parser;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface structVisitor<T> extends ParseTreeVisitor<T> {
	T visitStructDecl(structParser.StructDeclContext ctx);

	T visitFieldDecl2(structParser.FieldDecl2Context ctx);

	T visitGenericDecl(structParser.GenericDeclContext ctx);

	T visitStructDefine(structParser.StructDefineContext ctx);

	T visitStructBody(structParser.StructBodyContext ctx);

	T visitElements(structParser.ElementsContext ctx);

	T visitCollType(structParser.CollTypeContext ctx);

	T visitElementType(structParser.ElementTypeContext ctx);

	T visitCollFullType(structParser.CollFullTypeContext ctx);

	T visitKeywordDecl(structParser.KeywordDeclContext ctx);

	T visitGenericCollType(structParser.GenericCollTypeContext ctx);

	T visitFields(structParser.FieldsContext ctx);
}