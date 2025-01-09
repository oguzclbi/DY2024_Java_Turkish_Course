package day32_array_part_5;

public class J02_FirstOrLastSix {
    public static void main(String[] args) {

        int[] input = {13, 6, 1, 2, 3};
        boolean result = isFirstOrLastSix(input);

        System.out.println("result = " + result);


    }

    public static boolean isFirstOrLastSix(int[] input) {

        return input[0] == 6 || input[input.length - 1] == 6;


    }
}
