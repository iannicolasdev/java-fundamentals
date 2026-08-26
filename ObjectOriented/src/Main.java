public class Main {
    public static void main(String[] args) {

        // Object
        User user1 = new Admin(123, "Ian");
        User user2 = new User(987, "Evy");

        System.out.println();

        user1.introduce();
        System.out.println();
        user2.introduce();

        System.out.println();

        user1.setName("Nicolas");
        user1.introduce();
    }
}