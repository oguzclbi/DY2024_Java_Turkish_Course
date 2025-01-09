package day43_access_modifiers_final_keyword.pac01_access_modifiers.pac02;

import day43_access_modifiers_final_keyword.pac01_access_modifiers.pac01.ClassA;

public class ClassC extends ClassA{

    public static void method1(){
        System.out.println(ClassA.publicVar); // extends yapmadan önce sadece buna erişilebiliyor.
        System.out.println(ClassA.protectedVar); // extends sonrası buna da erişilebiliyor. (Yani sub-class yaptıktan sonra)


    }

}
