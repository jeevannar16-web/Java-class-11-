import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        // Ternary operator
        System.out.println(age >= 18 ? "Can vote" : "Cannot vote");

        // If-else
        if (age >= 18)
            System.out.println("Can vote");
        else
            System.out.println("Cannot vote");

        sc.close();
    }
}
