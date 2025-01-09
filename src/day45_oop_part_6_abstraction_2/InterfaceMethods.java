package day45_oop_part_6_abstraction_2;

import java.util.Arrays;

public interface InterfaceMethods {


    //!!!intefacelerde constructor yoktur önemli!!!

    //variable public static ve final olur
    public static final int VAR = 100;

    // public access modifier default
    public void abstractMethod();


    static void staticMethod() {

        System.out.println(VAR);
        System.out.println("Static Method");


    }

    //default method classlardaki instance methoda tekabül eder
    //default burda bir access modifier değildir

    public default void defaultMethod(){
        System.out.println("Default Method");


    }

    private static String   privateMethods(){
        System.out.println("Private Method");
        System.out.println("Private ALGORİTMA ÇALIŞTI");

        //Basit bir şifreleme algoritması yazdım private method sayesinde
        //burdan yanlızca benim return ettiğim değerler dışarı çıkabilir
        //başka hiçbir classtan bu methoda ulaşılamaz. Aşağıdaki getPassword
        //metodu sayesinde bu metoddan return edilen data başka classlara açık
        //hale getirilebildi

        //***Şifreleme algoritması***
        String  data = "Hacer";
        char[] crypto=new char[data.length()];
        int i=0;

        for (char each : data.toCharArray()) {
            crypto[i]= (char) ((each+150)/10*25);
            i++;
        }

        return new String(crypto);




    }


    public static String  getPassword(){

        return privateMethods();







    }










}
