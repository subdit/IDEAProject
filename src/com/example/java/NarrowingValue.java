package com.example.java;

public class NarrowingValue {
    public static void main(String[] args) {
        int intValue1 = 56;
        int intValue2 = intValue1;
        System.out.println("The 2nd value is " + intValue2);

        long longValue1 = intValue1;
        System.out.println("the long value is " + longValue1);

        short shorValue1 = (short) longValue1;
        System.out.println("The short value is " + shorValue1);

        int intValue3 = 1024; // you just make a copy of the value intValue3 to byteValue not a reference.
        int byteValue = (byte) intValue3; // make sure you make a casting type when narrow or widening the data
        System.out.println("The byte value is " + byteValue); // You will lose the data.

    }
}
