public class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];

        dp[0][0] = true; // Empty string matches empty pattern

        // Handle patterns like "a*", "b*", ".*" that can match empty string
        for (int j = 2; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 2]; // '*' eliminates preceding char
            }
        }

        // Fill the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (p.charAt(j - 1) == s.charAt(i - 1) || p.charAt(j - 1) == '.') {
                    dp[i][j] = dp[i - 1][j - 1]; // Direct match
                } else if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 2]; // Use '*' zero times
                    if (p.charAt(j - 2) == s.charAt(i - 1) || p.charAt(j - 2) == '.') {
                        dp[i][j] |= dp[i - 1][j]; // Use '*' one or more times
                    }
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isMatch("aa", "a"));  // Output: false
        System.out.println(solution.isMatch("aa", "a*")); // Output: true
        System.out.println(solution.isMatch("ab", ".*")); // Output: true
    }
}
