package ProgrammingConditionLogic;

import java.util.Scanner;

public class SwitchString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string of month: ");
        String input = sc.nextLine();

        switch (input){
            case "jan":
                System.out.println(1);
                break;
            case "Feb":
                System.out.println(2);
                break;
            case "Mar":
                System.out.println(3);
                break;
            case "Apr":
                System.out.println(4);
                break;
            default:
                System.out.println("Choose another month!");
        }

    }
}
