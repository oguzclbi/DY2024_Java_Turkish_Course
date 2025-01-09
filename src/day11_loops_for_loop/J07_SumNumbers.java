package day11_loops_for_loop;

public class J07_SumNumbers {
    public static void main(String[] args) {

        //1 den 10 akadar olan sayıların toplamı
        int sum=0;
        for (int i = 1; i <=10 ; i++) {
            sum=sum+i;
        }
        System.out.println("Sayıların toplamı: "+sum);


    }
}
