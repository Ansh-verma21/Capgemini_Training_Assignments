package COLLECT;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Marks> list = new ArrayList<>();

        list.add(new Marks(50, 20, 5, "Ansh"));
        list.add(new Marks(50, 20, 50, "Aman"));
        list.add(new Marks(10, 30, 50, "Ankit"));
        list.add(new Marks(10, 20, 50, "salil"));
        list.add(new Marks(10, 10, 50, "Rohit"));
        list.add(new Marks(50, 10, 50, "Aditya"));
        
        for (int i = 1; i < list.size() - 1; i++) {
         Marks key=list.get(i);
         int j=i-1;
         Marks a = list.get(j);
         Marks b = list.get(j + 1);
        	
            while(j>0&&(a.marks1 < b.marks1 ||
                    (a.marks1 == b.marks1 && a.marks2 < b.marks2) ||
                    (a.marks1 == b.marks1 && a.marks2 == b.marks2 && a.marks3 < b.marks3))) {

                

                

                    list.set(j+1, list.get(j));
                   j--;
                }
            list.set(j+1, key);
            }
        for (Marks m : list) {
            System.out.println(m.marks1 + " " + m.marks2 + " " + m.marks3+" "+m.name);
        }
        }

	}


