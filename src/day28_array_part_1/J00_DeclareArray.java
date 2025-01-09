package day28_array_part_1;

import java.util.Arrays;

public class J00_DeclareArray {
    public static void main(String[] args) {

        int[] scores;
        //diziler oluşturulurken ne kadar yer lazım söylenmesi gerekir.
        scores = new int[3];
        //int[] array=new int[3];

        //int mat1=90;
        scores[0] = 90;
        //int mat2=80;
        scores[1] = 80;
        //int mat3=100;
        scores[2] = 100;

        //System.out.println(scores); //Referansta bulunan adresi gözterir
        System.out.println(Arrays.toString(scores));

        //birinci değeri yazdır
        System.out.println(scores[0]); //90
        //üçüncü değeri yaz
        System.out.println(scores[2]); //100

        for (int i = 0; i < 2; i++) {
            System.out.print(scores[i] + " ");

        }

        System.out.println();
        //=====================================================================
        System.out.println("===================================================");
                         //0       1      2       3
        String [] names={"Sami","Bedia","Arif","Bengul"};


                     //0 1 2 3 4 5 6 7 8
        int[] numbers={1,2,3,4,5,6,7,8,9};

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(numbers));

        System.out.println(names[2]);


        /*

        //Bu şekilde tanımlama olmaz

        long[] nums;
        nums={1,2,3,4,5};

        */



    }
}
