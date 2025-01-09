package day28_array_part_1;

public class J04_ForEachLoop {
    public static void main(String[] args) {


        //numbers.for ==> otomatik olarak dizi için foreach döngüsü oluşturur.
        //numbers.fori ==> otomatik olarak dizi için for döngüsü oluşturur.
        //numbers.forr ==> otomatik olarak dizi için for döngüsünü tersten oluşturur.

        int[] numbers = {1, 2, 3, 4, 5,6};

        //numbers.for
        for (int s:numbers){
            System.out.println(s);
        }
        System.out.println("================================");

        //numbers.fori
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("================================");


        //numbers.forr
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }




    }
}
