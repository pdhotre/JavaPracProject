public class PrintfStatement {
    public static void main(String[] args) {

        // printf = is a method  used to format output

        double price1 = 9000.99;
        double price2 = 10000.15;
        double price3 = -5400.01;

        System.out.println("// printf = is a method  used to format output");
        System.out.printf("%.2f\n", price1);
        System.out.printf("%.2f\n", price2);
        System.out.printf("%.2f\n", price3);
        System.out.println();
        // %[flags][width][.precision][specifier-character]

        // + - output a plus
        System.out.println("// + - output a plus");
        System.out.printf("%+.2f\n", price1);
        System.out.printf("%+.2f\n", price2);
        System.out.printf("%+.2f\n", price3);
        System.out.println();
        // , - comma grouping separator
        System.out.println("// , - comma grouping separator");
        System.out.printf("%,.2f\n", price1);
        System.out.printf("%,.2f\n", price2);
        System.out.printf("%,.2f\n", price3);
        System.out.println();
        // ( - negative number are enclosed in ()
        System.out.println("// ( - negative number are enclosed in ()");
        System.out.printf("%(.2f\n", price1);
        System.out.printf("%(.2f\n", price2);
        System.out.printf("%(.2f\n", price3);
        System.out.println();
        // space - display a minus if negative, space if positive
        System.out.println("// space - display a minus if negative, space if positive");
        System.out.printf("% .2f\n", price1);
        System.out.printf("% .2f\n", price2);
        System.out.printf("% .2f\n", price3);
        System.out.println();
        // [width]
        int id1 = 1;
        int id2 = 23;
        int id3 = 345;
        int id4 = 7654;
        System.out.println("// width");
        System.out.printf("%d\n",id1);
        System.out.printf("%d\n",id2);
        System.out.printf("%d\n",id3);
        System.out.printf("%d\n",id4);
        System.out.println();
        // 0 - zero padding
        System.out.println("// 0 - zero padding");
        System.out.printf("%04d\n",id1);
        System.out.printf("%04d\n",id2);
        System.out.printf("%04d\n",id3);
        System.out.printf("%04d\n",id4);
        System.out.println();
        // number - right justified padding
        System.out.println("// number - right justified padding");
        System.out.printf("%4d\n",id1);
        System.out.printf("%4d\n",id2);
        System.out.printf("%4d\n",id3);
        System.out.printf("%4d\n",id4);
        System.out.println();
        // negative number - left justified padding
        System.out.println("// negative number - left justified padding");
        System.out.printf("%-4d\n",id1);
        System.out.printf("%-4d\n",id2);
        System.out.printf("%-4d\n",id3);
        System.out.printf("%-4d\n",id4);



    }
}
