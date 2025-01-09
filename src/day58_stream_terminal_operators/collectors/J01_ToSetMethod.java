package day58_stream_terminal_operators.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class J01_ToSetMethod {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 2, 8, 4, 6);

        //listede bulunan çift sayıları tekrarsız şekilde döndürür(Unique olarak)
        //Ayrıntılı bilgi olarak day50_collections_part_2.J03_Set classına bak

        Set<Integer> collect = numbers.stream()
                .filter(k -> k % 2 == 0) //2,4,6,2,8,4,6
                .collect(Collectors.toSet());

        System.out.println(collect);


    }
}
