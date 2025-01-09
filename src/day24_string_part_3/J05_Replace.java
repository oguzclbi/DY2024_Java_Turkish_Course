package day24_string_part_3;

public class J05_Replace {
    public static void main(String[] args) {

        String str="Cherry Cherry Cherry";

        str = str.replace("Cherry", "Apple"); //A A A

        System.out.println("str = " + str);

        str=str.replaceFirst("Apple","Cherry"); //C A A
        System.out.println("str = " + str);

        str=str.replaceFirst("Apple","Cherry"); //C C A
        System.out.println("str = " + str);


    }
}
