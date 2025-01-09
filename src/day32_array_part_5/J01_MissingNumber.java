package day32_array_part_5;

import java.util.Arrays;

public class J01_MissingNumber {

    public static void main(String[] args) {

        //0 1 2 3 4 5 6 7 8

        //0 1 3 2 5 6 9 8 7
        //0 1 2 3 5 6 7 8 9

        int[] array = {3, 0, 1, 2, 4, 7, 8, 5};
        System.out.println("array = " + Arrays.toString(array));

        /*
        -------- Yöntem 1 ----------
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (i!=array[i]){
                System.out.println("Missing Number: "+i);
                break;
            }

        }

        */

        //-------- Yöntem 2 ----------

        Arrays.sort(array);
        System.out.println("SortedArray= " + Arrays.toString(array));

        boolean isIrregular = false;
        for (int i = 0; i < array.length - 1; i++) {

            int current = array[i];
            int next = array[i + 1];

            if (next - current != 1) {
                System.out.println("Eksik Sayı: " + (current + 1));
                isIrregular = true;
                break;
            }

        }

        if (!isIrregular) {
            System.out.println("Eksik Sayı: " + (array[array.length - 1] + 1));
        }


    }
}
