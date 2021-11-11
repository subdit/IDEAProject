package com.example.java;

public class StringChar {
    public static void main(String[] args) {
        char[] chars =  {'h','e','l','l','o'};
        String s = new String(chars);
//        System.out.println("Print out chars" + chars);
        System.out.println("Create a new string of chars: " + s);

        String s1 = "This is a String";
        System.out.println(s1);
        String s2 = new String("This is also a String"); // String is a class member don't need to instantiate New.
        System.out.println(s2);
        String s3 = "Shirt size: ";
        String s4 = "M";
        String s5 = s3 + s4 +  ", Qty: " + 4; //concatenate the string
        System.out.println(s5);

        // Use an Array of String
        String s6 = new String(chars);
        System.out.println(s6);

        // convert the string to CharArray to print out each character
        char[] chars2 = s6.toCharArray();
        for(char c : chars2){
            System.out.println(c);
        }

    }
}
