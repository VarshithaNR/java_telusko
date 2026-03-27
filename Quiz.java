import java.util.Scanner;

public class Quiz{

    public static void main(String[] args){
        String[] questions = {
            "what is the main funtion of a computer?",
            "what is the full form of CPU?",
            "what is the full form of RAM?",
            "what is the full form of ROM?"
        };

        String[][] options = {
            {"a) to process data", "b) to store data", "c) to display data", "d) to input data"},
            {"a) Central Processing Unit", "b) Computer Processing Unit", "c) Central Performance Unit", "d) Computer Performance Unit"},
            {"a) Random Access Memory", "b) Read Access Memory", "c) Random Access Module", "d) Read Access Module"},
            {"a) Read Only Memory", "b) Random Only Memory", "c) Read Only Module", "d) Random Only Module"}
        };

        int[] answers = {1, 1, 1, 1}; 
        int score = 0;
        int guess;

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Quiz!");
        for(int i=0; i<questions.length; i++){
            System.out.println(questions[i]);
            for(String option : options[i]){
                System.out.println(option);
            }
            System.out.print("Enter your answer (1-4): ");
            guess = sc.nextInt();
            if(guess == answers[i]){
                System.out.println("Correct!");
                score++;
            }
            else{
                System.out.println("Wrong! The correct answer is: " + options[i][answers[i]-1]);
            }
        }

        sc.close();

    }
}