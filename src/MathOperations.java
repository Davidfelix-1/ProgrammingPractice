import java.util.Scanner;


public class MathOperations {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("kindle enter the digits:  ");
        int numberOne=scanner.nextInt();
        int numberTwo=scanner.nextInt();

        int sum =numberOne+ numberTwo;
        int difference= numberOne- numberTwo;
        int product=numberOne*numberTwo;


        System.out.println("The sum of numbers input is :"+sum);
        System.out.println("The difference of numbers input is :"+difference);
        System.out.println("The product of numbers input is :"+product);

    }
}
