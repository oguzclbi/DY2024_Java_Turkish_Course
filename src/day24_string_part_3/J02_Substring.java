package day24_string_part_3;

public class J02_Substring {
    public static void main(String[] args) {


        /*
        substring metodu istediğimiz index aralıklarındaki
        string değerini geri döndürür.

        */


                  //01234567
        String str="SENTENCE";

        //son index dahil değil

        String sub = str.substring(3, 6);
        System.out.println("sub = " + sub);

        String sub2 = str.substring(3);
        System.out.println("sub2 = " + sub2);

        String result="Yaklaşık 5.190.000 sonuç bulundu (0,33 saniye)";

        String seconds = result.substring(result.indexOf("(") + 1, result.indexOf(")"));
        System.out.println("Seconds = " + seconds);


    }
}
