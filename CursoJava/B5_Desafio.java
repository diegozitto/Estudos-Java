package CursoJava;

public class B5_Desafio {

    // Create a method called displayHighScorePosition
    // it should a players name as a parameter, and a 2nd parameter as a position in the high score table
    // You should display the players name along with a message like *playersName* + " managed to get into position "
    // and the
    // position they got and a further message " on the high score table".
    //
    // Create a 2nd method called calculateHighScorePosition
    // it should be sent one argument only, the player score
    // it should return an int
    // the return data should be
    // 1 if the score is >=1000
    // 2 if the score is >=500 and < 1000
    // 3 if the score is >=100 and < 500
    // 4 in all other cases
    // call both methods and display the results of the following
    // a score of 1500, 900, 400 and 50

    public static void main(String[] args) {
        // resposta:

        int positionHighScore = calculateHighScorePosition(1500);
        displayHighScorePosition("Zitaum_54", positionHighScore);

        positionHighScore = calculateHighScorePosition(900);
        displayHighScorePosition("Zitaum_53", positionHighScore);

        positionHighScore = calculateHighScorePosition(400);
        displayHighScorePosition("Zitaum_52", positionHighScore);

        positionHighScore = calculateHighScorePosition(50);
        displayHighScorePosition("Zitaum_51", positionHighScore);
    }

    public static void displayHighScorePosition(String playersName, int positionHighScore) {

        System.out.println(playersName + " managed to get into position: "
                + positionHighScore + " on the high score table");

    }

    public static int calculateHighScorePosition(int finalScore) {

        if (finalScore >= 1000) {
            return 1;
        } else if (finalScore >= 500) {
            return 2;
        } else if (finalScore >= 100) {
            return 3;
        } else {
            return 4;
        }

        // outra forma que poderia ser feita:

        // int position = 4;
        // if (finalScore >= 1000){
        //      position = 1;
        //   } else if(finalScore >= 500){
        //      position = 2;
        //   } else if(finalScore >= 100){
        //      position = 3;
        //   }
        //      return position;

    }
}

