import java.util.Scanner;

public class MethodParameters {

    public static int sumNumbers(int a, int b) {return a + b;}

    public static int subNumbers(int a, int b) {return a - b;}

    public static int multiNumbers(int a, int b) {return a * b;}

    public static int divNumbers(int a, int b) {return a / b;}

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a first number: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter a second number: ");
        int n2 = scanner.nextInt();

        int sumResult = sumNumbers(n1, n2);
        int subtractionResult = subNumbers(n1, n2);
        int multiplicationResult = multiNumbers(n1, n2);
        int divisionResult = divNumbers(n1, n2);

        System.out.printf("Sum: %d%nSubtraction: %d%nMultiplication: %d%nDivision: %d%n", sumResult, subtractionResult, multiplicationResult, divisionResult);
    }
}
