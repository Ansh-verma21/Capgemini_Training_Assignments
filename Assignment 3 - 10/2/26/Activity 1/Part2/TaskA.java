package COLLECT;
import java.util.*;

public class TaskA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> marks = new ArrayList<>();
        marks.add(85);
        marks.add(90);
        marks.add(78);
        marks.add(92);
        marks.add(100);
        marks.add(2, 80);
        int min=Integer.MAX_VALUE;
        for (int mark : marks) {
            if (mark < min) {
                min = mark;
            }
        }           
 marks.remove(marks.indexOf(min)); 

System.out.println(marks);

	}

}
