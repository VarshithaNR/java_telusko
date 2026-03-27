import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int  num1;
        int num2;
        char operator;
        double result;
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter first number: ");
        num1 = scanner.nextInt();
        System.out.print("enter second number: ");
        num2 = scanner.nextInt();
        System.out.print("enter operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        switch(operator){
            case '+':
                result = num1 + num2;
                System.out.println("result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("result: " + result);
                break;
            case '/':
                if(num2 != 0){
                    result = (double)num1 / num2;
                    System.out.println("result: " + result);
                } else {
                    System.out.println("error: division by zero");
                }
                break;
            case '%':
                if(num2 != 0){
                    result = num1 % num2;
                    System.out.println("result: " + result);
                } else {
                    System.out.println("error: division by zero");
                }
                break;
            case '^':
                result = Math.pow(num1, num2);
                System.out.println("result: " + result);
                break;
            default:
                System.out.println("invalid operator");
        }
        scanner.close();
    }
}
