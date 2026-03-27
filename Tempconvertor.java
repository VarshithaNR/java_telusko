import java.util.Scanner;
public class Tempconvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temp;
        double newTemp;
        int choice;

        System.out.println("temperature convertion program ");
        System.out.println("1. celsius to fahrenheit");
        System.out.println("2. fahrenheit to celsius");

        System.out.print("enter your choice: ");
        choice = scanner.nextInt();
        switch(choice){
            case 1:
                System.out.print("enter temperature in celsius: ");
                temp = scanner.nextDouble();
                newTemp = (temp * 9/5) + 32;
                System.out.println("temperature in fahrenheit: " + newTemp);
                break;
            case 2:
                System.out.print("enter temperature in fahrenheit: ");
                temp = scanner.nextDouble();
                newTemp = (temp - 32) * 5/9;
                System.out.println("temperature in celsius: " + newTemp);
                break;
            default:
                System.out.println("invalid choice");
        }
        scanner.close();
    }
    
}
