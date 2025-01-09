package day27_sixth_recap;

import java.util.Scanner;

public class J01_Login {
    public static void main(String[] args) {

        String realUserName="Mike";
        String realPassword="Abc1";

        Scanner scanner=new Scanner(System.in);

        int i = 0;
        for (; i <3 ; i++) {

            System.out.println("Kullanıcı adını giriniz");
            String userName=scanner.nextLine();
            System.out.println("Şifrenizi giriniz:");
            String userPassword=scanner.nextLine();

            if (userName.isBlank()&&userPassword.isBlank()){
                System.out.println("Kullanıcı adı ve şifre boş olamaz.");
            } else if (userName.isBlank()) {
                System.out.println("Kullanıcı adı boş olamaz.");
            } else if (userPassword.isBlank()) {
                System.out.println("Şifre boş olamaz.");
            } else if (!userName.equalsIgnoreCase(realUserName)||!userPassword.equals(realPassword)) {
                System.out.println("Kullanıcı adı veya şifre hatalı. Tekrar deneyiniz.");
            }else {
                System.out.println("Giriş başarılı");
                break;
            }


        }

        if (i==3){
            System.out.println("Üç kez hatalı giriş yapıldı. Hesabınız kilitlendi.");
        }





    }
}
