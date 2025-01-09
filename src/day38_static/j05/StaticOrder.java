package day38_static.j05;

public class StaticOrder {

    //username ve password girme işlemi
    static {
        System.out.println("USERNAME PASSWORD GİR");
    }

    static {
        System.out.println("GELEN KOD GİRİLİR");
    }

    static {
        System.out.println("SİSTEME GİRİŞ BAŞARILI");
    }

    //static metodlar yukarıdan aşağıya herşeyden önce çalışır. Static metoddan bile önce.


    public static void main(String[] args) {

        StaticOrder login1 = new StaticOrder();
        StaticOrder login2 = new StaticOrder();


    }


}
