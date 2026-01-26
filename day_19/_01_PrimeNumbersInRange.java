import java.util.Scanner;

public class _01_PrimeNumbersInRange {

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        boolean foundPrime = false;

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                foundPrime = true;
            }
        }

        if (!foundPrime) {
            System.out.println("No prime numbers found");
        }

        sc.close();
    }
}
