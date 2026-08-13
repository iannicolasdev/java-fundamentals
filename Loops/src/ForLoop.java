import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of columns: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of stars: ");
        int stars = scanner.nextInt();


        for (int i = 0; i < rows; i++) {
            System.out.printf("%d - ", i + 1);

            for(int j = 0; j < stars; j++) {
                System.out.print("* ");

            }
            System.out.printf("%n");
        }

    }
}
