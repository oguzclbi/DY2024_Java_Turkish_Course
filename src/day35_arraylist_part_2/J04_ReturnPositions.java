package day35_arraylist_part_2;

import java.util.ArrayList;

public class J04_ReturnPositions {
    public static void main(String[] args) {

        String[] array = {"A", "B", "C", "A", "D", "D", "B", "C", "A"};

        ArrayList<Integer> positions = returnpositions(array, "A");

        System.out.println("positions = " + positions);


    }

    private static ArrayList<Integer> returnpositions(String[] array, String aranan) {


        ArrayList<Integer> positions = new ArrayList<>();

        /*
        for (int i = 0; i < array.length; i++) {

            if (array[i].equals(aranan)) {

                positions.add(i + 1);
            }


        }
        */

        int   index=0;

        for (String each : array) {

            if (each.equals(aranan)){
                positions.add(index+1);
            }

            index++;
        }


        return positions;


    }


}
