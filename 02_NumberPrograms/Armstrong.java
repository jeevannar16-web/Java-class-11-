import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take a number as input from the user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Store the original number for comparison
        int original = num;
        // Variable to store the sum of cubes of each digit
        int sum = 0;

        // Extract each digit, cube it, and add to sum
        while (num > 0) {
            // Get the last digit
            int digit = num % 10;
            // Add the cube of the digit to sum
            sum = sum + (digit * digit * digit);
            // Remove the last digit
            num = num / 10;
        }

        // If original equals sum, it's an Armstrong number
        if (original == sum) {
            System.out.println(original + " is an ARMSTRONG number");
        } else {
            System.out.println(original + " is NOT an Armstrong number");
        }

        sc.close();
    }
}
