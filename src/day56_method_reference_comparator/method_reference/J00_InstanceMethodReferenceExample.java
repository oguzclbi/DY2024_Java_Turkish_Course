package day56_method_reference_comparator.method_reference;

import java.util.function.Supplier;

public class J00_InstanceMethodReferenceExample {
    public static void main(String[] args) {


        String message="Hello world";
                                  //Lambda Expression
        Supplier<String> withLambda=()->message.toUpperCase();

        System.out.println(withLambda.get());

        String name="Adam";
        Supplier<String> withMethodReference=name::toUpperCase;
        System.out.println("withMethodReference.get() = " + withMethodReference.get());




    }
}
