import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
        System.out.print("Array size: " + numbers.size());
        System.out.println();
        System.out.print("Remove: " + numbers.remove(2));
        System.out.println();

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}