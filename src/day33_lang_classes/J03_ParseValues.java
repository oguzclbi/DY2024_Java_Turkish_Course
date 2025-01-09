package day33_lang_classes;

public class J03_ParseValues {

    public static void main(String[] args) {

        String age="10";
                      //(Integer)
        //short s=(short) Integer.valueOf(age);

                      //(int)
        short s=(short) Integer.parseInt(age);

        //parse.. metodları tip olarak primitive döndürür
        //valueOf metodları tip olarak wrapper class döndürür.

        System.out.println(s+1);





    }

}
