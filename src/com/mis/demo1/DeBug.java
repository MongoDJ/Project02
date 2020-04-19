package com.mis.demo1;

import java.util.HashMap;

/**
 * @author MongoDJ
 * @date 2020/4/19 - 14:24
 */
public class DeBug {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        HashMap<String, String> map = new HashMap<>();
        map.put("name","Tom");
        map.put("age","19");
        map.put("school","Tsinghua");
        map.put("major","computer");


        String age = map.get("age");
        System.out.println(age);

        map.remove("major");
        System.out.println(map);
    }
}
