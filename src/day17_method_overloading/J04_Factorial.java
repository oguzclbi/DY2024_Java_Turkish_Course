package day17_method_overloading;

public class J04_Factorial {
    public static void main(String[] args) {

        double sonuc = factorial(-5);
        System.out.println(sonuc);

    }


    /**
     *
     * @param number (faltöriyelini bulmak istediğiniz sayı)
     * @return (sonuc pozitif olarak döner)
     *
     * eğer sonuç -1 ise istenilen sayının faktöriyelinin olmadığı anlamına gelir
     */
    public static double factorial(int number) {

        if (number<0){
            return -1;
        }

        if (number == 0 || number == 1) {
            return 1;
        } else {
            double result = 1;
            for (double i = 1; i <= number; i++) {

                result = result * i;

            }
            return result;
        }


    }


}
