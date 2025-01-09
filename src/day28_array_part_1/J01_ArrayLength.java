package day28_array_part_1;

public class J01_ArrayLength {
    public static void main(String[] args) {
        //0 1 2 3 4 5 6 7 8 9
        int[] numbers = {1, 2, 3, 5, 7, 8, 0, 9, 3, 10, 6};
        int numberOfElement = numbers.length;

        int lastIndex = numberOfElement - 1;

        System.out.println("numberOfElement = " + numberOfElement);

        System.out.println("lastIndex = " + lastIndex);

        System.out.println("numbers[lastIndex] = " + numbers[lastIndex]);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }


    }
}
