package com.example.java;

import java.sql.SQLOutput;
import java.text.NumberFormat;

public class ConvertingPrimitiveValueToStrings {
    public static void main(String[] args) {
        int intValue = 42;
        String fromInt = Integer.toString(intValue);
        System.out.println("Convert integer 42 to String: " + fromInt);

        boolean booleanValue = true;
        String fromBool = Boolean.toString(booleanValue);
        System.out.println("Convert Boolean value to string: " + fromBool);

        long longValue = 10_000_000;
//        NumberFormat formatter = NumberFormat.getNumberInstance();
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String formatted = formatter.format(longValue);
        System.out.println("Convert long value to string: " + formatted);
    }
}
