package day51_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class J01_IterateMaps {
    public static void main(String[] args) {

        Map<String, Double> products=new TreeMap<>(String.CASE_INSENSITIVE_ORDER);


        products.put("Elma",10.0);
        products.put("Kiraz",30.0);
        products.put("Muz",40.0);
        products.put("Erik",50.0);
        products.put("Karpuz",70.0);

        System.out.println("products = " + products);
        System.out.println("=========================");


        System.out.println("ElmaGüncellendi");
        products.put("Elma",20.0);
        System.out.println("products = " + products);
        System.out.println("=========================");

        for (String key : products.keySet()) {
            System.out.println(key.toUpperCase());
        }

        System.out.println("products = " + products);
        System.out.println("=========================");

        for (Double value : products.values()) {
            value+=value/10;
            System.out.println(value);
        }

        System.out.println("products = " + products);
        System.out.println("==========================");

        for (Map.Entry<String, Double> eachEntry : products.entrySet()) {

            System.out.println(eachEntry.getKey()+" : "+(eachEntry.getValue() + eachEntry.getValue()/10));
            products.put(eachEntry.getKey(),(eachEntry.getValue() + eachEntry.getValue()/10));
        }

        System.out.println("products = " + products);


    }
}
