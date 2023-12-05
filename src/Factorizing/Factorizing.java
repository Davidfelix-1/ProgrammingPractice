package Factorizing;

import java.util.Scanner;
public class Factorizing{
    public static void main(String[] args) {

        Scanner pack = new Scanner(System.in);

        System.out.print(" Enter a number :");

        int number = pack.nextInt();
        System.out.print(" factorizing " + number + " are");

        for(int i = 1; i<= number;  ++i) {

            if (number %i == 0){
                System.out.print(i++);
            }
        }


    }
}