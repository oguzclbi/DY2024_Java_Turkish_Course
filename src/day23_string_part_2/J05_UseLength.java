package day23_string_part_2;

public class J05_UseLength {
    public static void main(String[] args) {

        //kelimedeki karakter sayısınca kelimeyi tekrarla

        String word = "Muhsin";
        int length = word.length();
        for (int i = 0; i < length; i++) {
            System.out.println(word);
        }


    }
}
