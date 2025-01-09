package day00_homeworks.hw12_password;

public class Password {

    private String username;
    private String password;


    public void setUsername(String username) {


        if (this.username == null) {
            System.out.println("*** username set edildi. ***");
            this.username = username;
        }
    }


    public String getUsername(String firstThreeChars) {

        if (this.username.substring(0, 3).equals(firstThreeChars)) {
            return "*** Username: "+this.username;
        }

        return "invalid characters check your letters";
    }

    public void setPassword(String username, String password) {

        if (username.equals(this.username)&&password!=null){
            System.out.println("*** password set edildi. ***");
            this.password = password;
        }
    }

    public String getPassword(String username) {

        if (this.username.equals(username)){
            return "*** Password: "+password;
        }

        return "check your username";
    }

    @Override
    public String toString() {
        return "Password{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
