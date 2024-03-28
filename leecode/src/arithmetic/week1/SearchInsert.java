package leetcode.edu.com;

public class SearchInsert {

    public static int searchInsert(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;

            if(nums[mid] == target)
                return mid;
            if(nums[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return 0;
    }

    public static void main(String[] args) {

    }
}
