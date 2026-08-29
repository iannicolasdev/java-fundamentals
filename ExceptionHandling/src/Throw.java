import java.util.Scanner;

public class Throw {

    public static void checkAge(int age) {

        if (age < 0) {
            throw new IllegalArgumentException("Invalid age.");
        }

        if (age < 18) {
            throw new IllegalArgumentException("User must be 18 or older.");
        }

        System.out.print("Access granted.");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");

        byte age = scanner.nextByte();

        try {
            checkAge(age);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
