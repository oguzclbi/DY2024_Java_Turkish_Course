package day43_access_modifiers_final_keyword.pac01_access_modifiers.pac01;

public class ClassA {

    public static int publicVar=100;
    static int defaultVar=100;
    protected static int protectedVar=100;
    private static int privateVar=100;

    public static void method(){

        //aynı class içerisinde bütün access modifiers türündeki field lara ulaşabiliriz
        System.out.println(privateVar);
        System.out.println(publicVar);
        System.out.println(defaultVar);
        System.out.println(protectedVar);
    }


}
