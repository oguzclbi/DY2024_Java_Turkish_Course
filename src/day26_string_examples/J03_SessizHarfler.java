package day26_string_examples;

public class J03_SessizHarfler {
    public static void main(String[] args) {

        String word = "Bilginomist";

        int numberOfConsonantLetters = countConsonantLetters(word);
        System.out.println("numberOfConsonantLetters = " + numberOfConsonantLetters);


    }

    public static int countConsonantLetters(String word) {
        return word.length() - J02_SesliHarfler.countVowels(word);


    }
}
