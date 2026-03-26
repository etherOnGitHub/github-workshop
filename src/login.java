public class login {
    // username must be entered something must be entered
    // if username and password are correct say something
    // if they enter the wrong thing 3 times then it exits
    void main() {
        IO.println("Login App: ");
        String Uname = "";
        String Pass = "";
        byte attempt = 3;
//        for (byte i = 3; i > 0; i--) {
//            IO.println("Enter Username: ");
//            Uname = IO.readln();
//            IO.println("Enter Password: ");
//            Pass = IO.readln();
//            if (Uname.equals("admin") && Pass.equals("admin")) {
//                IO.println("Login Successful");
//                return;
//            } else  {
//                IO.println("Access Denied");
//            }
//        }
        while (attempt > 0) {
            do {
                IO.println("Type your username and password: ");
                IO.println("Username: ");
                Uname = IO.readln();
                IO.println("Password: ");
                Pass = IO.readln();
            } while ((Uname.isEmpty() || Pass.isEmpty()));
            if (Uname.equals("admin") && Pass.equals("admin")) {
                IO.println("Welcome Admin");
                break;
            } else {
                attempt--;
                IO.println("Denied.");
            }


        }
        if (attempt == 0) {
            IO.println("Account Locked");
        }
    }
}

