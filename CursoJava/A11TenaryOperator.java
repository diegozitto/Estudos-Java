package CursoJava;

public class A11TenaryOperator {
    public static void main(String[] args) {

        boolean isCar = false;

        if(isCar){
            System.out.println("This is not supposed to happen");
        }else{
            System.out.println("This is supposed to happen");
        }

        boolean wasCar = isCar ? true : false;

        if(wasCar){
            System.out.println("wasCar is true");
        }else{
            System.out.println("wasCar is false because: isCar is false");
        }
    }
}
