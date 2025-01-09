package day30_array_part_3;

import java.util.Arrays;

public class J01_CountWordsInSentence {
    public static void main(String[] args) {

        String sentence="Ali ata bak";
        System.out.println(sentence.split(" ").length+" kelime var");
        System.out.println(sentence.toCharArray().length+ " karakter var");


        String name="Arif";

        char chA='A';
        String strA="A";

        char[] charArray=name.toCharArray();
        String[] strArray=name.split("");

        System.out.println("Arrays.toString(charArray) = " + Arrays.toString(charArray));
        System.out.println("Arrays.toString(strArray) = " + Arrays.toString(strArray));


    }
}
