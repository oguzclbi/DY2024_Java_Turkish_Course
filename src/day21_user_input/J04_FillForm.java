package day21_user_input;

import java.util.Scanner;

public class J04_FillForm {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        //Adınızı girin
        System.out.println("Adınızı doldurun:");
        String ad = scanner.nextLine();

        //Soyadınızı girin
        System.out.println("Soyadınızı doldurun:");
        String soyad= scanner.nextLine();

        //Yaşınızı girin
        System.out.println("Yaşınızı giriniz:");
        int yas= scanner.nextInt();

        //Adres girin
        /*
        nextLine() metodu kullanılırken öncesinde nextLine() yoksa
        bir tane extradan öncesine scanner.nextLine() eklenir
        sebebi ENTER tuşunu yakalamak
        */
        scanner.nextLine();
        System.out.println("Adresinizi giriniz:");
        String adres= scanner.nextLine();

        //Cinsiyetinizi girin
        System.out.println("Cinsiyetinizi giriniz:");
        char cinsiyet=scanner.next().charAt(0);

        System.out.println("Adınız      :"+ ad);
        System.out.println("Soyadınız   :"+ soyad);
        System.out.println("Yaşınız     :"+ yas);
        System.out.println("Adresiniz   :"+ adres);
        System.out.println("Cinsiyetiniz:"+ cinsiyet);


    }
}
