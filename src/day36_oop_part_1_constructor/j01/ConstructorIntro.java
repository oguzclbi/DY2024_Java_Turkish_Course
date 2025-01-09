package day36_oop_part_1_constructor.j01;

public class ConstructorIntro {


    String name;  //null
    int age;  //0


    // *** default constructor - Görünmeyen constructor ***

    /*

    public ConstructorIntro(){



    }
    */


    //**************************************************


    // *** non argument cons - Görünen constructor ***

    //Bizim elimizle yazığımız biz bunu yazdığımızda
    // arka planda bulunan default cons silinir
    public ConstructorIntro(){
        this.name="Ahmet";
        this.age=10;
        System.out.println("No arg Cons Called");

    }

    //şimdilik public olarak kullanın
    public ConstructorIntro(String name, int age){
        this.age=age;
        this.name=name;
        System.out.println("Paramaterized cons called");


    }





    public static void main(String[] args) {

        ConstructorIntro obj=new ConstructorIntro(); //obje oluşturulurken default constructor her zaman çağırılır

        System.out.println(obj.name);
        System.out.println(obj.age);

        System.out.println("****************************************");

        ConstructorIntro obj1=new ConstructorIntro("Mehmet",20);
        System.out.println(obj1.name + " " + obj1.age);


    }




















}
