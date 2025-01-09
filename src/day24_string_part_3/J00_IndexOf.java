package day24_string_part_3;

public class J00_IndexOf {
    public static void main(String[] args) {

        String str = "Java Programming";

        // bana java kelimesindeki ilk a'nın poziyonunu ver
        //indexOf metodu bulmuş olduğu ilk a'nın indexini verir
        System.out.println("Index of first a = " + str.indexOf("a"));

        //Programming hangi indexten itibaren yazılmaya başlamış
        //Yani kelimenin ilk harfinin indexini veriyor

        System.out.println("Start index of \"Programming \" = "+str.indexOf("Programming"));
        System.out.println("Start index of \"ming \" = "+str.indexOf("ming"));


        //ikinci a' yı bulmak
        System.out.println("Index of second a = "+str.indexOf("a Pro"));


        int indexOfFirstA=str.indexOf("a");
        System.out.println("indexOfFirstA = " + indexOfFirstA);
        int indexOfSecondA=str.indexOf("a",indexOfFirstA+1);
        System.out.println("indexOfSecondA = " + indexOfSecondA);

        // üçüncü a'yı bul

        int indexOfThirdA=str.indexOf("a",indexOfSecondA+1);
        System.out.println("indexOfThirdA = " + indexOfThirdA);

        //Eğer aradığımız parça cümlenin içinde yoksa geriye -1 değeri döner
        int lostSentence =str.indexOf("ab");
        System.out.println("lostSentence = " + lostSentence);


    }
}
