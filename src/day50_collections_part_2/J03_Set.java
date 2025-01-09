package day50_collections_part_2;

import java.util.*;

public class J03_Set {
    public static void main(String[] args) {
        Set<Integer> hashSet=new HashSet<>();

        hashSet.add(1);
        hashSet.addAll(Arrays.asList(5,2,10,3,4,5,6,2,2,2,2,-1,-2,-5,null));

        //tekrar eden elementlerden sadece bir tanesini collections a ekler
        //büyükten küçüğe doğru sıralama eğilimi vardır fakat sıralama özel bir sıralamadır.(mutlak değer gibi)
        //Yani Random order eğilimi daha ağır basmaktadır.
        //null değeri alabilir
        System.out.println("hashSet = " + hashSet);


        //LinkedHashSet

        //tekrar eden elementlerden sadece bir tanesini collections a ekler
        //insertion order a göre verileri tutar.
        //null değeri alabilir
        Set<String> linkedHashSet=new LinkedHashSet<>();

        linkedHashSet.add("A");
        linkedHashSet.add("L");
        linkedHashSet.add("K");
        linkedHashSet.add("C");
        linkedHashSet.add("B");
        linkedHashSet.add("K");
        linkedHashSet.add(null);

        System.out.println("linkedHashSet = " + linkedHashSet);

        //TreeSet

        //Natural Order a göre verileri saklar (ASCII kodlarına göre sıralar)
        //null değer kabul etmez

        Set<String> letters=new TreeSet<>();
        //Set<String> letters=new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        //comparator olarak parantez içine String.CASE_INSENSITIVE_ORDER yazar isek
        // sıralamayı büyük küçük harf duyarlılığına takılmadan yapar fakat dezavantaj
        // olarak tekrar eden değerleri bir kez yazar ve veri kaybına sebebiyet verebilir.

        //letters.add(null); //NullPointerException (RuntimeException) null değer alamaz

        letters.add("a");
        letters.add("B");
        letters.add("C");
        letters.add("c");
        letters.add("X");

        System.out.println("letters = " + letters);

    }
}
