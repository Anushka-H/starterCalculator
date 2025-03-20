import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char operator;
        double number1, number2, result;

        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("Enter the operator: ");
        operator = keyboardInput.next().charAt(0);

        System.out.println("Enter the number 1: ");
        number1 = keyboardInput.nextDouble();
        System.out.println("Enter the number 2: ");
        number2 = keyboardInput.nextDouble();

        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }

        keyboardInput.close();
    }
}
