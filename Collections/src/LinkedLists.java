import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();

        numbers.removeFirst();
        numbers.removeLast();

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
