package day_12;

import java.util.Scanner;

public class _01_LowestTemperatureReading {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temp1");

        int temp1 = scanner.nextInt();

        System.out.println("Enter temp2");

        int temp2 = scanner.nextInt();

        System.out.println("Enter temp3");

        int temp3 = scanner.nextInt();

        if (temp1 < temp2 && temp1 < temp3) {

            System.out.println("Morning temperature is the lowest");

        } else if (temp2 < temp1 && temp2 < temp3) {

            System.out.println("Afternoon temperature is the lowest");

        } else if (temp3 < temp1 && temp3 < temp2) {

            System.out.println("Evening temperature is the lowest");

        } else {

            System.out.println("Two or more times share the lowest temperature");
        }
        
        scanner.close();
    }
}
