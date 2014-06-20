package com.woyao.XinggangLi.rules;
import com.woyao.XinggangLi.parser.structBaseListener;
import com.woyao.XinggangLi.parser.structParser;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.*;

/**
 * Created by 李兴钢 on 14-3-13.
 * 获得struct里面的数据，主要是字段信息。
 * 注意C++类是可以嵌套的
 */
public class structFieldsExtractor extends structBaseListener {

    public Map<structParser.StructDefineContext, structInfo> getGeneratedMethods() {return generatedMethods;}
    Map<structParser.StructDefineContext, structInfo> generatedMethods = new HashMap<structParser.StructDefineContext, structInfo>();
    @Override public void exitFieldDecl(@NotNull structParser.FieldDeclContext ctx) {
        structParser.StructDefineContext parentStruct = (structParser.StructDefineContext) ctx.getParent().getParent();
        //添加struct的字段信息。
        structInfo info = generatedMethods.get(parentStruct);
        if (info == null) {
            info = new structInfo(parentStruct.INDENTIFIER().getText(), getFullQualifiedName(parentStruct));
        }
        info.fieldNames.add(ctx.name.getText());
        generatedMethods.put(parentStruct, info);
    }
    private String getFullQualifiedName(structParser.StructDefineContext ctx) {
        //记录嵌套类的名字
        Stack<String> names = new Stack<String>();
        for (structParser.StructDefineContext parentStruct = ctx;parentStruct != null; parentStruct = (structParser.StructDefineContext) parentStruct.getParent().getParent()){
            names.push(parentStruct.INDENTIFIER().getText());
            if (parentStruct.getParent() == null) {
                break;
            }
        }
        //反向打印出来
        StringBuilder sb = new StringBuilder();
        sb.append(names.pop());
        while (!names.empty()){
            sb.append("::");
            sb.append(names.pop());
        }
        return sb.toString();
    }
}
