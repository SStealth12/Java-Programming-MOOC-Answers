
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username, password;
        String success = "You have successfully logged in!";
        String fail = "Incorrect username or password!";

        boolean pass = false;
        System.out.println("Enter username: ");
        username = scanner.nextLine();
        System.out.println("Enter passowrd: ");
        password = scanner.nextLine();

        if (username.equals("alex")) {
            if (password.equals("sunshine")) {
                pass = true;
            } else {
                pass = false;
            }
        }
        if (username.equals("emma")) {
            if (password.equals("haskell")) {
                pass = true;
            }
        }

        if (pass) {
            System.out.println(success);
        } else {
            System.out.println(fail);
        }
    }
}
