package COLLECT;
import java.util.*;

class Stu{
	int rollNo;
	String name;
	public Stu(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	
	
}
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("HAHA");
		List<Stu> l=new ArrayList<>();
		l.add(new Stu(1,"Ansh"));
		l.add(new Stu(10,"Aman"));
		l.add(new Stu(2,"Ankit"));
		l.add(new Stu(5,"Aditya"));
		l.add(new Stu(6,"Salil"));
		l.add(new Stu(15,"rohit"));
		
		for(int i=0;i<l.size();i++)
		{
			for(int j=i;j<l.size();j++)
			{
				if(l.get(i).rollNo>l.get(j).rollNo) {
					Stu t=l.get(i);
					l.set(i, l.get(j));
					l.set(j, t);
				}
			}
		}
		for(Stu h:l) {
			System.out.print(h.rollNo+" ");
			System.out.println(h.name);
		}

	}

}
