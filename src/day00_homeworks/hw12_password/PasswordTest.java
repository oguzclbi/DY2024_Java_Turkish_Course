package day00_homeworks.hw12_password;

public class PasswordTest {
    public static void main(String[] args) {

        Password password=new Password();

        System.out.println(password);

        password.setUsername("AdamJohn");
        System.out.println(password);

        System.out.println("password.getUsername(\"AdamJohn\") = " + password.getUsername("Ada"));


        password.setPassword("AdamJohn","adam123");

        System.out.println(password);

        System.out.println(password.getPassword("AdamJohn"));









    }


}
