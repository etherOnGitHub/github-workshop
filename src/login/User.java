package login;
// create a structure to store user information
public class User {
    private String username;
    private String password;
    // Build a constructor that will set new usernames and passwords
    public User (String username, String password) {
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
}