
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        String name = "";
        int oldest = 0;
        while (true) {
            input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] pieces = input.split(",");
            if (oldest < Integer.valueOf(pieces[1])) {
                oldest = Integer.valueOf(pieces[1]);
                name = pieces[0];
            }
        }
        System.out.println("Name of the oldest: " + name);

    }
}
