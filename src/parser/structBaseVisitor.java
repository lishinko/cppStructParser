// Generated from E:\My Documents\NetBeansProjects\cppStructParser\src\cppstructparser\struct.g4 by ANTLR 4.0
package parser;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

public class structBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements structVisitor<T> {
	@Override public T visitStructDecl(structParser.StructDeclContext ctx) { return visitChildren(ctx); }

	@Override public T visitStructDefine(structParser.StructDefineContext ctx) { return visitChildren(ctx); }

	@Override public T visitStructBody(structParser.StructBodyContext ctx) { return visitChildren(ctx); }

	@Override public T visitKeywordDecl(structParser.KeywordDeclContext ctx) { return visitChildren(ctx); }

	@Override public T visitFields(structParser.FieldsContext ctx) { return visitChildren(ctx); }
}