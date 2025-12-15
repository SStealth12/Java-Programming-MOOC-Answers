
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, sum=0,i;
        
        System.out.println("Last number? ");
        number=Integer.valueOf(scanner.nextLine());
        
        for(i=0;i<=number;i++){
            sum+=i;
        }
        System.out.println("The sum is "+sum);
    }
}
