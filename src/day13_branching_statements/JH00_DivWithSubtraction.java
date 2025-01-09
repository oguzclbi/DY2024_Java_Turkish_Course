package day13_branching_statements;

public class JH00_DivWithSubtraction {
    public static void main(String[] args) {

        int divided =4;
        int dividing =7;
        int result =0;

        while (divided >= dividing){
            divided = divided - dividing;
            result++;

        }
        System.out.println("result = " + result);


    }
}
