package day18_class_objects.pac_01;

public class Dog {

    public String name;
    public String breed; //cins
    public int age;
    public String color;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public void bark() {

        System.out.println(name + " havlıyor");

    }

    public void sleep() {

        System.out.println(name + " uyuyor.");

    }

    public void eat() {

        System.out.println(name + " mama yiyor.");

    }


}
