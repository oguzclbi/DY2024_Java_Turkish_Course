package day30_array_part_3;

import java.util.Arrays;

public class J00_Split_ToCharArray {
    public static void main(String[] args) {

        String names="Sami, Arif, Onur, Arslan";

        String[] nameArray= names.split(", ");

        System.out.println("Arrays.toString(nameArray) = " + Arrays.toString(nameArray));

        System.out.println("nameArray[1] = " + nameArray[1]);

        for (String eachName : nameArray) {
            System.out.println("eachName = " + eachName.charAt(0));

        }


        String name="Bedia";

        char[] letters=name.toCharArray();
        System.out.println("Arrays.toString(letters) = " + Arrays.toString(letters));

        for (char letter : letters) {
            System.out.println(letter);
        }


        int number=1234;

        String numberOfString=""+number;  //1234

        for (char c : numberOfString.toCharArray()) {

            System.out.println("c = " + c);

        }


    }
}
