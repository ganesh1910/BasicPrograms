package com.gk.java;

public class FibonacciSeries {

    public static void main(String[] args) {
        int n1=0, n2=1,n3;
        for (int i=0;i<50;i++){
            if (i==0 | i==1){
                System.out.print(" "+i);
            }else {
                n3 = n1+n2;
                n1=n2;
                n2=n3;
                System.out.print(" "+n3);
            }
        }
    }
}

