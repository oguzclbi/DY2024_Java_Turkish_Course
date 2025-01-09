package day48_exception_part_1;

import java.util.Scanner;

public class J02_ExceptionHandling {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("İsim Giriniz: ");
            String name = scanner.next();
            name = null;
            System.out.println(name.toLowerCase());
        } catch (NullPointerException e) {//Yukarıdaki kodun fırlattığı hata türünü yazmamız lazım ki catch bloğu bu hatayı yakalayabilsin
            System.out.println("Ad ile ilgili bir sorun yaşıyorum adın null olup olmadığını kontrol edin.");
        }


        System.out.println("Soyad Giriniz: ");
        String lastName = scanner.next();
        System.out.println(lastName.toUpperCase());


    }


}
