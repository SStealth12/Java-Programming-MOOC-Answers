
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first, second;
        // Write your program here.
        System.out.println("Enter the first string:");
        first = scan.nextLine();
        System.out.println("Enter the second string:");
        second = scan.nextLine();
        if (first.equals(second)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
