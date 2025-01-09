package day07_selection_statements_if_if_else;

public class J03_IfElse {
    public static void main(String[] args) {
        // girilen numara eğer sıfırdan büyük ise pozitif, değil ise negatif yazdır

        int num = 5;
        boolean isGraterThanZero=num>0;
        if (isGraterThanZero) {
            System.out.println("Pozitif");
        } else {
            System.out.println("Negatif");
        }


    }
}
