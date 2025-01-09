package day10_third_week_recap;

public class JP00_Revenue {
    public static void main(String[] args) {

        double price=119.99;
        int quantity=10;
        double revenue;
        revenue=price*quantity;
        if (revenue>5000){
            System.out.println("Discount: "+ (revenue*0.1));
            //System.out.println("Net Revenue: "+(revenue-(revenue*0.1)));
            revenue=(revenue-(revenue*0.1));

        }
        System.out.println("Revenue: "+revenue);
        System.out.printf("Revenue: %.3f",revenue);







    }
}
