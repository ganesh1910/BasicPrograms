package com.gk.java;

public class OddEvenNumber {

    public static void main(String[] args) {
        int arr[] = {1, 6, 3, 9, 8, 5, 6, 96};
        System.out.println("Using If condition");
        printEvenOdd(arr);
        System.out.println("Using Bitwise | operator");
        printUsingBitwiseOrOperator(arr);
        System.out.println("Using Bitwise & operator");
        printUsingBitwiseAndOperator(arr);
        System.out.println("Using Increment by 1");
        printUsingIncrementOperator(arr);
        System.out.println("Using Binary operator 1");
        printUsingBinaryOperator(arr);
    }

    static void printEvenOdd(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("Event = " + arr[i]);
            } else {
                System.out.println("Odd = " + arr[i]);
            }
        }
    }

    static void printUsingBitwiseOrOperator(int arr[]) {
        for (int i : arr) {
            // Using bitwise or operator
            if ((i | 1) > i) {
                System.out.println("Even  = " + i);
            } else {
                System.out.println("Odd  = " + i);
            }
        }
    }

    static void printUsingBitwiseAndOperator(int arr[]) {
        for (int i : arr) {
            // Using bitwise and operator
            if ((i & 1) == 1) {
                System.out.println("Odd  = " + i);
            } else {
                System.out.println("Even  = " + i);
            }
        }
    }
    static void printUsingIncrementOperator(int arr[]) {
        for (int i : arr) {
            // Using bitwise increment by 1
            if ((i ^ 1) == i+1) {
                System.out.println("Even  = " + i);
            } else {
                System.out.println("Odd  = " + i);
            }
        }
    }

    static void printUsingBinaryOperator(int arr[]){
        for (int i : arr) {
            // Using bitwise increment by 1
            if (Integer.toBinaryString(i).endsWith("0")) {
                System.out.println("Even  = " + i);
            } else {
                System.out.println("Odd  = " + i);
            }
        }
    }
}
