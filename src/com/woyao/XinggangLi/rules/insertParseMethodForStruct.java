package com.woyao.XinggangLi.rules;

import com.woyao.XinggangLi.parser.structBaseListener;
import com.woyao.XinggangLi.parser.structLexer;
import com.woyao.XinggangLi.parser.structParser;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created by 李兴钢 on 14-3-13.
 * 修改原来的struct.目前的操作有:
 * 1,生成parse方法
 * 2,需要将struct的atom字段替换掉(用来实现自动初始化,这样就不需要构造函数了),
 *
 */
import org.stringtemplate.v4.*;

import java.util.List;

public class insertParseMethodForStruct extends structBaseListener {
    BufferedTokenStream tokens;
    STGroup group;
    TokenStreamRewriter rewriter;

    public insertParseMethodForStruct(BufferedTokenStream tokens, STGroup group) {
        this.tokens = tokens;
        rewriter = new TokenStreamRewriter(tokens);
        this.group = group;

    }

    public String getHeader() {
        return rewriter.getText();
    }

    @Override public void exitStructDefine(@NotNull structParser.StructDefineContext ctx) {
        Token rightCurlyBrace = ctx.rightCurlyBrace;
        ST st = group.getInstanceOf("decl");
        String wss = getSomeWhiteSpaceBefore(tokens, rightCurlyBrace);
        String tips = "    " + st.render() + wss;
        rewriter.insertBefore(rightCurlyBrace, tips);
    }

    /**
     * 添加一些空格。正常情况下，我们写的代码都是有空格的，通过这种办法可以让生成的代码好看一些。
     * 当然了，这里是直接写死的，也就是，如果用户自己的代码就格式不好看，这个只会让它更难看。。
     */
    private static String getSomeWhiteSpaceBefore(BufferedTokenStream tokens, Token rightCurlyBrace) {
        int i = rightCurlyBrace.getTokenIndex();
        List<Token> wsChannel = tokens.getHiddenTokensToLeft(i, structLexer.WHITESPACE);
        String wss = "\n";
        if (wsChannel != null) {
            Token ws = wsChannel.get(0);
            if (ws != null) {
                wss = ws.getText();
            }
        }
        return wss;
    }
}
