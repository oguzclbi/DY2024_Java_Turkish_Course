package day15_methods_part_1;

public class J03_MethodWithParameter {
    public static void main(String[] args) {

        //create a method for saying 8 is odd or even


        //isEightEvenOrOdd();
        isEvenOrOdd(45);


    }

    public static void isEightEvenOrOdd() {
        int num = 8;
        if (num % 2 == 0) {
            System.out.println("Sayı çifttir");
        } else {
            System.out.println("Sayı tektir");
        }


    }


    public static void isEvenOrOdd(int number) {

        if (number % 2 == 0) {
            System.out.println(number + " bir çift sayıdır.");
        } else {
            System.out.println(number + " bir tek sayıdır.");
        }


    }


}
