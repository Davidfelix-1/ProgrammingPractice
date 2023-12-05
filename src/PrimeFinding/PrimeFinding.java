package PrimeFinding;
import java.util.Scanner;
public class PrimeFinding {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(" Enter a number: ");

        int number =input.nextInt();

        if (isPrime(number))
        {
            System.out.print(" this is a prime number ");
        }
        else
        {
            System.out.print(" this is  a prime number ");
        }

    }

    private static boolean isPrime(int number) {
        if (number < 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if ((number % 1) == 0) {
                return false;
            }
        }
        return true;

    }
}