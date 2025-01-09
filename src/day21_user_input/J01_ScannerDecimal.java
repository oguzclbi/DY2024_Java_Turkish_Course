package day21_user_input;

import java.util.Scanner;

public class J01_ScannerDecimal {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Birinci numarayı giriniz:");
        double number1 =scanner.nextDouble();
        System.out.println("İkinci numarayı giriniz:");
        double number2 = scanner.nextDouble();
        System.out.println("Sayıların Toplamı: "+(number1 + number2));



    }
}
