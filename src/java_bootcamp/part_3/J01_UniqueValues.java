package java_bootcamp.part_3;

import java.util.*;

public class J01_UniqueValues {
    public static void main(String[] args) {

        //verilen liste benzersiz değerlerden mi oluşuyor?

        List<String> list=new ArrayList<>(
                Arrays.asList("a","d","c","a","k")); //6

        Set<String> set=new HashSet<>(list); //5

        System.out.println(list.size() == set.size());


    }
}
