
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number,square;
        
        number=Integer.valueOf(scanner.nextLine());
        square=number*number;
        System.out.println(square);
    }
}
