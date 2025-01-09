package day58_stream_terminal_operators.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class J04_AveragingIntMethod {
    public static void main(String[] args) {

        //Liste içindeki elemanların ortalamasını bulma

        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 2, 8, 4, 6);

        Double average = numbers.stream()
                .collect(Collectors.averagingInt(Integer::intValue));


        System.out.println(average);




    }
}
