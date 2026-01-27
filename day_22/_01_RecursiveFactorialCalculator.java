package day_22;

import java.util.Scanner;

public class _01_RecursiveFactorialCalculator {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial:");
        int number = scanner.nextInt();

        int factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        } else {
            return n * calculateFactorial(n - 1); // Recursive case
        }
    }
}