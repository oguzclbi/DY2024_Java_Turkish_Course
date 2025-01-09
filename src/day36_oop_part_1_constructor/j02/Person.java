package day36_oop_part_1_constructor.j02;

import javax.swing.*;

public class Person {

    String name;
    int age;
    String job;
    boolean isAlive;

    //default constructor a işi bırakırsak isAlive False olarak gelir burda bir mantık hatası oluşur.
    //(Bir insan dünyaya geldiğinde canlı olarak gelir)
    //Dolayısıyla kendi Cons umuzu kendimiz yazmamız daha mantıklı olacaktır


    public Person(){

        this.isAlive=true;


    }

    //Aşağıdaki gibi de fieldlere değer atayabiliriz fakat genellikle this. keywordu kullanılır.
    //field ismi parametre olarak geçilir ve karışmaması için this. keywordu kullanılır
    /* ÖRNEK
    public Person(String name)
    this.name=name;
    */


    //public Person(String childName){

    public Person(String name){
        this.isAlive=true;
        //name= childName;
        this.name=name;


    }




}
