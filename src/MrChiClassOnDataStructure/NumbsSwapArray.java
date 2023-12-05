package MrChiClassOnDataStructure;
import java.util.Arrays;
import java.util.Random;

public class NumbsSwapArray {
    public static void main(String[] args) {
        int[] myArray= {20, 40, 60, 80, 100, 120, 160, 180, 200};
        System.out.println("The integer array ="+Arrays.toString(myArray));
        Random rand= new Random();
        for (int i = 0; i <myArray.length ; i++) {
            int index = rand.nextInt(myArray.length-i);
            int temp =myArray[myArray.length-1-i];
            myArray[myArray.length-1-i]=myArray[index];
            myArray[index]=temp;
        }
        System.out.println("Shuffle integer array"+Arrays.toString(myArray));

    }
}
