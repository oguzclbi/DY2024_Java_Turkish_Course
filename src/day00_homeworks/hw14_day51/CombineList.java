package day00_homeworks.hw14_day51;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CombineList {
    public static void main(String[] args) {

        List<List<Integer>> lists = new ArrayList<>();

        lists.add(Arrays.asList(1, 4, 5));
        lists.add(Arrays.asList(1, 4, 3));
        lists.add(Arrays.asList(2, 6));

        System.out.println(lists);

        List<Integer> newList=new ArrayList<>();
        for (List<Integer> eachList : lists) {
            //System.out.println("eachList = " + eachList);

            for (Integer each : eachList) {
                //System.out.println("each = " + each);
                newList.add(each);
            }

        }

        Collections.sort(newList);
        System.out.println(newList);










    }


}
