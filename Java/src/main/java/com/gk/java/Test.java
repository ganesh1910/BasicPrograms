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
        Main main = new Student();
        main.print();
        main.show();
        info.print();

        Set<String> set=new HashSet<>();
    }

    static String contact1(String s1){
        s1 =  s1+ "forgeeks";
        return s1;
    }
}

abstract class Main{
    abstract void print();
    void show(){
        System.out.println("Call in abstract");
    }
}
class Info extends Main{

    @Override
    void print() {
        System.out.println("Info");
    }
}

class Student extends Main{

    @Override
    void print() {
        System.out.println("Student");
    }
}
