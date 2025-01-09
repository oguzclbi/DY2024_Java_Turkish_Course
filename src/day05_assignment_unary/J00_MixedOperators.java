package day05_assignment_unary;

public class J00_MixedOperators {
    public static void main(String[] args) {

        byte num1 = 10;
        short num2 = 32767;

        // short sum= num1+num2; uyarı verir reyiz int e koyalım diye

        //short sum=(short)(num1+num2); Değerler üst sınırları geçince işlem yanlış sonuç verir

        int sum = num1 + num2;
        System.out.println(sum);


        short snum3 = 10;
        float fnum4 = 12.0F;
        float result = snum3 * fnum4;
        System.out.println(result);


    }
}
