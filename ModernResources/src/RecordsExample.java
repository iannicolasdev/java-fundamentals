import java.util.HashSet;

public class RecordsExample {

    public record Product(int id, String name, float price) {}

    public static void main(String[] args) {

        HashSet<Product> products = new HashSet<>();

        products.add(new Product(1, "Cookie", 8.99F));
        products.add(new Product(2, "Pizza", 18.99F));
        products.add(new Product(3, "Coke", 11.99F));

        for (Product product : products) {
            System.out.println(product);
        }
    }
}
