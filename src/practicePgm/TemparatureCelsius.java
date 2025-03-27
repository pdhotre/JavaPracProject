package practicePgm;

import java.util.Scanner;

public class TemparatureCelsius {
    public static void main(String[] args) {

        // Convert to Celsius or Fahrenheit using Ternary Operator

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temparature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit (C or F): ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 9 / 5 : (temp * 9 / 5) + 32;

        System.out.printf("%.1f° %s", newTemp, unit);

        scanner.close();
    }
}
