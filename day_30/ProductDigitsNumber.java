package day_30;

import java.util.Scanner;

public class ProductDigitsNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");

        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println(0);
            return;
        }

        int product = 1;

        while (n > 0) {
            int digit = n % 10;
            product *= digit;
            n = n / 10;
        }

        System.out.println(product);
    }
}
