
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean proceed = true;

        while (proceed) {
            input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String pieces[] = input.split(" ");

            for (String piece : pieces) {
                System.out.println(piece);
            }
        }

    }
}
