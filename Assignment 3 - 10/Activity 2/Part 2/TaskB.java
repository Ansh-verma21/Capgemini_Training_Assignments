package COLLECT;
import java.util.*;

public class Act2Task2B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> queue = new LinkedList<>();

        queue.add("P1");
        queue.add("P2");
        queue.add("P3");
        queue.add("P4");
        queue.add("P5");

        queue.addFirst("Emergency");

        queue.poll();
        queue.poll();

        System.out.println(queue);
	}

}
