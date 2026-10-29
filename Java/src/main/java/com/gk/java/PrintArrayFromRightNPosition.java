package com.gk.java;

import java.util.Arrays;

public class PrintArrayFromRightNPosition {
    // print array from right side with n th position
    // [1,8,3,6,4,2]
    // n = 2
    // Output [4,2,1,8,3,6]

    public static void main(String[] args) {

        int n = 2;
        Integer[] arr = new Integer[]{1, 3, 6, 5, 9 , 8, 8};
        Integer[] temp = new Integer[arr.length];
        int count = 0;
        for (int i = arr.length - n; i < arr.length; i++) {
            temp[count] = arr[i];
            count++;
        }
        for (int j = 0; j < (arr.length - n); j++) {
            temp[count] = arr[j];
            count++;
        }
        System.out.println(Arrays.stream(temp).toList());
    }
}
