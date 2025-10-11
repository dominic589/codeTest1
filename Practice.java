
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a number : ");
        double num1 = scanner.nextDouble();

        System.out.println("what operation do you wish to do ");
        char num = scanner.next().charAt(0);

        System.out.println("enter the second number : ");
        double num2 = scanner.nextDouble();

        if (num == '/') {
            if (num2 == 0) {
                System.out.println("sysntax error");
            } else {
                System.out.println(num1 / num2);
            }
            System.out.println(num1 / num2);
        } else if (num == '*') {
            System.out.println(num1 * num2);
        } else if (num == '+') {
            System.out.println(num1 + num2);
        } else if (num == '-') {
            System.out.println(num1 - num2);
        }

        scanner.close();

    }
}
