class DP{
public static int cal(int val[] ,int wt[],int W,int dp[][]){
    for(int i = 0;i<dp.length;i++){
        dp[i][0] = 0;
    }
    for(int i = 0;i<dp[0].length;i++){
        dp[0][i] = 0;
    }

    for(int i = 1;i<val.length+1;i++){
     for(int j = 1;j<W+1;j++){
        int v = val[i-1];
        int w = wt[i-1];
        if(w<=j){
            int inc = v + dp[i-1][j-w];
            int exc = dp[i-1][j];
            dp[i][j] = Math.max(inc,exc);
        }else{
            int exc = dp[i-1][j];
            dp[i][j] = exc;
        }
     }
    }
    return dp[val.length][W];
}
    public static void main(String[] args) {
        int val[] = {15,14,10,45,30};
        int wt[]  = {2,5,1,3,4};
        int W = 7;
        int dp[][] = new int[val.length+1][W+1];
        int ans = cal(val,wt,W,dp);
        System.out.println(ans);
    }
}