import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take a number as input from the user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Store the original number for comparison later
        int original = num;
        // Variable to store the reversed number
        int reversed = 0;

        // Loop to reverse the number digit by digit
        while (num > 0) {
            // Extract the last digit using modulo 10
            int digit = num % 10;
            // Append the digit to the reversed number (shift left by 1 place)
            reversed = reversed * 10 + digit;
            // Remove the last digit from num using integer division by 10
            num = num / 10;
        }

        // If original equals reversed, it's a palindrome
        if (original == reversed) {
            System.out.println(original + " is a PALINDROME number");
        } else {
            System.out.println(original + " is NOT a palindrome number");
        }

        sc.close();
    }
}
