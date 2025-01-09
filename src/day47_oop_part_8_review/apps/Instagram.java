package day47_oop_part_8_review.apps;

public class Instagram extends App implements PostPicture {


    public Instagram(String version) {
        super(version, "Instagram", "Meta LLC");
    }

    @Override
    public void download() {
        System.out.println("Download from play store");
    }


    @Override
    public void postPicture() {
        System.out.println("You can post your photos form insta");
    }
}
