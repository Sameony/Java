
public class findPeakElement {

	static int findPeak(int[] nums) {
        int left=0, right=nums.length-1;
        while(left<right)
        {
            int mid=left+(right-left)/2;
            if((mid==0 || nums[mid]>nums[mid-1]) && (nums[mid]>nums[mid+1] ||mid==nums.length-1))
            {
                return mid;
            }
            else if(nums[mid]<nums[mid+1])
            {
                left=mid+1;
            }
            else
            {
                right=mid;
            }
        }
        return left;
    }
	public static void main(String args[])
	{
		int[] nums = {4,5,9,11,0,3,2};
		System.out.println("One of the peak is at index: "+findPeak(nums));
	}
}
