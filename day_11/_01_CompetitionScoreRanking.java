package day_11;

import java.util.Scanner;

public class _01_CompetitionScoreRanking {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter price1");

        int price1 = scanner.nextInt();

        System.out.println("Enter price2");

        int price2 = scanner.nextInt();

        if (price1 < price2) {
            System.out.println("Item 1 is cheaper");
        } else if (price2 < price1) {
            System.out.println("Item 2 is cheaper");
        } else {
            System.out.println("Both items have the same price");

        }

    }
}