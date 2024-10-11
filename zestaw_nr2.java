import java.util.Scanner;

public class zestaw_nr2 {
    public static void main(String[] args) {
        //zad 1
        System.out.println("zad 1");
        System.out.println((23.0+76) +" Float");
        System.out.println((41*2.0+3)+" Float");
        System.out.println((5-33)+" Int");
        System.out.println((109%3)+" Int");
        System.out.println((50/2)+" Int");
        System.out.println((4|2)+" Byte");
        System.out.println((3^5)+" Byte");
        System.out.println((7&9)+" Byte");
        System.out.println("");

        //zad 2
        System.out.println("zad 2");
        double a = ((Math.sqrt(7)-1)/2)+Math.pow(3, 3)%2;
        int a_int = (int) a;
        System.out.println(a_int);

        double b = 2002/(5*5);
        int b_int = (int) b;
        System.out.println(b_int);

        double c = ( (3+Math.sqrt(3)) / ((Math.sqrt(5) / 2) / 3) )+1;
        int c_int = (int) c;
        System.out.println(c_int);

        double d = 65.2 % 6 % 2;
        int d_int = (int) d;
        System.out.println(d_int);

        System.out.println("");

        //zad 3
        System.out.println("zad 3");
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter first word:");
        String word1 = userInput.nextLine();
        System.out.println("Enter second word:");
        String word2 = userInput.nextLine();

        System.out.println(word1+" "+word2);

        System.out.println("");

        //zad 4
        System.out.println("zad 4");

        System.out.println("Enter first number:");
        float num1 = userInput.nextFloat();
        System.out.println("Enter second number:");
        float num2 = userInput.nextFloat();

        System.out.println("Sum = "+(num1+num2));
        System.out.println("Difference = "+(num1-num2));
        System.out.println("Product = "+(num1*num2));
        System.out.println("Quotient = "+(num1/num2));

        System.out.println("");

        //zad 5
        System.out.println("zad 5");
        System.out.println("Enter a number:");
        float x = userInput.nextFloat();

        System.out.println(x+140);
        System.out.println(x-31);
        System.out.println(x*7);
        System.out.println(x/13);
        System.out.println(x%7);
        System.out.println( (int) x/4);
        System.out.println(Math.pow(x, 45));
        System.out.println( ((byte) x) ^ 67 );
        System.out.println( ((byte) x) & 59 );
        System.out.println( ((byte) x) | 23 );
        System.out.println( ((byte) x) << 5);
        System.out.println( ((byte) x) >> 6);
    }
}