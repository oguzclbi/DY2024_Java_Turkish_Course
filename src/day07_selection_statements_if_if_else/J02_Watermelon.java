package day07_selection_statements_if_if_else;

public class J02_Watermelon {
    public static void main(String[] args) {

        int number = 40;
        boolean isEnough = false;
        if (number >= 20) {
            System.out.println("I have more than 20 watermelons");
            isEnough = true;
        }
        if (isEnough) {
            System.out.println("Good job");
        }
        if (!isEnough) {
            System.out.println("I need more watermelon");
        }


    }
}
