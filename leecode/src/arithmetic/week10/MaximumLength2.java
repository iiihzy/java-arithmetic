package arithmetic.week10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaximumLength2 {
    public int maximumLength(String s) {
        int n = s.length();
        Map<Character, List<Integer>> cnt = new HashMap<>();

        for (int i = 0, j = 0; i < n; i = j) {
            while (j < n && s.charAt(j) == s.charAt(i)) {
                j++;
            }
            cnt.computeIfAbsent(s.charAt(i), k -> new ArrayList<>()).add(j - i);
        }

        int res = -1;
        for (List<Integer> vec : cnt.values()) {
            int lo = 1, hi = n - 2;
            while (lo <= hi) {
                int mid = (lo + hi) >> 1;
                int count = 0;
                for (int x : vec) {
                    if (x >= mid) {
                        count += x - mid + 1;
                    }
                }
                if (count >= 3) {
                    res = Math.max(res, mid);
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
