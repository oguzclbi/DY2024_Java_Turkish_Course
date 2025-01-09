package day57_stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class J01_FilterMethod {
    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Stream<Integer> integerStream = list.stream();


        Predicate<Integer> filterEven=k->k%2==0;
        //Yukardaki tanımlamayı yaptıktan sonra filter metodu içerisine filterEven referansını yazabilirdik.
        List<Integer> evenNumbers= integerStream
                //list.stream()
                .filter(filterEven)
                //.filter(k->k%2==0)
                //.collect(Collectors.toList());
                .toList();

        System.out.println(evenNumbers);


    }




}
