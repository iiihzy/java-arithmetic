package arithmetic.week6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo1 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(2, 3);
        map.put(4, 3);
        map.put(1, 3);
        map.put(0, 3);
        map.put(0, 5);

        Set<Integer> set =  map.keySet();
        for (Integer i : set) {
            System.out.print(i);
            System.out.println("  ------>" + map.get(i));
        }
    }
}
