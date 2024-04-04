package arithmetic.week3;

import java.util.Arrays;
import java.util.Scanner;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        /*int[][] cur = new int[m][n];
        for (int i = 1; i < m; i++) cur[i][0] = 1; // 第一列元素为 1
        for (int j = 1; j < n; j++) cur[0][j] = 1; // 第一行元素为 1

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                cur[i][j] = cur[i - 1][j] + cur[i][j - 1];
            }
        }
        return cur[m - 1][n - 1];*/
        
        int[] cur = new int[n];
        Arrays.fill(cur, 1);

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                cur[j] += cur[j - 1];
            }
        }

        return cur[n - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(new UniquePaths().uniquePaths(m, n));
    }
}
