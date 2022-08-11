package ekosykh.training.ransomnote;

public class Solution {
    /**
     * Given two strings {@code ransomNote} and {@code magazine}, return {@code true} if {@code ransomNote} can be
     * constructed by using the letters from {@code magazine} and {@code false} otherwise.
     * <p/>
     * Each letter in {@code magazine} can only be used once in {@code ransomNote}.
     * <p/>
     * <b>Constraints:</b>
     * <ul>
     *     <li>{@code 1 <= ransomNote.length, magazine.length <= 10^5}</li>
     *     <li>{@code ransomNote} and {@code magazine} consist of lowercase English letters.</li>
     * </ul>
     */
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] letters = new int[26];
        for (byte magazineByte: magazine.getBytes()) {
            letters[magazineByte - 97]++;
        }
        for (byte noteByte : ransomNote.getBytes()) {
            letters[noteByte - 97]--;
        }
        for (int letter: letters) {
            if (letter < 0) {
                return false;
            }
        }
        return true;
    }
}
