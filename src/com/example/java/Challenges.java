package com.example.java;

import java.util.Scanner;

public class Challenges {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a first numeric : ");
        double input1  = sc.nextDouble();
        // double d1 = Double.parseDouble(input1);

        System.out.println("Enter a second numeric: ");
        double input2 = sc.nextDouble();
//        double d2 = Double.parseDouble(input2);
        // create variable to hold an inputs value.
        double result = input1 + input2;
        System.out.println("the result is " + result);

    }
}
