package day24_string_part_3;

public class J04_LastWord {
    public static void main(String[] args) {

        String sentence="Ali ata bak";
        System.out.println("sentence = " + sentence);

        String lastWord=getLastWord(sentence);
        System.out.println("lastWord = " + lastWord);


    }

    public static String getLastWord(String sentence) {

        int lastSpace = sentence.lastIndexOf(" ");
        String lastWord = sentence.substring(lastSpace + 1);
        return lastWord;


    }
}
