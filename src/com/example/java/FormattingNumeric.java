package com.example.java;

import java.text.NumberFormat;
import java.util.Currency;

public class FormattingNumeric {
    public static void main(String[] args) {
        // Formatting numbers using
        double doubleValue = 1_234_567.89;
        NumberFormat numF =  NumberFormat.getNumberInstance();

        System.out.println("Number: " + numF.format(doubleValue));
        NumberFormat numF2 = numF.getCurrencyInstance();
        System.out.println("Number with currency format: " + numF2);
    }

}
