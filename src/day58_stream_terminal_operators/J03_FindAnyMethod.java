package day58_stream_terminal_operators;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class J03_FindAnyMethod {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

        Optional<Integer> any = list.stream()
                .findAny();

        any.ifPresent(k-> System.out.println(k));


    }
}
