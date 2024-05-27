package arithmetic.demo;

import java.util.HashSet;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(6);
        set.add(5);
        set.add(4);

        for (Integer i : set) {
            System.out.println(i);
        }
    }

}
