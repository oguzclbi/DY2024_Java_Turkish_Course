package day29_array_part_2;

import java.util.Arrays;

public class J02_ReverseArray {

    /*
    Verilen diziyi ters döndürüp geriye döndüren bir method yazınız.

    -Method overloading ile int , double , String data tiplerinide kapsayınız.

     */


    public static void main(String[] args) {

        int[] numbers={1,2,3,4,5};

        int[] reverseResult = reverseArray(numbers);
        System.out.println("Arrays.toString(reverseResult) = " + Arrays.toString(reverseResult));

        String[] names={"merve","sami","harun","serhat"};
        String[] reverseNames= reverseArray(names);
        System.out.println("Arrays.toString(reverseNames) = " + Arrays.toString(reverseNames));


    }

    public static int[] reverseArray(int[] numbers) {

        int[] reverse=new int[numbers.length];
        int index=0;

        for (int i = numbers.length - 1; i >= 0; i--) {

            reverse[index++]=numbers[i];

        }

        return reverse;




    }

    public static String[] reverseArray(String [] numbers) {

        String [] reverse=new String[numbers.length];
        int index=0;

        for (int i = numbers.length - 1; i >= 0; i--) {

            reverse[index++]=numbers[i];

        }

        return reverse;




    }

    public static double[] reverseArray(double [] numbers) {

        double [] reverse=new double[numbers.length];
        int index=0;

        for (int i = numbers.length - 1; i >= 0; i--) {

            reverse[index++]=numbers[i];

        }

        return reverse;




    }




}
