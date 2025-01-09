package day57_stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class J06_SortMethod {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 5, 4, 2, 6, 3);

        //Küçükten büyüğe sıralama
        List<Integer> sortedList = list.stream().sorted().toList();
        System.out.println(sortedList);

        //Büyükten küçüğe doğru sıralar
        List<Integer> reverseSortedList = list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(reverseSortedList);

    }
}
