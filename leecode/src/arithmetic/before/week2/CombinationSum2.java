package arithmetic.before.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CombinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target){
        Arrays.sort(candidates);
        List<List<Integer>> lists = new ArrayList<>();
        des(lists, new ArrayList<>(), candidates, target, 0);
        return lists;
    }

    private void des(List<List<Integer>> lists, List<Integer> list, int[] candidates, int target, int start) {
        if(target == 0) {
            lists.add(new ArrayList<>(list));
            return;
        }
        if(target < 0 || start == candidates.length) return;

        for (int i = start; i < candidates.length; i++) {
            if(i > start && candidates[i] == candidates[i - 1]) continue;
            list.add(candidates[i]);
            des(lists, list, candidates, target - candidates[i], i + 1);
            list.remove(list.size() - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while(sc.hasNextInt()){
            list.add(sc.nextInt());
        }
        sc.next();
        int target = sc.nextInt();
        int[] candidates = list.stream().mapToInt(Integer::intValue).toArray();

        System.out.println(new CombinationSum2().combinationSum2(candidates, target));
    }
}
