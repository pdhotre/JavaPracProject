package practicePgm;

import java.util.Scanner;

public class MadLibsGame {

    public static void main(String[] args){

        //MAD LIBS GAME
        String adjective1;
        String noun1;
        String adjective2;
        String adjective3;
        String verb1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an adjective (description) : ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun (animal or person) : ");
        noun1 = scanner.nextLine();
        System.out.print("Enter an adjective (description) : ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb end with -ing (action) : ");
        verb1 = scanner.nextLine();
        System.out.print("Enter an adjective (description) : ");
        adjective3 = scanner.nextLine();

        System.out.println("Today I went to a "+adjective1+" zoo.");
        System.out.println("In a exhibit, I saw a "+noun1+" .");
        System.out.println(noun1+" was "+adjective2+" and "+verb1+"!");
        System.out.println("I am "+adjective3+"!");
    }
}
