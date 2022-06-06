package CursoJava;

public class A10Lofical_OR_Operator1 {
    public static void main(String[] args) {

        int topScore = 80;
        int secondTopScore = 79;

        if ((topScore > secondTopScore) && (topScore < 100)) //operador lógico E
             {
            System.out.println("Greater than second top score and less than 100");
        }

            // operador OU    ||
        if((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Uma das ou ambas as condições são verdadeiras");
        }


        if((topScore > 90)){
            System.out.println("Maior nota está acima de 90");
        } else {
            System.out.println("Maior nota está abaixo de 90");
        }


        int newValue = 50;

        if(newValue == 50){
            System.out.println("Isto é um erro");
        }
    }
}
