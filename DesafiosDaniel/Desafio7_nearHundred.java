package DesafiosDaniel;

public class Desafio7_nearHundred {
//Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
//
//
//nearHundred(93) → true
//nearHundred(90) → true
//nearHundred(89) → false

    public boolean posNeg(int a, int b, boolean negative) {

        if ((a <= 0 || b <= 0) && (negative == false)){
            return true;

        } else if ((negative == true) && (a  <= 0 && b  <= 0)){
            return true;


        }else {
            return false;

        }
    }

}
