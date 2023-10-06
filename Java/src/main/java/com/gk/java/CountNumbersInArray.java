package com.gk.java;

import java.util.HashMap;

public class CountNumbersInArray {

    public static void main(String[] args) {

        Integer[] arr = new Integer[]{1, 2, 6, 5, 3, 9, 6, 8, 9,5};
        System.out.println(countArray(arr).toString());

    }

    private static HashMap<Integer, Integer> countArray(Integer[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Integer count=1;
        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num)+1);
            }else {
                map.put(num, count);
            }
        }
        return map;
    }
}
