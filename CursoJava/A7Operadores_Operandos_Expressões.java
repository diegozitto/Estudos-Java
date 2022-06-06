package CursoJava;

public class A7Operadores_Operandos_Expressões {
    public static void main(String[] args) {
          // operadores são sinais usados como: + (adição), - (subtração), * (multiplicação), / (divisão);
          // operandos sãos os elementos presentes entre os operadores;
          // expressões são combinações de operadores e operandos;

        int  resultado = 1 + 2;
        System.out.println("1 + 2 = " + resultado);

        int resultadoAntigo = resultado;
        System.out.println("resultado antigo é = " + resultadoAntigo);

        resultado = resultado - 1;
        System.out.println("3 - 1 = " + resultado);

        resultado = resultado * 10;
        System.out.println("2 * 10 = " + resultado);

        resultado = resultado / 5;
        System.out.println("20 / 5 = " + resultado);

        resultado = resultado % 3; // resto da divisão (remainder em ing), apenas o 1 resto e sem "," no resultado
        System.out.println("4 % 3 = " + resultado);

        // resultado = resultado + 1; pode ser reescrito como:
        resultado++; //1 + 1 = 2
        System.out.println("1 + 1 = " + resultado);

        resultado--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + resultado);

        resultado += 2; // resultado = resultado + 2 ou 1 + 2 = 3
        System.out.println("1 + 2 = " + resultado);

        resultado *=10; // resultado = resultado * 10 ou 3 * 10 = 30
        System.out.println("3 * 10 = " + resultado);

        resultado /= 3; // resultado = resultado / 3 ou 30 / 3 = 10
        System.out.println("30 / 10 = " + resultado);

        resultado -=2; // resultado = resultado - 2 ou 10 - 2 = 8
        System.out.println("10 - 2 = " + resultado);

    }
}
