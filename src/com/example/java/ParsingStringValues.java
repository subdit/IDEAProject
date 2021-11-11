package com.example.java;

public class ParsingStringValues {
    public static void main(String[] args) {
       String s1 = "Welcome to California";
        System.out.println("the length of string:  "+ s1.length()); // Counting the length of string.

        // call the position of indexOf
        int position = s1.indexOf("California");
        System.out.println("Position of substring: " + position);

        // To check the position
        String sub = s1.substring(11);
        System.out.println(sub);

        // Counting the length
       String s2 = "Welcome!       ";
       int length1 = s2.length();
        System.out.println(length1);

        // Trim out the white space
        String s3 = s2.trim();
        System.out.println(s3.length());


    }

}
