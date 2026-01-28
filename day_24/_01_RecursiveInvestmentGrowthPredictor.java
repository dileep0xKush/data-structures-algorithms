package day_24;

import java.util.Scanner;

public class _01_RecursiveInvestmentGrowthPredictor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print(calculateInvestmentValue(i) + " ");
            
        }

        scanner.close();
    }

    static int calculateInvestmentValue(int n) {

        if (n <= 1) {
        
            return n;
        
        }
        return calculateInvestmentValue(n - 1) + calculateInvestmentValue(n - 2);
    }
}
