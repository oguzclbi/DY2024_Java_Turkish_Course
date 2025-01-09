package day34_arraylist_part_1;

import java.util.ArrayList;

public class J02_ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);


        System.out.println("numbers = " + numbers);

        /*
        for (int i = 0; i < numbers.size(); i++) {

            numbers.remove(i);

        }

        System.out.println("numbers = " + numbers);
        */

        //remove metodu for ile kullanmak mantıklı değil hatalı sonuç üretme riski büyük
        //çünkü hem döngü değişkeni değişiyor hem de numbers.size her turda güncelleniyor


        //***bir duruma göre silme işlemi***
        numbers.removeIf(e->e<30);
        System.out.println("numbers = " + numbers);

        ArrayList<String> isimler=new ArrayList<>();

        isimler.add("Hamit");
        isimler.add("Mustafa");
        isimler.add("Emir");
        isimler.add("Salih");
        isimler.add("Mehmet");
        isimler.add("   ");
        isimler.add("Oğuz");
        isimler.add("Hacer");
        isimler.add("Uraz");
        System.out.println("isimler = " + isimler);

                                 //sonuc boolean
        isimler.removeIf(e->e.startsWith("M")); //'M' ile başlayanları sil
        System.out.println("isimler = " + isimler);
        isimler.removeIf(e->e.isBlank()); //Boşluk olanı sil
        System.out.println("isimler = " + isimler);
        isimler.removeIf(e->e.contains("i")); //İçerisinde 'i' geçenleri sil
        System.out.println("isimler = " + isimler);
        isimler.removeIf(e->e.endsWith("z")); //'z' ile bitenleri sil

        System.out.println("isimler = " + isimler);



        ArrayList<Integer> nums=new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        System.out.println("nums = " + nums);
        //nums.remove(3); //4

                       //Obje olan 3 ü yok et
        nums.remove(Integer.valueOf(3)); //valueOf metodu Obje(Integer) döner
                       //int olan 3 ü yok et
        //nums.remove(Integer.parseInt("3")); //parseInt metodu int(primitive) döner

        System.out.println("nums = " + nums);


    }
}
