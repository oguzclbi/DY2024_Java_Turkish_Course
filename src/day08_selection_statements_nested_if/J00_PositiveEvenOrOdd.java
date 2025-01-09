package day08_selection_statements_nested_if;

                     //Çift yada Tek
public class J00_PositiveEvenOrOdd {
    public static void main(String[] args) {
        //Get first integer number
        int num =5;

        //check if the number is positive
        if (num > 0) {
            //If the number is positive, check whether the number is even or odd.
            //If the remainder when divided by 2 is 0
            if (num % 2 == 0) {
                System.out.println("Positive even number");
            } else {
                System.out.println("Positive odd number");
            }

        } else {
            //If the number is not positive, then it is printed on the screen as an incorrect number.
            System.out.println("Wrong number");


        }


    }


}
