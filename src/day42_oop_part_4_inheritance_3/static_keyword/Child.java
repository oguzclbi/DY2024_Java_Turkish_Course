package day42_oop_part_4_inheritance_3.static_keyword;

public class Child extends Parent{

    //Static method connot be overriden
    //Bu olaya Overhidding denir
    public static void method(){
        System.out.println("Child class static method");
    }

}
