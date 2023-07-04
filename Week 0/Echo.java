import java.util.Scanner;

public class Echo {

    public static void main(String[] args) {
        String line;
        Scanner in = new Scanner(System.in);

        System.out.print("Type something: ");
        line = in.nextLine();
        System.out.println("You said: " + line);

        System.out.print("Type something else: ");
        line = in.nextLine();
        System.out.println("You also said: " + line);


        System.out.print("What is your age? ");
        int age = in.nextInt();
        in.nextLine();  // read the newline character the user enters following the integer
        System.out.print("What is your name? ");
        String name = in.nextLine();
        System.out.printf("Hello %s, age %d\n", name, age);
    }
}
