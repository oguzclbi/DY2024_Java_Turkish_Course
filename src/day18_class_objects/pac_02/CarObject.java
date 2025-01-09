package day18_class_objects.pac_02;

public class CarObject {
    public static void main(String[] args) {

        //reference type / reference / object
              Car          car1=      new Car();

        car1.make="Toyota";
        car1.model="Corolla";
        car1.year=2021;
        car1.color="Beyaz";

        System.out.println(car1);

        System.out.println(car1.color);
        System.out.println(car1.model);

        car1.signal();
        car1.start();
        car1.wiper();
        car1.stop();


    }
}
