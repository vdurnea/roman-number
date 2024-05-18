////////////////////////////////////////////////////////////////////
// [CATERINA] [VALLOTTO] [2076434]
// [VICTORIA] [DURNEA] [2076324]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number < 1 || number > 100) {
            return "Numero non valido";
        }
        String roman = "";
        while (number == 100) {
            roman += "C";
            number -= 100;
        }
        while (number >= 90) {
            roman += "XC";
            number -= 90;
        }
        while (number >= 50) {
            roman += "L";
            number -= 50;
        }
        while (number >= 40) {
            roman += "XL";
            number -= 40;
        }
        while (number >= 10) {
            roman += "X";
            number -= 10;
        }
        while (number >= 9) {
            roman += "IX";
            number -= 9;
        }
        while (number >= 5) {
            roman += "V";
            number -= 5;
        }
        while (number >= 4) {
            roman += "IV";
            number -= 4;
        }
        while(number > 0){
            roman += "I";
            number -= 1;
        }
        return roman;
    }
}
