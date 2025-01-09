package day25_string_part_4;

public class J04_MutableVersionOfString {
    public static void main(String[] args) {

        /*
        String class immutable bir class tır.
        Oluşturmuş olduğumuz objenin değeri re-assign yapmadığımız sürece
        hangi metodu uygularsak uygulayalım hangi işlemi uygularsak uygulayalım
        orjinal değer değişmeyecektir.
        */
        String string=new String("Adam");
        System.out.println("string.contains(\"12\") = " + string.concat("12"));
        System.out.println("string = " + string);
        System.out.println("string.substring(0,2) = " + string.substring(0, 2));
        System.out.println("string = " + string);


        /*
        StringBuilder class mutable bir class tır.
        Oluşturmuş olduğumuz objenin değeri re-assign yapmamıza gerek yok.
        Çünkü uyguladığımız herhangi metod veya işlem sonrası StringBuilder sınıfından
        oluşturulmuş olan objenin değeri java tarafından otomatik olarak re-assign yapılır.
        */

        StringBuilder stringBuilder=new StringBuilder("Ad");
        System.out.println("stringBuilder before append= " + stringBuilder); //Ad
        stringBuilder.append("am");
        System.out.println("stringBuilder after append= " + stringBuilder); //Adam

        //StringBulder Classının Ekstra metodları
        System.out.println("stringBuilder.reverse() = " + stringBuilder.reverse());

        //Son harfle yanlış onlardan nasıl kurtuluruz.
        String ad1="Samir";
        String ad2="Adamk";
        String ad3="Arifi";

        //Yöntem 1
        ad1=ad1.substring(0,ad1.length()-1);
        System.out.println("ad1 = " + ad1);

        //Yöntem 2
        StringBuilder stringBuilder1=new StringBuilder(ad2);
        stringBuilder1.deleteCharAt(ad2.length()-1);
        System.out.println("stringBuilder1 = " + stringBuilder1);




                  // 0123
        String name="Sami";

        //String Classta kelimeyi ters çevirmek için
        for (int i = name.length()-1; i >=0 ; i--) {
            System.out.print(name.charAt(i));
        }

        System.out.println();

        //StringBuilder Classta kelimeyi ters çevirmek için
        StringBuilder stringBuilder2=new StringBuilder(name);
        System.out.println("stringBuilder2.reverse() = " + stringBuilder2.reverse());


        StringBuffer stringBuffer=new StringBuffer("Adam");
    }
}
