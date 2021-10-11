package dp;

import java.util.Arrays;

public class LCS_memoi {

	static final int maxim = 1000;
    static int helper(String a, String b, int m, int n, int[][]dp)
    {
    	if(m==0 || n==0)
            return 0;
        if(dp[m-1][n-1]==-1)
        {
            if(a.charAt(m-1) == b.charAt(n-1))
            {
                dp[m-1][n-1]= 1+helper(a,b,m-1,n-1, dp);
            }
            else
            {
                dp[m-1][n-1]= Math.max(helper(a,b,m-1,n,dp),helper(a,b,m,n-1,dp));
            } 
            
        }
        return dp[m-1][n-1];
        
    }
    public static void main(String[] args) {
    	String text1="pmjghexybyrgzczy", text2="hafcdqbgncrcbihkd";
        int m = text1.length(), n = text2.length();
        int dp[][] = new int[m][maxim];
        for(int[] row:dp)
        {
            Arrays.fill(row,-1);
        }
        System.out.print(helper(text1, text2, m ,n,dp));
    }

}
