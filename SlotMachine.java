import java.util.Scanner;
import java.util.Random;
public class SlotMachine {

        static Scanner s = new Scanner(System.in);
        static Random r = new Random();
    public static void main(String[] args){
        //java slot machine

        int balance = 100;
        int bet;
        int payout;
        String[] row;

        System.out.println("Welcome to the Slot Machine!");

        while(balance > 0){
            System.out.println("Your current balance is: " + balance);
            System.out.print("Enter your bet amount: ");
            bet = s.nextInt();

            if(bet > balance){
                System.out.println("Bet amount cannot be greater than your balance. Please try again.");
                continue;
            }
            if(bet <= 0){
                System.out.println("Bet amount must be greater than zero. Please try again.");
                continue;
            }
            else{
                balance -= bet;

            }

            //spin row
            row = spinRow();
            System.out.println("Spinning...");
            printRow(row);

            payout = getPayout(row, bet);
            balance += payout;

            if(payout > 0){
                System.out.println("Congratulations! You won " + payout + "!");
            }
            else{
                System.out.println("Sorry, you lost. Better luck next time!");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = s.next();
            if(!playAgain.equalsIgnoreCase("yes")){
                break;
            }

        }
        //declare variables
        //display welcome machines
        //play if balance > 0
        //enter bet amount
            //verify if bet > balance
            //verify if bet >0
            //subtract bet from balance
        //spin row
        //print row
        //get payout
        //ask to play again
        //display exit maessage

    }

    static String[] spinRow(){
        String[] symbols = {"Cherry", "Lemon", "Orange", "Bell", "Bar"};
        String[] row = new String[3];

        System.out.println(symbols[r.nextInt(symbols.length)]);
        for(int i=0; i<row.length; i++){
            row[i] = symbols[r.nextInt(symbols.length)];
        }
        return row;
    }

    static int getPayout(String[] row, int bet){
        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return bet * 3;
        }
        return 0;
    }

    static void printRow(String[] row){
        for(String symbol : row){
            System.out.print(symbol + " ");
        }
        System.out.println();
    }
    
}
