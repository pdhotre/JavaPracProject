import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPgm {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        String[] foods;
        int size;

        System.out.print("What # of food do you want: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        for(int i=0; i<foods.length;i++){
            System.out.print("Enter the food item: ");
            foods[i]= scanner.nextLine();
        }

        Arrays.sort(foods);

        for(String food: foods){
            System.out.println(food);
        }
        scanner.close();
    }
}
