package execption_finally;

import custom.CustomException;

public class FinallyException {
    public static void main(String[] args) {
        try{
            System.out.println("In try block");
            int result = 1/0;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println("cought an exception: "+e.getMessage());
        }finally {
            System.out.println("finally block executed");
        }
    }
}
