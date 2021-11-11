package Method;

import java.sql.SQLOutput;

public class ReusableCodeWithMethod {

    // Method in Java or Function in other languages.

    static String[] months = {"January", "February", "March","April","May","June",
            "July","August","September","October","November","Christmas: Yeah!!"};

    public static void main(String[] args) {
        loopTheMonths("Months of the year");
        loopTheMonths("Second Run");
        loopTheMonths("Third run");
        System.out.println("Add = " + addNumber(2,3));
        System.out.println("Division number: " + division(6, 2));
    }

    static void loopTheMonths(String label){
        System.out.println(label);
        for(int i = 0; i <label.length(); i++){
            System.out.print("*");
        }
        System.out.println(" ");

        for(int i = 0; i < months.length; i++){
            System.out.println(months[i]);
        }
    }
    private static int addNumber(int x, int y){
        return x + y;

    }
    private static double division(double x, double y){
        return x/y;
    }
}
