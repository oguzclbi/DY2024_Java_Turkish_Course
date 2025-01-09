package day21_user_input;

import java.util.Scanner;

public class J03_ScannerChar {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Cinsiyetinizi F / M olarak belirtiniz");
        char gender=scanner.next().charAt(0);
        System.out.println("Cinsiyetiniz: "+gender);



    }
}
