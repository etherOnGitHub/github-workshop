 //     username must be entered something must be entered
 //     if username and password are correct say something
 //     if they enter the wrong thing 3 times then it exits

//     Iteration 1
      /*
    void main() {
        IO.println("Login App: ");
        String Uname;
        String Pass;
        byte attempt = 3;
      for (byte i = 3; i > 0; i--) {
      IO.println("Enter Username: ");
      Uname = IO.readln();
      IO.println("Enter Password: ");
      Pass = IO.readln();
      if (Uname.equals("admin") && Pass.equals("admin")) {
           IO.println("Login Successful");
           return;
      } else  {
           IO.println("Access Denied");
      }
    */

//     Iteration 2
 /*
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

      */

     // Iteration 3

// Use OOP, abstraction
// Use files to output outcomes and consume files to read login.login data
// Use logging

 import login.Database;
 import login.User;

 void main() {
     IO.println("Login time!");
     // call a method for collecting terminal information
     byte attempt = 3;
     while (attempt > 0) {
         do {
             User loginMansInput = CollectUserInput();

         }
     }

        User loginMan = CollectUserInput();
        boolean checked = CheckUserExists(loginMan);
}
// collect IO of user inputs and pass it back to main
public User CollectUserInput() {IO.println("Username: ");
    String username = IO.readln();
    IO.println("Password: ");
    String password = IO.readln();
    return new User(username, password);
}
// check if the user exists
public boolean CheckUserExists(User loginMan) {
    Database db = new Database();
    for (User in db);


    return answer;
}
