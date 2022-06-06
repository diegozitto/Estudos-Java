package CursoJava;

public class A4NumerosDecimais {
    public static void main (String[] args){
        // float é número com virgula, número não inteiros
        // double tem maior espaço e precisão do que o float

        float floatMax = Float.MAX_VALUE;
        float floatMin = Float.MIN_VALUE;

        System.out.println("Valor float máximo = " + floatMax);
        System.out.println("Valor float mínimo = " + floatMin);

        double doubleMax = Double.MAX_VALUE;
        double doubleMin = Double.MIN_VALUE;

        System.out.println("Valor double máximo = " + doubleMax);
        System.out.println("Valor double mínimo = " + doubleMin);

        // Ao declarar variáveis de float e double em Java
        // não é necessário colocar as letras "f" e "d" ao final
        // caso os valores declarados sejam inteiros.

        // Porém se ao declarar valores não inteiros em um variável do tipo float
        // não for colocada a letra respectiva ao final, teremos um ERRO
        // pois aparecerá que foi encontrado um dado do tipo double
        // e esperava float:

        int valorInt = 5 / 3;
        float valorFloat = 5f / 3f;
        double valorDouble = 5d / 3d;

//        int valorInt2 = 5;
//        float valorFloat2 = 5.25;
//        float valorFloat3 = 5.25f;
//        double valorDouble2 = 5.25d;

        // É possível tirar o erro colocando o "f" ou
        // fazer o "casting", basicamente dizer ao JAVA
        // "Sim, escrevi double mas quero que o trate como float"
        //  float valorFloat2 = (float) 5.25; [NÃO RECOMENDADO]

        System.out.println("Valor inteir= " + valorInt); // o int ocupa menos memória e só trabalha com inteiros
        System.out.println("Valor float= " + valorFloat); // o float ocupa menos memória e é menos preciso
        System.out.println("Valor double= " + valorDouble); // o double ocupa mais memória e é mais preciso

        // DESAFIO: converter pounds (libras) para quilogramas

        double valorPounds = 55.97d;
        double poundsKG = 0.45359237d;
        double valorKG = valorPounds * poundsKG;
        System.out.println(valorPounds + " libras equivalem á: " + valorKG + "kg");
    }
}
