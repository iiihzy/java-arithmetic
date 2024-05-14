package arithmetic.week8;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int slow = 1;
        for (int fast = 1; fast < n; fast++) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow++] = nums[fast];
            }
        }
        return slow;
    }

    public static void main(String[] args) {
        
    }

}
