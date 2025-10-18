package com.example.StringExample;

public class StringConcept {

    public static void main(String[] args) {

        String a = "hello";
        String b = new String("hello");
        String c = "hello";

        System.out.println(a == b);//false
        System.out.println(a.equals(b));//true
        System.out.println(a == c);//true
        System.out.println("success");
    }

}
