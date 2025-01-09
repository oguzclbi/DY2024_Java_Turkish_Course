package day32_array_part_5;

public class J00_MajorityElement {
    public static void main(String[] args) {

        int[] array={2,3,3,2,2,3,3};
        int result=majority(array);
        System.out.println("result = " + result);


    }

    public static int majority(int[] array) {
        int major=0;
        for (int each:array){
            int numberOfElement=count(array,each);
            if (numberOfElement>array.length/2){
                major=each;
                break;
            }
        }
        return major;

    }

    public static int count(int[] array, int aranan) {
        int sayac=0;
        for (int each : array) {
            if (aranan==each){
                sayac++;
            }


        }
        return sayac;

    }


}
