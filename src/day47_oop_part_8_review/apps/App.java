package day47_oop_part_8_review.apps;

public abstract class App {

    String version;
    String name;
    String publisher;

    public App(String version, String name, String publisher) {
        this.version = version;
        this.name = name;
        this.publisher = publisher;

    }


    public abstract void download();


    @Override
    public String toString() {
        return "App{" +
                "version='" + version + '\'' +
                ", name='" + name + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    

}
