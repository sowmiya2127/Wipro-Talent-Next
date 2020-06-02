if(n == 1) return 5;
        int mod = (int)(1e9+7);
        int[][] trans = new int[][]{{0, 1, 0, 0, 0}, {1, 0, 1, 0, 0}, {1, 1, 0, 1, 1}, {0, 0, 1, 0, 1}, {1, 0, 0, 0, 0}};
        int[][] dp = new int[n][5];
        int res = 0;
        for(int i = 0; i < 5; i++) dp[0][i] = 1;
        for(int i = 1; i < n; i++) {
            for(int j = 0; j < 5; j++) {
                for(int k = 0; k < 5; k++) {
                    if(trans[j][k] == 1) {
                        dp[i][j] = (dp[i][j] + dp[i-1][k]) % mod;
                    }
                }
                if(i == n-1) res = (res + dp[i][j]) % mod;
            }
        }
        return res;
