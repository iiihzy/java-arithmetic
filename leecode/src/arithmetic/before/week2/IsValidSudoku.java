package arithmetic.before.week2;

public class IsValidSudoku {

    public static boolean isValidSudoku(char[][] board) {
        int[][] rows = new int[9][9]; //  记录每一行中除0外的数字的次数
        int[][] columns = new int[9][9]; //  记录每一列中除0外的数字的次数
        int[][][] box = new int[3][3][9]; //  记录每个九宫格中除0外的数字的次数

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int digit = board[i][j] - '1';

                    if(++rows[i][digit] * ++columns[j][digit] * ++box[i / 3][j / 3][digit] > 1)
                        return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
