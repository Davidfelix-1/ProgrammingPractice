package Exercise;

public class ChapterFourExerciseOne {
    public static void main(String[] args) {
        int x =-2;
        int total =0;
        while(x <=10){
            int temp = x+2;
            x++;
            total+=temp;
            System.out.printf("Result is:%d and total is %d\n",temp, total);
        }
    }
}
