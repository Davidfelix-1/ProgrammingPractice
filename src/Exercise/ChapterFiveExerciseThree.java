package Exercise;

import java.util.HashMap;

public class ChapterFiveExerciseThree {
    public static void main(String[] args) {
        HashMap<String, Integer> myHashMap = new HashMap<>();

        myHashMap.put("Alice",300);
        myHashMap.put("John",400);
        myHashMap.put("Uncle",500);
        myHashMap.containsKey("Alice");
        myHashMap.get("john");


        System.out.println(myHashMap);
    }
}
