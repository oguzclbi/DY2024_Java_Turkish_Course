package java_bootcamp.part_1;

public class J03_Immutable {
    public static void main(String[] args) {
                  //0123
        String str="Elif";
        String word = str.substring(0, 2);

        System.out.println(word); //El
        System.out.println(str); //Elif

        str=str.substring(0,3);

        System.out.println(str);


    }
}
