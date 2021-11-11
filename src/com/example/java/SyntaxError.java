package com.example.java;

public class SyntaxError {
    public static void main(String[] args) {
        String s = "Where are you going?";
        System.out.println(s);


        String welcome = "Welcome, guys";
        welcome.length(); // to find out the length of character in string
        System.out.println(welcome.length());

        // To find out the last character of the string assign it Array of Char
        char[] chars = welcome.toCharArray(); // referencing the String variable "welcome"
        char lastChar = chars[chars.length -1];
        System.out.println(lastChar);
    }
}
