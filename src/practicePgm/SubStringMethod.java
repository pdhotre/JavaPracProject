package practicePgm;

import java.util.Scanner;

public class SubStringMethod {
    public static void main(String[] args) {

        // .substring() - A method used to extract a portion of a string
        //              .substring(start, end)

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter the email: ");
        email = scanner.nextLine();

        if(email.contains("@")){
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@")+1);

            System.out.println("Username: "+username);
            System.out.println("Domain: "+domain);
        }
        else {
            System.out.println("Email must contain @");
        }
    }
}
