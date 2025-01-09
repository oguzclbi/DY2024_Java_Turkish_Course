package day36_oop_part_1_constructor.j02;

public class PersonObj {

    public static void main(String[] args) {


        Person person1=new Person();
        System.out.println("person1.isAlive = " + person1.isAlive);

        System.out.println("**************************************");

        Person person2=new Person("Ahmet");

        System.out.println("person2.name = " + person2.name);
        System.out.println("person2.isAlive = " + person2.isAlive);


    }



}
