public class ArraysBasics {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.printf("%n");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        for (int number: numbers) {
            System.out.print(number + " ");
        }

        System.out.printf("%nFirst element: %d%nLast element: %d%nArray length: %d", numbers[0], numbers[4], numbers.length);
    }
}