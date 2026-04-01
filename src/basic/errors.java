void main() {
/*
Checked basic.errors
FileNotFound, IOException
unchecked basic.errors
NullPointer, Arithmetic
*/

    //Risk code goes in try catch
    try {
        IO.println("Welcome to Java Programming System");
    } catch (Exception e) {
        IO.println("Please enter a valid choice");
    }
}