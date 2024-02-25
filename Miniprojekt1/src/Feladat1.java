import java.util.Scanner;

public class Feladat1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Input a number(1-10): ");
        num = sc.nextInt();
        if (num <= 10 && num >= 1){
            for (int i = 1; i <= 10; i++){
                System.out.println(num + "*" + i + "=" + num*i);
            }
        }
        else{
            throw new ArithmeticException("The number isn't between 1 and 10!");
        }
    }
}
