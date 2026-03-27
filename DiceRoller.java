import java.util.Scanner;
import java.util.Random;

public class DiceRoller {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        int numofDice;
        int total = 0; 

        System.out.print("Enter number of dice to roll: ");
        numofDice = s.nextInt();

        if (numofDice > 0) {

            for (int i = 1; i <= numofDice; i++) {
                int roll = r.nextInt(6) + 1;
                printDie(roll);
                System.out.println("You rolled: " + roll);
                total += roll;
            }

            System.out.println("Total: " + total); 

        } else {
            System.out.println("Number of dice must be greater than 0");
        }

        s.close();
    }

    static void printDie(int roll) {

        String dice = "";

        switch (roll) {
            case 1:
                dice = "+-------+\n"
                     + "|       |\n"
                     + "|   *   |\n"
                     + "|       |\n"
                     + "+-------+";
                break;

            case 2:
                dice = "+-------+\n"
                     + "| *     |\n"
                     + "|       |\n"
                     + "|     * |\n"
                     + "+-------+";
                break;

            case 3:
                dice = "+-------+\n"
                     + "| *     |\n"
                     + "|   *   |\n"
                     + "|     * |\n"
                     + "+-------+";
                break;

            case 4:
                dice = "+-------+\n"
                     + "| *   * |\n"
                     + "|       |\n"
                     + "| *   * |\n"
                     + "+-------+";
                break;

            case 5:
                dice = "+-------+\n"
                     + "| *   * |\n"
                     + "|   *   |\n"
                     + "| *   * |\n"
                     + "+-------+";
                break;

            case 6:
                dice = "+-------+\n"
                     + "| *   * |\n"
                     + "| *   * |\n"
                     + "| *   * |\n"
                     + "+-------+";
                break;

            default:
                System.out.println("Invalid roll");
                return;
        }

        System.out.println(dice);
    }
}