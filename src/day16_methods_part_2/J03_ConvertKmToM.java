package day16_methods_part_2;

public class J03_ConvertKmToM {
    public static void main(String[] args) {

        /*
        Bana metod lazım görevi
        Km yi Metreye dönüştürecek ve bana döndürecek

        Bana bir metod daha lazım
        Gelen sonucu ben cm ye ceviren metoda vereceğim

        */


        int km = 5;

        int metre = convertKmToM(km);
        System.out.println(km + " km = " + metre + " metre");

        int cm = convertMToCm(metre);
        System.out.println(metre + " metre = " + cm + " cm");


    }

    public static int convertKmToM(int km) {
        return km * 1000;
    }

    public static int convertMToCm(int metre){
        return metre*100;
    }








}
