package day06_relational_logical_operators;

public class J02_OrOperators {
    public static void main(String[] args) {
        System.out.println(false | false);
        System.out.println(false | true);
        System.out.println(true | false);
        System.out.println(true | true);
        System.out.println(true | false | false | false);
        System.out.println(false | false | false | false);
        System.out.println(false | false | false | false | true);

        System.out.println("-----------------------------");
        System.out.println(false || true || false | false | true);

        //tek or | ve çift or || farkı

        int b = 20;
        boolean result = true || b++ < 20;
        System.out.println(b);
        boolean result1 = true | b++ < 20;
        System.out.println(b);


    }
}
