class Solution {
    public:
        int mctFromLeafValues(vector<int>& arr) {
            vector<vector<int>> dp(arr.size(),vector<int>(arr.size(),0));
            
            int n = arr.size();
            for(int i = 0; i < n; i++){
                for(int j = i; j < n; j++){
                    if(i == j){
                        dp[i][j] = arr[i];
                    }else{
                        for(int k = i; k < j; k++){
                            dp[i][j] = min(dp[i][j],dp[i][k] + dp[k+1][j] + maxi[i][k]*max[k+1][j];
                    }
                                           }
                }
            }
                                           }
    
            return 0;
        }
};