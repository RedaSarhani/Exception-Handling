package throw_Keyword;

import java.util.Scanner;

public class ThrowExample {
    public static void main(String[] args) {
        int age;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = input.nextInt();

        if (age < 18) {
            throw new ArithmeticException("Access denied — you must be at least 18 years old.");
            //The program stops immediately after the throw statement.
            //No code after it runs (unless the exception is caught).
        } else {
            System.out.println("Access granted.");
        }
        System.out.println("welcome to the program");
    }
}

