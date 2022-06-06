package CodingExercises;

public class CE3_BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        // We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.
        // In all other cases return false.
        // If the hourOfDay parameter is less than 0 or greater than 23 return false.

        // EX: shouldWakeUp (true, 1); → should return true
        // EX: shouldWakeUp (false, 2); → should return false since the dog is not barking.
        // EX: shouldWakeUp (true, 8); → should return false, since it's not before 8.
        // EX: shouldWakeUp (true, -1); → should return false since the hourOfDay parameter needs to be in a range 0-23.

        if((barking && hourOfDay < 0) || (barking && hourOfDay > 23)) {
            return false;

        } else if((barking && hourOfDay < 8) || (barking && hourOfDay > 22)) {
            return true;

        } else if ((!barking && hourOfDay < 8) || (!barking && hourOfDay > 22)){
            return false;
        }
            return false;
    }
}
