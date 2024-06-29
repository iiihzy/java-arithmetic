package arithmetic.before.week7;

import java.util.ArrayList;
import java.util.List;

public class Generate {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();

        for (int i = 0; i < numRows; ++i) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j <= i; ++j) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    int num = ret.get(i - 1).get(j - 1) + ret.get(i - 1).get(j);
                    row.add(num);
                }
            }
            ret.add(row);
        }

        return ret;
    }
}
