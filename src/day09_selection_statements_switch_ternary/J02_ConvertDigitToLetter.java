package day09_selection_statements_switch_ternary;

public class J02_ConvertDigitToLetter {
    public static void main(String[] args) {


        byte num = 9;
        String result = "";
        switch (num) {
            case 1 -> {
                result = "Bir";
            }
            case 2 -> {
                result = "İki";
            }
            case 3 -> {
                result = "Üç";
            }
            case 4 -> {
                result = "Dört";
            }
            case 5 -> {
                result = "Beş";
            }
            case 6 -> {
                result = "Altı";
            }
            case 7 -> {
                result = "Yedi";
            }
            case 8 -> {
                result = "Sekiz";
            }
            case 9 -> {
                result = "Dokuz";
            }
            default -> result = "error";

        }
        System.out.println(result);


    }
}
