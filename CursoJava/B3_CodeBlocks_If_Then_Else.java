package CursoJava;

public class B3_CodeBlocks_If_Then_Else {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

//        if(score < 5000 && score > 1000){
//            System.out.println("Your score was less than 5000 but greater than 1000");
//        } else if(score < 1000) {
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here.");
//        }

        if (gameOver == true){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);

            score = 10000;
            levelCompleted = 8;
            bonus = 200;
            finalScore = score + (levelCompleted * bonus);

            System.out.println("Your final score was: " + finalScore);
        }

        // variáveis criadas dentro das {} não podem ser usadas fora delas
        // porém as criadas fora das {} podem ser usadas a qualquer momento
        // ex: a variável "finalScore" não pode ser usada livremente fora
        // das chaves

        // variáveis dentro das chaves, são chamadas de SCOPE
        // Em java, variáveis são apenas acessíveis dentro da região
        // de onde foram criadas

        // DESAFIO: printar uma segunda pontuação com o seguinte
        // score = 10000
        // levelCompleted = 8
        // bonus 200
        // Mas o print acima deve aparecer junto


    }
}
