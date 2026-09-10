class Solution {
    int MOD = 1_000_000_007;

    public int lengthAfterTransformations(String s, int t) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        for (int i = 0, j = 25; i < t; i++, j = (j + 25) % 26) {
            freq[(j + 1) % 26] = (freq[(j + 1) % 26] + freq[j]) % MOD;
        }

        int sum = 0;
        for (int f : freq) {
            sum = (sum + f) % MOD;
        }
        return sum;
    }
}