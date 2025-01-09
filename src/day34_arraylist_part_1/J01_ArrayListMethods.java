package day34_arraylist_part_1;

import java.util.ArrayList;

public class J01_ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        //***print list***
        System.out.println(list);

        //***listeye birşeyler ekle***
        list.add("Yumurta"); //ilk sıraya
        list.add("Kaşar"); //ikinci sıraya

        System.out.println(list);

        list.add("Sucuk");
        list.add("Zeytin");

        System.out.println("Sucuk ve Zeytin eklendikten sonra");
        System.out.println(list);

        //   0        1      2      3
        //[Yumurta, Kaşar, Sucuk, Zeytin]

        //***Araya Ekleme***

        list.add(2,"Bal");
        System.out.println("3. sıraya Bal eklendikten sonra");
        System.out.println(list);

        //***eğer listin içindeki eleman sayısı lazımsa***
        System.out.println("list.size() = " + list.size());

        //***istenilen index deki elemanı alma***
        System.out.println("list.get(1) = " + list.get(1));

        //***en sondaki elemanı almak için***
        System.out.println("list.get(list.size()-1) = " + list.get(list.size() - 1)); //yada
        System.out.println("list.getLast() = " + list.getLast());

        //***ilk elemanı alma***
        System.out.println("list.get(0) = " + list.get(0)); //yada
        System.out.println("list.getFirst() = " + list.getFirst());

        //   0        1     2     3      4
        //[Yumurta, Kaşar, Bal, Sucuk, Zeytin]

        //***istenilen elementi güncelleme***
        list.set(3,"Afyon Sucuk");
        System.out.println(list);

        //***Listeden element silme***
        //list.removeAll(); list.removeFirst(); list.removeLast(); gibi metodlarda mevcut
        //System.out.println("list.remove(\"Kaşar\") = " + list.remove("Kaşar")); //objeye göre sildi
        //System.out.println("list.remove(3) = " + list.remove(3)); //indexe göre sildi
        list.add("Yumurta");
        System.out.println(list);

        //***istenilen elementin kaçıncı sırada olduğunu belirtir hangi indexte olduğunu***

        //!!!indexOf metodu ilk bulduğu değerin indexini döner
        System.out.println("list.indexOf(\"Yumurta\") = " + list.indexOf("Yumurta"));
        System.out.println("list.lastIndexOf(\"Yumurta\") = " + list.lastIndexOf("Yumurta"));

        //????bir eleman başatan ve sondan tarandığında indexleri eşitse bu eleman uniqe bir elemandır
        System.out.println("list.indexOf(\"Bal\") = " + list.indexOf("Bal"));
        System.out.println("list.lastIndexOf(\"Bal\") = " + list.lastIndexOf("Bal"));
        //  if (list.indexOf("Kaşar")== list.lastIndexOf("Kaşar"))//eşsiz

        //!!!(-1) değeri dönerse aranan değer listede yoktur.

        //***Element mevcut mu değil mi kontrol etmek için***
        System.out.println("list.contains(\"Zeytin\") = " + list.contains("Zeytin"));


        System.out.println(list);

        //***listeyi temizlemek için (Bütün elemanları sil)***

        /*
        list.remove(0);
        System.out.println("list = " + list);
        list.remove(0);
        System.out.println("list = " + list);
        list.remove(0);
        System.out.println("list = " + list);
        list.remove(0);
        System.out.println("list = " + list);
        list.remove(0);
        System.out.println("list = " + list);
        list.remove(0);
        System.out.println("list = " + list);
        */

        list.clear();



        //***listenin içi boş mu değil mi kontrol etmek için***
        System.out.println("list.isEmpty() = " + list.isEmpty());


    }

}
