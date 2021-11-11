package com.example.java;

public class CompareString {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";

        if (s1 == s2) {
            System.out.println("They're matched");
        } else {
            System.out.println("They don't match");
        }

        String s3 = "hello";
        if (s1 == s3) {
            System.out.println("They're matched");
        } else {
            System.out.println("They don't match");
        }

        System.out.println("***** Compare S4 and S5 ****");
        String part1 = "Hello";
        String part2 = " WORLD";
        String s4 = part1 + part2;
        String s5 = "Hello World";

        // to compare string using equalsIgnoreCase or Equals to get accurate result
        if (s4.equalsIgnoreCase(s5)){
            System.out.println("They matched!");
        }else {
            System.out.println("They don't match");
        }
    }
}


