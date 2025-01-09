package day11_loops_for_loop;

public class J06_PrintAlphabetAToZ {
    public static void main(String[] args) {

        /*
        //Harfleri a dan z ye kadar yazdır
        for (char i = 'a'; i <='z' ; i++) {
            System.out.println(i);
        }
        */

        for (int i = 97; i <=122 ; i++) {
            System.out.println(i+"=>"+(char) i);
        }




    }
}
