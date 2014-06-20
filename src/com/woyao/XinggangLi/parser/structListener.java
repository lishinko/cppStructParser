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
     * Enter a parse tree produced by {@link structParser#concreteType}.
     *
     * @param ctx the parse tree
     */
    void enterConcreteType(@NotNull structParser.ConcreteTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link structParser#concreteType}.
     *
     * @param ctx the parse tree
     */
    void exitConcreteType(@NotNull structParser.ConcreteTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link structParser#param}.
     *
     * @param ctx the parse tree
     */
    void enterParam(@NotNull structParser.ParamContext ctx);

    /**
     * Exit a parse tree produced by {@link structParser#param}.
     *
     * @param ctx the parse tree
     */
    void exitParam(@NotNull structParser.ParamContext ctx);

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
     * Enter a parse tree produced by {@link structParser#paramList}.
     *
     * @param ctx the parse tree
     */
    void enterParamList(@NotNull structParser.ParamListContext ctx);

    /**
     * Exit a parse tree produced by {@link structParser#paramList}.
     *
     * @param ctx the parse tree
     */
    void exitParamList(@NotNull structParser.ParamListContext ctx);

    /**
     * Enter a parse tree produced by {@link structParser#inheritance}.
     *
     * @param ctx the parse tree
     */
    void enterInheritance(@NotNull structParser.InheritanceContext ctx);

    /**
     * Exit a parse tree produced by {@link structParser#inheritance}.
     *
     * @param ctx the parse tree
     */
    void exitInheritance(@NotNull structParser.InheritanceContext ctx);

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
     * Enter a parse tree produced by {@link structParser#methodDecl}.
     *
     * @param ctx the parse tree
     */
    void enterMethodDecl(@NotNull structParser.MethodDeclContext ctx);

    /**
     * Exit a parse tree produced by {@link structParser#methodDecl}.
     *
     * @param ctx the parse tree
     */
    void exitMethodDecl(@NotNull structParser.MethodDeclContext ctx);

    /**
     * Enter a parse tree produced by {@link structParser#method}.
     *
     * @param ctx the parse tree
     */
    void enterMethod(@NotNull structParser.MethodContext ctx);

    /**
     * Exit a parse tree produced by {@link structParser#method}.
     *
     * @param ctx the parse tree
     */
    void exitMethod(@NotNull structParser.MethodContext ctx);

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
     * Enter a parse tree produced by {@link structParser#methodDefine}.
     *
     * @param ctx the parse tree
     */
    void enterMethodDefine(@NotNull structParser.MethodDefineContext ctx);

    /**
     * Exit a parse tree produced by {@link structParser#methodDefine}.
     *
     * @param ctx the parse tree
     */
    void exitMethodDefine(@NotNull structParser.MethodDefineContext ctx);

    /**
     * Enter a parse tree produced by {@link structParser#methodSignature}.
     *
     * @param ctx the parse tree
     */
    void enterMethodSignature(@NotNull structParser.MethodSignatureContext ctx);

    /**
     * Exit a parse tree produced by {@link structParser#methodSignature}.
     *
     * @param ctx the parse tree
     */
    void exitMethodSignature(@NotNull structParser.MethodSignatureContext ctx);
}