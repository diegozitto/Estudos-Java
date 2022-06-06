package CursoJava;

public class B2_Statements_Whitespace_Indentation {
    public static void main(String[] args) {
        int minhaVariável = 50; // a linha toda é um statement
// o conteúdo é uma expressão: minhaVariável = 50
        minhaVariável++;

        minhaVariável += 1;

        minhaVariável--;

        System.out.println("Isso é um teste");

        System.out.println("Isso é" +
                " um" +
                " statement também mas sem quebra " +
                "de linha");

        // o espaço em branco que existe para separar variáveis,
        // funções e nomes é cortado quando se roda o código
        // int curso = 50; os espaços são cortados pelo java e ficam como intcurso=50;


    }
}
