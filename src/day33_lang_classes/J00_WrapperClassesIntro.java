package day33_lang_classes;

public class J00_WrapperClassesIntro {

    public static void main(String[] args) {

        String ten="10";

        System.out.println(ten+1);

        //sayı olarak
        System.out.println(Integer.valueOf(ten)+1); //11
        System.out.println(Integer.parseInt(ten)+1); //11

        String decimal="3.5";

        System.out.println(decimal+1); //3.51

        System.out.println(Double.valueOf(decimal)+1); //4.5
        System.out.println(Double.parseDouble(decimal)+1); //4.5

        System.out.println(Integer.MAX_VALUE); //Integerin alabileceği maximum değeri yazdırdık

        System.out.println("Evlimisiniz");
        String cevap="TRUE";

        boolean b1=true; //yada false
        System.out.println(b1);

        System.out.println("BOOLEAN TRUE");
        System.out.println(Boolean.valueOf(cevap));

        if (Boolean.valueOf(cevap)){
            System.out.println("String booleana dönüştü");
        }





    }
}
