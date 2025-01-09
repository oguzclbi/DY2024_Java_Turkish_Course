package day58_stream_terminal_operators.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class J03_SummingIntMethod {
    public static void main(String[] args) {


        //Liste içindeki elemanların toplamını bulma

        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 2, 8, 4, 6);

        Integer sum = numbers.stream()
                .collect(Collectors.summingInt(Integer::intValue));


        System.out.println(sum);


    }
}
