package day21_user_input;

import java.util.Scanner;

public class J02_ScannerString {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Adınız Giriniz:");

        //String ad=scanner.next(); //Sadece bir kelime girebiliriz
        String ad=scanner.nextLine(); //istediğimiz kadar kelime girebiliriz
        System.out.println("Hoşgeldiniz Sayın "+ad);

    }
}
