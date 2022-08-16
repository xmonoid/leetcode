package ekosykh.training.searcha2dmatrix;

public class Solution {
    /**
     * Write an efficient algorithm that searches for a value <code>target</code> in an <code>m x n</code>
     * integer matrix <code>matrix</code>. This matrix has the following properties:
     * <p/>
     * <ul>
     *     <li>Integers in each row are sorted from left to right.</li>
     *     <li>The first integer of each row is greater than the last integer of the previous row.</li>
     * </ul>
     * <p/>
     * <b>Constraints:</b>
     * <ul>
     *     <li><code>m == matrix.length</code></li>
     *     <li><code>n == matrix[i].length</code></li>
     *     <li><code>1 <= m, n <= 100</code></li>
     *     <li><code>-10^4 <= matrix[i][j], target <= 10^4</code></li>
     * </ul>
     * @see <a href="https://leetcode.com/problems/search-a-2d-matrix/">74. Search a 2D Matrix</a>
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = binaryRow(matrix, target);
        return row != -1 && binaryColumn(matrix[row], target);
    }

    /**
     * @return a row number where the target <b>potentially</b> might be
     * or -1 if the target is less than <code>matrix[0][0]</code>
     */
    private int binaryRow(int[][] matrix, int target) {
        if (target < matrix[0][0]) {
            return -1;
        }
        if (target >= matrix[matrix.length-1][0]) {
            return matrix.length-1;
        }
        int low = 0;
        int high = matrix.length;
        do {
            int middle = (low + high) / 2;
            if (target < matrix[middle][0]) {
                high = middle;
            } else if (target >= matrix[middle][0] && target < matrix[middle + 1][0]) {
                return middle;
            } else {
                low = middle;
            }
        } while (low < high);
        return low;
    }

    /**
     * @return <code>true</code> if <code>target</code> found in the row, <code>false</code> otherwise.
     */
    private boolean binaryColumn(int[] row, int target) {
        int low = 0;
        int high = row.length;
        int middle;
        do {
            middle = (low + high) / 2;
            if (target < row[middle]) {
                if (high == middle) {
                    return false;
                }
                high = middle;
            } else if (target == row[middle]) {
                return true;
            } else {
                if (low == middle) {
                    return false;
                }
                low = middle;
            }
        } while (low < high);
        return false;
    }
}
