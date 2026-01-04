package day_4;
import java.util.Scanner;
public class _01_multiplyNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.err.println("Enter price");
        int price = scanner.nextInt();
        System.err.println("Enter quantity");
        int quantity = scanner.nextInt();
        int result = price * quantity;
        System.err.println("Result " + result);

    }

}
