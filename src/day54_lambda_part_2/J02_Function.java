package day54_lambda_part_2;

import java.util.function.Function;

public class J02_Function {
    public static void main(String[] args) {

        Function<String,Integer> lengthOfString=k->k.length();
        System.out.println("lengthOfString.apply(\"Adam\") = " + lengthOfString.apply("Adam"));

        Function<Integer,Boolean> isGreaterThan18=k->k>=18;
        System.out.println("isGreaterThan18.apply(12) = " + isGreaterThan18.apply(12));

        Function<String,String> initials=k->{
            String[] words = k.split(" ");
            return ""+words[0].charAt(0)+words[1].charAt(0);
        };

        System.out.println("initials.apply(\"Berat Erkul\") = " + initials.apply("Berat Erkul"));


    }
}
