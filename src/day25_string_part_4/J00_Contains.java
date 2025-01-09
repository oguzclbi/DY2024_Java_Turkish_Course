package day25_string_part_4;

public class J00_Contains {
    public static void main(String[] args) {

        String mysentence="Ali ata bak";

        String aranan="ata";

                       //boolean değer döndürür.
        if (mysentence.contains(aranan)) {
            System.out.println("Bulundu");
        }else {
            System.out.println("Bulunamadı");
        }


        int konum=mysentence.indexOf(aranan);

        if (konum>=0){
            System.out.println("Bulundu");
        }else{
            System.out.println("Bulunamadı");
        }






    }
}
