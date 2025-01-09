package day17_method_overloading;

public class J03_Calculator {
    public static void main(String[] args) {

        String sonuc = calculate(15, 6, '÷');

        System.out.println(sonuc);


    }

    public static String calculate(int num1, int num2, char operator) {

        switch (operator) {
            case '+':
                return "Result= " + (num1 + num2);


            case '-':
                return "Result= " + (num1 - num2);

            case '*', 'x':
                return "Result= " + (num1 * num2);


            case '/', ':', '÷':
                if (num2 == 0) {
                    return "Hata: Sıfıra bölme hatası.";
                } else {
                    return "Result " + (num1 / num2);
                }

            case '%':
                return "Result= " + (num1 % num2);

            default:
                return "Result= " + ("Geçersiz Operator");
        }


    }
}
