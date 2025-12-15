
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, i;
        int factorial = 1;

        System.out.println("Give a number: ");
        number = Integer.valueOf(scanner.nextLine());

        for (i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);
    }
}
