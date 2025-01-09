package day26_string_examples;

public class J04_FindIndexOfWordInSentence {
    public static void main(String[] args) {
        String str1 = "First, solve the problem. Then, write the code.";

        String str2 = "solve";

        findIndexOfWordInSentence(str1, str2);


    }

    public static void findIndexOfWordInSentence(String sentence, String word) {

        //if (sentence.indexOf(word) >= 0) {
        if (sentence.contains(word)){
            System.out.println("Word index: " + sentence.indexOf(word));
        } else {
            System.out.println("Not Found");
        }


    }
}
