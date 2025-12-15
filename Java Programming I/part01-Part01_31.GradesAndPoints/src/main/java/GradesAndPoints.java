
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int points;
        String remark;

        System.out.println("Give points [0-100]:");
        points = Integer.valueOf(scan.nextLine());

        if (points < 0) {
            remark = "impossible";
        } else if (points >= 0 && points <= 49) {
            remark = "failed";
        } else if (points >= 50 && points <= 59) {
            remark = "1";
        } else if (points >= 60 && points <= 69) {
            remark = "2";
        } else if (points >= 70 && points <= 79) {
            remark = "3";
        } else if (points >= 80 && points <= 89) {
            remark = "4";
        } else if (points >= 90 && points <= 100) {
            remark = "5";
        } else {
            remark = "incredible!";
        }

        System.out.println("Grade: " + remark);
    }
}
