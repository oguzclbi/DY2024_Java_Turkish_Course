package day14_fourth_week_recap;

public class JP01_Triangle {
    public static void main(String[] args) {

        int satir = 7;

        for (int i = 1; i <= satir; i++) {
            System.out.print("#");
            for (int j = 1; j < i; j++) {

                System.out.print(" ");

            }
            System.out.println("#");

        }


    }
}
