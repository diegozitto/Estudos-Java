package CodingExercises;

public class CE10_Equality_Printer {
    public static void printEqual (int A, int B, int C){

        if( (A < 0) || (B < 0) || (C < 0)){
            System.out.println("Invalid Value");

        } else if((A == B) && (B == C)){
            System.out.println("All numbers are equal");

        } else if ((A == B) && (B != C)){
            System.out.println("Neither all are equal or different");

        }  else if ((A == B) && (A != C)){
            System.out.println("Neither all are equal or different");

        } else if ((A == C) && (C != B)){
            System.out.println("Neither all are equal or different");

        } else if ((B == C) && (C != A)){
            System.out.println("Neither all are equal or different");

        } else {
            System.out.println("All numbers are different");
        }

    }
}
