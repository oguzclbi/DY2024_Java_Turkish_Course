package day37_passing_objects_to_method.j01;

public class AppleClient {

    public static void main(String[] args) {

       Apple apple=new Apple();
        System.out.println(apple.color);

               //ojenin referansı
        changeColor(apple);

        //değiştikten sonra
        System.out.println(apple.color);



        //int primitive data type olduğu için kopya üzerinde çalışır
        //Dolayısıyla orjinal değer değişmez
        int a=5;
        System.out.println(a);

        changeA(a);
        System.out.println(a);








    }

    private static void changeA(int a) {

        a=10;

    }

    private static void changeColor(Apple obj) {
        obj.color="White";



    }


}
