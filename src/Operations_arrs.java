
public class Operations_arrs {

	public static void main(String[] args) {
//		int a[] = {8,2,5,1,1,13,2,8,17,5,1,14,28};
//		int sorted[] = {1,1,2,4,5,6,6,6,6,6,7,8,9,10};
//		int[] zeroes = {1,2,0,3,2,0,0,0,4,0};
//		for(int i:a)
//			System.out.print(i+" ");
//		for(int i:sorted)
//			System.out.print(i+" ");
//		for(int i:zeroes)
//			System.out.print(i+" ");
		//SECOND LARGEST
//		int x=SecondLargest(a);
//		System.out.println(x+" "+a[x]);
		
		//REVERSED ORDER
		System.out.println();
//		Reversed(a);
//		for(int i:a)
//			System.out.print(i+" ");
		
		//REMOVE DUPES
//		int new_L=RemDupFrmSortedII(sorted);
//		for(int i=0;i<new_L;i++)
//			System.out.print(sorted[i]+" ");
//		MovZeroEnd(zeroes);
//		for(int i:zeroes)
//			System.out.print(i+" ");

	}
	public static int SecondLargest(int[] arr)
	{
		int res=0, first=0;
		for(int i=1;i<arr.length;i++)
		{
			
			if(arr[i]>arr[first])
			{
				res=first;
				first=i;
				
			}
			else 
				{
				if(arr[i]>arr[res])
					res=i;
				}
				
		}
		return res;
	}
	
	public static void Reversed(int[] arr)
	{
		int t,l=arr.length;
		for(int i=0;i<l/2;i++)
		{
			t=arr[i];
			arr[i]=arr[l-i-1];
			arr[l-i-1]=t;
		}
	}
	
	public static int RemDupFrmSorted(int[] arr)
	{
		int res=1, l=arr.length;
		for(int i=1;i<l;i++)
		{
			if(arr[i]!=arr[res-1])
			{
				arr[res]=arr[i];
				res++;
			}
				
		}
		return res;
	}
	
	public static int RemDupFrmSortedII(int[] arr)
	{
		//at Most 2 instances of sorted var
		int res=2, l=arr.length;
		for(int i=2;i<l;i++)
		{
			if(arr[i]!=arr[res-2])
			{
				arr[res]=arr[i];
				res++;
			}
				
		}
		return res;
	}
	
	public static void MovZeroEnd(int[] arr)
	{
		int counter=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				int t=arr[i];
				arr[i]=arr[counter];
				arr[counter]=t;
				counter++;
				
			}
		}
	}
	
	public void rotateByD(int[] nums, int key) {
        //O(n) time but O(k%l) space
		int l=nums.length;
        if(l==1)
            return;
        int k=key%l;
        int[] temp = new int[k];
        int c=0;
        for(int i=l-k;i<l;i++)
        {
            temp[c]=nums[i];
            c++;
        }
        int i=0;
        for(i=nums.length-1;i>=k;i--)
        {
            nums[i]=nums[i-k];
        }
        for(i=0;i<k;i++)
        {
            nums[i]=temp[i];
        }
    }

}
