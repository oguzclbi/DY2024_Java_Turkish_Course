package day16_methods_part_2;

public class J00_WhyReturnMethod {
    public static void main(String[] args) {

        int addResult=addTwoNumberAndReturn(15,10);

        multiplyResultWithAnyNumber(addResult,3);



    }

    public static int addTwoNumberAndReturn(int num1, int num2) {
        return num1+num2;
    }

    public static void multiplyResultWithAnyNumber(int result, int number) {

        System.out.println(result*number);

    }


}
