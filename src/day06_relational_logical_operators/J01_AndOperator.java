package day06_relational_logical_operators;

public class J01_AndOperator {
    public static void main(String[] args) {

        boolean isGreaterThan18 = false;
        boolean isMale = true;
        System.out.println(isGreaterThan18 & isMale);

        //iki and && ve tek and & farkı

        /*
        iki and kullanıldığı zaman ilkte false görürse diğer koşullar kontrol edilmez çünkü sonuç zaten false olur.
        tek and kullanıldığı zaman tüm koşullar kontrole edilir
        */

        int a=10;
        System.out.println(false & a++>10 & true); //Tek & kullanırsak tüm ifadelerin doğruluğunu kontrol eder.
        System.out.println(a);

        System.out.println(true & false && a++>10 & true); //Çift && kullanırsak ilk ifade koşulu sağlamıyorsa diğer tüm ifadeleri kontrol etmeyi bırakıyor.
        System.out.println(a);


    }
}
