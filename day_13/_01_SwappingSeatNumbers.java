package day_13;

import java.util.Scanner;

public class _01_SwappingSeatNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Seat 1 Number");

        int seat1 = scanner.nextInt();

        System.out.println("Enter Seat 2 Number");

        int seat2 = scanner.nextInt();

        int temp1 = seat1;

        seat1 = seat2;

        seat2 = temp1;

        System.out.println(seat1);

        System.out.println(seat2);

        scanner.close();

    }
}
