package day09_selection_statements_switch_ternary;

public class J00_Calculator {
    public static void main(String[] args) {

        double num1 = 100, num2 = 80;
        char operator = '-';
        /*

        if (operator == '+') {
            System.out.println("Toplam: "+(num1 + num2));
        } else if (operator == '-') {
            System.out.println("Fark: "+(num1 - num2));
        } else if (operator == '*') {
            System.out.println("Çarpım: "+(num1 * num2));
        } else if (operator == '/') {
            System.out.println("Bölüm: "+(num1 / num2));
        } else {
            System.out.println("Hatalı işlem");
        }

        */











        /* Switch-Case Yapısı ile

        double num1 = 100, num2 = 80;
        char operator = '?';
        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Hatalı işlem");
        }


        */

        switch (operator){
            case '+'-> System.out.println(num1 + num2);
            case '-'-> System.out.println(num1 - num2);
            case '*'-> System.out.println(num1 * num2);
            case '/'-> System.out.println(num1 / num2);
            default -> System.out.println("Hatalı işlem");

        }


    }
}
