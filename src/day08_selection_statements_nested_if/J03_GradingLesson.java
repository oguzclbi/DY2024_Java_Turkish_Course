package day08_selection_statements_nested_if;

public class J03_GradingLesson {
    public static void main(String[] args) {
        int score = 75;
        if (score >= 0 && score <= 100) {

            if (score >= 90) {
                System.out.println("AA");
            } else if (score >= 80) {
                System.out.println("AB");
            } else if (score >= 70) {
                System.out.println("BB");
            } else if (score >= 60) {
                System.out.println("BC");
            } else if (score >= 50) {
                System.out.println("CC");
            } else if (score >= 40) {
                System.out.println("DC");
            } else if (score < 40) {
                System.out.println("DD");
            }
        } else {
            System.out.println("note is wrong");
        }
    }
}
