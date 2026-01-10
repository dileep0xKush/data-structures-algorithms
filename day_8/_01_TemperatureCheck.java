import java.util.Scanner;

public class _01_TemperatureCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature");

        int temperature = scanner.nextInt();

        if (temperature > 0) {

            System.out.println("Positive");

        } else if (temperature < 0) {

            System.out.println("Negative");

        } else {

            System.out.println("Zero");
        }
        scanner.close();
    }
}