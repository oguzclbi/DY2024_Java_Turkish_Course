package day57_stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class J04_ReduceMethod {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3);
        Integer sum = list.stream()
                //.reduce(2, (a, b) -> a + b);
                .reduce(Integer::sum).get();

        System.out.println(sum/list.size());


    }
}
