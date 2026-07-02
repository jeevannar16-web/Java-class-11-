import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take two numbers as input from the user
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        // Perform and display all arithmetic operations
        double sum = a + b;       // Addition
        double sub = a - b;       // Subtraction
        double mul = a * b;       // Multiplication
        double div = a / b;       // Division

        // Display all results
        System.out.println("\n--- Results ---");
        System.out.println("Addition:       " + a + " + " + b + " = " + sum);
        System.out.println("Subtraction:    " + a + " - " + b + " = " + sub);
        System.out.println("Multiplication: " + a + " * " + b + " = " + mul);
        System.out.println("Division:       " + a + " / " + b + " = " + div);

        sc.close();
    }
}
