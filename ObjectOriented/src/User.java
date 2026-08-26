public class User {

   // Attribute
    protected int id;
    protected String name;

//    public String getName() {
//        return name;
//    }

//    public void setAge(int age) {
//        this.age = age;
//    }

    // Constructor
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method
    public void introduce() {
        System.out.printf("Welcome User %s! %n", name);
//        System.out.printf("My age is %d. %n", age);
    }
}