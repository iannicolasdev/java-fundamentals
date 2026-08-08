public class PrimitiveTypes {
    public static void main(String[] args) {

        // Integer types
        byte numberOne = 127;
        short numberTwo = 32_767;
        int numberThree = 2_147_483_647;
        long numberFour = 9_223_372_036_854_775_807L;

        // Floating-point types
        float numberFive = 3.4028235E38f;
        double numberSix = 1.7976931348623157E308;

        // Character type
        char characterOne = 'A';
        char characterTwo = 65;
        char characterThree = '\101';
        char characterFour = '\u0041';

        // Boolean type
        boolean conditionOne = true;
        boolean conditionTwo = false;

        System.out.printf("Integer Types:\nByte: %d\nShort: %d\nInt: %d\nLong: %d\n\n", numberOne, numberTwo, numberThree, numberFour);
        System.out.printf("Floating-point types:\nFloat: %e\nDouble: %e\n\n", numberFive, numberSix);
        System.out.printf("Character type:\n'A': %c\nASCII Decimal: %c\nASCII Octal: %c\nUnicode: %c\n\n", characterOne, characterTwo, characterThree, characterFour);
        System.out.printf("Boolean type:\nTrue: %b\nFalse: %b\n\n", conditionOne, conditionTwo);

    }
}