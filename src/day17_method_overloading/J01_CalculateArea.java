package day17_method_overloading;

public class J01_CalculateArea {
    public static void main(String[] args) {

        // dairenin alanını hesaplayan method
        // dikdörtgenin alanını hesaplayan method
        // karenin alanını hesaplayan method

        calculateArea(10.5); //3.14*r^2
        calculateArea(3,5);
        calculateArea(5);






    }

    /*
    3 çeşit comment vardır
    Single Line --> //
    Multi Line  --> /*
    Document    --> /**
     */


    /**
     *
     * @param radius (Dairenin Yarıçapı)
     */
    public static void calculateArea(double radius) {

        System.out.println(3.14*radius*radius);

    }



    /**
     *
     * @param kKenar (dikdörtgene ait kısa kenar uzunluğu metre cinsinden)
     * @param uKenar (dikdörtgene ait uzun kenar uzunluğu metre cinsinden)
     */
    public static void calculateArea(double kKenar, double uKenar){

        System.out.println(kKenar * uKenar);

    }


    public static void calculateArea(int kenar){

        System.out.println(kenar*kenar);

    }












}
