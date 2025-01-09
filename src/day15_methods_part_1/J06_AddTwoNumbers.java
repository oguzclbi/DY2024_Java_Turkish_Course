package day15_methods_part_1;

public class J06_AddTwoNumbers {
    public static void main(String[] args) {

        addTwoNumbers(12,100);

        int a=23;
        int b=34;
        addTwoNumbers(a,b);

    }

    public static void addTwoNumbers(int num1,int num2) {

        System.out.println("Bu sayıların toplamı: "+(num1+num2));

    }
}
