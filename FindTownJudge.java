// Time Complexity: O(T + N)
// Space Complexity: O(N)
public class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] score = new int[n + 1];

        for (int[] pair : trust) {
            int a = pair[0];
            int b = pair[1];
            score[a]--; // person a trusts someone
            score[b]++; // person b is trusted
        }

        for (int i = 1; i <= n; i++) {
            if (score[i] == n - 1) {
                return i; // potential judge
            }
        }

        return -1; // no judge found
    }
}
