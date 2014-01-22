// Generated from E:\My Documents\IntellijProjects\cppStructParser\src\com\woyao\XinggangLi\struct.g4 by ANTLR 4.1
package com.woyao.XinggangLi.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link structParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface structVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link structParser#fieldDecl3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDecl3(@NotNull structParser.FieldDecl3Context ctx);

	/**
	 * Visit a parse tree produced by {@link structParser#fieldType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldType(@NotNull structParser.FieldTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link structParser#structDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDefine(@NotNull structParser.StructDefineContext ctx);

	/**
	 * Visit a parse tree produced by {@link structParser#structBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructBody(@NotNull structParser.StructBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link structParser#normalType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalType(@NotNull structParser.NormalTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link structParser#fieldName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldName(@NotNull structParser.FieldNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link structParser#elementType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementType(@NotNull structParser.ElementTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link structParser#mapType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapType(@NotNull structParser.MapTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link structParser#genericCollType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericCollType(@NotNull structParser.GenericCollTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link structParser#fields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFields(@NotNull structParser.FieldsContext ctx);
}