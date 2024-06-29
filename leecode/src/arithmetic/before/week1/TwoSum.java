package leetcode.edu.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {

    public static void Print(int[] nums, int aimIndex){
        System.out.println(nums[aimIndex]);
    }


    // 哈希表查数
    public static int[] two_Sum(int[] nums, int target){
        Map<Integer, Integer> hasMap = new HashMap<>(nums.length - 1);
        // nums.length nums数组的大小(元素个数)
        // 这里插个眼, 思考一下, 为什么哈希表的长度是nums.length - 1, 而不是nums.length

        hasMap.put(nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            if(hasMap.containsKey(target - nums[i])){
                return new int[] {i, hasMap.get(target - nums[i])};
            }
            hasMap.put(nums[i], i);
        }

        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] aims = two_Sum(arr, target);
        if(aims != null) {
            Print(arr, aims[0]);
            Print(arr, aims[1]);
        }
    }
}
