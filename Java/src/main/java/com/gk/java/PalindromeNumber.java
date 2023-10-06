package com.gk.java;

public class PalindromeNumber {
    public static void main(String[] args) {
//            System.out.println("100 is palindrome ="+isPalindrome(100));
        System.out.println("101 is palindrome =" + isPalindrome(101));
        System.out.println("101 is palindrome =" + checkPalindromeWithString(101));
        System.out.println("165 is palindrome =" + checkPalindromeWithString(165));
        System.out.println("161 is palindrome =" + checkPalindromeWithInbuilt(161));
        System.out.println("169 is palindrome =" + checkPalindromeWithInbuilt(169));
    }

    static boolean isPalindrome(int num) {
        int sum = 0, r, temp;
        temp = num;
        while (num > 0) {
            r = num % 10;
            System.out.println("r =" + r);
            sum = (sum * 10) + r;
            System.out.println("sum =" + sum);
            num = num / 10;
            System.out.println("num = " + num);
        }
        if (temp == sum) {
            return true;
        }

        return false;
    }

    // We can use same logic for String reverse
    static boolean checkPalindromeWithString(int num) {
        int temp = num;
        String rev = "";
        String strNum = Integer.toString(num);
        for (int i = strNum.length(); i > 0; --i) {
            rev = rev + strNum.charAt(i-1);
        }
        return temp == Integer.parseInt(rev);
    }

    // We can use same logic for String reverse
    static boolean checkPalindromeWithInbuilt(int num){
        StringBuilder builder =new StringBuilder(String.valueOf(num));
        return num == Integer.parseInt(builder.reverse().toString());
    }
}
