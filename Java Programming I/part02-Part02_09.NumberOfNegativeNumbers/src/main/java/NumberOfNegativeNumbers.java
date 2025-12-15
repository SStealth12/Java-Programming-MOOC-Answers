
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number,ctr = 0;
        
        while (true){
            System.out.println("Give a number:");
            number=Integer.valueOf(scanner.nextLine());
            
            if(number<0){
                ctr=ctr+1;
            }
            if(number==0){
                break;
            }
        }
        System.out.println("Number of negative numbers: "+ctr);
    }
}
