import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numerator: ");
        double numerator = scanner.nextDouble();

        System.out.print("Enter denominator: ");
        double denominator = scanner.nextDouble();

        do (denominator != 0) {
            double result = numerator / denominator;
            System.out.println("Result: " + result);
        } while {
            System.out.println("Error: Division by zero is not allowed.");
        }
        
        scanner.close();
    }
}
