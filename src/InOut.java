import java.util.Scanner;

void main() {
        Scanner sc = new Scanner(System.in);
        int age = -1, height = -1;
        String name = "";
        boolean loop = true;
        while (loop) {
            try {
                IO.println("What is your name? ");
                name = sc.nextLine();
                IO.println("What is your age? ");
                age = sc.nextInt();
                IO.println("What is your height? ");
                sc.nextInt();
                loop = false;
            } catch (Exception e){
                IO.println("Invalid");
                sc.nextLine();
            }
        }
        sc.close();
        IO.println(name + age + height);
    }

