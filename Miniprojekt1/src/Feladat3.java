import java.util.Scanner;

public class Feladat3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first, second, operator;
        operator = 0;
        System.out.print("Enter the first number:");
        first = sc.nextInt();
        System.out.print("Enter the second number:");
        second = sc.nextInt();
        while (operator != 5) {
            System.out.println("Enter 1 for addition.\nEnter 2 for subtraction.\nEnter 3 for multiplication.\nEnter 4 for division.\nEnter 5 for exit.");
            operator = sc.nextInt();
            switch (operator) {
                case 1:
                    System.out.println("Result: " + (first + second));
                    break;
                case 2:
                    System.out.println("Result: " + (first - second));
                    break;
                case 3:
                    System.out.println("Result: " + (first * second));
                    break;
                case 4:
                    if (second == 0) {
                        throw new ArithmeticException("You can't divide by 0");
                    }
                    System.out.println("Result: " + (first / second));
                    break;
            }
        }
    }

}
