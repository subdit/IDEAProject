package com.example.java;

import java.util.Scanner;

public class BuilderString {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + ", " + s2 + "!";
        System.out.println(s3);

        // String builder to hold data more than we expected. In case we don't know how much of the memory that we need
        StringBuilder sb = new StringBuilder("Hello")
//        sb.append(" _02");
//        sb.append(",");
//        sb.append(" World_again");
//        sb.append("!");
                // Or this method=> no ; @the end just use .append and make a call destructor StringBuilder once.
                .append(" _02")
                .append(",")
                .append(" World_again")
                .append("!");
        System.out.println(sb);

        // Use scanner to collect the user data
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value: ");
        String input = sc.nextLine();
        System.out.println(input);
        // Combine the StringBuilder and Scanner together
        // 1st => have to delete the sb.content
        sb.delete(0, sb.length());
        for (int i = 0; i < 3; i++){
            input = sc.nextLine();
            sb.append(input + "\n");
        }
        System.out.println(sb);
    }
}

//        System.out.print("Enter your name: ");
//        String firstName = sc.nextLine();
//
//        System.out.println("Enter the last name: ");
//        String lastName = sc.nextLine();
//
//        System.out.println("Your name is " + firstName + " " + lastName);
//
//        // Combine the StringBuilder and Scanner together
//        // 1st => have to delete the sb.content
//        sb.delete(0, sb.length());
//        for(int i = 0; i < 3; i++){
//            firstName = sc.nextLine();
//            sb.append(firstName + "\n");
//            lastName = sc.nextLine();

//        }
//        System.out.println(sb);

//    }
//}
