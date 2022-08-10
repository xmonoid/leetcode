package ekosykh.training.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * Given an integer {@code n}, return <i>a string array</i> answer (<b>1-indexed</b>) where:
     * <ul>
     *     <li>{@code answer[i] == "FizzBuzz"} if i is divisible by 3 and 5.</li>
     *     <li>{@code answer[i] == "Fizz"} if i is divisible by 3.</li>
     *     <li>{@code answer[i] == "Buzz"} if i is divisible by 5.</li>
     *     <li>{@code answer[i] == i} (as a string) if none of the above conditions are true.</li>
     * </ul>
     *
     * @see <a href="https://leetcode.com/problems/fizz-buzz/">412. Fizz Buzz</a>
     */
    public static List<String> fizzBuzz(int n) {
        var result = new ArrayList<String>(n);
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    result.add("FizzBuzz");
                } else {
                    result.add("Fizz");
                }
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(fromInt(i));
            }
        }
        return result;
    }

    private static String fromInt(int x) {
        byte[] bytes;
        if (x < 10) {
            bytes = new byte[] {(byte) (x % 10 + 48)};
        } else if (x < 100) {
            bytes = new byte[] {
                    (byte) (x / 10 + 48),
                    (byte) (x % 10 + 48)
            };
        } else if (x < 1000) {
            bytes = new byte[] {
                    (byte) (x / 100 + 48),
                    (byte) (x % 100 / 10 + 48),
                    (byte) (x % 10 + 48)
            };
        } else {
            bytes = new byte[] {
                    (byte) (x / 1000 + 48),
                    (byte) (x % 1000 / 100 + 48),
                    (byte) (x % 100 / 10 + 48),
                    (byte) (x % 10 + 48)
            };
        }
        return new String(bytes);
    }
}