package day33_lang_classes;

public class J04_WrapperClassMethods {
    public static void main(String[] args) {

        char ch='A';

        System.out.println(Character.isLowerCase(ch));
        System.out.println(Character.isUpperCase(ch));
        System.out.println(Character.isAlphabetic(ch));
        System.out.println(Character.isDigit(ch));
        System.out.println(Character.isLetter(ch));
        System.out.println(Character.isSpaceChar(ch));
        System.out.println(Character.isLetterOrDigit(ch));
        System.out.println(!Character.isLetterOrDigit(ch));
        System.out.println(Character.isEmoji(ch));
        System.out.println();
        System.out.println("------------------------------");
        System.out.println();

        String str ="2432r5403ı%&//(ERA";

        String name="ADAM";
        name.toCharArray(); //char[] letters={'A','D','A','M'}

        char[] array = str.toCharArray();

        for (char c : array) {
            if (Character.isUpperCase(c)){
                System.out.println(c);
            }
        }






    }
}
