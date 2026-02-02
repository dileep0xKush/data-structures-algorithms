package day_28;

import java.util.Scanner;

public class _01_TransactionDigitCounter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the transaction amount: ");
        int transactionAmount = scanner.nextInt();

        int count = 0;

        if (transactionAmount == 0) {
            count = 1;
        } else {
            while (transactionAmount != 0) {
                count++;
                transactionAmount /= 10;
            }
        }

        System.out.println("Number of digits: " + count);
        scanner.close();
    }
}
