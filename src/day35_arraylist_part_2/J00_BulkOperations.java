package day35_arraylist_part_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class J00_BulkOperations {

    public static void main(String[] args) {

        //        Zorunlu                     //isteğe bağlı
        ArrayList<String> languages=new ArrayList<String >();


        languages.add("Java");
        System.out.println(languages);
        languages.add("C#");
        System.out.println(languages);

        /* Sadece bişey denedim
        Arrayi ArrayList içerisine atabilir miyim diye bi baktım

        String [] hello=new String[5];
        hello[0]="H";
        hello[1]="E";
        hello[2]="L";
        hello[3]="L";
        hello[4]="O";

        languages.addAll(List.of(hello));

         */



        //tek seferde birden fazla element ekleme
        languages.addAll(Arrays.asList("Python","Ruby","Groovy","Kotlin","C++","C#","Ruby"));

        //!!!NOT!!!
        /*ArrayList.asList()---> metodu bir liste oluşturmak için kullanılır.
        Bulk operations larda genellikle toplu veriler üzerinde işlem yapıldığı için
        ArrayListlere listeler halinde veri ekleme(addAll) liste halinde veri arama(containsAll)
        veya liste halide veri silme(removeAll) gibi işlemleri yaparken nu metodlara verileri
        liste halinde girmemiz gerekir. Dolayısıyla ArrayList.asList() metodu bu ihtiyacımızı
        burada karşılamış olur.

        */

        System.out.println("languages = " + languages);

        //ArrayList içerisinde istenilen element var mı yokmu onu kontrol etme
        System.out.println("languages.contains(\"Ruby\") = " + languages.contains("Ruby"));


        //ArrayList içerisinde istenilen bir grup element var mı yokmu onu kontrol etme

        //---Yöntem1---
        System.out.println(languages.contains("Ruby") &&
                           languages.contains("C#") &&
                           languages.contains("Kotlin"));


        //---Yöntem2---
        boolean result=languages.containsAll(Arrays.asList("Script","C#","Kotlin"));
        System.out.println("result = " + result);


        //Silme

        //languages.remove("Ruby"); //ilk bulduğu "Ruby" leri siler

        //languages.removeAll(Arrays.asList("Ruby")); //bulduğu bütün "Ruby" leri siler

        languages.removeAll(Arrays.asList("Ruby","Java","Groovy")); //bulduğu bütün "Ruby","Java","Groovy" leri siler

        System.out.println("languages = " + languages);



        //[C#, Python, Kotlin, C++, C#]
        //bu hariç yada bunlar hariç hepsini sil

        languages.retainAll(Arrays.asList("C#","Kotlin"));
        System.out.println("languages = " + languages);

        //listeyi tamamen temizleme

        languages.clear();
        System.out.println("languages = " + languages);


    }



}
