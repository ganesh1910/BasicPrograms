package com.gk.java;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        String s="Geeks";
      System.out.println(contact1(s));

      Info info=new Info();
      Student student=new Student();
//      info = student // compile time error

        Set<String> set=new HashSet<>();
    }

    static String contact1(String s1){
        s1 =  s1+ "forgeeks";
        return s1;
    }
}

class Main{}
class Info extends Main{

}

class Student extends Main{

}
