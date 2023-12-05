package Exercise;

public class ChapterFiveExercises {
    public static void main(String[] args) {
        int number = 10;
        int i;
        for (i = 0; i < number; i++) {
            if (i == 7) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("broke out of loop" + i);
    }
}
