import java.util.Scanner;

public class BankingProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");
            System.out.println("Enter your choice (1-4): ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> System.out.println("");
            }
        }
    }
}
