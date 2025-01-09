package day54_lambda_part_2;

import java.util.function.BiFunction;

public class J06_BiFunction {
    public static void main(String[] args) {

        BiFunction<Integer,Integer,Integer> add=(k,l)->k+l;
        System.out.println("add.apply(4,5) = " + add.apply(4, 5));

        BiFunction<Double,Double,Double> findHypotenuse=(k,l)->Math.sqrt(Math.pow(k,2)+Math.pow(l,2));
        System.out.println("findHypotenuse.apply(3.0,4.0) = " + findHypotenuse.apply(3.0, 4.0)); //3-4-5 Üçgeni


    }
}
