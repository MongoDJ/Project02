package com.mis.demo1;

import java.util.ArrayList;

/**
 * @author MongoDJ
 * @date 2020/4/18 - 19:16
 * 1.IDEA中代码模板所在位置：settings - Editor -Live Templates / Postfix Completion
 * 2.常用模板
 *
 */
public class TemplatesTest {
    //模板一：psvm
    public static void main(String[] args) {

        //模板二：sout
        System.out.println("hello！");
        //变形：soutp / soutm /soutv / xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");
        System.out.println("args = " + args);

        //模板三：fori
        String[] arr=new String[]{"Tom","Jerry","Guomeimei","DJ"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);

        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板四：list.for
        ArrayList list = new ArrayList();
        list.add(12);
        list.add(23);
        list.add(24);

        for (Object o : list) {
            System.out.println(o);
        }
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
        }
        //变形：list.forr 逆序遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(i);
        }


    }
    public void method(){
        System.out.println("TemplatesTest.method");
        int num1=210;
        System.out.println("num1 = " + num1);
        System.out.println(num1);
        //模板五：ifn
        ArrayList list = new ArrayList();
//        list.add(12);
//        list.add(23);
//        list.add(24);
//        if (list == null) {
//
//        }
//        //模板：inn
//        if (list != null) {
//
//        }
            
        }

    }

