package com.woyao.XinggangLi.rules;

import com.woyao.XinggangLi.parser.structBaseListener;
import com.woyao.XinggangLi.parser.structParser;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created by 李兴钢 on 14-3-13.
 * 修改原来的struct.目前的操作有:
 * 1,生成parse方法
 * 2,需要将struct的atom字段替换掉(用来实现自动初始化,这样就不需要构造函数了),
 *
 */
public class structRewriter extends structBaseListener {
    BufferedTokenStream tokens;
    TokenStreamRewriter rewriter;
    structRewriter(BufferedTokenStream tokens) {
        this.tokens = tokens;
        rewriter = new TokenStreamRewriter(tokens);
    }
    @Override public void exitFieldDecl(@NotNull structParser.FieldDeclContext ctx) {
        //原子数据不能被区分，在这里需要使用独立的配置文件
    }
}
