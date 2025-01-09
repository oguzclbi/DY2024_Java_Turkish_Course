package day28_array_part_1;

import java.util.Arrays;

public class J05_SortString {
    public static void main(String[] args) {

        String[] letters = {"a", "B", "D", "c"};
        System.out.println("Arrays.toString(letters) = " + Arrays.toString(letters));

        /*
        Arrays.sort(letters);
        System.out.println("Arrays.toString(letters) after sort = " + Arrays.toString(letters));
         */

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] != letters[i].toLowerCase()) {
                System.out.println(i);
                letters[i] = letters[i].toLowerCase();
            }


        }

        Arrays.sort(letters);
        System.out.println("Arrays.toString(letters) = " + Arrays.toString(letters));


    }
}
