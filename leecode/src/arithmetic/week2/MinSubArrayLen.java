package arithmetic.week2;

import java.util.ArrayList;
import java.util.Scanner;

public class MinSubArrayLen {

    public static int minSubArrayLen(int target, int[] nums){
        if(nums.length < 2) {
            if(nums[0] < target)
                return 0;
        }
        if(nums[0] > target)
            return 1;

        int left = 0;
        int right = 1;
        int minDistance = 999999;

        int value = nums[left] + nums[right];
        while(right < nums.length) {

            if(value >= target){
                while(value >= target)
                    value -= nums[left++];
                int distance = right - left + 2;
                minDistance = Math.min(distance, minDistance);
            }


                right++;
                if(right < nums.length) {
                    value += nums[right];
                }


        }
        return minDistance == 999999? 0 : minDistance;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int target = sc.nextInt();

        while(sc.hasNextInt()){
            list.add(sc.nextInt());
        }


        int[] nums = list.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(minSubArrayLen(target, nums));

    }
}
