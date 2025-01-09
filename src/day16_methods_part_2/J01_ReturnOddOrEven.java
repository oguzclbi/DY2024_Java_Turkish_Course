package day16_methods_part_2;

public class J01_ReturnOddOrEven {
    public static void main(String[] args) {

        //Verilen sayının çift veya tek olduğunu döndüren metodu yazınız
        String result=returnOddOrEven(9);
        System.out.println(result);

    }

    private static String returnOddOrEven(int num) {

        if (num % 2 == 0) {
            return "Cift";
        } else {
            return "Tek";
        }
    }
}
