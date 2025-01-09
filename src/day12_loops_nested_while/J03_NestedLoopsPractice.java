package day12_loops_nested_while;

public class J03_NestedLoopsPractice {
    public static void main(String[] args) {

        /*
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        */


        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    System.out.println(i+":"+j+":"+k);
                }
            }
        }
    }
}
