package day_25;

import java.util.Scanner;

public class _01_InvestmentMilestoneValidator {

    static boolean isPerfectSquare(long num) {
        long root = (long) Math.sqrt(num);
        return root * root == num;
    }

    static boolean isFibonacci(long n) {
        long value = 5 * n * n;
        return isPerfectSquare(value + 4) || isPerfectSquare(value - 4);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        System.out.println(isFibonacci(n) ? "YES" : "NO");

        sc.close();
    }
}
