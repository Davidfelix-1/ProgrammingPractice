package CohortEighteen;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import static java.util.Arrays.sort;

public class ArraySorting {
    public static void main(String[] args) {
        int[] myNumbers = {12, 45, 67, 8, 89};

        int i;
        for (i = 0; i < myNumbers.length; i++) {
            final var myNumber = myNumbers[i];
            int numb = sort(myNumbers[i]);
        }
        System.out.println("Sorted" + Arrays.toString(myNumbers));
    }

    private static int sort(int myNumber) {
        return myNumber;
    }


}
