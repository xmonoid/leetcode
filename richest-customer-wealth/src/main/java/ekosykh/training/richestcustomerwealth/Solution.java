package ekosykh.training.richestcustomerwealth;

public class Solution {
    /**
     * You are given an {@code m x n} integer grid accounts where {@code accounts[i][j]} is the amount of money the
     * {@code i-th} customer has in the {@code j-th} bank. Return the <b>wealth</b> that the richest customer has.
     * <p/>
     * A customer's <b>wealth</b> is the amount of money they have in all their bank accounts.
     * The richest customer is the customer that has the maximum wealth.
     * <p/>
     * <b>Constraints:</b>
     * <ul>
     *     <li>{@code m == accounts.length}</li>
     *     <li>{@code n == accounts[i].length}</li>
     *     <li>{@code 1 <= m, n <= 50}</li>
     *     <li>{@code 1 <= accounts[i][j] <= 100}</li>
     * </ul>
     * <b>Constraints:</b>
     * <ul>
     *     <li>{@code 0 <= num <= 10^6}</li>
     * </ul>
     * @see <a href="https://leetcode.com/problems/richest-customer-wealth/">1672. Richest Customer Wealth</a>
     */
    public static int maximumWealth(int[][] accounts) {
        for (int j = 1; j < accounts[0].length; j++) {
            accounts[0][0] += accounts[0][j];
        }
        for (int i = 1; i < accounts.length; i++) {
            for (int j = 1; j < accounts[i].length; j++) {
                accounts[i][0] += accounts[i][j];
            }
            if (accounts[i][0] > accounts[0][0]) {
                accounts[0][0] = accounts[i][0];
            }
        }
        return accounts[0][0];
    }
}