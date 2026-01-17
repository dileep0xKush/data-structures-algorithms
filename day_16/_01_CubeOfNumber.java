package day_16;

import java.util.Scanner;

public class _01_CubeOfNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter num");

        int num = scanner.nextInt();

        int result = num * num * num;

        System.out.println("Cube of the number = " + result);

        scanner.close();

    }
}
