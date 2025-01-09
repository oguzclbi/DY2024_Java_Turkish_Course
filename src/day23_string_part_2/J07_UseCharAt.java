package day23_string_part_2;

import java.util.Scanner;

public class J07_UseCharAt {
    public static void main(String[] args) {

        System.out.println("Bir kelime giriniz:");
        //Kelime dışarıdan alınacak
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        //Karakterler tek tek alınacak

        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i) + " ");

        }


        //arasına boşluk koy


    }
}
