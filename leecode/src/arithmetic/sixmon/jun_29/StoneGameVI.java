package arithmetic.sixmon.jun_29;

import java.util.Arrays;

public class StoneGameVI {
    public int stoneGameVI(int[] aliceValues, int[] bobValues) {
        int n = aliceValues.length;
        int[][] values = new int[n][3];

        for (int i = 0; i < n; i++) {
            values[i][0] = aliceValues[i] + bobValues[i];
            values[i][1] = aliceValues[i];
            values[i][2] = bobValues[i];
        }

        Arrays.sort(values, (a, b) -> b[0] - a[0]);
        int aliceSum = 0;
        int bobSum = 0;
        for (int i = 0; i < n; i++) {
            if(i % 2 == 0)
                aliceSum += values[i][1];
            else bobSum += values[i][2];
        }

        if(aliceSum > bobSum) return 1;
        if(aliceSum < bobSum) return -1;
        return 0;
    }
}
