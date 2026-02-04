package day_29;

import java.util.Scanner;

public class _01_TransactionDigitSumAnalyzer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the transaction amount: ");
        int transactionAmount = scanner.nextInt();

        int sum = 0;

        if (transactionAmount == 0) {
            sum = 0;
        } else {
            while (transactionAmount != 0) {
                sum += transactionAmount % 10;
                transactionAmount /= 10;
            }
        }

        System.out.println("Sum of digits: " + sum);
        scanner.close();
    }
}