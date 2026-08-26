public class Admin extends User{

    public Admin(int id, String name) {
        super(id, name);
    }

    @Override
    public void introduce() {
        System.out.printf("Welcome Admin %s! %n", name);
//        System.out.printf("My age is %d. %n", age);
    }
}
