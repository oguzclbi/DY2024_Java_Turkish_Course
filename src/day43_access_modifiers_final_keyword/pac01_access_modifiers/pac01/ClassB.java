package day43_access_modifiers_final_keyword.pac01_access_modifiers.pac01;

public class ClassB {

    public static void main(String[] args) {

        System.out.println(ClassA.publicVar);
        System.out.println(ClassA.defaultVar);
        System.out.println(ClassA.protectedVar);

        //private alana sadece aynı class içerisinde ulaşabilirsin
        //System.out.println(ClassA.privateVar);




    }

}
