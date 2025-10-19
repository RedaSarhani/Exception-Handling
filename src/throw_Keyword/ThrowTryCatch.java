package throw_Keyword;

import java.util.Scanner;

public class ThrowTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your age: ");
        int age = sc.nextInt();
        try {
            checkAge(age);
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getMessage());
        }
        System.out.println("program continues");
    }

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not old enough!");
        } else {
            System.out.println("Welcome!");
        }
    }
}
