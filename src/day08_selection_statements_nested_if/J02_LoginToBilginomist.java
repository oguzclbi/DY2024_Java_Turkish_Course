package day08_selection_statements_nested_if;

public class J02_LoginToBilginomist {
    public static void main(String[] args) {
        String url = "https://bilginomist.com/login";

        String userName = "admin";
        String password = "1234";
        if (url == "https://bilginomist.com/login") {
            if (userName == "admin" && password == "1234") {
                System.out.println("Login to the system successful");
            } else {
                System.out.println("Username or password is incorrect");
            }
        } else {
            System.out.println("Wrong address");
        }


    }
}
