package CodingExercises;

public class CE9_Minutes_To_Years_And_Days_Calculator {
    public static void printYearsAndDays (long minutes){

        if(minutes < 0){
            System.out.println("Invalid Value");
        } else {
            long hours = minutes / 60;

            long days = hours / 24;

            long years = days / 365;

            System.out.println(minutes + " min = "
                    + years + " y and " + days % 365 + " d");
        }
    }
}
