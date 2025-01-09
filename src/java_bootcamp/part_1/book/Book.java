package java_bootcamp.part_1.book;

public class Book {

    private String tittle;
    private String author;
    private int year;

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "tittle='" + tittle + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}
