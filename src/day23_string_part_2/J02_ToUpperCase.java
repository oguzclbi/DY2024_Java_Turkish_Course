package day23_string_part_2;

import java.util.Locale;

public class J02_ToUpperCase {
    public static void main(String[] args) {

        String word="elma";
        String result="";

        word=word.toUpperCase();

        //Kelime havuzum
        switch (word){
            case "ELMA":
                result=word;
                break;
            case "ERİK":
                result=word;
                break;
            case "ARMUT":
                result=word;
            default:
                result="ARANAN DEĞER BULUNAMADI";
                break;


        }
        System.out.println("result = " + result);

        //Diller arası büyük küçük harf uyumsuzluğunu ortadan kaldırmak için aşağıdaki metot kullanılabilir
        String word1="Kiraz";
        System.out.println("word1 = " + word1.toUpperCase(Locale.forLanguageTag("tr-TR")));


    }
}
