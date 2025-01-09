package day13_branching_statements;

public class J01_Continue {
    public static void main(String[] args) {

        int arananTek = 23;
        for (int tahmin = 1; tahmin <= 1000; tahmin++) {

            if (tahmin % 2 == 0) {
                continue;
            }

            System.out.println("tahmin = " + tahmin);

            if (tahmin == arananTek) {
                System.out.println("tahmin = " + tahmin);
                System.out.println("Buldun");
                break;
            }
        }


    }
}
