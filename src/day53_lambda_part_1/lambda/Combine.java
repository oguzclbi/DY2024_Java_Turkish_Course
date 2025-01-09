package day53_lambda_part_1.lambda;

@FunctionalInterface
public interface Combine<T,K,R> {

    //FunctionalInterface bir tane methoda sahip olabilir o kadar.

    //R:Geri dönüş tipi
    //T:Referance Type1
    //K:Referance Type2


    //Metod
    R accept (T first,K second);


}
