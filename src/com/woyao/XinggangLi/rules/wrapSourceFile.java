package com.woyao.XinggangLi.rules;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;

/**
 * Created by lixg on 14-4-18.
 */
public class wrapSourceFile {
    String fullFileName;
    STGroup group;

    public wrapSourceFile(STGroup group, String fullFileName) {
        this.fullFileName = fullFileName;//
        this.group = group;
    }

    private String wrapFile(String content) {
        ST st = group.getInstanceOf("includeHeader");
        st.add("headerName", fullFileName);
        String headerDecl = st.render();
        return headerDecl + content;
    }

    public String generate(String content) {
        return wrapFile(content);
    }
}
