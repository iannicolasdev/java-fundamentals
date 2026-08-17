import java.util.Scanner;

public class MethodReturn {

    public static String greet(String name) {
        return "Hello, " + name;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String greetName = greet(scanner.next());

        System.out.print(greetName);
    }
}
