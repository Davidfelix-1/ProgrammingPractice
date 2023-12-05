package MrChiClassOnDataStructure;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class MultipleEntryArray {
    List<Integer> numbers;




    public static List<Integer> unOrderNumbers ( int length){
            List<Integer> numbers = new ArrayList<>();
            for (int i = 1; i <= length; i++) {
                numbers.add(i);
            }
            Collections.shuffle(numbers);
            return numbers;

        }
    }
