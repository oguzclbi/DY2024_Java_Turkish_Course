package day08_selection_statements_nested_if;

public class J01_EligibleToVoteInTurkey {
    public static void main(String[] args) {

        //determination of nationality
        String citizenship = "Turkey";
        //age determination
        int age = 5;

        //check turkish citizenship
        if (citizenship == "Turkey") {

            //Is the age greater than or equal to 18?
            if (age >= 18) {
                //you can vote
                System.out.println("Oy kullanabilirsin");

                //If the age is not greater than or equal to 18
            } else {
                //Write that you cannot vote due to your age.
                System.out.println("Yaş dolayısıyla oy kullanamazsın");

            }
            //If not a Turkish citizen
        } else {
            //Write that you cannot vote due to citizenship.
            System.out.println("Vatandaşlık dolayısıyla oy kullanamazsın");
        }


    }
}
