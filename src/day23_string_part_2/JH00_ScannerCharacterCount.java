package day23_string_part_2;

import java.util.Scanner;

public class JH00_ScannerCharacterCount {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.print("Adınızı girin: ");
        String firstName=scanner.next();
        System.out.print("Soyadınızı girin: ");
        String lastName=scanner.next();
        String fullName=firstName.concat(lastName);
        int length = fullName.length();
        System.out.println("Adınız ve soyadınızdaki toplam karakter sayısı: " + length);


    }
}
