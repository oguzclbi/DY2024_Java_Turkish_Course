package day26_string_examples;

public class J06_CountWord {
    public static void main(String[] args) {

        String sentence = "In the world of coding, practice, Practice, and more practice is the path to mastery.";
        String word = "practice";
        sentence=sentence.toLowerCase();
        word=word.toLowerCase();
        int counter=0;

        /*

        //Contains ve replaceFirst metodu ile
        while (sentence.contains(word)){
            sentence=sentence.replaceFirst(word,"");
            counter++;
        }

        */


        /*
        //Substring metodu ile
        for (int i = 0; i < sentence.length()-word.length(); i++) {
            String aralik = sentence.substring(i, i + word.length());
            if (aralik.equals(word)){
                counter++;
            }

        }
        */

        //indexOf Metodu ile
        for (int i = 0; i < sentence.length()-word.length(); i++) {

            if (sentence.indexOf(word,i)>=0){
                System.out.println(sentence.indexOf(word,i));

                counter++;
                i=sentence.indexOf(word,i)+word.length();

            }


        }



        System.out.println("counter = " + counter);


    }
}
