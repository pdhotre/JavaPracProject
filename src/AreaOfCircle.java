import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        //circumference = 2 * Math.PI * radius;
        //area = Math.PI * Math.pow(radius, 2);
        //volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)

        Scanner scanner = new Scanner(System.in);
        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("Circumference of circle: %.1fcm\n",circumference);
        System.out.printf("Area of circle: %.1fcm\u00B2\n",area);
        System.out.printf("Volume of circle: %.1fcm\u00B3\n",volume);

        scanner.close();
    }
}
