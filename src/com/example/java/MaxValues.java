package com.example.java;

import java.math.BigDecimal;

public class MaxValues {
    public static void main(String[] args) {
        byte b = 127;
        if(b < Byte.MAX_VALUE){
            b++;
        }else {
            System.out.println("Byte: " + b);
        }
        double value = 0.012D;
        double pSum = value + value + value;
        System.out.println("Sum of pSum = " + pSum);
        double newValue = pSum * 3 / 2;
        System.out.println("new value of newValue: " + newValue);

        String strValue = Double.toString(value);
        System.out.println("strValue: " + strValue);
        strValue = Double.toString(value);
        System.out.println("Value: " + strValue);


        BigDecimal bigValue = new BigDecimal(strValue);

        BigDecimal bSum = bigValue.add(bigValue).add(bigValue);
        System.out.println("Sum of BigDecimals: " + bSum.toString());

    }

}
