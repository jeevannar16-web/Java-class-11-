// Import Scanner class from java.util package to read user input
import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        // Create a Scanner object named 'sc' that reads from System.in (keyboard)
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        // Read a line of text input from the user
        String name = sc.nextLine();

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        // Read an integer input from the user
        int age = sc.nextInt();

        // Display the entered information back to the user
        System.out.println("Hello " + name + ", you are " + age + " years old!");

        // Close the Scanner to prevent resource leak
        sc.close();
    }
}
