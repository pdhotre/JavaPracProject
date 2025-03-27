package practicePgm;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {

        double number;
        String firstName;
        String lastName;
        String name;
        int age;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        lastName = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Enter a number: ");
        number = scanner.nextDouble();
        System.out.println();

        name = getFullName(firstName, lastName);
        System.out.println("Hello, "+name);
        happyBirthday(name, age);
        double square = square(number);
        System.out.println("The Square of "+number+" is "+square);
        double cube = cube(number);
        System.out.println("The Cube of "+number+" is "+cube);
        boolean isAge = ageCheck(age);
        if(isAge){
            System.out.println("You may sign up!");
        }
        else {
            System.out.println("You must be 18+ to sign up");
        }
    }

    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s\n",name);
        System.out.printf("You are %d years old\n", age);
        System.out.println("Happy Birthday to you!");
        System.out.println();
    }

    static double square(double number){
        return number * number;
    }

    static double cube(double number){
        return number * number * number;
    }

    static String getFullName(String firstname, String lastname){
        return firstname + " " +lastname;
    }

    static boolean ageCheck(int age){
        return age >= 18;
    }
}
