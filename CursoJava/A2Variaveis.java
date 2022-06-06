package CursoJava;

public class A2Variaveis {
    public static void main(String[] args){

        //variável do tipo int, abreviação para integral ou um valor numérico inteiro
        //para declarar uma variável é preciso especificar o tipo da variável e posteriormente
        //o nome dela exemplo:

        int Numero = 5;

        //Posso declarar separadamente o tipo da variável do nome dela, mas ao dar o comando
        //de "print", devo apenas escrever o nome da variável.

        System.out.println ( Numero + " normal. " );

        //É possível colocar vários operadores dentro de uma mesma variável

        int meuPrimeiroNumero = (10 + 5) + (2 * 10);

        //Usamos os operadores + e * (soma e multiplicação)

        System.out.println(meuPrimeiroNumero + " meu primeiro numero. ");

        int meuSegundoNumero = 12;
        int meuTerceiroNumero = 6;
        int meuTotal = meuPrimeiroNumero + meuSegundoNumero + meuTerceiroNumero;

        System.out.println(meuSegundoNumero + " meu segundo numero ");
        System.out.println(meuTerceiroNumero + " meu terceiro numero ");
        System.out.println(meuTotal + " meu total é o resultado de (10 + 5) + (2 * 10) + 12 + 6 " );
//DESAFIO
        int meuUltimoNumero = 1000 - meuTotal;

        System.out.println( meuUltimoNumero + " é o valor do meu ultimo numero" );
    }
}
