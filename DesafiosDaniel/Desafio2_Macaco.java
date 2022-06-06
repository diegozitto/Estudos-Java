package DesafiosDaniel;

public class Desafio2_Macaco {

//    We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
//    We are in trouble if they are both smiling or if neither of them is smiling.
//        Return true if we are in trouble.
//
//    monkeyTrouble(true, true) → true
//    monkeyTrouble(false, false) → true
//    monkeyTrouble(true, false) → false


    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {


        if(!aSmile && !bSmile){
            return true;
        } else if (aSmile && bSmile) {
            return true;
        } else {
            return false;
        }
    }

    // resposta está certa mas é possível colocar mais de uma dupla de condição junta
    // nesse caso poderia fazer:

    //  if((!aSmile && !bSmile) || (aSmile && bSmile)) {
    //        return true;
    //    } else {
    //        return false;
    //    }

    //                OU

    //  if(aSmile == bSmile) {
    //        return true;
    //    } else {
    //        return false;
    //    }

}
