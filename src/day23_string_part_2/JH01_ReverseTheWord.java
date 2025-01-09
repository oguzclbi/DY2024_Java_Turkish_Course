package day23_string_part_2;

import java.util.Scanner;

public class JH01_ReverseTheWord {
    public static void main(String[] args) {

        System.out.print("Bir kelime giriniz: ");
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();
        String reverseResult= reverseTheWord(word);

        System.out.println("reverseResult = " + reverseResult);


    }

    public static String reverseTheWord(String original) {

        String result = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            char each = original.charAt(i);
            result += each;

        }
        return result;


    }
}
