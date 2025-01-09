package day13_branching_statements;

public class J04_FinRa {
    public static void main(String[] args) {

        int num=150;
        int start=1;
        while (start<=num){
            if (start%3==0 && start%5==0){
                System.out.println("FINRA");
            }else if (start%3==0){
                System.out.println("FIN");
            } else if (start%5==0) {
                System.out.println("RA");
            }else{
                System.out.println(start);
            }
            start++;


        }

    }
}
