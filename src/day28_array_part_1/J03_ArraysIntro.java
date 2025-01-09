package day28_array_part_1;

import java.util.Arrays;

public class J03_ArraysIntro {
    public static void main(String[] args) {

        int[] numbers = {32, 43, 25, 46, 27, 34, 35};

        //toString
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));

        //equals
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {1, 3, 2};
        System.out.println("Arrays.equals(nums1,nums2) = " + Arrays.equals(nums1, nums2));

        //ikisini de küçükten büyüğe doğru sırala

        //sort
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        System.out.println("Arrays.equals(nums1,nums2) after sort = " + Arrays.equals(nums1, nums2));

        //arama
        int[] numbers1 = {1, 3, 2, 56, 4, 7};
        Arrays.sort(numbers1);
        //çalışabilmesi için aradığınız dizinin sıralı olması gerekir.
        System.out.println("Arrays.binarySearch(numbers1,56) = " + Arrays.binarySearch(numbers1, 56));

        String[] letters = {"A", "C", "Z", "B", "a"};
        System.out.println("Arrays.toString(letters) = " + Arrays.toString(letters));
        Arrays.sort(letters);
        System.out.println("Arrays.toString(letters) = " + Arrays.toString(letters));


        //copy
        String[] copyOfOriginal = Arrays.copyOf(letters, letters.length);
        //String[] copyOfOriginal = Arrays.copyOf(letters, 12);
        System.out.println("Arrays.toString(copyOfOriginal) = " + Arrays.toString(copyOfOriginal));


    }
}
