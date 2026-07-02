import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take three numbers as input from the user
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        // Find the greatest number using nested ternary operator
        // Ternary: (condition) ? value_if_true : value_if_false
        int greatest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

        // Display the greatest number
        System.out.println("Greatest number is: " + greatest);

        // Check if the greatest number is odd or even
        if (greatest % 2 == 0) {
            System.out.println(greatest + " is EVEN");
        } else {
            System.out.println(greatest + " is ODD");
        }

        sc.close();
    }
}
