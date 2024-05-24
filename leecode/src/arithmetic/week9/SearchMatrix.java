package arithmetic.week9;

public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int m = matrix.length, n = matrix[0].length;
        int low = 0, high = m * n - 1;

        while (low <= high) {
            // 优化mid的计算，避免溢出
            int mid = low + (high - low) / 2;
            int x = matrix[mid / n][mid % n];

            if (x < target) {
                low = mid + 1;
            } else if (x > target) {
                high = mid - 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
