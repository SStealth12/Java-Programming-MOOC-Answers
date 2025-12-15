
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first,second,i;
        int sum=0;
        
        System.out.println("First number? ");
        first=Integer.valueOf(scanner.nextLine());
        System.out.println("Second number? ");
        second=Integer.valueOf(scanner.nextLine());
        
        for(i=first;i<=second;i++){
            sum+=i;
        }
        System.out.println("The sum is "+sum);
    }
}
