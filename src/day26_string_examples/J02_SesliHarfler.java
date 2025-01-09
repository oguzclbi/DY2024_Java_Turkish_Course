package day26_string_examples;

public class J02_SesliHarfler {
    public static void main(String[] args) {

        String word = "Mustafa";

        int count = countVowels(word);

        System.out.println("count = " + count);

    }

    public static int countVowels(String word) {

        int counter = 0;
        for (int i = 0; i <= word.length() - 1; i++) {
            char each = word.charAt(i);
            if (isVowel(each)) {
                counter++;
            }
        }
        return counter;

    }

    public static boolean isVowel(char each) {

        return each == 'a' ||
                each == 'e' ||
                each == 'i' ||
                each == 'o' ||
                each == 'u' ||
                each == 'A' ||
                each == 'E' ||
                each == 'I' ||
                each == 'O' ||
                each == 'U';

    }
}
