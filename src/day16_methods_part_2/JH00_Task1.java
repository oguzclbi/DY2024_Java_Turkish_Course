package day16_methods_part_2;

public class JH00_Task1 {
    public static void main(String[] args) {


        drawRoof();
        drawMultipleStorey(3);


    }

    private static void drawMultipleStorey(int numberOfStorey) {
        for (int i = 0; i <numberOfStorey ; i++) {
            drawStorey();
        }
    }

    public static void drawRoof() {


        System.out.println("    *    ");
        System.out.println("   * *   ");
        System.out.println("  *   *  ");
        System.out.println(" *     * ");
        System.out.println("*********");

    }

    private static void drawStorey() {


        System.out.println("*********");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*********");

    }


}
