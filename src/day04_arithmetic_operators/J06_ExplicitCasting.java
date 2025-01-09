package day04_arithmetic_operators;

public class J06_ExplicitCasting {
    public static void main(String[] args) {


         /* Explicit Casting
        büyük veri tipini küçük veri tipinin
        içine koyma işlemi

        DİKKAT!
        büyük veri tipinden gelen değer
        küçük veri tipinin aralığını aşarsa
        küçük veri tipinin veri aralığının
        en küçük değerinden tekrar saymaya başlar.
         */

        int s=25;
        byte a=(byte)s;
        System.out.println(a);


        int i=128;
        byte b=(byte)i;
        System.out.println(b);


        double gercekTutar=10.7;
        System.out.println(gercekTutar);

        int alinanMiktar=(int)gercekTutar;
        System.out.println(alinanMiktar);





    }
}
