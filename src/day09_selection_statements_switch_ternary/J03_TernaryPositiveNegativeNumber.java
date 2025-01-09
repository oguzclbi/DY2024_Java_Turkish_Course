package day09_selection_statements_switch_ternary;

public class J03_TernaryPositiveNegativeNumber {
    public static void main(String[] args) {
        int numara=0;



        /*
        String result="";
        if (numara>0){
            result="Positive";
        }else {
            result="Negative";
        }
        System.out.println(result);
        */

        /*
        String result=(numara>0)?"Positive":"Negative";
        System.out.println("result = " + result);
        */
        //System.out.println((numara>0)?"Positive":"Negative");


        //                      1          1           2      2
        String result=(numara>0)?"Positive":(numara==0)?"Notr":"Negative";
        System.out.println(result);
        //DİKKAT! Ne kadar soru işareti varsa o kadar iki nokta üst üste vardır.
        // (?)Soru işareti 'İSE' demek (:)iki nokta üstüste 'DEĞİLSE' demek





    }
}
