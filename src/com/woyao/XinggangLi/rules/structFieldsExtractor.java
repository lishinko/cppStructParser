package com.woyao.XinggangLi.rules;
import com.woyao.XinggangLi.parser.structBaseListener;
import com.woyao.XinggangLi.parser.structParser;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by 李兴钢 on 14-3-13.
 * 获得struct里面的数据，主要是字段信息。
 * 注意C++类是可以嵌套的
 */
public class structFieldsExtractor extends structBaseListener {
    Map<structParser.StructDefineContext, String> generatedMethods = new HashMap<structParser.StructDefineContext, String>();
    @Override public void exitFieldDecl(@NotNull structParser.FieldDeclContext ctx) {

    }
    @Override public void exitStructDefine(@NotNull structParser.StructDefineContext ctx) {
        generatedMethods.put(ctx, getFullQualifiedName(ctx));
        //System.out.println(getFullQualifiedName(ctx));
    }
    private String getFullQualifiedName(structParser.StructDefineContext ctx) {
        //记录嵌套类的名字
        Stack<String> names = new Stack<String>();
        for (structParser.StructDefineContext parent = ctx;parent != null; parent = (structParser.StructDefineContext) parent.getParent().getParent()){
            names.push(parent.INDENTIFIER().getText());
            if (parent.getParent() == null) {
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
