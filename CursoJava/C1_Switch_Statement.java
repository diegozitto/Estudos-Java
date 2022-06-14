package CursoJava;

public class C1_Switch_Statement {
    public static void main(String[] args) {
//        int value = 1;
//
//        if(value == 1){
//            System.out.println("Value was 1");
//        } else if (value == 2){
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Value was neither 1 or 2");
//        }

        // usando o if-else pode ficar demorado ou demasiado grande o código
        // caso precisasse fazer com muitos valores, ai que entra o SWITCH:

        int switchValue = 5;

        switch (switchValue){

            case 1:
                // é o mesmo que escrever (value == 1)

                System.out.println("Value was 1");
                break;
                // Para evitar que as comparações continuem a ser executadas após um caso correspondente
                // ter sido encontrado, acrescentamos o comando break no final de cada bloco de códigos.
                // O comando break, quando executado, encerra a execução da estrutura onde ele se encontra.

                // Se não ele pula para executar a próxima condição

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Value was a 3 or a 4 or a 5");
                System.out.println("Actually it was: " + switchValue);
                break;

            default:
              //  System.out.println("Was not 1 or 2");
                break;
                //seria o else
        }

        // switch é mais recomendado quando estamos testando a mesma variável
        
    }




}
