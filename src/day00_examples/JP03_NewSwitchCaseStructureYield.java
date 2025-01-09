package day00_examples;

public class JP03_NewSwitchCaseStructureYield {
    public static void main(String[] args) {
        int num = 7;
        String message = switch (num) {
            case 1, 3, 5, 7, 9 -> {
                System.out.println("There is more than one line in case");
                System.out.println("We can return the value we want to return with the 'yield' keyword.");
                num = num + 1;
                yield "The number is odd";

            }
            case 2, 4, 6, 8 -> "The number is even";
            default -> "unknown number";

        };
        System.out.println(message);


    }
}
