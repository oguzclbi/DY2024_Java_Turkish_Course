package day31_array_part_4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class J00_RotateLeft {

    /*

    Task 1    : Write a program that accepts an array and prints an array with the elements "rotated left"

        int[] x = {1,2,3};           // = > [2,3,1]

        x[0]=x[1];
        x[1]=x[2]

        int[] y = {17,12,10,8};      // = > [12,10,8,17]
        int[] a = {7,0,0};           // = > [0,0,7]

    */



    public static void main(String[] args) {

        int[] x={1,2,3};

        //geçicici değişken
        int temp=x[0];
        for (int i = 0; i < x.length-1; i++) {

            x[i]=x[i+1];

        }

        x[x.length-1]=temp;
        System.out.println(Arrays.toString(x));


    }
}
