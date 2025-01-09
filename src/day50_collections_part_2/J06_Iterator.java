package day50_collections_part_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class J06_Iterator {

    public static void main(String[] args) {

        //Verilen listede 20 den küçük olanları silme


        List<Integer> numbers=new ArrayList<>(
                Arrays.asList(1,3,23,23,2,32,23,34,5,67,4,9,0,45)
        );

        //***YÖNTEM 1***

        //Hatalı çalışır fori ile remove kullanmak sağlıklı sonuçlar üretmeyebilir.
        /*
        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i)<20){
                numbers.remove(i);
            }

        }
        */

        //***YÖNTEM 2***

        //numbers.removeIf(k->k<20); //Çalışır


        //***YÖNTEM 3***

        Iterator<Integer> it= numbers.iterator();

        while (it.hasNext()){ //hasNext metodu sırada eleman var mı diye bakar
            if (it.next()<20){//next metodu sıradaki elemana bakmak için kullanılır
                it.remove();

            }
        }

        System.out.println("numbers = " + numbers);


    }



}
