package day_20;

import java.util.Scanner;

public class _01_CompositeNumberDetection {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number:");

        int num = scanner.nextInt();

        if (isComposite(num)) {
            System.out.println("Composite");
        } else {
            System.out.println("Not Composite");
        }
    }

    private static boolean isComposite(int n) {
        if (n <= 1) {
            return false; // 1 and below are not composite
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return true; // Found a divisor → composite
            }
        }
        return false; // Prime number
    }
}