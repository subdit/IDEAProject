package Method;

import java.util.Scanner;

public class Calculator {
    // Calculator using scanner,handle operators in separate methods and handle exception using try/catch

    public static void main(String[] args) {

        String s1 = getInput("Enter a number value: ");
        String s2 = getInput("Enter a second number: ");
        String option = getInput("Choose an operator (+ - * / ): ");
        double result = 0;
  try {
      switch (option) {
          case "+":
              result = addValue(s1, s2);
              break;
          case "_":
              result = subtractValue(s1, s2);
              break;
          case "*":
              result = multiplyValue(s1, s2);
              break;
          case "/":
              result = divideValue(s1, s2);
              break;
          default:
              System.out.println("Unrecognized operator!");
              return; // leave a main method when finish running
          }
         System.out.println("The answer is " + result);

      } catch (Exception e){
      System.out.println("Number formatting exception " + e.getMessage());
     }
    }
    private static double addValue(String s1, String s2){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 + d2 ;

    }
    private static double subtractValue(String s1, String s2){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 - d2;
    }
    private static double multiplyValue(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 * d2;
    }
    private static double divideValue(String  s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 / d2;
    }
    private static String getInput(String prompt){
            System.out.println(prompt);
            Scanner sc = new Scanner(System.in);
            return sc.nextLine();
    }
}
