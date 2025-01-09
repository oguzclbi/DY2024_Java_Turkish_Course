package day54_lambda_part_2;

import java.util.Random;
import java.util.function.Supplier;

public class J03_Supplier {
    public static void main(String[] args) {

        Supplier<Integer> randomNumberGenerator=()->new Random().nextInt(100);

        System.out.println("randomNumberGenerator.get() = " + randomNumberGenerator.get());


        Supplier<Character> randomChar=()->{
            char ch=(char)(new Random().nextInt(26)+65);
            return ch;

        };
        System.out.println("randomChar.get() = " + randomChar.get());


    }
}
