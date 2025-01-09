package day12_loops_nested_while;

public class J01_LoopRules {
    public static void main(String[] args) {
        /*
        for (;;){
            System.out.println("Hello World");
        }
        */

        /*
        for (int i = 0; i > -1; i++) {
            System.out.println(i);
        }
        */
        for (int i=1, k=4; i<10 ; i++, k++) {
            System.out.print("i=" + i+" / ");
            System.out.print("k=" + k+ " ==> ");
            System.out.print(i*k+ "   ");

        }

    }
}
