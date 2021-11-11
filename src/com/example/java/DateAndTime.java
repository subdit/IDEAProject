package com.example.java;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateAndTime {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        GregorianCalendar gc = new GregorianCalendar(2009, 1, 28);
        gc.add(GregorianCalendar.DATE, 1); // be careful of the old dat format start counting the month of index[0]
        Date d2 = gc.getTime();
        System.out.println(d2);

        // format the date
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(df.format(d2));

        // Java 8 Dat- time value
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        //
        LocalDate ld = LocalDate.of(2009, 1, 28);
        System.out.println(ld);

//        DateTimeFormatter dlf = DateTimeFormatter.ISO_DATE;
        DateTimeFormatter dlf = DateTimeFormatter.ofPattern("MM/DD/YYYY");
        System.out.println(dlf.format(ld));

    }
}
