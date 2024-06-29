package arithmetic.before.week5;

import java.util.ArrayList;
import java.util.Scanner;

public class Jump {
    public int jump(int[] nums) {
        int end = 0;
        int maxLocal = 0;
        int step = 0;
        for(int i = 0; i <= end && end < nums.length - 1; i++) {
            maxLocal = Math.max(maxLocal, i + nums[i]);
            if(i == end) {
                end = maxLocal;
                step++;
            }
        }

        return step;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while(sc.hasNextInt())
            list.add(sc.nextInt());

        System.out.println(new Jump().jump(list.stream().mapToInt(Integer::intValue).toArray()));
    }
}
