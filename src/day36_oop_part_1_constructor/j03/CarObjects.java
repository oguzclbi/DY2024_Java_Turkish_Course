package day36_oop_part_1_constructor.j03;

public class CarObjects {


    public static void main(String[] args) {

        //Bir araba yapacağız
        Car car1=new Car();
        System.out.println("car1 = " + car1);

        //Bir sıvı yakıtlı araba yapacağız
        Car car2=new Car(true);
        System.out.println("car2 = " + car2);

        //Markası TOGG modeli T10X olan elektrikli bir araba yapacağız
        Car car3=new Car("TOGG","T10X",false);
        System.out.println("car3 = " + car3);
        car3.color="White";
        System.out.println("car3 = " + car3);


        //Herşeyi belli olan bir araba yapacağız
        Car car4=new Car("Audi","Q7",10000,"Red",true);
        System.out.println("car4 = " + car4);


    }












}
