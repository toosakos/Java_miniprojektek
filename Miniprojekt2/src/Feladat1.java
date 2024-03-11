import java.util.Scanner;
public class Feladat1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.print("First character: " +input.charAt(0));
        System.out.print(", last character: " + input.charAt(input.length()-1));
    }
}
