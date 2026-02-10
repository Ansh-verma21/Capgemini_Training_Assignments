package COLLECT;

import java.util.*;

public class ArrayListAdvance {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
            list.add(10);
            list.add(9);
            list.add(8);
            list.add(11);
            list.add(12);
            list.add(13);
            list.add(14);
            list.add(15);
            list.add(16);
            list.add(17);
        

        list.removeIf(n -> n % 2 == 0);

        int max = Collections.max(list);
        int min = Collections.min(list);

        list.sort(Collections.reverseOrder());

        System.out.println("Max=" + max);
        System.out.println("Min=" + min);
        System.out.println(list);
    }
}
