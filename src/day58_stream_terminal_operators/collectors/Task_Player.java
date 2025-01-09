package day58_stream_terminal_operators.collectors;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Player {
    String ad;
    String soyad;
    int yas;
    String takim;

    public Player(String ad, String soyad, int yas, String takim) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.takim = takim;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public int getYas() {
        return yas;
    }

    public String getTakim() {
        return takim;
    }

    @Override
    public String toString() {
        return "Player{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                ", takim='" + takim + '\'' +
                '}';
    }
}


public class Task_Player {
    public static void main(String[] args) {


        List<Player> players = Arrays.asList(
                new Player("Lucas", "Torreira", 29, "GS"),
                new Player("Barış Alper", "Yılmaz", 24, "GS"),
                new Player("Frederico Rodrigues", "Santos", 32, "FB"),
                new Player("Dries", "Mertens", 37, "GS"),
                new Player("Abdülkerim", "Bardakcı", 30, "GS"),
                new Player("Allan", "Saint-Maximin", 28, "FB"),
                new Player("Mauro Emanuel", "Icardi", 32, "GS"),
                new Player("Edin", "Dzeko", 39, "FB"),
                new Player("Kaan", "Ayhan", 30, "GS"),
                new Player("Gabriel", "Sara", 25, "GS"),
                new Player("Jayden", "Oosterwolde", 23, "FB"),
                new Player("Victor", "Nelsson", 26, "GS"),
                new Player("Dusan", "Tadic", 36, "FB"),
                new Player("Sebastian", "Szymanski", 25, "FB"),
                new Player("Fernando", "Muslera", 38, "GS"),
                new Player("Dominik", "Livakovic", 30, "FB"),
                new Player("Çağlar", "Söyüncü", 28, "FB"),
                new Player("Hakim", "Ziyech", 32, "GS"),
                new Player("İsmail", "Yüksek", 26, "FB"),
                new Player("Alexander", "Djiku", 30, "FB"),
                new Player("Davinson", "Sanchez", 28, "GS"),
                new Player("Mert", "Müldür", 25, "FB")


        );


        Map<String, List<Player>> result = players.stream()
                .collect(Collectors.groupingBy(Player::getTakim));


        System.out.println(result);


    }
}
