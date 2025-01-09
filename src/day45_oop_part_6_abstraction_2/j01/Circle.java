package day45_oop_part_6_abstraction_2.j01;

public class Circle extends Shape {

   public double radius;

   public Circle(double radius){
       this.radius=radius;
   }

    @Override
    public double area() {

       //pi * r^2
        return Math.PI+Math.pow(radius,2);
        //PI metodunu direk sınıf ismiyle çağırabiliyoruz ve PI metodu büyük harflerle yazılmış
        //Bunun sebebi PI statik bir metod ve final bir metoddur.
    }
}
