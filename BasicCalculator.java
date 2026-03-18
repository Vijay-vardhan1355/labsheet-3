import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        double num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        num1 = sc.nextDouble();

        System.out.println("Enter the second number:");
        num2 = sc.nextDouble();

        System.out.println("Enter the operator (+, -, *, /):");
        char operator = sc.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error! Division by zero is not allowed.");
                    sc.close();
                    return; // Exit the program
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Error! Invalid operator. Please use +, -, *, or /.");
                sc.close();
                return; // Exit the program
        }

        System.out.println("The result is:");
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

        sc.close();
    }
}
