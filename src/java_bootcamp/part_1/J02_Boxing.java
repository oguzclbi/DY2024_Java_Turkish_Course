package java_bootcamp.part_1;

public class J02_Boxing {
    public static void main(String[] args) {

        //Boxing

        int num=10;

        Integer boxing = Integer.valueOf(num); //primitive valueof motodu ile kutulamış

        //Autoboxing

        Integer autoboxing=num;

        Integer num2=10;

        int unboxing = num2.intValue(); //unboxing

        int autoUnboxing=num2;  //Auto Unboxing




    }
}
