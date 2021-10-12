
public class Leetcode_45 {
	public static void main(String[] args)
	{
		int[] nums = {1,2,1,1,4,1};
		int[] dp = new int[nums.length];
        //Arrays.fill(dp, Integer.MAX_VALUE);
		for(int i=0;i<nums.length;i++)
		{
			dp[i]=Integer.MAX_VALUE;
		}
        dp[0]=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j =1;j<=nums[i];j++)
            {
                if(i+j<nums.length)
                    dp[i+j]=Math.min(dp[i+j],dp[i]+1);
            }
        }
        System.out.println(dp[nums.length-1]);
    }
	}

