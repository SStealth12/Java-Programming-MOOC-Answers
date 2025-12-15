
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);
        int number;
        double ave;
        int sum = 0, ctr = 0;
        int odd = 0, even = 0;

        System.out.println("Give numbers:");

        while (true) {
            number = Integer.valueOf(scanner.nextLine());
            if (number < 0) {
                break;
            }
            if (number % 2 == 0) {
                even++;
            }
            if (number % 2 == 1) {
                odd++;
            }
            sum += number;
            ctr++;
        }
        ave = (double) sum / ctr;

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + ctr);
        System.out.println("Average: " + ave);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
