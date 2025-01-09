package day06_relational_logical_operators;

public class J00_RelationalOperators {
    public static void main(String[] args) {

        int x=0;
        System.out.println(x<1); //true
        System.out.println(x>0); //false
        System.out.println(x<=0); //true
        System.out.println(x>=0); //true
        System.out.println(x==0); //true
        System.out.println(x!=1); //true

        System.out.println("A"=="a"); //false
        System.out.println("a"=="a"); //true

        /*
        String veya int ifadelerde "==" operatörü
        datanın hafızada(heap bölgesinde) nerede olduğunu kontrol ediyor.
        */
        System.out.println("Adam"=="adam");
        System.out.println("\"Adam\"==\"adam\" değildir.");







    }
}
