package day45_oop_part_6_abstraction_2.j01;

public class Cylinder extends Shape implements Volume {

    @Override
    public double area() {
        //2*pi*r^2+2*pi*r*h
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    }
}
