package day14_fourth_week_recap;

public class JP02_DivideWithoutSlash {
    public static void main(String[] args) {

        int bolunen = 123;
        int bolen = 7;
        int sonuc;


        for (sonuc = 0; bolen <= bolunen; sonuc++) {
            bolunen = bolunen - bolen;


        }

        System.out.println(sonuc);


    }
}
