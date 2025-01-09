package day18_class_objects.pac_01;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name="Çomar";
        dog1.breed="Çoban köpeği";
        dog1.age=3;
        dog1.color="Siyah";

        //dog1 objesinin tüm bilgilerini yazdır.
        System.out.println(dog1);

        //dog1 objesinin sadece yaşını yazdır.
        System.out.println(dog1.age);

        //dog1 ne yiyor
        dog1.eat();

        //dog1 nasıl ses çıkarıyor
        dog1.bark();

    }

}
