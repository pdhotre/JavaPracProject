public class varargsPgm {
    public static void main(String[] args) {

        /*
            varargs = allow a method to accept a varying # of arguments
                      makes method more flexible, no need for overloaded methods
                      java will pack the argument into an array
                      ... (ellipsis)
         */

        System.out.println("Addition : "+add(1,2,3,4));
        System.out.println("Average : "+average(1,2,3,4));
    }

    static int add(int... numbers){

        int sum = 0;

        for(int number:numbers){
            sum += number;
        }
        return sum;
    }

    static double average(double... numbers){
        double avg;
        double sum = 0;
        for (double number:numbers){
            sum += number;
        }

        avg = sum /numbers.length;
        return avg;
    }
}
