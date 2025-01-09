package day21_user_input;


import java.util.Scanner;

public class J00_ScannerInteger {

    public static void main(String[] args) {

        //Scanner kullanmak için önce obje oluştur.
        //Referans tipi referans adı = new Referans tipi

        Scanner keyboard=new Scanner(System.in);

        //byte
        System.out.println("Yaşını gir:");
        byte b=keyboard.nextByte();
        System.out.println("Yaşınız: "+ b);
        System.out.println("içinde bulunduğunuz yılı giriniz:");
        short s=keyboard.nextShort();
        System.out.println("Girdiğiniz yıl:"+s);

        int i=keyboard.nextInt();

        long l=keyboard.nextLong();








    }


}
