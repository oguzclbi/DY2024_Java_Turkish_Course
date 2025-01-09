package day54_lambda_part_2;

import java.util.function.Predicate;

public class J00_Predicate {
    public static void main(String[] args) {

        Predicate<String> isLongerThan6=k->k.length()>6;
        System.out.println("isLongerThan6.test(\"Adam\") = " + isLongerThan6.test("Adam"));

        Predicate<String> emailCheck=k->k.contains("@");
        System.out.println("emailCheck.test(\"adamcy@html.com\") = " + emailCheck.test("adamcy@html.com"));

        Predicate<Integer> isEven=k->k%2==0;
        System.out.println("isEven.test(5) = " + isEven.test(5));


    }
}
