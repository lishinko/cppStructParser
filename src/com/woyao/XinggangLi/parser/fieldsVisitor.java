/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.woyao.XinggangLi.parser;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.runtime.FailedPredicateException;
/**
 *
 * @author lixg
 * 检查是不是合法：内嵌的struct，应该是先声明，再实例化
 */
public class fieldsVisitor extends structBaseVisitor<String> {
//    Map<String, String> alreadyDeclaredStructs = new Map<String, String>
    Set<String> alreadyDeclaredStructs = new HashSet<String>();
//    @Override public String visitStructDefine(structParser.StructDefineContext ctx) {
//        alreadyDeclaredStructs.add(ctx.structBody().name);
//        return visitChildren(ctx);
//    }
    @Override public String visitStructBody(structParser.StructBodyContext ctx) {
        alreadyDeclaredStructs.add(ctx.name.getText());
        return visitChildren(ctx);
    }
    @Override public String visitNormalType(structParser.NormalTypeContext ctx) {
        //定义的struct字段，必须是已经存在的字段。
        if (ctx.INDENTIFIER() != null)
        {
            String structName = ctx.INDENTIFIER().getText();
            try {
                if (alreadyDeclaredStructs.contains(structName)) {
                    return visitChildren(ctx);
                }
                String tips = "标识符被认为是一个struct的实例，但是之前没有声明该struct!请先用C++编译器编译下！";
                tips += ctx.toString();
                throw new fieldDefinationNotFoundException(tips);
            } catch (fieldDefinationNotFoundException ex) {
                Logger.getLogger(fieldsVisitor.class.getName()).log(Level.SEVERE, null, ex);
                Runtime.getRuntime().exit(-1);
                return "";//都Runtime.getRuntime().exit(-1);了，还要return?
            }
        }
        return new String("");
    }
}
