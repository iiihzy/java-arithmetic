package arithmetic.week10;

import java.util.Arrays;

public class MissingRolls {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int sum = mean * (m + n);
        for (int roll : rolls) sum -= roll;

        if (sum < n || sum > 6 * n) return new int[]{};

        int quotient = sum / n;
        int mods = sum % n;
        int[] result = new int[n];
        for (int i = 0; i < n; i++)
            result[i] = quotient + (i < mods? 1 : 0);

        return result;
    }
}
