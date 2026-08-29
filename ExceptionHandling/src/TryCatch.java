import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Enter a index: ");
        int index = scanner.nextInt();

        try {
            System.out.println(numbers[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error: " + e.getMessage());

        }

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        try {
            int result = index / num;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("error: " + e.getMessage());

        }
    }
}