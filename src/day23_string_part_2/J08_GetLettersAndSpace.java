package day23_string_part_2;

public class J08_GetLettersAndSpace {
    public static void main(String[] args) {

        String word = "Y+%+^%o^+%^+%u^%+%^ a'^+'r=?+'^+'e^ p^'+'^*/e//r64654f5468///e--c0450t";
        // Verilen stringdeki harfleri ve boşlukları alan ve
        // yeni bir string yapan programı yazınız

        String result = "";

        for (int i = 0; i < word.length(); i++) {

            char each = word.charAt(i);

            if ((each >= 'a' && each <= 'z') || (each >= 'A' && each <= 'Z') || (each == ' ')) {
                result += each;
            }


        }

        System.out.println(result);


    }
}
