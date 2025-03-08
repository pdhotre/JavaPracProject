import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string to be reversed: ");
        String str = scanner.nextLine();
        StringBuilder reversedString = new StringBuilder("");

        for(int i=str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
            reversedString.append(ch);
        }
        System.out.println(reversedString);
        scanner.close();
    }
}
