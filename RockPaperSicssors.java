import java.util.Scanner;
import java.util.Random;

public class RockPaperSicssors {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain ="yes";

        System.out.println("Welcome to Rock, Paper, Scissors!");
        playerChoice = s.nextLine().toLowerCase();

        if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")){
            System.out.println("Invalid choice! Please choose rock, paper, or scissors.");
            s.close();
            return;
        }

        computerChoice = choices[r.nextInt(choices.length)];
        System.out.println("Computer chose: " + computerChoice);

        if(playerChoice.equals(computerChoice)){
            System.out.println("It's a tie!");
        }
        else if((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                (playerChoice.equals("scissors") && computerChoice.equals("paper"))){
            System.out.println("You win!");
        }
        else{
            System.out.println("Computer wins!");
        }

        System.out.print("Do you want to play again? (yes/no): ");
        playAgain = s.nextLine().toLowerCase();
        if(playAgain.equals("yes")){
            main(args); 
        }
        else{
            System.out.println("Thanks for playing!");
        }

        s.close();
    }
}
