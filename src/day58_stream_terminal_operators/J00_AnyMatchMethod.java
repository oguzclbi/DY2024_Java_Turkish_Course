package day58_stream_terminal_operators;

import java.util.Arrays;
import java.util.List;

public class J00_AnyMatchMethod {
    public static void main(String[] args) {

        //liste içerisinde şarta uyan herhangi bir eşleşme var ise true döndür

        List<Integer> list= Arrays.asList(1,3,4,5);
        boolean result = list.stream()
                .anyMatch(k -> k % 2 == 0);

        System.out.println(result);

    }
}
