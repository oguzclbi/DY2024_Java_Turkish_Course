package day49_collections_part_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class J00_ListArrayList {
    public static void main(String[] args) {

        //burda polymorphism yaptık
        //Solda baba sağda çocuk
        List<String> list=new ArrayList<>();

        list.add("Adam");
        list.addAll(Arrays.asList("A","B"));

        System.out.println("list = " + list);

        System.out.println("list.get(0) = " + list.get(0));

        list.add("Adam");
        list.add(null);
        System.out.println("list = " + list);

        //Arrays.asList
        //Günlerde kullanılılabilir.
        List<String> list1 = Arrays.asList("A", "B", "C");
        //Arrays.asList metodu ile new keywordu kullanmadan liste oluşturabiliriz.
        //Fakat listeyi bir kere oluşturabiliriz ama ekleme çıkarma yapamayız.

        System.out.println("list1 = " + list1);

        //we con not modify list after creating
        //list1.add("D"); //RuntimeException atar.

        System.out.println("list1 = " + list1);


        //null değer koyamayız
        List<String> strings = List.of("A", "B", "C"); //içerisine null değer koyamazsın

        System.out.println("strings = " + strings);

        //we con not modify list after creating
        //strings.add("D"); //RuntimeException atar.

        System.out.println("strings = " + strings);


    }
}
