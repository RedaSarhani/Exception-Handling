package throws_keyword.checked_and_runtime;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StaticCheckedException {
    static File file = new File("fileNotExist.txt");
    static Scanner sc ; // declare but don’t initialize yet

    public static void main(String[] args){
        try {
            riskyFunction();
        }catch (FileNotFoundException e){
            System.out.println("File not found : "+e.getMessage());
        }
        System.out.println("closing file inside the Main Function... ");
        if (sc != null) {
            //Since the file was never opened (and sc was never initialized because the exception happened first),
            //sc is still null.
            //you’ll get a NullPointerException
            sc.close();
        }
        System.out.println("program continues");
    }
    //  in this case the compiler forces you to add throws FileNotFoundException
    // so you eather handle the exception inside a try-catch or make the function throws the exeption
    public static void riskyFunction() throws FileNotFoundException {
        sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String data = sc.nextLine();
            System.out.println(data);
        }
        //it skips these lines once the exception occurs
        System.out.println("closing file inside the risky method");
        sc.close();
    }
}
// Best approach :
/***
 * public static void riskyFunction() {
 *     try (Scanner sc = new Scanner(file)) {
 *         while (sc.hasNextLine()) {
 *             System.out.println(sc.nextLine());
 *         }
 *     } catch (FileNotFoundException e) {
 *         System.out.println("File not found : " + e.getMessage());
 *     }
 * }
 *
 * Automatically closes sc (no need for manual close()),
 * Handles the exception safely,
 * Doesn’t require throws.
 */
