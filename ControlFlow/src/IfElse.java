import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your test score: ");
        int testScore = scanner.nextInt();

        if (testScore >= 6) {
            System.out.println("Congratulations, you passed!");
        } else {
            System.out.println("You failed.");
        }

        scanner.close();
    }
}