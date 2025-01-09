package day54_lambda_part_2;

import java.util.function.BiPredicate;

public class J04_BiPredicate {
    public static void main(String[] args) {

        BiPredicate<Integer, Integer> areBothPositive = (k, l) -> k > 0 && l > 0;
        System.out.println("areBothPositive.test(2,3) = " + areBothPositive.test(2, 3));

        BiPredicate<String ,String> areEquals=(k,l)->k.equalsIgnoreCase(l);
        System.out.println("areEquals.test(\"Adam\",\"adam\") = " + areEquals.test("Adam", "adam"));



    }
}
