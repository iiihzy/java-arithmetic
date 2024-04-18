package arithmetic.week4;

import java.util.*;

public class FindOriginalArray {
    public int[] findOriginalArray(int[] changed) {
        if(changed.length % 2 != 0 || changed.length == 0)
            return new int[0];

        Arrays.sort(changed);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : changed) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int[] res = new int[changed.length / 2];
        int count = 0;
        for (int i : changed) {
            if(map.get(i) == 0)
                continue;

            map.put(i, map.get(i) - 1);
            if(map.getOrDefault(i * 2, 0) == 0)
                return new int[0];
            map.put(i * 2, map.get(i * 2) - 1);
            res[count++] = i;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while(sc.hasNextInt()) {
            list.add(sc.nextInt());
        }

        int[] nums = list.stream().mapToInt(Integer::intValue).toArray();
        nums = new FindOriginalArray().findOriginalArray(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
