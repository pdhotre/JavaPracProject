package practicePgm;

public class MethodOverload {
    public static void main(String[] args) {
        // practicePgm.Method overload - methods that share the same name
        //                   but different parameters
        //                   signature = name + parameters
        String pizza1 = bakePizza("Flat bread");
        String pizza2 = bakePizza("Flat bread", "Mozzarella");
        String pizza3 = bakePizza("Flat bread","Mozzarella", "pepperoni");

        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);
    }

    static String bakePizza(String bread){
        return bread + " pizza";
    }

    static String bakePizza(String bread, String cheese){
        return cheese+" " +bread + " pizza";
    }

    static String bakePizza(String bread, String cheese, String toppings){
        return toppings + " " +cheese+ " " +bread + " pizza";
    }
}
