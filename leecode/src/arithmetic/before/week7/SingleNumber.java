package arithmetic.before.week7;

import java.util.ArrayList;
import java.util.Scanner;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;
        for (int num : nums) {
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }
        return ones;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while(sc.hasNextInt()) list.add(sc.nextInt());

        System.out.println(new SingleNumber().singleNumber(list.stream().mapToInt(Integer::intValue).toArray()));
    }
}
