package day47_oop_part_8_review.apps;

public class Discord extends App implements HasVoiceChannel {


    public Discord(String version) {
        super(version, "Discord", "ABC LTD ŞTI");
    }

    @Override
    public void download() {
        System.out.println("Download from browser");
    }

    @Override
    public void hasVoiceChanel() {

        System.out.println("Discord has voice channel");

    }


}
