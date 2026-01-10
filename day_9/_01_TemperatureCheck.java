package day_9;

import java.util.Scanner;

public class _01_TemperatureCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter package1");

        int package1 = scanner.nextInt();

        System.out.println("Enter package2");

        int package2 = scanner.nextInt();

        if (package1 > package2) {
            System.out.println("Package 1 is heavier");
        } else {
            System.out.println("Package 2 is heavier");
        }

    }

}