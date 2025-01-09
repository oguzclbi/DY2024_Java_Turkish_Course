package day58_stream_terminal_operators;

import java.util.Arrays;
import java.util.List;

public class J02_AllMatchMethod {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(-2,4,6);

        boolean result = list.stream()
                //listedeki bütün elemanlar şarta uyuyor ise true değilse false döner
                .allMatch(k -> k % 2 == 0);//2,4,6

        System.out.println(result);


        List<String> names = Arrays.asList("Mustafa", "Mehmet", "Murat");

        boolean result1 = names.stream()
                .allMatch(k -> k.startsWith("M"));

        System.out.println(result1);


    }







}
