package arithmetic.week10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindPeaks {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i < mountain.length - 1; i++) {
            if (mountain[i - 1] < mountain[i] && mountain[i] > mountain[i + 1]) {
                res.add(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while(sc.hasNextInt()) list.add(sc.nextInt());

        int[] nums = list.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(new FindPeaks().findPeaks(nums));
    }
}
