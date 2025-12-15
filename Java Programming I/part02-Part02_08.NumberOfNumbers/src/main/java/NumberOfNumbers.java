
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, ctr = 0;

        while (true) {
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());

            if (number != 0) {
                ctr = ctr + 1;
            } else {
                break;
            }
        }
        System.out.println("Number of numbers: "+ctr);
    }
}
