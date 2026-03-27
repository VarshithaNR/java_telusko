import java.util.Scanner;
public class Weightconverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight;
        double newWeight;
        int choice;

        System.out.println("weight convertion program ");
        System.out.println("1. kg to pound");
        System.out.println("2. pound to kg");

        System.out.print("enter your choice: ");
        choice = scanner.nextInt();
        switch(choice){
            case 1:
                System.out.print("enter weight in kg: ");
                weight = scanner.nextDouble();
                newWeight = weight * 2.20462;
                System.out.println("weight in pound: " + newWeight);
                break;
            case 2:
                System.out.print("enter weight in pound: ");
                weight = scanner.nextDouble();
                newWeight = weight / 2.20462;
                System.out.println("weight in kg: " + newWeight);
                break;
            default:
                System.out.println("invalid choice");
        }
        scanner.close();
    }
}
