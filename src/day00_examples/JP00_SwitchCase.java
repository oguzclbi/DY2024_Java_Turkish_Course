package day00_examples;

import java.util.Scanner;

public class JP00_SwitchCase {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            System.out.println("İsminiz Giriniz:");
            String ad = s.next();
            switch (ad) {
                case "Mehmet":
                    System.out.println("İsminiz Mehmet'tir");
                    break;
                case "Sezer":
                    System.out.println("İsminiz Sezer'dir");
                    break;
                default:
                    System.out.println("Adınız Hiçbirisi değildir");
            }
        }


    }
}
