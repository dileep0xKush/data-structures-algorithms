import java.util.Scanner;

public class subtract {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.err.println("Enter salary");
        int salary = scanner.nextInt();
        System.err.println("Enter Montly Expenses");
        int expenses = scanner.nextInt();

        int result = salary - expenses;

        System.err.println("Remaining money after expenses " + result);

    }

}
