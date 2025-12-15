
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, ctr = 0, sum = 0;
        double average;

        while (true) {
            number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            } else if (number > 0) {
                sum = sum + number;
                ctr = ctr + 1;
            } else {
                continue;
            }
        }
        if (ctr == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            average = (double)sum / ctr;
            System.out.println(average);
        }
    }
}
