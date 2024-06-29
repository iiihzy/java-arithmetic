package arithmetic.before.week4;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumCount {

    public int binarySearch(int[] nums, int value) {
        int left = 0;
        int right = nums.length;
        while(left < right) {
            int mid = (left + right) / 2;
            if(nums[mid] >= value)
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }

    public int maximumCount(int[] nums) {

        return Math.max(binarySearch(nums, 0), nums.length - binarySearch(nums, 1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while(sc.hasNextInt()){
            list.add(sc.nextInt());
        }
        System.out.println(new MaximumCount().maximumCount(list.stream().mapToInt(Integer::intValue).toArray()));
    }
}
