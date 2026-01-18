package day_18;

import java.util.Scanner;

public class _01_PrimeNumberVerification {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num <= 1) {
            System.out.println("Not a prime number");
        } 
        else if (num == 2) {
            System.out.println("Prime number");
        } 
        else if (num % 2 == 0) {
            System.out.println("Not a prime number");
        } 
        else {
            boolean isPrime = true;

            for (int i = 3; i * i <= num; i += 2) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("Prime number");
            } else {
                System.out.println("Not a prime number");
            }
        }

        scanner.close();
    }
}
