import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        float height;

        System.out.println("Hello, what's your name?");
        name = scanner.next();

        System.out.println("What's your age?");
        age = scanner.nextInt();

        System.out.println("What's your height?");
        height = scanner.nextFloat();

        System.out.printf(
                "Name: %s%nAge: %d%nHeight: %.2f%n",
                name, age, height
        );

        scanner.close();
    }
}