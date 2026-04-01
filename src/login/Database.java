package login;

import java.util.ArrayList;

public class Database {
    private ArrayList<User> users = new ArrayList<User>();

    public Database() {
        users.add(new User("admin", "admin"));
    }
}
