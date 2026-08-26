public class Main {
    public static void main(String[] args) {

        // Object
        User user1 = new Admin(123, "Ian");
        User user2 = new User(987, "Evy");

//        System.out.printf("%s and ", user1.getName());
//        System.out.printf("%s!", user2.getName());

        System.out.println();

//        user1.setAge(22);
//        user2.setAge(21);

        user1.introduce();
        System.out.println();
        user2.introduce();
    }
}