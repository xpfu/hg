package com.fxp.hg.common.utils;

/**
 * @program: hg
 * @author: xp.fu
 * @create: 2020-01-02 16:47
 * @description:
 **/
public class StringTools {

    public static boolean isNullOrEmpty(String str) {
        return null == str || "".equals(str) || "null".equals(str);
    }

    public static boolean isNullOrEmpty(Object obj) {
        return null == obj || "".equals(obj);
    }
}
