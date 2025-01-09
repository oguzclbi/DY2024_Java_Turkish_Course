package day19_memory_mangement_system;

public class CalculatorFactory {
    public static void main(String[] args) {


        Calculator calculator1=new Calculator();

        int result=calculator1.add(calculator1.clickDigitButton(3), calculator1.clickDigitButton(5) );

        System.out.println(result);



        

    }



}
