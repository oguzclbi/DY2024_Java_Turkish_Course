package day30_array_part_3;

public class J05_2DimensionalArray3 {
    public static void main(String[] args) {

        String[][] company = new String[2][];
        //departmanları oluştur

        String[] department1 = new String[3];
        String[] department2 = new String[5];

        company[0] = department1;
        company[1] = department2;

        department1[0] = "Sami";
        department2[0] = "Arif";

        department1[1] = "Merve";
        department2[1] = "Harun";

        //departman2 çalışanlarını listeler
        for (int i = 0; i < department2.length; i++) {
            System.out.println(department2[i]);

        }

        System.out.println("============");

        System.out.println(company[0][0]); //1. departman 1 çalışan
        System.out.println(company[1][2]); //2. departman 3 çalışan

        System.out.println("============");

        //şirketin bütün departmanlarının bütün çalışanlarını listeler
                          //departman sayısı
        for (int i = 0; i < company.length; i++) {

            System.out.println((i+1)+" nolu departman çalışanları");
            for (int j = 0; j < company[i].length; j++) {
                System.out.println(company[i][j]);

            }
            System.out.println("-------------------");

        }


    }
}
