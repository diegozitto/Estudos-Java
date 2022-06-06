package CursoJava;

public class A5CharBoolean {
    public static void main(String[] args){
    // char é similar a string, a diferença é que
    // só pode armazenar UM caracter

    char meuChar = 'D';

    // Porém os caracteres possuem um código mundial
    // que pode ser encontrado no Unicode (https://unicode-table.com/pt/#latin-extended-b) e baseado neste site
    // a letra D estaria na linha 0040 e na coluna 4
    // É possível digitar esses códigos dentro do char
    // colocamos barra invertida (\) e a letra "u" quando formos usar o código e o ÚLTIMO NÚMERO
    // da linha é substituído pela da coluna desejada, no caso da letra D
    // o código seria 0044 (004 linha e 4 coluna)

    char meuUnicode = '\u0044';

    System.out.println( "Meu char = " + meuChar);
    System.out.println("Meu unicode = " + meuUnicode);

    char copyright = '\u00A9';
        System.out.println("Copyright:" + copyright);

    // boolean é para valores de Verdadeiro ou Falso

    boolean valorVerdadeiro = true;
    boolean valorFalso= false;
    }
}
