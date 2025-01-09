package day24_string_part_3;

public class J03_FirstWord {
    public static void main(String[] args) {

        String sentence = "İpek ata bak";
        System.out.println("sentence = " + sentence);

        String firstWord = getFirstWord(sentence);
        System.out.println("firstWord = " + firstWord);


    }

    public static String getFirstWord(String sentence) {

        String result = sentence.substring(0, sentence.indexOf(" "));

        return result;


    }


}
