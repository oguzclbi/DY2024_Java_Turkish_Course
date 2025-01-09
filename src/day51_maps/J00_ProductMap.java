package day51_maps;

import java.util.*;

public class J00_ProductMap {
    public static void main(String[] args) {


        Map<String, Double> products=new HashMap<>();
        //Map<String, Double> products=new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        //küçük harflerle de arayarak bulmak için yukarıdaki kullanım şekli olabilir.


        products.put("Elma",4.56); //"Elma",4.56 bu ikiliye Entry denir
        products.put("Kiraz",3.0);
        products.put("Muz",4.0);
        products.put("Erik",5.0);
        products.put("Karpuz",7.0);

        System.out.println("products = " + products);

        System.out.println("Kaç tane ikili eleman var: " + products.size());

        System.out.println("Elma var mı: " + products.containsKey("Elma"));

        System.out.println("5 liralık ürün var mı: " + products.containsValue(5.0));

        System.out.println("Elmanın fiyatı ne kadar: " + products.get("Elma"));


        //System.out.println("Elmanın fiyatı ne kadar: " + products.get("elma"));
        //küçük harflerle de arayarak bulmak için yukarıdaki kullanım şekli olabilir.(En yukarı)

        Set<String> productNames = products.keySet();
        System.out.println("Ürünlerin ismini listele " + productNames);

        System.out.println("Ürünlerin fiyatlarını listele " + products.values());


    }
}
