package com.woyao.XinggangLi.rules;

import java.util.ArrayList;
import java.util.List;

/**
* Created by lixg on 14-3-20.
*/
public class structInfo {
    public String name;
    public String fullQualifiedName;
    public List<String> fieldNames = new ArrayList<String>();
    structInfo(String name, String fullQualifiedName) {
        this.name = name;
        this.fullQualifiedName = fullQualifiedName;
    }
}
