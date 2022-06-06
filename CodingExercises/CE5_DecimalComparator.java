package CodingExercises;

public class CE5_DecimalComparator {


   //The method should return boolean and it needs to return true if two double numbers are the same up to
   // three decimal places. Otherwise, return false.
   //
   //
   //EXAMPLES OF INPUT/OUTPUT:
   //
   //* areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3
   // decimal places.
   //
   //* areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3
   // decimal places
   //
   //* areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.
   //
   //* areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3
   // decimal places.

    public static boolean areEqualByThreeDecimalPlaces(double a, double b){



        if(a == b){
            return true;
        } else {
            return false;
        }

    }
}

// return (int) (num1 * 1000) == (int) (num2 * 1000); resposta
