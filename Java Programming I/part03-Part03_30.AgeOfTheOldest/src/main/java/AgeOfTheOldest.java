
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int oldest = 0;
        while (true) {
            input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] pieces = input.split(",");
            if (oldest < Integer.valueOf(pieces[1])) {
                oldest = Integer.valueOf(pieces[1]);
            }
        }
        System.out.println("Age of the oldest: " + oldest);

    }
}
