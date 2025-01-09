package day30_array_part_3;

import java.util.Arrays;

public class J03_2DimensionalArray {
    public static void main(String[] args) {

        String [] department1={"A","B"};
        String [] department2={"C","D"};
        String [] department3={"E","F"};
        String [] department4={"G","H"};
        String [] department5={"I","J"};
        String [] department6={"K","L"};
        // Tek boyutlu dizilerde dizi içeriğini yani değerleri listelemek istiyorsak Arrays.ToString kullanmamız gerekir.
        System.out.println(Arrays.toString(department1));

        // 2 boyutlu ve çok boyutlu dizilerde dizi içeriklerini listelemek istiyorsak Arrays.deepToString kullanmamız gerekir.
        String [][] company1={department1,department2,department3};
        System.out.println(Arrays.deepToString(company1));

        String [][] company2={department4,department5,department6};

        String [][][] holding={company1,company2};
        System.out.println(Arrays.deepToString(holding));

        //[[[A, B], [C, D], [E, F]], [[G, H], [I, J], [K, L]]]
        //ilk companyi yazdır.
        System.out.println(Arrays.deepToString(holding[0]));
        //ilk şirketteki ikinci departmanda çalışanları göster
        System.out.println(Arrays.deepToString(holding[0][1])); //gelen değerler dizi türünde olduğu için Arrays.deepToString ile çağırıyoruz
        //ikinci şirketteki ikinci deparmandaki birinci çalışan
        System.out.println((holding[1][1][0])); //gelen değer dizi olmadığı için yani doğrudan String tipinde bir değer olduğu için Arrays.deepToString yazmadık



    }
}
