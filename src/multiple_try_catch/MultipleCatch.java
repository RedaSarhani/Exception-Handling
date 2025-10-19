package multiple_try_catch;

public class MultipleCatch {
    static int[] array = {1,2,3,4};
    static int index = 6;

    public static void main(String[] args) {
       // invalid index
        try {
            // Trying to access invalid index
            System.out.println("the value of index "+index+ " is "+array[index]);
            int invalidValue = 10/0;// dividing by 0
        }catch(ArrayIndexOutOfBoundsException e) {
            //There is no index 6
            // the size of the array is 4
            System.out.println("!!Error "+e.getMessage());
        }catch(ArithmeticException e) {
            System.out.println("!!Arithmetic Exception "+e.getMessage());
        }
        System.out.println("**********************************");
        System.out.println("Once an exception is thrown, the rest of the code inside the try block is skipped.");
        System.out.println("this line is never executed : int invalidValue = 10/0;");
        System.out.println("Program finished and not terminated after try/catch");
        /// //////
        System.out.println("**********************************");
        System.out.println("now checking all the exceptions :");
        AllExceptionsChecked();
    }

    public static void AllExceptionsChecked() {
        try {
            System.out.println("the value of index " + index + " is " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("!!Error " + e.getMessage());
        }

        try {
            int invalidValue = 10 / 0;// dividing by 0

        } catch (ArithmeticException e) {
            System.out.println("!!Arithmetic Exception " + e.getMessage());
        }
    }
}
