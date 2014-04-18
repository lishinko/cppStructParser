package com.woyao.XinggangLi.rules;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;

/**
 * Created by lixg on 14-4-18.
 * 对c++来说，还需要生成头文件的guard.当然了,也可以生成#pragma once,gcc同样支持.现在就先生成这个吧
 */
public class wrapHeaderFile {
    String fileName;
    String fileExt;
    STGroup group;

    public wrapHeaderFile(STGroup group, String fileName, String fileExt) {
        this.fileName = fileName;//
        this.fileExt = fileExt;
        this.group = group;
    }

    private String wrapFile(String content) {
        ST st = group.getInstanceOf("fileGuardName");
        st.add("name", fileName.toUpperCase());
        st.add("ext", fileExt.toUpperCase());

        ST st1 = group.getInstanceOf("headWrap");
        st1.add("upperCasedFileName", st.render());
        st1.add("content", content);

        return st1.render();
    }

    public String generate(String content) {
        return wrapFile(content);
    }
}
