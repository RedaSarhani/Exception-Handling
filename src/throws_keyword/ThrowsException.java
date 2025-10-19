package throws_keyword;
/***
 * it’s not mandatory to use both throw and throws together.
 * You use throw inside a method or block to actually create and throw an exception object.
 * You add throws in a method signature to warn that the method might throw a certain exception, so whoever calls it should handle it.
 * You only need both throw and throws in the same method when:
 * # You are throwing a checked exception, (the compiler forces you to handle or declare with throws.)
 * # You don’t catch it inside the same method.
 *
 */
public class ThrowsException {
    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }

    static void divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");//custom message => e.getMessage();
        }else
            System.out.println("Result: " + (a / b));
    }
}
