import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExample {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(3);
        numbers.add(15);

        Predicate<Integer> isGreaterThanTen = number -> number > 10;

        Function<Integer, Integer> doubleNumber = number -> number * 2;

        Consumer<Integer> printNumber = number -> System.out.println("Number: " + number);

        Supplier<String> message = () -> "End.";

        numbers.forEach(number -> {
            if (isGreaterThanTen.test(number)) {
                printNumber.accept(doubleNumber.apply(number));
            }
        });

        System.out.println(message.get());
    }
}
