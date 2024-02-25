
import java.util.Objects;
import java.util.Scanner;

public class Feladat2 {
    static boolean pwdcheck(String pwdinput) {
        String pwd = "h7kloPQc";
        if (Objects.equals(pwdinput, pwd)) {
            return true;

        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.print("Please input your password: ");
            String pwdinput = sc.nextLine();
            if (pwdcheck(pwdinput)) {
                System.out.println("The password is correct you may enter");
                break;
            } else {
                System.out.println("The password is incorrect, you have " + (3 - i) + " tries left");
                if (i == 3) {
                    System.out.println("You have failed the authentication, try again later");
                    break;
                }
            }
        }
    }
}
