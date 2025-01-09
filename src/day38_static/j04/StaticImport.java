package day38_static.j04;

//import static java.lang.Math.PI;
//import static java.lang.Math.max;
//import static java.lang.Math.min;
//import static java.lang.Math.cos;
/*
yukarıdaki gibi tek tek static metodları import edebiliriz
ama aşağıdaki şekilde tek seferde bütün static metodları import edebiliriz
Bu bize import yaparken kolaylık sağlar fakat kullanmadığımız bir çok metodu
da projemize dahil etmiş oluruz dolayısızla performas konusunda ufak bir dezavantaj
olabilir.
 */


                       //statik methodlar ve fieldlar
//Class içerisindeki tüm statik alanlar import edildi
import static java.util.Collections.*;
import static day16_methods_part_2.J00_WhyReturnMethod.*;
import static java.lang.Math.*;


public class StaticImport {

    //PI
    //min
    //max


    public static void main(String[] args) {


        System.out.println("Math.PI = " + PI);

        System.out.println("Math.max(5,6) = " + max(5, 6));

        System.out.println("min(4,9) = " + min(4, 9));
        System.out.println("cos(0.5) = " + cos(0.5));
        //PI=180
        System.out.println("cos(0.5) = " + cos(PI / 3));

        System.out.println(tan(PI / 4));


        multiplyResultWithAnyNumber(30,2);
        addTwoNumberAndReturn(2,3);
















    }














}
