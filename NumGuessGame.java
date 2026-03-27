import java.util.Random;
import java.util.Scanner;
public class NumGuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();

        int num = r.nextInt() ;
        int max = 100;
        int min = 1;
        int guess;
        int attempts = 0;

        do{
            System.out.print("guess a number between 1 and 100: ");
            System.out.println("guess the number between " + min + " and " + max);
            guess = scanner.nextInt();
            attempts++;

            if(guess < num){
                System.out.println("too low");
            } else if(guess > num){
                System.out.println("too high");
            } else {
                System.out.println("correct!");
            }
        } while(guess != num);

        System.out.println("Number of attempts: " + attempts);
        scanner.close();
    }
}
