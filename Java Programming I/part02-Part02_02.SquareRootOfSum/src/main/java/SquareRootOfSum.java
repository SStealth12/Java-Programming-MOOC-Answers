
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first, second;
        double sum, root;

        first = Integer.valueOf(scanner.nextLine());
        second = Integer.valueOf(scanner.nextLine());

        sum = (double) first + second;
        root = Math.sqrt(sum);

        System.out.println(root);
    }
}
