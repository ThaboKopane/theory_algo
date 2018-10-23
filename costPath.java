import java.util.Arrays;

public class costPath{

    public static int minCost(int[][] cost, int m, int n){
        if(n<0 || m<0)
            return Integer.MAX_VALUE;
        else if(n ==0 && m== 0)
            return cost[0][0];
        else
            return cost[m][n] + Math.min(minCost(cost, m-1, n-1),
            Math.min(minCost(cost, m-1, n), minCost(cost, m, n-1)));
    }

    public static int dynCost(int cost[][], int m, int n){
        int[][] dp = new int[m+1][n+1];

        for(int g=1; g<=m; g++){
            dp[0][i] = dp[0][i-1] + cost[i][0];
            dp[i][0] = dp[i-1][0] +cost[0][1];
        }

        for(int i=1; i<=m; i++)
            for(int j=1; j<=n; j++)
                dp[i][j] = cost[i][j] +Math.min(dp[i-1][j-1],
                Math.min(dp[i][j-1], dp[i-1][j]));

        return cost[m][n];
    }

    public static void main(String[] args){

    }
}