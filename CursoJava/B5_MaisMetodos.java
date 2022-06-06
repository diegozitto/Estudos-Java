package CursoJava;

public class B5_MaisMetodos {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was: " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was: " + highScore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }

    // 1- podemos associar o valor de uma variável a chamada de um método:
    //  int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
    // assim separamos um método para fazer o cálculo da pontuação e outro para imprimir o resultado

    // a variável finalScore apenas foi criada para se realizar a conta, o valor dela é associado ao método
    // pelo comando return

}
