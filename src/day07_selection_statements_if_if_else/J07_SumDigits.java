package day07_selection_statements_if_if_else;

public class J07_SumDigits {
    public static void main(String[] args) {
        int num=7895;

                // Birler -     Onlar   -  Yüzler    -  Binler
        int topla=(num%10)+((num/10)%10)+(num/100%10)+(num/1000);
        System.out.println(num+" sayısının basamaklarının toplamı "+topla+" dır");



    }
}
