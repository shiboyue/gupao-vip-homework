package com.gupaoedu;

import java.util.HashMap;
import java.util.Map;

public class HashMapAnalysis {

    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<>();
        map.put("a", 1);

        int a = 7;
        int b = 9;
        System.out.println(7^9);
        System.out.println(7&9);
        System.out.println(7|9);
        System.out.println(~7);

    }
}
