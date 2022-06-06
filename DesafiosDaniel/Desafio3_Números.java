package DesafiosDaniel;

public class Desafio3_Números {

    //Given two int values, return their sum. Unless the two values are the same, then return double their sum.
    //
    //sumDouble(1, 2) → 3
    //sumDouble(3, 2) → 5
    //sumDouble(2, 2) → 8
    public static void main(String[] args) {


    }

    public int sumDouble(int a, int b) {

        if(a == b){
            int resultado = (a + b) * 2;
            return resultado;
        } else {
            int resultado = a + b;
            return resultado;
        }

    }
// CORRETO
}
