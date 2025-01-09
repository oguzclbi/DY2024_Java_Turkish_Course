package day52_generics_enums.enums;

import java.util.Arrays;

public class TestEnum {
    public static void main(String[] args) {

        String day1="Pazartesi";
        String day2="SALI";

        System.out.println("day1 = " + day1);
        System.out.println("day2 = " + day2);


        System.out.println("DayOfWeek.day1 = " + DayOfWeek.day1);
        System.out.println("DayOfWeek.day2 = " + DayOfWeek.day2);

        System.out.println("Day.Pazartesi = " + Day.PAZARTESİ);
        System.out.println("Day.Salı = " + Day.SALI);

        System.out.println("ProjectStatus.values() = " + Arrays.toString(ProjectStatus.values()));

        


    }
}
