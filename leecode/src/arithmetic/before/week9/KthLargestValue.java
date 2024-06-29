package arithmetic.before.week9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class KthLargestValue {
    public int kthLargestValue(int[][] matrix, int k) {
        int[][] pre = new int[matrix.length + 1][matrix[0].length + 1];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= matrix.length; i++) {
            for (int j = 1; j <= matrix[0].length; j++) {
                pre[i][j] = pre[i - 1][j] ^ pre[i][j - 1] ^ pre[i - 1][j - 1] ^ matrix[i - 1][j - 1];
                list.add(pre[i][j]);
            }
        }
        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer num1, Integer num2) {
                return num2 - num1;
            }
        });
        return list.get(k - 1);
    }
}
