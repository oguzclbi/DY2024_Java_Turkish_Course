package day18_class_objects.pac_03_HW;

public class ConverterClient {
    public static void main(String[] args) {

        Converter convert1 = new Converter();


        convert1.convertMPHtoKM(10);
        System.out.println(convert1.output);


        convert1.convertKMtoMPH(16.09344);
        System.out.println(convert1.output);


        convert1.convertCelciusToFahrenheit(10);
        System.out.println(convert1.output);


        convert1.convertFahrenheitToCelcius(50);
        System.out.println(convert1.output);


    }
}
