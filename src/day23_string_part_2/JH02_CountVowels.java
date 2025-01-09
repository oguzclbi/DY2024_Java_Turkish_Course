package day23_string_part_2;

import java.util.Scanner;

public class JH02_CountVowels {
    public static void main(String[] args) {

        System.out.print("Bir kelime giriniz: ");
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();

        //int i = countVowels(word);
        //System.out.println("Kelimede bulunan sesli harf sayısı = " + i);

        int j = countVowelsIf(word);
        System.out.println("Kelimede bulunan sesli harf sayısı = " + j);


    }



    public static int countVowels(String word) {

        int count = 0;
        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            char each = word.charAt(i);

            switch (each) {
                case 'a':
                    count++;
                    break;
                case 'e':
                    count++;
                    break;
                case 'ı':
                    count++;
                    break;
                case 'i':
                    count++;
                    break;
                case 'o':
                    count++;
                    break;
                case 'ö':
                    count++;
                    break;
                case 'u':
                    count++;
                    break;
                case 'ü':
                    count++;
                    break;


            }

        }
        return count;


    }

    private static int countVowelsIf(String word) {

        int count = 0;
        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {

            char each = word.charAt(i);

            if (each == 'a' || each == 'e' || each == 'ı' || each == 'i' || each == 'o' || each == 'ö' || each == 'u' || each == 'ü') {
                count++;
            }


        }
        return count;


    }

}
