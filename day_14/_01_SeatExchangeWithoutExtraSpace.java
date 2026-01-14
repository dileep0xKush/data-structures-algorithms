package day_14;

import java.util.Scanner;

public class _01_SeatExchangeWithoutExtraSpace {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Seat");

        int seat1 = scanner.nextInt();

        System.out.println("Enter seat2");

        int seat2 = scanner.nextInt();

        // using XOR Bitwise operators 
        seat1 = seat1 ^ seat2;
        seat2 = seat1 ^ seat2;
        seat1 = seat1 ^ seat2;

        System.out.println("After swapping:");

        System.out.println("Seat 1 = " + seat1);

        System.out.println("Seat 2 = " + seat2);

        scanner.close();

    }

}
