import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take age as input from the user
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // ─── Method 1: Using ternary operator ───
        // Ternary syntax: (condition) ? value_if_true : value_if_false
        String result = (age >= 18) ? "You can vote!" : "You cannot vote!";
        System.out.println("\n--- Using Ternary Operator ---");
        System.out.println(result);

        // ─── Method 2: Using if-else ───
        System.out.println("\n--- Using If-Else ---");
        if (age >= 18) {
            // Runs if age is 18 or more
            System.out.println("You can vote!");
        } else {
            // Runs if age is less than 18
            System.out.println("You cannot vote!");
        }

        sc.close();
    }
}
