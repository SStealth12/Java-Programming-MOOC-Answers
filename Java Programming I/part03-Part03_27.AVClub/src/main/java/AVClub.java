
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] pieces = input.split(" ");

            for (String piece : pieces) {
                if (piece.contains("av")) {
                    System.out.println(piece);
                } else {
                    continue;
                }
            }
        }

    }
}
