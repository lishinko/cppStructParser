package com.woyao.XinggangLi.rules;

import org.antlr.v4.runtime.ParserRuleContext;
import org.stringtemplate.v4.ST;

/**
 * Created by lixg on 14-3-20.
 */
public class DemoXmlBaseBuilder implements IDemoBuilder {
    DemoXmlBaseBuilder(ST st, ParserRuleContext ctx) {
        this.st = st;
        this.ctx = ctx;
    }

    @Override
    public void build() {

    }

    protected ST st;
    protected ParserRuleContext ctx;
}
