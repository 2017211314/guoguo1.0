package com.guoguo.common.utils;

/**
 * 创建者:刘达
 * 创建日期: 2018/4/11
 * 创建时间: 13:36
 */
public class StringTools {

    /**
     * 验证字符串是否为空
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        if (str == null){
            return true;
        }
        if (str.trim().length() == 0){
            return true;
        }
        if (str.trim().equalsIgnoreCase("null")){
            return true;
        }
        if ("".equals(str)){
            return  true;
        }
        return false;
    }
}
