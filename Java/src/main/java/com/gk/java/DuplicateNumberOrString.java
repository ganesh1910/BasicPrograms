package com.gk.java;

import static java.util.stream.Collectors.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class DuplicateNumberOrString {

    public static void main(String[] args) {
        int[] arr = {5, 6, 3, 5, 9, 6};
        printDuplicateUsingSet(arr);
        printDuplicateNumbers(arr);
        printDuplicateNumbers2(arr);
        printDuplicateNumbers3(new String[]{"G", "M", "D", "J", "L", "M"});
    }

    static void printDuplicateUsingSet(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!set.add(arr[i])) {
                duplicate.add(arr[i]);
            }
        }
        Arrays.stream(arr).filter(num-> duplicate.contains(num)).forEach(System.out::print);
    }

    static void printDuplicateNumbers(int arr[]) {
        System.out.println();
        String temp = "";
        String duplicate = "";
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (duplicate.contains(Integer.toString(num))) {
                temp = temp + num;
            } else {
                duplicate = duplicate + num;
            }
        }
        for (int num : arr) {
            if (temp.contains(Integer.toString(num))) {
                System.out.print(num);
            }
        }
        System.out.println();
    }

    static void printDuplicateNumbers2(int arr[]) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arrayList.add(arr[i]);
                }
            }
        }
        System.out.println(arrayList.toString());
    }

    static void printDuplicateNumbers3(String arr[]) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arrayList.add(arr[i]);
                }
            }
        }
        System.out.println(arrayList.toString());
    }
}