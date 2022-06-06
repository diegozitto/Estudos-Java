package CursoJava;

public class A12CHALLENGES {
    public static void main(String[] args) {
        // operators challenge

        double valor1 = 20.00d;
        // 1 - certo, não esquecer do "d" após escrever o valor em DOUBLE.

        double valor2 = 80.00d;
        // 2 - certo, não esquecer do "d" após escrever o valor em DOUBLE.

        double soma = (valor1 + valor2) * 100.00d;
        // 3 - meio certo, não esquecer do "d" após escrever o valor em DOUBLE.
        //     e dos parênteses.

        System.out.println("20.00 + 80.00 * 100 = " + soma);

        double resto4 = soma % 40.00d; // 4 - certo, não esquecer do "d" após escrever o valor em DOUBLE.

        System.out.println("O resto da operação de " + soma + " por 40.00 é: " + resto4);



        // 5 - Criar uma variável BOOLEAN que seja TRUE se o resto for igual a 0 ou FALSE se não for 0
        // RESPOSTA:

        boolean semResto = (resto4 == 0) ? true : false; //pode ser simplificado para: semResto = resto4 == 0;

        // 6 - Printar resultado do passo 5
        // RESPOSTA:

        System.out.println("semResto é: " + semResto);

        // 7 - Escreva um IF-THEN que apareça a mensagem " Teve resto " se o BOOLEAN for FALSE
        // RESPOSTA:
        // "!semResto" é o mesmo que: "semResto == false"

        if (!semResto){
            System.out.println("Teve resto");
        }




    }
}
