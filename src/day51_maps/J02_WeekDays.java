package day51_maps;

import java.util.Map;
import java.util.TreeMap;

public class J02_WeekDays {
    public static void main(String[] args) {

        Map<Integer,String> daysTurkey=new TreeMap<>();

        daysTurkey.put(1,"Pazartesi");
        daysTurkey.put(2,"Salı");
        daysTurkey.put(3,"Çarşamba");
        daysTurkey.put(4,"Perşembe");
        daysTurkey.put(5,"Cuma");
        daysTurkey.put(6,"Cumartesi");
        daysTurkey.put(7,"Pazar");

        System.out.println("daysTurkey = " + daysTurkey);
        System.out.println("===========================================");

        System.out.println("daysTurkey.get(1) = " + daysTurkey.get(1));

        System.out.println("daysABD.get(1) = " + daysTurkey.get((1 + 6) % 8));

        Map<Integer,String> daysABD=new TreeMap<>();

        daysABD.put(2,"Pazartesi");
        daysABD.put(3,"Salı");
        daysABD.put(4,"Çarşamba");
        daysABD.put(5,"Perşembe");
        daysABD.put(6,"Cuma");
        daysABD.put(7,"Cumartesi");
        daysABD.put(1,"Pazar");

        System.out.println("daysABD = " + daysABD);
        System.out.println("===========================================");

        System.out.println("daysABD.get(1) = " + daysABD.get(1));

        daysTurkey.clear();

        System.out.println("daysTurkey = " + daysTurkey);


    }
}
