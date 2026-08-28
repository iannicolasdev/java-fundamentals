public class Developer extends User implements Developable {

    public Developer(int id, String name) {
        super(id, name);
    }

    @Override
    public void introduce() {
        System.out.printf("Welcome Developer %s! %n", getName());
        System.out.printf("Developer ID: %d. %n", getId());
    }

    @Override
    public void develop() {
        System.out.println(getName() +" developing...");
    }
}
