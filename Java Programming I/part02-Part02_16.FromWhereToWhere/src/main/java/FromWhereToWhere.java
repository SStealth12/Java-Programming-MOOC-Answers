
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first,second;
        System.out.println("Where to? ");
        first=Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        second=Integer.valueOf(scanner.nextLine());
        
        for(int i=second;i<=first;i++){
            System.out.println(i);
        }
            
        // Write your program here
    }
}
