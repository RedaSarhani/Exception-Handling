package throws_keyword.checked_and_runtime;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//Expaination:

/***
 * The main method calls riskyMethod().
 * Since riskyMethod() declares that it throws a FileNotFoundException,
 * the compiler forces main to either handle it (try-catch)
 * or also declare throws FileNotFoundException in the main function.
 */
// If you remove the try-catch and call riskyMethod(); directly, you’ll get a compile-time error unless you declare:
public class CheckedException {
    public static void main(String[] args){
        try {
            riskyFunction();
        }catch (FileNotFoundException e){
            System.out.println("File not found : "+e.getMessage());
        }
        System.out.println("program continues");
    }
    //  in this case the compiler forces you to add throws FileNotFoundException
    // so you eather handle the exception inside a try-catch or make the function throws the exeption
    public static void riskyFunction() throws FileNotFoundException {
        File file = new File("fileNotExist.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String data = sc.nextLine();
            System.out.println(data);
        }
        //it skips these lines once the exception occurs
        System.out.println("closing file inside the risky method");
        sc.close();
    }
}
