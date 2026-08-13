import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        do {
            System.out.println("The number is: " + number);
            number++;

        } while (number <= 10);

    }
}
