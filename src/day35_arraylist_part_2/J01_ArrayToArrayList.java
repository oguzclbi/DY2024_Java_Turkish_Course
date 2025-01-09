package day35_arraylist_part_2;

import java.util.ArrayList;
import java.util.Arrays;

public class J01_ArrayToArrayList {
    public static void main(String[] args) {


        String[] food = {"Peynir", "Kiraz", "Elma", "Ekmek"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(food));//arrayi ArrayList içerisine ekledik


        //Aşşağıdaki şekilde Arrayi ArrayListe akatarabiliriz. Ama daha
        // basit bir şekilde yukarıdaki gibi yapabiliriz.
        /*
        for (String each : food) {
            list.add(each);

        }
        */

        list.add("Brokoli");
        System.out.println("list = " + list);

        //ArrayListi Arraye döndürme

        String[] array2=new String[list.size()];
        for (int i = 0; i < array2.length; i++) {
            array2[i]=list.get(i);

        }
        System.out.println("Array2= "+Arrays.toString(array2));


    }
}
