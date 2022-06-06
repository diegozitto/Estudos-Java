package CursoJava;

public class A9LogicalAndOperator {

    public static void main (String[] args) {

       int topScore = 99;
       if (topScore != 100) // nesse caso estamos perguntando "topScore não vale 100?"

           {
           System.out.println("Você atingiu a pontuação máxima!");
         }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100){
            System.out.println("Greater than second top score and less than 100");
        }
    }
}
