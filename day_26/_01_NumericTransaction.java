package day_26;

import java.util.Scanner;

public class _01_NumericTransaction {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter transaction amount: ");

        int number = scanner.nextInt();

        int temp = number;

        int reversed = 0;

        while (temp > 0) {

            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp = temp / 10;

        }
        System.out.println("Original number: " + number);

        System.out.println("Reversed number: " + reversed);

        scanner.close();
    }
}
