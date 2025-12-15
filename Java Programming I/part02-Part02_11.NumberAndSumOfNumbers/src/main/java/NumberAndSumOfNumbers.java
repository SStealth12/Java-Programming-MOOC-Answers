
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, counter=0, sum=0;
        
        while(true){
            System.out.println("Give a number:");
            number=Integer.valueOf(scanner.nextLine());
            
            if(number==0){
                break;
            }
            counter=counter+1;
            sum=sum+number;
        }
        System.out.println("Number of numbers: "+counter);
        System.out.println("Sum of the numbers: "+sum);
    }
}
