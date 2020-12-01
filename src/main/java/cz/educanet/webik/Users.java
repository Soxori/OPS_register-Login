package cz.educanet.webik;

public class Users {
    private String FirstName;
    private String LastName;
    private String username;
    private String email;
    private String password;
    public Users(String username, String password, String email, String FirstName, String LastName) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.FirstName = FirstName;
        this.LastName = LastName;
    };


    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

}
