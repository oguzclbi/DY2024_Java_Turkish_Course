package day13_branching_statements;

public class J03_Return {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if (i==3){
                //continue;
                /*
                0
                1
                2
                4
                5
                6
                7
                8
                9
                Main Metoddayım
                */

                //break;
                /*
                0
                1
                2
                Main Metoddayım
                */

                return;
                /*
                0
                1
                2
                */
            }

            System.out.println(i);

        }
        System.out.println("Main Metoddayım"); //break imleci buraya taşır

    } //return imleci buraya atar
}
