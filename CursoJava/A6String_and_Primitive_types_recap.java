package CursoJava;

public class A6String_and_Primitive_types_recap {
    public static void main(String[] args) {
        //int
        //boolean
        //byte
        //char
        //short
        //long
        //float
        //double
        String minhaString = "Isso é uma string";
        System.out.println("minhaString é igual a: " + minhaString);

        minhaString = minhaString + ", e isto é mais string.";
        System.out.println("minhaString é igual a: " + minhaString);

        minhaString = minhaString + "\u00A92022";
        System.out.println("minhaString é igual a: " + minhaString);

        // ao usa a mesma variável "minhaString", o resultado será a concatenação dos valores
        // previamente atribuídos.

        String numeroString = "250.55";
        numeroString = numeroString + "49.95";
        System.out.println(numeroString);

    }
}
