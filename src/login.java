public class login {
    // username must be entered something must be entered
    // if username and password are correct say something
    // if they enter the wrong thing 3 times then it exits
    void main() {
        IO.println("Login App: ");
        String Uname = "";
        String Pass = "";
        byte attempts = 3;
        for (byte i = 3; i > 0; i--) {
            IO.println("Enter Username: ");
            Uname = IO.readln();
            IO.println("Enter Password: ");
            Pass = IO.readln();
            if (Uname.equals("admin") && Pass.equals("admin")) {
                IO.println("Login Successful");
                break;
            } else  {
                IO.println("Access Denied");
            }
        }
    }
}
