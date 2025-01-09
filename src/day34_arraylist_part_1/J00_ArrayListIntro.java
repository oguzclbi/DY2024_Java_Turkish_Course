package day34_arraylist_part_1;

import java.util.ArrayList;
import java.util.Arrays;

public class J00_ArrayListIntro {
    public static void main(String[] args) {

        int[] array1 = new int[5];
        System.out.println(Arrays.toString(array1));
        int[] array2 = {10, 30, 50, 70};
        System.out.println(Arrays.toString(array2));

        //Array üzerinde boyutları güncelleyemiyoruz bu yüzden yeni bir array oluşturup boyutunu arttırıp eleman eklemeyi öyle yapabildik
        int[] array3 = Arrays.copyOf(array2, array2.length + 1);

        array3[4] = 90;
        System.out.println(Arrays.toString(array3));

        System.out.println("--------------Arraylist-------------");

        //ArrayList oluşturma

        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println(arrayList);

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Kiraz", "Şeftali", "Erik"));
        System.out.println(list);

        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println(nums);

        ArrayList<Integer> nums2=new ArrayList<>(Arrays.asList(10,20,30,40));
        System.out.println(nums2);

        for (Integer each : nums2) {
            System.out.println(each);
        }


    }
}
