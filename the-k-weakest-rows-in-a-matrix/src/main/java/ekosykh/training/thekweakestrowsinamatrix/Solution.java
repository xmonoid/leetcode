package ekosykh.training.thekweakestrowsinamatrix;

import java.util.PriorityQueue;

public class Solution {
    /**
     * You are given an <code>m x n</code> binary matrix mat of 1's (representing soldiers)
     * and 0's (representing civilians). The soldiers are positioned <b>in front</b> of the civilians.
     * That is, all the 1's will appear to the <b>left</b> of all the 0's in each row.
     * <p/>
     * A row <code>i</code> is <b>weaker</b> than a row <code>j</code> if one of the following is true:
     * <p/>
     * <ul>
     *     <li>The number of soldiers in row <code>i</code>
     *     is less than the number of soldiers in row <code>j</code>.</li>
     *     <li>Both rows have the same number of soldiers and <code>i < j</code>.</li>
     * </ul>
     * Return <i>the indices of the <code>k</code> <b>weakest</b> rows in the matrix
     * ordered from weakest to strongest</i>.
     * <p/>
     * <b>Constraints:</b>
     * <ul>
     *     <li><code>m == mat.length</code></li>
     *     <li><code>n == mat[i].length</code></li>
     *     <li><code>2 <= n, m <= 100</code></li>
     *     <li><code>1 <= k <= m</code></li>
     *     <li><code>matrix[i][j]</code> is either 0 or 1.</li>
     * </ul>
     * @see <a href="https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/">
     *     1337. The K Weakest Rows in a Matrix</a>
     */
    public static int[] kWeakestRows(int[][] mat, int k) {
        var power = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length && mat[i][j] == 1; j++) {
                count++;
            }
            power[i] = count;
        }
        class Pair implements Comparable<Pair> {
            final int k;
            final int v;
            public Pair(int k, int v) {
                this.k = k;
                this.v = v;
            }
            @Override
            public int compareTo(Pair o) {
                return (v - o.v) * 100 + (k - o.k);
            }

            @Override
            public String toString() {
                return "{" + k + ":" + v + "}";
            }
        }
        var queue = new PriorityQueue<Pair>();
        for (int i = 0; i < power.length; i++) {
            queue.add(new Pair(i, power[i]));
        }

        var result = new int[k];
        for (int i = 0; i < result.length; i++) {
            result[i] = queue.remove().k;
        }
        return result;
    }
}
