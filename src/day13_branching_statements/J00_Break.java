package day13_branching_statements;

public class J00_Break {
    public static void main(String[] args) {

        int aranan = 5;
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == aranan) {
                System.out.println("Buldun devam etmene gerek yok");
                break;
            }

        }


    }
}
