package com.codinggame.algorithm;

public class MaxScore {

    public static void main(String[] args) {
        int [] cards = {1,9,10,5,6,4};
        System.out.println(maxScore(cards));
    }

    public static int maxScore(int[] cards) {
        int n = cards.length;
        int[][] dp = new int[n][n];

        // Fill the DP table diagonally
        for (int gap = 0; gap < n; gap++) {
            for (int i = 0, j = gap; j < n; i++, j++) {
                int x = (i + 2 <= j) ? dp[i + 2][j] : 0;
                int y = (i + 1 <= j - 1) ? dp[i + 1][j - 1] : 0;
                int z = (i <= j - 2) ? dp[i][j - 2] : 0;
                dp[i][j] = Math.max(cards[i] + Math.min(x, y), cards[j] + Math.min(y, z));
            }
        }

        // Return the maximum score the first player can get
        return dp[0][n - 1];
    }

}
