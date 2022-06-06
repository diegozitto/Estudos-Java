package CursoJava;

public class B4_MetodosEmJava {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        // Até agora usamos um método para rodar o código, o método MAIN
        // Um método não pode ser criado dentro  de outro, deve ser feitos
        // de forma separada

        calculateScore(gameOver, score, levelCompleted, bonus);

        // ao executar o código, ele irá ler e rodar o que estiver no método MAIN
        // ao criar um outro método, faz se  necessário "chamar" ele no MAIN
        // como fizemos acima;

        // as variáveis criadas dentro das chaves, devem ser enviadas para o chamado do método
        // dentro do MAIN, com os valores ou apenas os nomes das variáveis (esse último, desde que as variáveis tenham
        // sido declaradas no método MAIN também)

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus);
    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        // quando um método está sendo usado, a cor dele muda
        // em uso: amarelo
        // sem uso: cinza
        // ao menos está assim na minha configuração atual

       // boolean gameOver = true;
       // int score = 5000;
       // int levelCompleted = 5;
       // int bonus = 100;


        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was: " + finalScore);
            return finalScore;
        } else {

            return -1;
        }
        // as variáveis criadas dentro do método, podem ser declaradas dentro dos parênteses
        // e se mantiver os dois juntos, haverá erro.

    }

    // a palavra VOID significa: não mandar nenhum resultado de volta
    // para mandar um dado de volta, precisamo trocar VOID pelo tipo de dado
    // que queremos mandar de resposta.

    // porém ao fazer isso, haverá um erro pois ainda escrevamos o return finalScore;
    // é necessário um outro return, independente se o gameOver não for verdadeiro

    // duas formas de se fazer isso são:
    // else { return -1; }
    //       ou
    //   return -1;

    // isto indica um valor inválido ou não encontrado

}
