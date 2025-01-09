package day55_eighteenth_recap;

import java.util.Random;
import java.util.function.Supplier;

public class J00_RandomPasswordGenerator {
    public static void main(String[] args) {

        String password = "";
        int countOfChar = 16;

        for (int i = 0; i < countOfChar; i++) {
            Supplier<Character> randomChar = () -> (char) (new Random().nextInt(92) + 34);

            password += randomChar.get();

        }


        System.out.println(password);


    }
}
