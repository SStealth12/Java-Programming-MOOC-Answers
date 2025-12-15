
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start, end;
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        System.out.println("From Where? ");
        start=Integer.valueOf(scanner.next());
        System.out.println("To Where? ");
        end=Integer.valueOf(scanner.next());
        
        for(int i=start;i<=end;i++){
            System.out.println(numbers.get(i));
        }
    }
}
