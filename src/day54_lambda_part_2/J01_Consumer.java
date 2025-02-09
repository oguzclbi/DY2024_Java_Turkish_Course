package day54_lambda_part_2;

import java.util.function.Consumer;

public class J01_Consumer {
    public static void main(String[] args) {

        Consumer<String> printer=k-> System.out.println(k+" welcome");
        printer.accept("Adam");
        printer.accept("Ali");
        printer.accept("Mehmet");


        Consumer<Integer> formula=k-> System.out.println(k-273);
        formula.accept(0);


        Consumer<Double> circleArea=k-> System.out.println("Yarıçapı "+k+" olan Dairenin alanı: "+(3*k*k));
        circleArea.accept(3.0);

        Consumer<Integer> loop=k->{
            for (int i = 0; i < k; i++) {
                System.out.println(i);
            }
        };
        loop.accept(5);

    }
}
