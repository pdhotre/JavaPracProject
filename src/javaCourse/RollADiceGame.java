package javaCourse;

import java.util.Random;

public class RollADiceGame {

    public static void main(String[] args) {
//     The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.
//     Roll the die for the user (generate a Random number between 1 – 6) and advance the user that number of spaces on the game board. Here’s the code to do this ((import is java.util.Random):
        int maxRolls = 5;
        int lastSpace = 20;
        int currentSpace = 0;
        Random random = new Random();
        int die;
//      After each roll, tell the user which game space they are on and how many more spaces they have to go to win.
//      Repeat this 4 additional times, for 5 rolls in total.
//      However, if the user gets to 20 before 5 rolls, end the game - they’ve won.
//      If they are greater than or less than 20 spaces exactly, they lose.
//      Remember there are only 20 spaces on the board, so a message like “You advanced to space 22” is a bug.
        for(int i=1; i<=maxRolls; i++) {
            die = random.nextInt(6) + 1; // 1
            currentSpace = currentSpace + die;    // 20 - 1 = 19
            System.out.printf("Roll #%d: You've rolled a %d. ",i,die);
            if (currentSpace == lastSpace) {
                System.out.print("You're on space " + currentSpace + ". Congrats, you win!");
                break;
            }
            else if (currentSpace > lastSpace){
                System.out.print("Unfortunately, that takes you past " + lastSpace + " spaces. You lose!");
            }
            else if(i==maxRolls && currentSpace < lastSpace){
                System.out.println("You're on "+currentSpace+".");
                System.out.println("Unfortunately, you didn't make it to all " +
                        lastSpace + " spaces. You lose!");
            }
            else{
                int spacesToGo = lastSpace - currentSpace;
                System.out.print("You are now on space " + currentSpace +
                        " and have " + spacesToGo + " more to go.");
            }

            System.out.println();
        }
    }
}
