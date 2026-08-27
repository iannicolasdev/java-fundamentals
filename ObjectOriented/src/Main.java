public class Main {
    public static void main(String[] args) {

        User[] users = {
                new Admin(123, "Ian"),
                new User(456, "Linus Torvalds"),
                new User(789, "Alan Turing")
        };

        for(User user : users) {
            user.introduce();
            System.out.println();
        }


    }
}