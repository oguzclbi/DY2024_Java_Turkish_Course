package day18_class_objects.pac_03_HW;

public class Converter {
    double input;
    double output;

    public void convertMPHtoKM(double mph) {

        input = mph;
        double km = input * 1.609344;
        output = km;
        System.out.println(mph + " MPH = " + km + " KM");

    }

    public void convertKMtoMPH(double km) {

        input = km;
        double mph = input / 1.609344;
        output = mph;
        System.out.println(km + " KM = " + mph + " MPH");


    }

    public void convertCelciusToFahrenheit(double celcius) {

        input = celcius;
        double fahrenheit = (input * 1.8) + 32;
        output = fahrenheit;
        System.out.println(celcius + " Celcius = " + fahrenheit + " Fahrenheit");

    }

    public void convertFahrenheitToCelcius(double fahrenheit) {

        input = fahrenheit;
        double celcius = (input - 32) / 1.8;
        output = celcius;
        System.out.println(fahrenheit + " Fahrenheit = " + celcius + " Celcius");


    }


}
