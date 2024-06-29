package arithmetic.before.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindIndices {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        for (int i = 0; i < nums.length - indexDifference; i++) {
            for (int j = i + indexDifference; j < nums.length; j++) {
                if (Math.abs(nums[j] - nums[i]) >= valueDifference) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while(sc.hasNextInt()) list.add(sc.nextInt());

        int[] nums = list.stream().mapToInt(Integer::intValue).toArray();
        int[] end = new FindIndices().findIndices(nums, sc.nextInt(), sc.nextInt());
        System.out.println(Arrays.toString(end));
    }
}
