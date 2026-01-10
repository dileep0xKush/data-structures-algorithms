package day_10;

import java.util.Scanner;

public class _01_CompetitionScoreRanking {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter score1");
        int score1 = scanner.nextInt();

        System.out.println("Enter score2");
        int score2 = scanner.nextInt();

        System.out.println("Enter score3");
        int score3 = scanner.nextInt();

        if (score1 > score2 && score1 > score3) {
            System.out.println("Student 1 has the highest score");
        } 
        else if (score2 > score1 && score2 > score3) {
            System.out.println("Student 2 has the highest score");
        } 
        else if (score3 > score1 && score3 > score2) {
            System.out.println("Student 3 has the highest score");
        } 
        else {
            System.out.println("Two or more students share the highest score");
        }

        scanner.close();
    }
}
