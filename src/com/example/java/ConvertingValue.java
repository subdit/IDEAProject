package com.example.java;

public class ConvertingValue {

    public static void main(String[] args) {
        int value1 = 56;
        int value2 = 42;

        int result1 = value1 + value2;
        System.out.println("Addition result = " + result1);

        int result2 = value1 - value2;
        System.out.println("Subtraction result = " + result2);

        int result3 = value1 * value2;
        System.out.println("Multiplication result = " + result3);

        double result4 =(double) value1/value2;
        System.out.println("Division result = " + result4);

        double result5 = (double )value1 % value2;
        System.out.println("The remainder = " + result5);

        double doubleValue = -3.9999999;
        long rounded = Math.round(doubleValue);
        System.out.println("rounded value = " + rounded);

        double abValue = Math.abs(doubleValue);
        System.out.println("Absolute value = " + abValue); // always return positive
    }
}
