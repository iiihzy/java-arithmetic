package arithmetic.before.week2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        des(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void des(List<List<Integer>> result, List<Integer> tempList, int[] candidates, int remain, int start) {
        if (remain < 0) return;
        if (remain == 0) {
            result.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            tempList.add(candidates[i]);
            // 注意这里的 start 是 i，而不是 i + 1，因为一个数字可以使用多次
            des(result, tempList, candidates, remain - candidates[i], i);
            tempList.remove(tempList.size() - 1);
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
        int[] nums = list.stream().mapToInt(Integer::intValue).toArray();
        CombinationSum combinationSum = new CombinationSum();
        List<List<Integer>> lists = combinationSum.combinationSum(nums, target);
        System.out.println(lists);
    }
}
