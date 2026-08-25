public class User {

   // Attribute
    private String name;
    private int age;
    float height;
    float weight;

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Constructor
    User(String name, int age, float height, float weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    // Method
    void introduce() {
        System.out.printf("Hello, my name is %s. %n", name);
        System.out.printf("My age is %d. %n", age);
        System.out.printf("My height is %.2f. %n", height);
        System.out.printf("My weight is %.2f. %n", weight);
    }
}