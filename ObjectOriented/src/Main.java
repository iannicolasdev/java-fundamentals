public class Main {
    public static void main(String[] args) {

        // Object
        User user1 = new User("Ian", 21, 1.75F, 70.0F);
        User user2 = new User("Evy", 20, 1.60F, 60.0F);

        user1.introduce();
        System.out.println();
        user2.introduce();
    }
}