package day58_stream_terminal_operators.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class J05_PartitioningByMethod {
    public static void main(String[] args) {

        /*player diye bir class oluştur.
        adı soyadı yaşı ve takımı olsun
        22 tane futbolcu oluştur.

        liste şeklinde bize verilse
        gruopingby ile
        galatasaraylılar bir listeye fenerbahçeliler
        bir listeye ayrılsın işte bunun için bu metodu kullanırız.*/


        /*

         */


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        Map<Boolean, List<Integer>> map = numbers.stream()
                .collect(Collectors.partitioningBy(k -> k % 2 == 0));

        System.out.println(map);

        System.out.println("map.get(true) = " + map.get(true));
        System.out.println("map.get(false) = " + map.get(false));


    }
}
