import java.util.Scanner;

public class Throws {

    public static void findUser(int[] usersID, int id)
            throws IllegalArgumentException {

        boolean user = false;

        for (int userID : usersID) {
            if (id == userID) {
                user = true;
                break;
            }
        }

        if (user) {
            System.out.println("User found!");
        } else {
            throw new IllegalArgumentException("User not found!");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a user id: ");
        int id = scanner.nextInt();

        int[] usersId =  {1, 2, 3, 4, 5, 6, 7};

        try {
            findUser(usersId, id);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
