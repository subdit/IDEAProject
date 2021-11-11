package ProgrammingConditionLogic;

public class ConditionAndLogics {
    public static void main(String[] args) {
        int monthNumber = 12;
        if(monthNumber >= 1 && monthNumber <= 3){
            System.out.println("You're in Quarter 1");
        }else if(monthNumber >= 4 && monthNumber <=6){
        System.out.println("You're in Quarter 2");
        }else if (monthNumber >=7 && monthNumber <=9){
            System.out.println("you're in quarter 3");
        } else if(monthNumber >= 10 && monthNumber <= 12){
            System.out.println("You're in quarter 4");
        }else{
            System.out.println("Unknown month");
        }
    }
}
