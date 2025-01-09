package java_bootcamp.part_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class J02_Map {
    public static void main(String[] args) {

        Map<String,Double> priceList=new HashMap<>();

        priceList.put("Kiraz",13.5);
        priceList.put("Elma",14.5);
        priceList.put("Armut",15.5);
        priceList.put("Vişne",16.5);

        System.out.println(priceList);

        System.out.println(priceList.values());

        Set<String> set = priceList.keySet();

        System.out.println(set);


    }
}
