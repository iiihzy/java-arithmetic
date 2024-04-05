package arithmetic.week3;

import java.util.ArrayList;
import java.util.Scanner;

public class UniquePathsWithObstacles {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;

        int[] cur = new int[obstacleGrid[0].length];
        cur[0] = obstacleGrid[0][0] == 0 ? 1 : 0;

        for (int[] row : obstacleGrid) {
            for (int j = 0; j < m; j++) {
                if (row[j] == 1) {
                    cur[j] = 0;
                    continue;
                }
                if (j > 0 && row[j - 1] == 0)
                    cur[j] += cur[j - 1];
            }
        }
        return cur[m - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while(sc.hasNextInt()){
            list.add(sc.nextInt());
        }

        int n = (int)Math.sqrt(list.size());
        int[][] nums = new int[n][n];

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nums[i][j] = list.get(count++);
            }
        }

        System.out.println(new UniquePathsWithObstacles().uniquePathsWithObstacles(nums));
    }
}
