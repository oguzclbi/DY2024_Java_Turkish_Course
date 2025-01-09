package day18_class_objects.pac_02;

public class Car {

    public String make,model,color;
    public int year;

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    public void start(){
        System.out.println("Araba çalışıyor");
    }

    public void stop(){
        System.out.println("Araba durdu");
    }

    public void signal(){
        System.out.println("Arabanın sinyalleri çalıştı.");
    }

    public void wiper(){
        System.out.println("Arabanın silecekleri çalışıyor");
    }


}
