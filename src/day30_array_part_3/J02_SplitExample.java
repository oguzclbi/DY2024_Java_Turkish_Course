package day30_array_part_3;

public class J02_SplitExample {
    public static void main(String[] args) {

        String word = "adam"; //AdAm şeklinde yazmak istiyorum.

        char[] letters = word.toCharArray(); //a,d,a,m
        //char veri tipinde toLowerCase-toUpperCase gibi bir metod yok o yüzden

        String[] letters1 = word.split("");

        String result = "";

        for (int i = 0; i < letters1.length; i++) {
            if (i % 2 == 0) {
                //String
                result += letters1[i].toUpperCase();
            } else {
                result += letters1[i].toLowerCase();
            }
        }
        System.out.println("result = " + result);


    }
}
