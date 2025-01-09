package day29_array_part_2;

import java.util.Arrays;

public class J00_SumEvenAndOddNumbersInArray {


    /*
    iki farklı int diz tanımlayınız.
    iki ayrı method tanımlayarak methoda parametre olarak intiger dizi gönderelim.

    1. method dizi içersindeki çift(even) sayıların toplamını döndürsün.

    2. method dizi içersindeki tek(odd) sayıların toplamını döndürsün.

    */
    public static void main(String[] args) {

        int[] numbers1 = new int[5];
        System.out.println("Arrays.toString(numbers1) = " + Arrays.toString(numbers1));

        numbers1[0] = 5;
        numbers1[1] = 2;
        numbers1[2] = 8;
        numbers1[3] = 13;
        numbers1[4] = 12;

        int[] numbers2 = {5, 13, 46, 2, 12};
        int evenResult = sumEven(numbers2);

        System.out.println(Arrays.toString(numbers2) + " evenResult = " + evenResult);

        int oddResult = sumOdd(numbers2);
        System.out.println(Arrays.toString(numbers2) + " oddResult = " + oddResult);

        boolean compareResult = compareSumOfEvenAndOdd(numbers2);
        System.out.println("compareResult = " + compareResult);


    }

    public static int sumEven(int[] numbers) {

        int sum = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }

        }
        return sum;

    }

    public static int sumOdd(int[] numbers) {

        int sum = 0;

        for (int number : numbers) {
            if (number % 2 != 0) {
                sum += number;
            }

        }
        return sum;

    }

    public static boolean compareSumOfEvenAndOdd(int[] numbers) {
        //return sumEven(numbers)>=sumOdd(numbers);
        return sumEven(numbers) >= sumOdd(numbers) ? true : false; //şuan bu kullanım çok mantıklı değil.
        //Çünkü buerda true ise true döndür diyoruz
        //Yani if(true) ise True döndür diyoruz

    }


}
