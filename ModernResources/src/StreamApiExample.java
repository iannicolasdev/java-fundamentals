import java.util.ArrayList;

public class StreamApiExample {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Ian");
        names.add("Ana");
        names.add("Evy");
        names.add("Elton");
        names.add("Tony Stark");
        names.add("Bruce Wayne");
        names.add("Clark Kent");

        names.stream()
                .filter(name -> name.length() > 5)
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
