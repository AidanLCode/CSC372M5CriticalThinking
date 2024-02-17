import java.util.Arrays;
import java.util.Scanner;

public class RecursiveCalculator {
    public static void main(String[] args) {
        int[] numbers = new int[5]; //Creates an empty array of integers to store 5 values.
        Scanner scanner = new Scanner(System.in); //Used to take in input numbers.

        for (int i = 0; i < numbers.length; i ++) { // Prompts user for 5 numbers.
            System.out.println("Enter number " + (i + 1) + ": ");
            while(!scanner.hasNextInt()) { // This ensures only ints are recorded
                System.out.println("Please enter a number.");
                scanner.next();
            }
            numbers[i] = scanner.nextInt(); // This records the numbers into the array
        }
        scanner.close(); // Closes the scanner to release resources.

        System.out.println("Your numbers are: " + Arrays.toString(numbers)); // Shows the array.
        System.out.println("The sum of your numbers is: " + sum(numbers, numbers.length));
    }
    public static int sum(int numbers[], int n) { // Takes the array of numbers and int n as the length.
        if (n == 0) {
            return 0; // This is the base case because the length of the array would mean nothing left to add.
        } else {
            return sum(numbers, n -1) + numbers[n-1]; // Recursive call.
        }
    }

}
