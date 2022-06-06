package CodingExercises;

public class CE8_Area_Calculator {
    public static double area (double radius){


        if (radius < 0){
            return -1;
        } else {
            double PI = Math.PI;
            return (radius * radius) * PI;
        }
    }

    public static double area (double x, double y){

        if(x < 0 || y < 0){
            return -1;
        } else {
            return x * y;
        }
    }
}
