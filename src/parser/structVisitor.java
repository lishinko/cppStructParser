// Generated from E:\My Documents\NetBeansProjects\cppStructParser\src\cppstructparser\struct.g4 by ANTLR 4.0
package parser;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface structVisitor<T> extends ParseTreeVisitor<T> {
	T visitStructDecl(structParser.StructDeclContext ctx);

	T visitStructDefine(structParser.StructDefineContext ctx);

	T visitStructBody(structParser.StructBodyContext ctx);

	T visitKeywordDecl(structParser.KeywordDeclContext ctx);

	T visitFields(structParser.FieldsContext ctx);
}