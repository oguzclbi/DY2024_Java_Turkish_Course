package day30_array_part_3;

import java.util.Arrays;

public class J04_2DimensionalArray2 {
    public static void main(String[] args) {

        //şirket oluştur

        String [][] company=new String[2][]; //ilk boyutu yazmak zorundayız ikinci boyutu yazmak zorunda değiliz

        //departmanları oluştur

        String [] department1=new String[3];
        String [] department2=new String[5];

        company[0]=department1;
        company[1]=department2;

        //Çalışanları ekle

        department1[0]="Sami";
        department2[0]="Arif";

        department1[1]="Merve";
        department2[1]="Harun";

        System.out.println(Arrays.deepToString(company));

        for (String s : department1) {
            System.out.println(s);
        }

        System.out.println("==============");

        for (String s : department2) {
            System.out.println(s);
        }

        System.out.println("==============");

        for (String[] departments : company) {
            System.out.println(Arrays.toString(departments));
        }

        System.out.println("==============");

        for (String[] eachDepartments : company) {
            for (String eachPerson : eachDepartments) {
                System.out.println(eachPerson);
            }

            System.out.println("----------------");
        }





    }
}
