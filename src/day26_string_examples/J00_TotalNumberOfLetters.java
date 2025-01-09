package day26_string_examples;

import java.util.Scanner;

public class J00_TotalNumberOfLetters {
    public static void main(String[] args) {

        //Dışarıdan bilgi almam gerekir

        Scanner scanner = new Scanner(System.in);

        //Aldığım ad için bir variable tanımlamam lazım
        System.out.println("Adınızı giriniz: ");
        String name = scanner.nextLine();
        name = name.replace(" ", "");


        //Aldığımsoyad için bir variable tanımlamam lazım
        System.out.println("Soyadınızı giriniz: ");
        String lastName = scanner.next();


        //aldığım ad değerindeki harf sayısını veren bir yol lazım
        int lengthOfName = name.length();

        //aldığım soyad değerindeki harf sayısını veren bir yol lazım
        int lengthOfLastName = lastName.length();


        //sonda bunların toplamını print ettireceğim
        System.out.println("Adınız ve soyadınızdaki toplam karakter sayısı: " + (lengthOfName + lengthOfLastName));

        scanner.close();


    }

}
