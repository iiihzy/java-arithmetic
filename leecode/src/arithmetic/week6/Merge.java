package arithmetic.week6;

import java.util.*;

public class Merge {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][2];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] interval : intervals) {
            if (map.containsKey(interval[0])) {
                map.put(interval[0], Math.max(map.get(interval[0]), interval[1]));
            } else {
                map.put(interval[0], interval[1]);
            }

        }

        Set<Integer> set = map.keySet();
        ArrayList<int[]> list = new ArrayList<>();
        for (Integer i : set) {
            int value = map.get(i);
            if(list.isEmpty()) {
                list.add(new int[]{i, value});
                continue;
            }

            if(i <= list.get(list.size() - 1)[1])
                list.get(list.size() - 1)[1] = Math.max(list.get(list.size() - 1)[1], value);
            else
                list.add(new int[]{i, value});
        }
        int[][] result = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        while(sc.hasNextInt()) {
            ArrayList<Integer> list = new ArrayList<>();
            while(sc.hasNextInt()) list.add(sc.nextInt());
            lists.add(list);
            sc.nextLine();
        }

        int[][] nums = new int[lists.size()][];
        for (int i = 0; i < lists.size(); i++) {
            ArrayList<Integer> list = lists.get(i);
            nums[i] = new int[list.size()];
            for (int j = 0; j < list.size(); j++) {
                nums[i][j] = list.get(j);
            }
        }
*/
        int[][] nums = new int[][]{
                {2, 3},
                {2, 2},
                {3, 4},
                {5, 5},
                {3, 4}
        };
        System.out.println(Arrays.deepToString(new Merge().merge(nums)));
    }
}
