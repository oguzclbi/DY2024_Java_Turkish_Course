package day05_assignment_unary;

public class J05_IncrementDecrement {
    public static void main(String[] args) {

        int a=5;
        // eğer ++veya -- öndeyse hemen değeri arttır sonra işlem yap
        System.out.println(++a); //a nın içerisinde 6 var
        System.out.println(++a); //a=7
        System.out.println(--a); //a=6
        System.out.println(--a); //a=5

        //eğer ++ veya -- sayıdan sonra ise önce yapacağını yap sonra değeri azalt veya artır

        int b=10;
        System.out.println(b++); //10 yazdır b=11
        System.out.println(b++); //11 yazdır b=12
        System.out.println(b--); //12 yazdır b=11
        System.out.println(b--); //11 yazdır b=10
        System.out.println(b--); //10 yazdır b=9
        System.out.println(b);





    }


}
