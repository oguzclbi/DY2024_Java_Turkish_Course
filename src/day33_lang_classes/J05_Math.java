package day33_lang_classes;

public class J05_Math {
    public static void main(String[] args) {

        System.out.println("Math.max(100,120) = " + Math.max(100, 120)); //Max değer
        System.out.println("Math.min(100,120) = " + Math.min(100, 120)); //Min değer
        System.out.println("Math.abs(-100) = " + Math.abs(-100)); //Mutlak Değer
        System.out.println("Math.pow(10,3) = " + (int) Math.pow(100, 3)); //Üslü Değer
        System.out.println("Math.sqrt(25) = " + Math.sqrt(25)); //Karekök
        System.out.println("Math.round(4.49) = " + Math.round(4.49)); //Yuvarla
        System.out.println("Math.round(4.49) = " + Math.round(4.5)); //Yuvarla
        System.out.println("Math.ceil(12.3) = " + Math.ceil(12.3)); //Yukarı yuvarla
        System.out.println("Math.floor(12.7) = " + Math.floor(12.7)); //Aşşağı yuvarla
        System.out.println("Math.random() = " + Math.random()); //0 ile 1 arasında rastgele sayı üret
        System.out.println("Math.random() = " + (int) (Math.random() * 100)); //0 ile 100 arasında rastgele sayı üret

        char random = (char) (Math.random() * 25 + 65); //Rastgele char üretme
        System.out.println("random char = " + random);

        System.out.println("Math.PI = " + Math.PI); //Pi sayısı


    }
}
