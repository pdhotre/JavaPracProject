package javaCourse;

import java.util.Scanner;

public class PhoneBillCalculator {
    public static void main(String[] args) {
        // input plan fee and number of overage minutes
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base cost of the plan: ");
        double baseCost = scanner.nextDouble();
        System.out.print("Enter overage minutes: ");
        double overageMinutes = scanner.nextDouble();
        scanner.close();

        double overage = calculateOverages(overageMinutes);
        double tax = calculateTax(baseCost);
        calculatePhoneBill(baseCost, overage, tax);
    }

    public static double calculateOverages(double extraMinutes){
        double rate = 0.25;
        return extraMinutes * rate;
    }

    public static double calculateTax(double subtotal){
        double rate = 0.15;
        return subtotal * rate;
    }

    public static void calculatePhoneBill(double baseCost, double overage, double tax){
        double total = baseCost + overage + tax;

        System.out.println("Phone Bill Statement");
        System.out.printf("Plan : ₹%.2f\n",baseCost);
        System.out.printf("Overage : ₹%.2f\n",overage);
        System.out.printf("Tax : ₹%.2f\n",tax);
        System.out.printf("Total : ₹%.2f\n",total);
    }
}
