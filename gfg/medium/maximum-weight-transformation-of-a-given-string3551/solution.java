
class Solution {
    public int getMaxWeight(String s) {
        int n = s.length();

        // dp[i] = maximum weight obtainable from first i characters
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            // Leave current character unpaired
            dp[i] = dp[i - 1] + 1;

            if (i >= 2) {
                // Pair previous and current characters.
                // If they are equal, toggle one character at cost 1.
                int cost = (s.charAt(i - 2) == s.charAt(i - 1)) ? 1 : 0;

                dp[i] = Math.max(
                    dp[i],
                    dp[i - 2] + 4 - cost
                );
            }
        }

        return dp[n];
    }
}
