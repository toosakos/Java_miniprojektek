import java.util.Scanner;
public class Feladat4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n=");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println("*".repeat(i));
        }
    }
}
