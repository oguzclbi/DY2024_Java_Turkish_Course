package day56_method_reference_comparator.method_reference;

import java.util.function.Function;

public class J01_StaticMethodReferenceExample {

    public static int square(int a){
        return a*a;
    }

    public static void main(String[] args) {

        Function<Integer,Integer> squareWithLambda=k->J01_StaticMethodReferenceExample.square(k);


        System.out.println("squareWithLambda.apply(5) = " + squareWithLambda.apply(5));

        Function<Integer,Integer> squareWithMethodReference=J01_StaticMethodReferenceExample::square;
        System.out.println("squareWithMethodReference.apply(10) = " + squareWithMethodReference.apply(10));


    }
}
