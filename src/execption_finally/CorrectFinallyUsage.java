package execption_finally;
import java.io.FileReader;
import java.io.IOException;

public class CorrectFinallyUsage {
    public static void main(String[] args) {
        FileReader file = null;
        try {
            file = new FileReader("file.txt");
        }catch (IOException e){
            System.out.println("Error reading file : "+e.getMessage());
        }finally {
            try {
                if(file != null)
                file.close();
                System.out.println("File closed");
            }catch (IOException e){
                System.out.println("Error closing file : "+e.getMessage());
            }
        }

    }
}
