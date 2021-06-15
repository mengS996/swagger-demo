package com.ms.swagger.controller;

/**
 *@BelongsProject: swagger-demo
 *@BelongsPackage: com.ms.swagger.controller
 *@author: 孟老师
 *@create: 2021/6/9/2021/06/09/22:01
 *@className: com.ms.swagger.controller
 *@version 1.0
 *@description: TODO
 */
public class Test {
    public static boolean isUpperCase(char c) {
        return c >=65 && c <= 90;
    }
    public static boolean isLowerCase(char c) {
        return c >=97 && c <= 122;
    }
    public static void main(String[] args) {
        //定义字符串
        String s = "Hello java,";
        char[] charArray = s.toCharArray();
        if(isUpperCase(charArray[0])){
            String upperCase = "";
            for(char c : charArray){
                upperCase += isUpperCase(c) ? c : "";
            }
            System.out.println("字符串是:"+s + " I am 李晓龙");
            System.out.println("第一个字母是大写 "+ " 大写字母是"+ upperCase + " 个数是"+ upperCase.length());
        }else {
            System.out.println("字符串是:"+s + " I am 李晓龙");
            System.out.println("第一个字母不是大写 ");
        }
    }
}
