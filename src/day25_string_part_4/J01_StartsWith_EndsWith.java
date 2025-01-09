package day25_string_part_4;

public class J01_StartsWith_EndsWith {
    public static void main(String[] args) {

        //startsWith()
        String word = "Ahmet";
        boolean result = word.startsWith("A");
        System.out.println("result = " + result);

        //Boşluk kaldırarak da arama yapılabilir.
        String word1 = "Ah met";
        word1 = word.replace(" ", "");
        boolean result1 = word1.startsWith("Ahm");
        System.out.println("result1 = " + result1);

        //endsWith()
        String sentence="Hello world?";
        boolean isQuestion=sentence.endsWith("?");
        System.out.println("isQuestion = " + isQuestion);


        String email="xxx@hotmail.com";
        boolean isValidEmail = email.endsWith("gmail.com");
        System.out.println("isValidEmail = " + isValidEmail);


    }
}
