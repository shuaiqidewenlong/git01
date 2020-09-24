package com.itheima.test;

import com.itheima.pojo.Dept;

/**
 * @program: git03
 * @author: wenlong
 * @create: 2020-09-23 09:22
 */
public class Demo {
    private static int did;

    public static void main(String[] args) {
        System.out.println(did=8);
        System.out.println(did=9);
        System.out.println(did=10);
        System.out.println(21111);
        Dept dept=new Dept();
        dept.setDid(1);
        dept.setDname("张三");
        dept.setDtel("31457-7894");
        String s = dept.toString();
        System.out.println(s);
    }
}
