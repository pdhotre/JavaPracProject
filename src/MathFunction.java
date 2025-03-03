public class MathFunction {
    public static void main(String[] args) {

        /*
        System.out.println(Math.PI);    //3.141592653589793
        System.out.println(Math.E);     //2.718281828459045
        */

        double result;
        result = Math.pow(2,5);         //32.0
        result = Math.abs(-5);          //5.0
        result = Math.sqrt(9);          //3.0
        result = Math.round(3.14);      //3.0
        result = Math.ceil(3.14);       //4.0
        result = Math.floor(3.99);      //3.0
        result = Math.max(10,20);       //20.0
        result = Math.min(10,20);       //10.0

        System.out.println(result);

    }
}
