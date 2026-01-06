package day_7;

import java.util.Scanner;

public class _01_CheckEvenOdd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.err.println("Enter  students");

        int students = scanner.nextInt();

        if (students % 2 == 0) {
            System.err.println("Even");
        } else {
            System.err.println("Odd");
        }
    }

}
