package leetcode.edu.com;


import java.lang.reflect.Array;
import java.util.Arrays;

public class ThreeSumClosest {

    public static int threeSumClosest(int[] nums, int target){

        Arrays.sort(nums);
        int temp = target;
        int endCha = Integer.MAX_VALUE;
        int cha = 0;
        for (int one = 0; one < nums.length - 2; one++) {
            if(one > 0 && nums[one] == nums[one - 1])
                continue;

            target = target - nums[one];
            int three = nums.length - 1;
            int two = one + 1;

            while(two < three){
                while (two < three && nums[two] == nums[two + 1]) two++;
                while (two < three && nums[three] == nums[three - 1]) three--;

                if(nums[two] + nums[three] > target)
                    three--;
                if(nums[two] + nums[three] < target)
                    two++;
            }
            cha = target - nums[two] - nums[three];
            endCha = Math.min(cha, endCha);


        }

        return temp - endCha;
    }

    public static void main(String[] args) {

    }
}
