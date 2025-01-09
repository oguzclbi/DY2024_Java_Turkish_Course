package day38_static.j05;

public class StaticBlock {

    public int insVar;

    //class a ait dolayısıyla her obje create edilirken assign etmeye gerek yok
    public static int staticVar;

    static {
        //EN ÖNCE SADECE BİR KEZ ÇALIŞIR
        System.out.println("STATIC");
        staticVar=10;

    }

    //CONS tan önce
    //Staticten sonra her obje create edilirken çalışır
    {

        insVar=10;
        System.out.println("INSTANCE BLOCK");
    }

    public StaticBlock(){
        System.out.println("CONS");
    }





    public static void main(String[] args) {

        StaticBlock staticBlock=new StaticBlock();
        StaticBlock staticBlock1=new StaticBlock();











    }









}
