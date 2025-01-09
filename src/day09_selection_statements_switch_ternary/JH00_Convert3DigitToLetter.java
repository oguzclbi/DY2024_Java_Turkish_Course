package day09_selection_statements_switch_ternary;

public class JH00_Convert3DigitToLetter {
    public static void main(String[] args) {

        int num = 9999;
        String resultBirler = "", resultOnlar = "", resultYuzler = "", resultBinler = "";
        int birler = (num % 10);
        int onlar = ((num / 10) % 10);
        int yuzler = ((num / 100))%10;
        int binler= (num/1000);


        switch (birler) {
            case 1 -> {resultBirler = "Bir";}
            case 2 -> {resultBirler = "İki";}
            case 3 -> {resultBirler = "Üç"; }
            case 4 -> {resultBirler = "Dört";}
            case 5 -> {resultBirler = "Beş";}
            case 6 -> {resultBirler = "Altı";}
            case 7 -> {resultBirler = "Yedi";}
            case 8 -> {resultBirler = "Sekiz";}
            case 9 -> {resultBirler = "Dokuz";}

        }
        switch (onlar) {
            case 1 -> {resultOnlar = "On ";}
            case 2 -> {resultOnlar = "Yirmi ";}
            case 3 -> {resultOnlar = "Otuz ";}
            case 4 -> {resultOnlar = "Kırk ";}
            case 5 -> {resultOnlar = "Elli ";}
            case 6 -> {resultOnlar = "Altmış ";}
            case 7 -> {resultOnlar = "Yetmiş ";}
            case 8 -> {resultOnlar = "Seksen ";}
            case 9 -> {resultOnlar = "Doksan ";}
            

        }
        switch (yuzler) {
            case 1 -> {resultYuzler = "Yüz ";}
            case 2 -> {resultYuzler = "İki Yüz ";}
            case 3 -> {resultYuzler = "Üç Yüz ";}
            case 4 -> {resultYuzler = "Dört Yüz ";}
            case 5 -> {resultYuzler = "Beş Yüz ";}
            case 6 -> {resultYuzler = "Altı Yüz ";}
            case 7 -> {resultYuzler = "Yedi Yüz ";}
            case 8 -> {resultYuzler = "Sekiz Yüz ";}
            case 9 -> {resultYuzler = "Dokuz Yüz ";}
            

        }
        switch (binler) {
            case 1 -> {resultBinler= "Bin ";}
            case 2 -> {resultBinler= "İki Bin ";}
            case 3 -> {resultBinler= "Üç Bin ";}
            case 4 -> {resultBinler= "Dört Bin ";}
            case 5 -> {resultBinler= "Beş Bin ";}
            case 6 -> {resultBinler= "Altı Bin ";}
            case 7 -> {resultBinler= "Yedi Bin ";}
            case 8 -> {resultBinler= "Sekiz Bin ";}
            case 9 -> {resultBinler= "Dokuz Bin ";}


        }


        System.out.println(resultBinler + resultYuzler +  resultOnlar + resultBirler);


    }
}
