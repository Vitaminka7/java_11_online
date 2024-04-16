package ua.com.alevel.classes;

import org.apache.commons.lang3.StringUtils;

public class ClassB {
    public void print(String msg) {
        //System.out.println(msg)
        System.out.println(StringUtils.upperCase(msg));
    }
}