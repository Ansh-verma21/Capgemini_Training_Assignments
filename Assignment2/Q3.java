package COLLECT;
import java.util.*;
class Marks {
    int marks1, marks2, marks3;
    String name;

    public Marks(int marks1, int marks2, int marks3, String name) {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.name = name;
    }
}

public class Bubbling3Marks {

    public static void main(String[] args) {

        List<Marks> list = new ArrayList<>();

        list.add(new Marks(50, 20, 5, "Ansh"));
        list.add(new Marks(50, 20, 50, "Aman"));
        list.add(new Marks(10, 30, 50, "Ankit"));
        list.add(new Marks(10, 20, 50, "salil"));
        list.add(new Marks(10, 10, 50, "Rohit"));
        list.add(new Marks(50, 10, 50, "Aditya"));
        

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {

                Marks a = list.get(j);
                Marks b = list.get(j + 1);

                if (a.marks1 < b.marks1 ||
                   (a.marks1 == b.marks1 && a.marks2 < b.marks2) ||
                   (a.marks1 == b.marks1 && a.marks2 == b.marks2 && a.marks3 < b.marks3)) {

                    list.set(j, b);
                    list.set(j + 1, a);
                }
            }
        }

        for (Marks m : list) {
            System.out.println(m.marks1 + " " + m.marks2 + " " + m.marks3+" "+m.name);
        }
    }
}