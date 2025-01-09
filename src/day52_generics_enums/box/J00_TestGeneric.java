package day52_generics_enums.box;

public class J00_TestGeneric {
    public static void main(String[] args) {



        Box<Integer> intergerBox=new Box<>(1234);
        System.out.println("intergerBox.getItem() = " + intergerBox.getItem());


        Box<String> stringBox=new Box<>("1234");
        System.out.println("stringBox.getItem() = " + stringBox.getItem());


        Box<Double> doubleBox=new Box<>(123.4);
        System.out.println("doubleBox.getItem() = " + doubleBox.getItem());


    }
}
