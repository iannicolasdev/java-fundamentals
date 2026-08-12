public class Operators {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // Arithmetic
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Comparison
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);

        // Logical
        boolean x = true;
        boolean y = false;

        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);

        // Assignment
        a += 5;
        System.out.println(a);

        // Ternary
        String result = a > b ? "a is bigger" : "b is bigger";
        System.out.println(result);
    }
}
