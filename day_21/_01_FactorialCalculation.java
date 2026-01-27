package day_21;
import java.util.Scanner;
public class _01_FactorialCalculation {
 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial:");
        int number = scanner.nextInt();

        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        scanner.close();
        System.out.println("Factorial of " + number + " is: " + factorial); 

        scanner.close();
    }
}
