package MrChiClassOnDataStructure;
import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {


        Queue<String> queue = new LinkedList<>();

        queue.add("Morning");
        queue.add("Afternoon");
        queue.add("Evening");
        System.out.println("queue"+queue);

        String front= queue.remove();
        System.out.println("Removed element:"+front);
    }
}
