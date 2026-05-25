public class SolutionLC1871 {
    public static boolean canReach(String s, int minJump, int maxJump) {
        int n = s.length();
        // If the last character is '1', we can never reach it
        if (s.charAt(n - 1) == '1') {
            return false;
        }
        boolean[] dp = new boolean[n];
        dp[0] = true; // We start at index 0

        int reachableCount = 0;

        for (int i = 1; i < n; i++) {
            // 1. Add elements entering the window from the right side
            if (i >= minJump) {
                if (dp[i - minJump]) {
                    reachableCount++;
                }
            }
            // 2. Remove elements leaving the window from the left side
            if (i > maxJump) {
                if (dp[i - maxJump - 1]) {
                    reachableCount--;
                }
            }
            // 3. If current character is '0' and there's a valid starting point in our window
            if (s.charAt(i) == '0' && reachableCount > 0) {
                dp[i] = true;
            }
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        String s = "011010";
        System.out.println(canReach(s, 2, 3));
    }
}
/*
Example 1:
Input: s = "011010", minJump = 2, maxJump = 3
Output: true
Explanation:
In the first step, move from index 0 to index 3.
In the second step, move from index 3 to index 5.

Example 2:
Input: s = "01101110", minJump = 2, maxJump = 3
Output: false
 */