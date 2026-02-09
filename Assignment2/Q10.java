package COLLECT;

import java.util.ArrayList;
import java.util.List;

public class InsertionObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Stu class created in different file
		List<Stu> l=new ArrayList<>();
		l.add(new Stu(1,"Ansh"));
		l.add(new Stu(10,"Aman"));
		l.add(new Stu(2,"Ankit"));
		l.add(new Stu(5,"Aditya"));
		l.add(new Stu(6,"Salil"));
		l.add(new Stu(15,"rohit"));
		for (int i = 1; i < l.size(); i++) {
		    Stu key = l.get(i);
		    int j = i - 1;

		    while (j >= 0 && l.get(j).rollNo > key.rollNo) {
		         l.set(j+1, l.get(j)) ;
		        j--;
		    }
		    l.set(j+1, key) ;
		}
		for(Stu h:l) {
			System.out.print(h.rollNo+" ");
			System.out.println(h.name);
		}
		

	}

}
