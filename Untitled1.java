import java.util.*;

public class Untitled1 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("The element is:" + list.get(i));

        }
        for (int n : list) {
            System.out.println("For each loop The element is:" + n);
        }

        // list.set(2, 20);
        // System.out.println(list);
        // System.out.println(list.contains(20));

        // list.add(5);
        // list.add(2, 10);
        // System.out.println(list);

        // System.out.println(list.get(1));

        // list.remove(2);
        // list.remove(Integer.valueOf(5));

        // System.out.println(list);
        // list.clear();
        // System.out.println(list);

    }
}
