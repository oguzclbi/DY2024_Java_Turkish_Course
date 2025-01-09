package day45_oop_part_6_abstraction_2.j01;

public interface Volume {
    //metodu yazarken public ve abstact yazmamıza gerek yok
    //çünkü interface de oluşturduğumuz metodlar orjinalde public ve abstract metodlardır.

    //variable lerde de puclic static final default değerlerdir.bunları variable oluştururken yazmamıza gerek yok

    //final olmasından dolayı HAS_VOLUME büyük harflerle yazılır
    boolean HAS_VOLUME=true;
    //public abstract void volume();
    double volume();




}
