package execption_finally;

public class FinallyAlwaysExecutes {
    public static void main(String[] args) {
        try {
            int result = 1/0;
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception" + e.getMessage());
        }
        System.out.println("program continues even without a finally block ");
        System.out.println("adding 1 to 3 : gi"+(1+3));
        System.out.println("program finished and not terminated");
    }

}
