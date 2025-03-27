package practicePgm;

import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {

        // Enhanced Switch - A replacement to many else if statement
        //                  (Java14 feature)

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine();

        switch(day){
            case "Monday","Tuesday","Wednesday","Thursday","Friday" ->
                    System.out.println("It is a weekday 😔");
            case "Saturday", "Sunday" ->
                    System.out.println("It is the weekend 😁");
            default -> System.out.println(day+" is not a day");
        }
    }
}
