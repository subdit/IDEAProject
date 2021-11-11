package ProgrammingConditionLogic;

public class Loops {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March","April","May","June",
                "July","August","September","October","November","December"};

        // use regular for loop to loop through the Array of months.
       // for(int i = 0; i < months.length; i++){
        //    System.out.println(months[i]);

        /* Revers order
        for(int i = months.length -1; i >= 0; i--){
            System.out.println(months[i]);
         */
        // For each loop
//       for (String month: months) {
//           System.out.println(month);
//       }

        /* While loop
            int countMonth = 0;
            while(countMonth < months.length){
                System.out.println(months[countMonth]);
                countMonth++;
            };
        */
        int counter =0;
        do{
            System.out.println(months[counter]);
            counter++;
        }while(counter < months.length);

        }
    }

