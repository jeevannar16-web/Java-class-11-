import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take a number as input from the user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check if the number is positive, negative, or zero
        if (num > 0) {
            // Executes if number is greater than 0
            System.out.println(num + " is POSITIVE");
        } else if (num < 0) {
            // Executes if number is less than 0
            System.out.println(num + " is NEGATIVE");
        } else {
            // Executes if number is exactly 0
            System.out.println(num + " is ZERO");
        }

        sc.close();
    }
}
