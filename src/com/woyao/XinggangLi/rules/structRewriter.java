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

public class structRewriter extends structBaseListener {
    BufferedTokenStream tokens;
    STGroup group;
    public TokenStreamRewriter rewriter;
    public structRewriter(BufferedTokenStream tokens, STGroup group) {
        this.tokens = tokens;
        rewriter = new TokenStreamRewriter(tokens);
        this.group = group;
    }
    @Override public void exitStructDefine(@NotNull structParser.StructDefineContext ctx) {
        Token rightCurlyBrace = ctx.rightCurlyBrace;
        ST st = group.getInstanceOf("decl");
        String wss = getSomeWhiteSpaceBefore(rightCurlyBrace);
        String tips = "    " + st.render() + wss;
        rewriter.insertBefore(rightCurlyBrace, tips);
    }

    private String getSomeWhiteSpaceBefore(Token rightCurlyBrace) {
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
