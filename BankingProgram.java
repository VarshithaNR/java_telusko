import java.util.Scanner;

public class BankingProgram {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double balance;
        boolean isRunning = true;
        int choice;

        System.out.print("Enter initial balance: ");
        balance = scanner.nextDouble();

        while (isRunning) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    balance += deposit();   
                    break;
                case 2:
                    balance -= withdraw(balance); 
                    break;
                case 3:
                    showBalance(balance);
                    break;
                case 4:
                    isRunning = false;
                    System.out.println("Thank you for using our banking program");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.printf("Current balance: $%.2f%n", balance);
    }

    static double deposit() {
        double amount;
        System.out.print("Enter deposit amount: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Invalid amount");
            return 0;
        } else {
            System.out.println("Deposit successful");
            return amount;
        }
    }

    static double withdraw(double balance) {
        double amount;
        System.out.print("Enter withdraw amount: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Invalid amount");
            return 0;
        } else if (amount > balance) {
            System.out.println("Insufficient funds");
            return 0;
        } else {
            System.out.println("Withdraw successful");
            return amount;
        }
    }
}