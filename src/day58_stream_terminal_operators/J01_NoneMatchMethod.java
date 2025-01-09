package day58_stream_terminal_operators;

import java.util.Arrays;
import java.util.List;

public class J01_NoneMatchMethod {
    public static void main(String[] args) {


        List<Integer> list= Arrays.asList(2,4,6);
        boolean result = list.stream()

                //hiç tek eleman yok ise true dön yoksa false
                //hepsi çift ise true else false
                .noneMatch(k->k%2!=0);

        System.out.println(result);

    }
}
