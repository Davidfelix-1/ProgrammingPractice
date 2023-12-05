package Exercise;

public class ChapterFiveExerciseTwo {
    public static void main(String[] args) {

    }

    public int sumNumber(int[] numbers){
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
            return max;




    }
}
