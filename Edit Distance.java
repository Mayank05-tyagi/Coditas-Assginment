class Solution {
    public int minDistance(String word1, String word2) {word1 = " " + word1;
        word2 = " " + word2;
        int m = word1.length();
        int n = word2.length();
        
        int[][] dp = new int[m][n];
        
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + 1;
        }
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j - 1] + 1;
        }
        
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                int temp = Integer.MAX_VALUE;
                if (word1.charAt(i) != word2.charAt(j)) {
                    
                    // delete
                    temp = Math.min(temp, dp[i - 1][j] + 1);
                    // insert
                    temp = Math.min(temp, dp[i][j - 1] + 1);
                    // replace
                    temp = Math.min(temp, dp[i - 1][j - 1] + 1);

                } else {
                    // do nothing
                    temp = Math.min(temp, dp[i - 1][j - 1]);
                    // delete
                    temp = Math.min(temp, dp[i - 1][j] + 1);
                    // insert
                    temp = Math.min(temp, dp[i][j - 1] + 1);
                }
                
                dp[i][j] = temp;
            }
        }
        
        return dp[m - 1][n - 1];
        
    }
}