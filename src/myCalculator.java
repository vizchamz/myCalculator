import java.util.Scanner;

public class myCalculator {
    public static void main(String[] args) {
        double num1;
        double num2;
        char operator;
        double answer = 0.0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Value: ");
        num1 = input.nextDouble();
        System.out.println("Enter Operator: ");
        operator = input.next().charAt(0);
        System.out.println("Enter Value: ");
        num2 = input.nextDouble();

        switch (operator) {
            case '+':
                answer = num1 + num2;
                break;
            case '-':
                answer = num1 - num2;
                break;
            case '*':
                answer = num1 * num2;
                break;
            case '/':
                answer = num1 / num2;
                break;
            default:
                System.out.println("Enter a Valid Operator");
                break;
        }

        System.out.println("Answer: " + answer);

    }
}
