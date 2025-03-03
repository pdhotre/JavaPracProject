import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";

        while (name.isEmpty()){
            System.out.print("Enter the name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello "+name);
        scanner.close();
    }
}
