package BaseValue;
import java.util.Scanner;

public class BaseValue{
    public static void main(String[] args) {


        Scanner scheming = new Scanner(System.in);

        System.out.print(" enter a number to check for it base: ");

        int base= scheming.nextInt();

        System.out.print(" Enter the number for exponent: ");

        int exponent= scheming.nextInt();

        double result =Math.pow(base,exponent);

        System.out.println(base + " Raised to the power " + exponent + " is " + result) ;
    }
}