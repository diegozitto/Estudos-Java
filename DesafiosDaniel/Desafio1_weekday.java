package DesafiosDaniel;

public class Desafio1_weekday {

    public static void main(String[] args) {

        //Segundo desafio2- sleepIn
        //O parâmetro weekday é verdadeiro se for um dia da semana e o parâmetro vacation é verdadeiro se estivermos de
        // vacation. Nós dormimos até tarde se não for um dia de semana ou estamos de vacation. Retorne true se
        // dormirmos até tarde.
        // exemplos:
        //sleepIn(false, false) → true
        //sleepIn(true, false) → false
        //sleepIn(false, true) → true
        // metodo padrão
        //public boolean sleepIn(boolean weekday, boolean vacation) {}

       boolean weekday = true;
       boolean vacation = false;



       if(sleepIn(weekday, vacation)){
           System.out.println("Posso dormir até tarde pois " + "dia de semana: " + weekday + " e férias: " + vacation);
       } else {
           System.out.println("Não posso dormir até tarde pois " + "dia de semana: " + weekday + " e férias: " + vacation);
       }
    }

    public static boolean sleepIn (boolean weekday, boolean vacation) {


        if ((weekday) && (vacation)) {
            return true;

        } else if ((weekday) && (!vacation)) {
            return false;

        } else {
            return true;

        }

    }

    // RESPOSTA:

//    if(!weekday || vacation) {
//        return true;
//    } else {
//
//        return false;
// }

}
