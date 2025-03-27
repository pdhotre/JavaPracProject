package javaCourse;

import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your favourite season: ");
        String season = scanner.nextLine();
        System.out.print("Enter your favourite whole number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your favourite adjective: ");
        String adjective = scanner.nextLine();
        scanner.close();
        System.out.println("On a "+adjective+" "+season+" day, I drink a minimum of "+number+" cups of coffee");
    }

}
