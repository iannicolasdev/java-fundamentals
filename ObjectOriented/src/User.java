public class User {

   // Attribute
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    // Constructor
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method
    public void introduce() {
        System.out.printf("Welcome User %s! %n", name);
        System.out.printf("User ID: %d. %n", id);
    }
}