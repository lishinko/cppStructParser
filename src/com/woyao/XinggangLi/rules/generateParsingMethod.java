package com.woyao.XinggangLi.rules;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;

/**
 * Created by lixg on 14-3-18.
 */
public class generateParsingMethod {
    structFieldsExtractor.structInfo info;
    STGroup group;
    public generateParsingMethod(structFieldsExtractor.structInfo info, STGroup group) {
        this.info = info;
        this.group = group;
    }
    public String generate() {
        ST st = group.getInstanceOf("method");
        st.add("fullQualifiedName", info.fullQualifiedName);
        st.add("fieldName", info.fieldNames);
        return st.render();
    }
}
