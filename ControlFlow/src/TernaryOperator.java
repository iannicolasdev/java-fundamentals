import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println(number >= 0 ? "Positive": "Negative");
        System.out.println(number % 2 == 0 ? "Even": "Odd");
    }
}
