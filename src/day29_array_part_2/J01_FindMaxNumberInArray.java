package day29_array_part_2;

import java.util.Arrays;

public class J01_FindMaxNumberInArray {

    /*
    Verilen dizi içersindeki maximum değeri dönen bir method yazınız.
     */
    public static void main(String[] args) {


    int[] numbers={3,5,6,7,9,13,8,4};
    int findMaxResult =findMax(numbers);
        System.out.println("findMaxResult = " + findMaxResult);
        int findMax1Result=findMax1(numbers);
        System.out.println("findMax1Result = " + findMax1Result);


    }

    public static int findMax(int[] number) {
        int max=number[0];
        for (int i : number) {
            if (i>max){
                max=i;
            }
        }
        return max;
    }

    public static int findMax1(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];



    }


}
