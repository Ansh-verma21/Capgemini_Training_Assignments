package COLLECT;
import java.util.*;

public class TaskB {
	public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();

        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        queue.add("E");

        queue.poll();
        queue.poll();

        System.out.println(queue);

}
}
