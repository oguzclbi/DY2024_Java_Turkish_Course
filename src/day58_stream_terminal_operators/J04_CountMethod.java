package day58_stream_terminal_operators;

import java.util.Arrays;
import java.util.List;

public class J04_CountMethod {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Salih",
                "Arif",
                "Samet",
                "Betül",
                "Sami",
                "Merve",
                "Ali");


        //Baş harfi S olanlar çıksın


        //Son harfi i olanlar çıksın


        long result = names.stream()
                .filter(k -> !k.startsWith("S"))
                .filter(k -> !k.endsWith("i"))
                .count();

        System.out.println(result);


    }
}
