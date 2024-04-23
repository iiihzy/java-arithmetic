package arithmetic.week5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permute {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, 0, res);
        return res;
    }

    public void backtrack(int[] nums, int start, List<List<Integer>> res) {
        if(start == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int num : nums) {
                temp.add(num);
            }
            res.add(temp);
        } else {
            for (int i = start; i < nums.length; i++) {
                swap(nums, start, i);
                backtrack(nums, start + 1, res);
                swap(nums, start, i);
            }
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while(sc.hasNextInt()) list.add(sc.nextInt());

        System.out.println(new Permute().permute(list.stream().mapToInt(Integer::intValue).toArray()));
    }
}
