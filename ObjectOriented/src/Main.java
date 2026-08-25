public class Main {
    public static void main(String[] args) {

        // Object
        User user1 = new User("Ian", 21, 1.75F, 70.0F);
        User user2 = new User("Evy", 20, 1.60F, 60.0F);

        System.out.printf("%s and ", user1.getName());
        System.out.printf("%s!", user2.getName());

        System.out.println();

        user1.setAge(22);
        user2.setAge(21);

        user1.weight = 80.0F;
        user2.height = 1.65F;

        user1.introduce();
        System.out.println();
        user2.introduce();
    }
}