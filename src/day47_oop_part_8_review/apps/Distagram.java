package day47_oop_part_8_review.apps;

public class Distagram extends App implements HasVoiceChannel,PostPicture{


    //String name =getClass().getSimpleName();


    public Distagram(String version, String publisher) {
        super(version,"Distagram", "Java Dev 01");
    }

    @Override
    public void download() {
        System.out.println("Download from our web page");
    }

    @Override
    public void hasVoiceChanel() {
        System.out.println("Our app has voice channel");
    }

    @Override
    public void postPicture() {
        System.out.println("Our app is able to post picture");

    }
}
