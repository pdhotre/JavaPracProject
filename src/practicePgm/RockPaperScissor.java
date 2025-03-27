package practicePgm;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choice = {"rock","paper","scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do {
            System.out.print("Enter your choice (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();
            if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors") ){
                System.out.println("Invalid choice");
                continue;
            }
            computerChoice = choice[random.nextInt(3)];
            System.out.println("Computer choice: "+computerChoice);

            if(playerChoice.equals(computerChoice)){
                System.out.println("It's a tie!");
            }
            else if (playerChoice.equals("rock") && computerChoice.equals("scissors") ||
                        playerChoice.equals("paper") && computerChoice.equals("rock") ||
                        playerChoice.equals("scissors") && computerChoice.equals("paper")) {
                System.out.println("You win!");
            }
            else{
                System.out.println("You lose!");
            }
            System.out.print("Play again (Yes/No): ");
            playAgain = scanner.nextLine().toLowerCase();
        }while (playAgain.equals("yes"));
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
