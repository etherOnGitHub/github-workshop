public class methods {
    void main() {
        print(add(20,2323));
    }
    // func
    private int add(int a, int b) {
        return a+b;
    }
    private double add(double a, double b) {
        return a+b;
    }
    // procedure
    private void print(int a) {
        IO.println(a);
    }

    /*
    each method creates a stack frame, the vars in a method are garbage collected when used

    */
}