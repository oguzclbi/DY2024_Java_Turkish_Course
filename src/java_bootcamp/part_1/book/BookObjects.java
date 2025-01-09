package java_bootcamp.part_1.book;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BookObjects {
    public static void main(String[] args) throws FileNotFoundException {

        // ("user.dir") --> C:\Users\Oğuz ÇELEBİ\IdeaProjects\first-test

        File file=new File(System.getProperty("user.dir")+"/src/java_bootcamp/Books.txt");
        Scanner scanner=new Scanner(file);

        int bookNumber=scanner.nextInt(); //2

        for (int i = 0; i < bookNumber; i++) {

            Book book=new Book();
            book.setTittle(scanner.next());
            book.setAuthor(scanner.next());
            book.setYear(scanner.nextInt());
            System.out.println(book);

        }








    }
}
