package CursoJava;

public class A3TiposPrimitivos {
    public static void main(String[] args){
        //INT é um dos oito tipos primitivos de dados que existem, os oito existentes são:
        // INT,BOOLEAN, BYTE, CHAR, SHORT, LONG, FLOAT e DOUBLE
        // ao criar um projeto novo e escolhendo a opção de Cria projeto a parti do template, ele já deixa escrito
        // que a classe está em um PACKAGE, o public static void main (String[] args){}
        // os dados INT possuem um valor MÍN e MÁX que podem ser assimilados e para descobrir este valor
        // fazemos o seguinte:

        int intValorMin = Integer.MIN_VALUE;
        int intValorMax = Integer.MAX_VALUE;

    System.out.println ("Valor int mínimo = " + intValorMin);
    System.out.println ("Valor int máximo = " + intValorMax);

    System.out.println("Valor int máximo estourado = " + (intValorMax + 1));
    //Overflow
    System.out.println("Valor int mínimo estourado = " + (intValorMin - 1));
    //Underflow
    // Aula 4 de tipos de dados primitivos

    byte byteValorMinimo = Byte.MIN_VALUE;
    byte byteValorMaximo = Byte.MAX_VALUE;

    System.out.println("Byte máximo = " + byteValorMaximo);
    System.out.println("Byte mínimo = " + byteValorMinimo);


    short shortValorMinimo = Short.MIN_VALUE;
    short shortValorMaximo = Short.MAX_VALUE;

    System.out.println("Short mínimo = " + shortValorMinimo);
    System.out.println("Short máximo = " + shortValorMaximo);
    
    //long meuValorLong = 100L;

    // Para se escrever número LONG, deve-se por a letra L no final
    // mas se o valor não tiver L, será tratado como INT, logo o valor
    // não pode ser maior que 2147483647 ou menor que -2147483648 sem o L
    // isto porque o espaço que long ocupa na memória é o dobro de int
    // byte < short < int < long (8 bits, 16 bits, 32 bits, 64 bits)

    long longValorMinimo = Long.MIN_VALUE;
    long longValorMaximo = Long.MAX_VALUE;

    System.out.println("Long mínimo = " + longValorMinimo);
    System.out.println("Long máximo = " + longValorMaximo);

    //Aula 4 - casting, significa tratar ou converter um número de um tipo
    // para o outro:

    int myTotal = (intValorMin / 2);

    //byte meuNovoValorByte = (meuValorMinimo/2);

    // O byte está dando erro pois o java está interpretando ele como INT
    // e para fazer dar certo, é preciso colocar o tipo de dado, entre parênteses, antes
    // da operação a ser realizada

    byte meuNovoValorByte = (byte) (byteValorMinimo / 2);

    // DESAFIO: criar uma variável e alocar um valor (byte, short e int) e enfim criar
    // criar uma variável do tipo long e seu valor deve ser igual a 50.000 + 10 * ( byte + short + int)

    byte valor1 = 100;
    short valor2 = 500;
    int valor3 = 2500;
    long valor4 = 50000L + 10L * (valor1 + valor2 + valor3);

    System.out.println("Valor de long é = " + valor4);
    }
}
