public class WhileLoop {
    public static void main(String[] args) {

        int number = 0;

        while (number < 10) {
            System.out.printf("%d ", number);
            number++;
        }

        number = 0;

        System.out.printf("%n");

        while (number < 10) {
            System.out.printf("%d ", number);
            number = number + 2;
        }

        number = 1;

        System.out.printf("%n");

        while (number < 10) {
            System.out.printf("%d ", number);
            number = number + 2;
        }
    }
}