package day17_method_overloading;

public class J00_MethodOverloadingIntro {
    public static void main(String[] args) {
        //Bir method lazım hangi numara tipini verirsem vereyim onu ekrana yazdırsın
        display(5);
        display(10.0);
        display("Adam");
        display('c'); //Char için method yazmazsak ASCII kod karşılığı olarak int olan metodu yazdırır


        sum(2,3);
        sum(2,3,4);


        sum(10.5,5);
        sum(8,5.3);

    }

    // *** 3 adet method overloading kuralı vardır ***

    // Aynı method ismi parametreler değişik sıra ile
    public static void sum(double number1, int number2){

        System.out.println(number1+number2);

    }
    public static void sum(int num1, double num2){

        System.out.println(num1+num2);

    }


    //Aynı method ismi farklı sayıda parametre
    public static void sum(int num1, int num2, int num3) {

        System.out.println(num1+num2+num3);

    }
    public static void sum(int number1, int number2) {

        System.out.println(number1+number2);

    }


    //Aynı method ismi farklı parametre tipleri
    public static void display(int number) {

        System.out.println(number);

    }
    public static void display(double number){
        System.out.println(number);

    }
    public static void display(String value){

        System.out.println(value);

    }
    public static void display(char value){

        System.out.println(value);

    }

















}
