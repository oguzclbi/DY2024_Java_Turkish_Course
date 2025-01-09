package day32_array_part_5;

public class J03_SameFirstLast {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3};
        int[] array2 = {7, 3};

        String result = sameFirstLast(array1, array2);
        System.out.println("result = " + result);


    }

    public static String sameFirstLast(int[] array1, int[] array2) {

        if (array1.length <= 1) {
            return "Array 1 is not valid";
        }
        if (array2.length <= 1) {
            return "Array 2 is not valid";
        }
        int firstElementOfFirstArray = array1[0];
        int lastElementOfFirstArray = array1[array1.length - 1];
        int firstElementOfSecondArray = array2[0];
        int lastElementOfSecondArray = array2[array2.length - 1];

        if (firstElementOfFirstArray == firstElementOfSecondArray ||
                lastElementOfFirstArray == lastElementOfSecondArray) {
            return "true";
        } else {
            return "false";
        }


    }
}
