package day31_array_part_4;

public class J02_MultipleWords {
/*
Task 3 :    Write a program that accepts string and prints multiple words in the string

        "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer"

        output : wooden spoons
                 trash can
                 dish washer
 */
public static void main(String[] args) {

    String words="knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
    String [] wordArray=words.split(", ");

    for (String each : wordArray) {

        /*
        *** Yöntem 1 ***
        if (each.contains(" ")){
            System.out.println(each);
        }
        */

        // *** Yöntem 2 ***
        if (each.split(" ").length>1){
            System.out.println(each);
        }



    }





}


}
