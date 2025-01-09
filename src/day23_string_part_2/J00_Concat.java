package day23_string_part_2;

public class J00_Concat {
    public static void main(String[] args) {


        String firstName = "Sami";
        String lastName="Mutlu";
        String fullName=firstName+" "+lastName;
        System.out.println("fullName = " + fullName);

        String fullName2=firstName.concat(" "+lastName);
        System.out.println("fullName2 = " + fullName2);

        String food1="Kiraz";
        String food2="Elma";
        String food3="Nektar";

        String fruit=food1.concat(food2).concat(food3);
        System.out.println("fruit = " + fruit);


    }
}
