package day03_first_week_recap;

public class JP03_AdditionVsConcatenation {
    public static void main(String[] args) {

        //Addition ==>Toplama
        //Concatenation ==>Birleştirme

        System.out.println(5 + 5); //10 (Addition)
        System.out.println("Adam1" + 10); //Adam110 (Concatenation)
        System.out.println(12 + "Adam"); //12Adam (Concatenation)
        System.out.println("Adam" + "Harun"); //AdamHarun (Concatenation)
        System.out.println(5 + "Adam" + 5 + 1); //5Adam51 (Concatenation-Concatenation-Concatenation)
        System.out.println("Adam" + (5 + 4)); //Adam9 ((Addition)-Concatenation)
        System.out.println(5 + 5 + "Adam"); //10Adam (Addition-Concatenation)

    }
}
