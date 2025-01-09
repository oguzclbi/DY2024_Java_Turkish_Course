package day05_assignment_unary;

public class J07_PrePostIncDec {
    public static void main(String[] args) {
        int x=10;
        int y=22;

        System.out.println(x++ +x);
        System.out.println(x++ + ++y);
        System.out.println(++x %5);

        String name="Oğuz";

        //variable(değişken) value(değeri) yazdırmak için variable adı nokta sout "name.sout"
        System.out.println(name);
        //Variable name string olarak + variable value yazdırmak için variable adı nokta soutv "name.soutv"
        System.out.println("name = " + name);


    }
}
