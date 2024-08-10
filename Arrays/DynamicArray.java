package Arrays;

import java.util.ArrayList;

public class DynamicArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(20);
        list.add(10);

        System.out.println(list);

        list.remove(2);

        System.out.println(list);

        System.out.println(list.indexOf(20));
        System.out.println(list.lastIndexOf(20));
        System.out.println(list.contains(20));
        System.out.println(list.size());

        System.out.println(list.toArray().length);
    }
}
