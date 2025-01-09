package day25_string_part_4;

public class J02_IsBlank_IsEmpty {
    public static void main(String[] args) {

        String result=" ";

        System.out.println("result.length() = " + result.length());
        //isBlank() değer olarak bakar
        System.out.println("result.isBlank() = " + result.isBlank()); //String boş mu?==> True
        //isEmpty() uzunluğa bakar
        System.out.println("result.isEmpty() = " + result.isEmpty()); //String boş mu?==> False



        String password="         "; //geçerli olamayan bir parola

        //eğer boş ise geçerli değil
        if (password.isBlank()){
            System.out.println("Geçersiz");
        }else {
            System.out.println("Geçerli");
        }


    }
}
