public class User {

    String name;
    int age;
    float height;
    float weight;

    void introduce() {
        System.out.printf("Hello, my name is %s. %n", name);
        System.out.printf("My age is %d. %n", age);
        System.out.printf("My height is %.2f. %n", height);
        System.out.printf("My weight is %.2f. %n", weight);
    }
}