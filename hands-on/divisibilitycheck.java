package loops;
import java.util.Scanner;

public class divisibilitycheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 11 == 0) {
            System.out.println("Divisible");
        } else {
            System.out.println("Not Divisible");
        }
        scanner.close();
    }
    
    }
