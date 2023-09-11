package com.gk.java;

public class RemoveFirstLastCharacter {

    public static void main(String[] args) {
        System.out.println(removeUsingSubString("Hello World"));
        System.out.println(removeUsingChartAt("Hello World"));
        System.out.println(removeUsingBuilder("Hello World"));

    }

     static String removeUsingSubString(String str){
        return str.substring(1,str.length()-1);
    }

    static String removeUsingChartAt(String str){
        String temp="";
        for (int i=0;i<str.length();i++){
            if (i!=0 && i!=str.length()-1){
                temp = temp + str.charAt(i);
            }
        }
        return temp;
    }

    static String removeUsingBuilder(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.deleteCharAt(str.length()-1);
        sb.deleteCharAt(0);
        return sb.toString();
    }
}