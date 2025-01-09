package day16_methods_part_2;

public class J02_ReturnNumbersAsWord {
    public static void main(String[] args) {

        String result = convertNumberToWord(5);
        System.out.println(result);

        String result2 = convertNumberToWord2(4);
        System.out.println(result2);
    }



    public static String convertNumberToWord(int num) {

        switch (num) {
            case 1 -> {
                return "Bir";
            }
            case 2 -> {
                return "İki";
            }
            case 3 -> {
                return "Üç";
            }
            case 4 -> {
                return "Dört";
            }
            case 5 -> {
                return "Beş";
            }
            default -> {
                return "error";
            }
        }

    }

    public static String convertNumberToWord2(int number) {

        if (number == 1) {
            return "One";
        } else if (number == 2) {
            return "Two";
        } else if (number == 3) {
            return "Three";
        } else if (number == 4) {
            return "Four";
        } else if (number == 5) {
            return "Five";
        } else {
            return "Error";
        }

    }




}


