package arithmetic.before.week7;

import java.util.Arrays;

public class SetZeroes {
    public void setZeroes(int[][] matrix) {
        boolean flagCo0 = false;
        for (int i = 0; i < matrix[0].length; i++) {
            if(matrix[0][i] == 0)
                flagCo0 = true;

            for (int j = 1; j < matrix.length; j++) {
                if(matrix[j][i] == 0) {
                    matrix[0][i] = 0;
                    matrix[j][0] = 0;
                }
            }
        }

        for(int i = 1; i < matrix.length; i++) {
            for(int j = matrix[0].length - 1; j >= 0; j--) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
        }

        if (flagCo0)
            Arrays.fill(matrix[0], 0);
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {0, 1, 2},
                {4, 5, 6}
        };
        new SetZeroes().setZeroes(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
