import java.util.Scanner;

public class RecursiveSum {
    public static int calculateSum(int[] numbers, int index) {
        // Base case: if we've reached the last index, return the number at that index
        if (index == 4) {
            return numbers[4];
        }
        // Recursive case: add the current number to the sum of the remaining numbers
        return numbers[index] + calculateSum(numbers, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Get the five numbers from the user
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calculate the sum using recursion
        int sum = calculateSum(numbers, 0);

        // Display the result
        System.out.println("The sum of the 5 numbers is: " + sum);
    }
}
