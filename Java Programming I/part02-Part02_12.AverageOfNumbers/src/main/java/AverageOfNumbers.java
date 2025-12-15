
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number, sum = 0, ctr = 0;
        double average;
        while (true) {
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            } else {
                sum = sum + number;
                ctr = ctr + 1;

            }
        }
        average = (double) sum / ctr;
        System.out.println("Average of the numbers: " + average);

    }
}
