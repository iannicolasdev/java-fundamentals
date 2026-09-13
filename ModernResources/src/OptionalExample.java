import java.util.Optional;

public class OptionalExample {

    public static Optional<Integer> findNumber(int[] numbers, int number) {
        for (int num : numbers) {
            if (number == num) {
                return Optional.of(num);
            }
        }

        return Optional.empty();
    }

    public static void main(String[] args) {

        int[] numbers = {12, 3, 41, 52, 6, 19, 32, 8};

        Optional<Integer> number = findNumber(numbers, 8);

        System.out.print(number);
    }
}
