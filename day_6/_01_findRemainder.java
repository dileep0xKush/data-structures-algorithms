package day_6;

import java.util.Scanner;

public class _01_findRemainder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.err.println("Enter totalCandies");
        int totalCandies = scanner.nextInt();
        System.err.println("Enter boxCapacity");
        int boxCapacity = scanner.nextInt();

        int leftover = totalCandies % boxCapacity;

        System.err.println("Remainder = " + leftover);

    }
}