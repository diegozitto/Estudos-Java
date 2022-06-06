package CursoJava;

public class B7_Coding_Exercises {

    public static void main(String[] args) {

        //recurso adicionado em 2018
        // não tem solução em vídeo
        // pode ser feito na IDE e depois colar na página ou direto na página

        // ESCREVA UM MÉTODO CHAMADO "checkNumber" COM O PARÂMETRO "int *number*"
        // O MÉTODO NÃO DEVE RETORNAR VALOR ALGUM E PRECISA "IMPRIMIR":

        // "positive" se o parâmetro for > 0
        // "negative" se o parâmetro for < 0
        // "zero" se o parâmetro for igual a 0

        // O método "checkNumber" precisa estar definido como "public static"
        // Não adicione um método main para a sua solução

        checkNumber(5);
        checkNumber(-9);
        checkNumber(0);


    }

    public static void checkNumber(int number){

        if(number > 0){
            System.out.println("positive");
        } else if( number < 0){
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
}
