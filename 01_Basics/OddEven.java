import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take a number as input from the user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Use modulo operator (%) to check divisibility by 2
        // If remainder is 0, the number is even; otherwise odd
        if (num % 2 == 0) {
            System.out.println(num + " is EVEN");
        } else {
            System.out.println(num + " is ODD");
        }

        sc.close();
    }
}
