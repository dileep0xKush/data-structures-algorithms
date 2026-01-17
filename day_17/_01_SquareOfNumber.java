package day_17;

import java.util.Scanner;

public class _01_SquareOfNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter num");

        int num = scanner.nextInt();

        int result = num * num;

        System.out.println("Square of the number = " + result);

        scanner.close();

    }
}
