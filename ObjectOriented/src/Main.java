public class Main {
    public static void main(String[] args) {

        User[] users = {
                new Admin(123, "Ian"),
                new Developer(456, "Linus Torvalds"),
                new Developer(789, "Alan Turing")
        };

        for(User user : users) {
            user.introduce();
            System.out.println();
        }
    }
}