package day44_oop_part_5_abstraction_1.j04;

public abstract class Manager {

    //abstract classlardan bir obje create edilemez
    //burdaki asıl amaç alt classların nasıl davranacağını belirlemektir.
    //abstract classlarda constructor bulunabilir burda constructorın amacı fieldları initalize etmektir.
    //(aslında constructorların amaçları obje oluşturmak ve fieldleri initalize etmektir)

    public abstract void enterTimeAtEight();


}
