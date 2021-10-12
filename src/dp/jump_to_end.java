package dp;

public class jump_to_end {
	//leetcode - 55
	//recursion - Time limit exceeds in bigger values
	//valley peak method: get reachability of every index
	public static void main(String[] args)
	{
		int[] arr = {3,4,1,0,1,3,2,2,0,2,0,3,2};
		int len = arr.length;
		int reachability = 0;
		for(int i=0;i<=reachability;i++)
		{
			int cur_max_jump = arr[i]+i;
			if(cur_max_jump>reachability)
			{
				reachability = cur_max_jump;
			}
			if(reachability>=len)
			{
				System.out.println("Yes, you can reach the end!");
				break;
			}
		}
		if(reachability<len)
			System.out.println("No you cannot. Sori.");
	}
}

//public boolean canJump(int[] nums) {
//    int i=0, n=nums.length-1, ele=nums[0];
//    if(n==0)
//        return true;
//    if(ele==0)
//        return false;
//    return helper(nums, i, n, ele);  
//}
//public boolean helper(int[] nums, int index, int len, int ele)
//{   if(ele<0)
//        return false;
//    if(ele==0 && nums[index]==0)
//          return false;
//    else if(nums[index]>=len-index)
//        return true;
//    else
//    {
//        boolean sum1 = helper(nums, ++index, len, --ele);
//        boolean sum2 = helper(nums, index, len, nums[index]);
//        return sum1 || sum2;
//    }
// 
//}
