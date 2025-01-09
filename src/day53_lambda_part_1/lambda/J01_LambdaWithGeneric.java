package day53_lambda_part_1.lambda;

public class J01_LambdaWithGeneric {
    public static void main(String[] args) {

        /*
        LAMBDA FORMÜL
        (t,k)->{statement1,statement2}
            t->{statement1,statement2}
             t->statement1

         */


            //1. Param  //2.Param  //Dönüş Tipi
        Combine<String,    String,    String> stringCombine=(t,k)->(t+k);

        String accept= stringCombine.accept("Ali","Veli");


        System.out.println("accept = " + accept);


        //Combine<Integer,Integer,Integer> integerCombine=(t,k)->{return (t+k);};
        Combine<Integer,Integer,Integer> integerCombine=(a,b)->a+b;

        Integer accept1=integerCombine.accept(5,4);

        System.out.println("accept1 = " + accept1);


    }
}
