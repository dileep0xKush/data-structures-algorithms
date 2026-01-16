package day_15;

import java.util.Scanner;

public class _01_SquareOfNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number Value");

        int num = scanner.nextInt();

        int result = num * num;

        System.out.println(result);

        scanner.close();

    }

}
