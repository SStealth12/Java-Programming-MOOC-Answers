
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        String longest = "";
        int sum = 0, count = 0;
        double average;
        while (true) {
            input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] pieces = input.split(",");

            if (longest.length() < pieces[0].length()) {
                longest = pieces[0];
            }
            sum += Integer.valueOf(pieces[1]);
            count++;
        }
        average = (double) sum / count;
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + average);

    }
}
