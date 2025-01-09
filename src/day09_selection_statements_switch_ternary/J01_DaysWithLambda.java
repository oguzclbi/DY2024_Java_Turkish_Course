package day09_selection_statements_switch_ternary;

public class J01_DaysWithLambda {
    public static void main(String[] args) {
        byte dayNum = 7;

        switch (dayNum) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            case 7: //case 6, 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid Data");


        }


        switch (dayNum) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("İnvalid Data");

        }


    }
}
