package day00_homeworks.hw14_day51;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMF {
    public static void main(String[] args) {
        Map<String, String> employeeMap = new HashMap<>();

        {
            employeeMap.put("Ddene", "F");

            employeeMap.put("Winfred", "M");

            employeeMap.put("Jereme", "M");

            employeeMap.put("Glad", "F");

            employeeMap.put("Desirae", "F");

            employeeMap.put("Kakalina", "F");

            employeeMap.put("Bertrando", "M");

            employeeMap.put("Ajay", "F");

            employeeMap.put("Brigitte", "F");

            employeeMap.put("Derk", "M");

            employeeMap.put("Orlando", "M");

            employeeMap.put("Selle", "F");

            employeeMap.put("Marika", "F");
        }

        //Kadın ve Erkek sayısı

        {

            int femaleCounter = 0;
            for (String value : employeeMap.values()) {

                if (value.equalsIgnoreCase("F")) {
                    femaleCounter++;
                }

            }

            System.out.println("Kadın Sayısı: " + femaleCounter);
            System.out.println("Erkek Sayısı: " + (employeeMap.size() - femaleCounter));

        }

        System.out.println("====================");

        //Kadın Çalışanların İsimleri

        {

            for (Map.Entry<String, String> entry : employeeMap.entrySet()) {

                if (entry.getValue().equalsIgnoreCase("F")) {
                    System.out.println(entry.getKey());
                }

            }
        }

        System.out.println("====================");

        //Tüm M ler (Male) tüm F ler (Female) olsun

        {
            for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
                if (entry.getValue().equalsIgnoreCase("F")) {
                    employeeMap.put(entry.getKey(), "Female");
                } else {
                    employeeMap.put(entry.getKey(), "Male");
                }
            }

            System.out.println("employeeMap = " + employeeMap);
        }


    }
}
