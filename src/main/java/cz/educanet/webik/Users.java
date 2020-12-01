package cz.educanet.webik;

public class Users {
    private String username;
    private String email;
    private String password;
    public Users(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    };


    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

}
