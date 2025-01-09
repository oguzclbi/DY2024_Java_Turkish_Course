package day13_branching_statements;

public class J02_BreakWithLabel {
    public static void main(String[] args) {

        outerloop:
        for (int i = 1; i < 5; i++) {

            System.out.print(i + " - ");

            for (char j = 'A'; j <= 'D'; j++) {

                System.out.print(j + " ");

                //break; //sadece bu loop dursun
                break outerloop; //dıştaki loop ile birlikte durdur

            }
            System.out.println("");

        }


    }
}
