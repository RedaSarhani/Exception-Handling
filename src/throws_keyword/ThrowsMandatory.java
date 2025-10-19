package throws_keyword;
import java.io.IOException;
/***
 * If you remove the throws IOException from riskyMethod(),
 * you’ll get a compile-time error, because IOException is a checked exception.
 */

public class ThrowsMandatory {

    public static void main(String[] args) {
        try {
            riskyMethod(); // Must handle or declare
        } catch (IOException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
    static void riskyMethod() throws IOException {
        // "throw" actually creates and throws the exception
        throw new IOException("Disk not found!");
    }
}
