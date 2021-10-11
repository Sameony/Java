
public class PeakIndex_MountainArray {

	static int findPeak(int[] arr)
	{
		int left=1, right=arr.length-2;
        while(left<right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
                return mid;
            else if(arr[mid]<arr[mid-1])
                right=mid-1;
            else
                left=mid+1;
        }
        return left;
	}
	public static void main(String[] args)
	{
		int[] nums= {0,3,4,5,6,9,8,7,2,1};
		System.out.println("Peak index of given mountain array is: "+findPeak(nums));
	}
}
