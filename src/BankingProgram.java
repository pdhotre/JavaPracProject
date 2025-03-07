import java.util.Scanner;

public class BankingProgram {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 0;
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
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice");
            }
        }
        System.out.println("***************");
        System.out.println("Thank You! have night");
    }

    static void showBalance(double balance){
        System.out.printf("₹%.2f\n", balance);
    }

    static double deposit(){
        double amount;

        System.out.print("Enter the amount to be deposit: ");
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }

    static double withdraw(double balance){
        double amount;

        System.out.print("Enter the amount to be withdraw: ");
        amount = scanner.nextDouble();
        if(balance < amount){
            System.out.print("Insufficient Balance");
            return 0;
        }
        else {
            return amount;
        }
    }
}
