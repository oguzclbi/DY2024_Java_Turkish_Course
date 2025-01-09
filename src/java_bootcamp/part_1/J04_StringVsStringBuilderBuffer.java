package java_bootcamp.part_1;

public class J04_StringVsStringBuilderBuffer {
    public static void main(String[] args) {

        String literal="Adam";

        String newKeyword=new String("Elif");

        StringBuilder stringBuilder=new StringBuilder(literal);

        String reversed = stringBuilder.reverse().toString();
        System.out.println("reversed = " + reversed);

        //threadsa(F)e --> StringBu(FF)er  "synchronized" keywordu ile threadsafe olduğunu anlarız
        // StringBuilder threadsafe DEĞİLDİR.


    }
}
