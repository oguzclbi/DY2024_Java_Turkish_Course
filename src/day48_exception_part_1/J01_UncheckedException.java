package day48_exception_part_1;

import day47_oop_part_8_review.apps.App;

import java.util.ArrayList;
import java.util.Objects;

public class J01_UncheckedException {

    public static String a;

    public static void main(String[] args) {

        //ArithmeticException

        /*
        for (int i = 10; i >=0 ; i--) {

            System.out.println(20/i);

        }

        */


        //NullPointerException

        //String b=null;
        //System.out.println(a.substring(0));



        //NumberFormatException

        String sentence="Sepette 10 elma var";
        int firstSpace=sentence.indexOf(" ");
        int elmaninYeri=sentence.indexOf("elma");
        String elmaSayisi=sentence.substring(firstSpace,elmaninYeri); //.trim yazarsak hata çözülür



        //System.out.println(Integer.parseInt(elmaSayisi)+5);


        //StringOutOfBoundsException
        //IndexOutOfBoundsException
        //ArrayIndexOutOfBoundsException

        String name="Adam";
        //System.out.println(name.charAt(5));

        ArrayList<String> arrayList=new ArrayList<>();

        //System.out.println("arrayList.get(3) = " + arrayList.get(3));

        //ClassCastException

        Object a="232";
        //System.out.println((Integer)a);

        AParent achild=new AChild();
        //System.out.println((AChild2)AChild);
        //birbiri ile bağlantısı olmayan classları birbirine cast ederken bu hata
        //ile karşılaşılır.









    }




}
