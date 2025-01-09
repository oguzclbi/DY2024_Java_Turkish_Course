package day53_lambda_part_1.lambda;


public class J00_LambdaIntro {
    public static void main(String[] args) {

        /*

        CheckEven checkEven=new CheckEven();
        checkEven.test(2);

         */



        IsEven isEven=(k)->{System.out.println(k%2==0);};

        isEven.test(2);


        Square sq=l->System.out.println(l*l);
        // Tek parametre var ise parantez koymaya gerek yok
        // Tek statement var ise süslü parantez koymaya gerek yok



        sq.square(4);




    }

    public static boolean isEven(int a){
        if (a%2==0)
            return true;
        else
            return false;

    }


}
