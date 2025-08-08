package models;

public class User {

    private int user_id;
    private String username;
    private String password;
    private String email;
    private String birthdate;

    public User(int user_id, String username, String password, String email, String birthdate) {
        this.user_id = user_id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.birthdate = birthdate;
    }

    public int getuser_id() {
        return user_id;
    }

    public String getusername() {
        return username;
    }

    public String getpassword() {
        return password;
    }

    public String getemail() {
        return email;
    }

    public String getbirthdate() {
        return birthdate;
    }
}
