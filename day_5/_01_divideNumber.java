package day_5;

import java.util.Scanner;

public class _01_divideNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.err.println("Enter total Note books");

        int totalNotebooks = scanner.nextInt();

        System.err.println("Enter students");

        int students = scanner.nextInt();

        int notebooksPerStudent = totalNotebooks / students;

        System.err.println("result = " + notebooksPerStudent);

    }
}
