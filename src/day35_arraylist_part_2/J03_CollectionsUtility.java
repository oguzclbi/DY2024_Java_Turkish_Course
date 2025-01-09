package day35_arraylist_part_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class J03_CollectionsUtility {
    public static void main(String[] args) {


        ArrayList<Integer> numbers =
                new ArrayList<>(Arrays.asList(5, 2, 6, 8, 1, 8, 10, 8, 8, 8, 8));

        ArrayList<String> letters = new ArrayList<>(Arrays.asList("A", "B", "D", "C"));

        System.out.println("numbers = " + numbers);
        System.out.println("letters = " + letters);

        //ben bu listeyi sort edebilir miyim

        Collections.sort(numbers);
        Collections.sort(letters);

        System.out.println("numbers after sort = " + numbers);
        System.out.println("letters after sort = " + letters);

        //ilk bulduğu elemanın indexini döndürür
        int index = Collections.binarySearch(numbers, 8); // bu metodu kullanmak için listenin sıralı olması gerekiyor


        System.out.println("index = " + index);


        //max ve min değerleri bulma

        int max = Collections.max(numbers);
        System.out.println("max = " + max);
        int min = Collections.min(numbers);
        System.out.println("min = " + min);

        //listeyi default değerle doldurma

        //Collections.fill(numbers,1000);
        System.out.println(numbers);

        //liste içerisindeki elemanların sıklığını bulmak için(liste içinde kaç tane var)

        System.out.println("Collections.frequency(numbers,8) = " + Collections.frequency(numbers, 8));

        System.out.println("=========================================");


        //içinde kaç tane a var
        String name="adam";
        String[] strSplit= name.split("");
        ArrayList<String > str=new ArrayList<>(Arrays.asList(strSplit));
        System.out.println("str = " + str);
        System.out.println(Collections.frequency(str,"a")+" tane var");


    }
}
