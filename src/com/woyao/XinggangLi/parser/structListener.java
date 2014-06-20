// Generated from E:\My Documents\NetBeansProjects\cppStructParser\src\com\woyao\XinggangLi\struct.g4 by ANTLR 4.x
package com.woyao.XinggangLi.parser;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link structParser}.
 */
public interface structListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link structParser#fieldType}.
     *
     * @param ctx the parse tree
     */
    void enterFieldType(@NotNull structParser.FieldTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link structParser#fieldType}.
     *
     * @param ctx the parse tree
     */
    void exitFieldType(@NotNull structParser.FieldTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link structParser#structDefine}.
     *
     * @param ctx the parse tree
     */
    void enterStructDefine(@NotNull structParser.StructDefineContext ctx);

    /**
     * Exit a parse tree produced by {@link structParser#structDefine}.
     *
     * @param ctx the parse tree
     */
    void exitStructDefine(@NotNull structParser.StructDefineContext ctx);

    /**
     * Enter a parse tree produced by {@link structParser#nameInNamespace}.
     *
     * @param ctx the parse tree
     */
    void enterNameInNamespace(@NotNull structParser.NameInNamespaceContext ctx);

    /**
     * Exit a parse tree produced by {@link structParser#nameInNamespace}.
     *
     * @param ctx the parse tree
     */
    void exitNameInNamespace(@NotNull structParser.NameInNamespaceContext ctx);

    /**
     * Enter a parse tree produced by {@link structParser#structField}.
     *
     * @param ctx the parse tree
     */
    void enterStructField(@NotNull structParser.StructFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link structParser#structField}.
     *
     * @param ctx the parse tree
     */
    void exitStructField(@NotNull structParser.StructFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link structParser#normalType}.
     *
     * @param ctx the parse tree
     */
    void enterNormalType(@NotNull structParser.NormalTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link structParser#normalType}.
     *
     * @param ctx the parse tree
     */
    void exitNormalType(@NotNull structParser.NormalTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link structParser#fieldDecl}.
     *
     * @param ctx the parse tree
     */
    void enterFieldDecl(@NotNull structParser.FieldDeclContext ctx);

    /**
     * Exit a parse tree produced by {@link structParser#fieldDecl}.
     *
     * @param ctx the parse tree
     */
    void exitFieldDecl(@NotNull structParser.FieldDeclContext ctx);

    /**
     * Enter a parse tree produced by {@link structParser#elementType}.
     *
     * @param ctx the parse tree
     */
    void enterElementType(@NotNull structParser.ElementTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link structParser#elementType}.
     *
     * @param ctx the parse tree
     */
    void exitElementType(@NotNull structParser.ElementTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link structParser#mapType}.
     *
     * @param ctx the parse tree
     */
    void enterMapType(@NotNull structParser.MapTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link structParser#mapType}.
     *
     * @param ctx the parse tree
     */
    void exitMapType(@NotNull structParser.MapTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link structParser#genericCollType}.
     *
     * @param ctx the parse tree
     */
    void enterGenericCollType(@NotNull structParser.GenericCollTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link structParser#genericCollType}.
     *
     * @param ctx the parse tree
     */
    void exitGenericCollType(@NotNull structParser.GenericCollTypeContext ctx);
}