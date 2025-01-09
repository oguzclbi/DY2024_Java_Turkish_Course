package day57_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class J00_StreamCreation {
    public static void main(String[] args) {


        //arrayden stream oluşturma
        String[] array={"A","B","C"};
        Stream<String> arrayStream = Arrays.stream(array);

        //create stream from collection
        List<String> list = Arrays.asList("A", "B", "C");
        Stream<String> listStream = list.stream();

        Stream<String> stream = Stream.of("A", "B", "C");


    }
}
