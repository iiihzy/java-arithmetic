package arithmetic.week10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DistributeCandies2 {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();

        for (int i : candyType) {
            set.add(i);
        }

        return Math.min(set.size(), candyType.length / 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while(sc.hasNextInt()) list.add(sc.nextInt());
        int[] candyType = list.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(new DistributeCandies2().distributeCandies(candyType));
    }
}
