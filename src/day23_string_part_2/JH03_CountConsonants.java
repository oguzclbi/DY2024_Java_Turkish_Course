package day23_string_part_2;

import java.util.Scanner;

public class JH03_CountConsonants {
    public static void main(String[] args) {

        System.out.print("Bir kelime giriniz: ");
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();

        int i = countConsonants(word);
        System.out.println("Kelimede bulunan sessiz harf sayısı = " + i);


    }

    private static int countConsonants(String word) {

        int count = 0;
        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {

            char each = word.charAt(i);

            if (each == 'a' || each == 'e' || each == 'ı' || each == 'i' ||
                    each == 'o' || each == 'ö' || each == 'u' || each == 'ü') {
                count++;
            }


        }
        count = word.length() - count;
        return count;


    }


}
