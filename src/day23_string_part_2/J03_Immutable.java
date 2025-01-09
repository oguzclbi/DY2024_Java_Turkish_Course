package day23_string_part_2;

import java.util.Locale;

public class J03_Immutable {
    public static void main(String[] args) {

        String word = "Sultan";

        System.out.println("word = " + word.toLowerCase()); //sultan
        System.out.println("word = " + word.toUpperCase()); //SULTAN

        /*
        word=word.toLowerCase();
        word=word.toUpperCase();

        yapana kadar word referansının gösterdiği obje değimez
        yani referansın gösterdiği obje Heap bölgesinde orjinal haliyle kalır.
        Değişmesini istiyorsak açıklama satırında verildiği gibi assign yapmamız gerek.

        */

        System.out.println("word = " + word); //Sultan

        word=word.toUpperCase(); //SULTAN (Sultan go to garbage Collector)
        System.out.println("word = " + word); //SULTAN


    }
}
