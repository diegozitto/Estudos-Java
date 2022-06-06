package CursoJava;

public class B1_KeywordAndExpressions {
    public static void main(String[] args) {

        // Java tem 50 palavras chaves reservadas
        // link de palavras reservadas em java : https://en.wikipedia.org/wiki/List_of_Java_keywords
        // o nome da variável não pode ser o mesmo que o dela
        // EX: int int = 5;

        // expressão é tudo que está entre a palavra reservada e o ponto e vírgula (;)
        // 1 milha = 1.609344 kilometros

        double kilômetros = (100 * 1.609344);

        System.out.println("100 milhas equivalem a: " + kilômetros + " KM");

        int highscore = 50;

        if(highscore == 50){
            System.out.println("Isto é uma expressão.");
        }

        // DESAFIO de expressões: identificar quais partes no código abaixo são expressões

        int score = 100;
        if(score > 99){
            System.out.println("You got the high scores");
            score = 0;
        }

        // RESPOSTA:
        // score = 100
        //  score > 99
        //         "You got the high scores"
        //             score = 0
        //


    }
}
