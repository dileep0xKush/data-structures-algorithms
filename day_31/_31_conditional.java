package day_31;

import java.util.Scanner;

public class _31_conditional {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");

        int n = scanner.nextInt();

        if (n > 0) {
            System.out.println("Positive");
        } else if (n < 0) {
            System.out.println("Negative");
        } else if (n % 2 == 0) {
            System.out.println("Weird");
        } else if (n % 2 != 0 && n > 20) {
            System.out.println("Not Weird");
        } else if (n >= 2 && n <= 5) {
            System.out.println("Weird");
        } else if (n >= 6 && n <= 20) {
            System.out.println("Weird");
        } else {
            System.out.println("Zero");
        }
    }
}