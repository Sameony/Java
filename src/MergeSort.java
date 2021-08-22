
public class MergeSort {

	public static void main(String[] args) {
		int[] ar= {2,5,1,6,9,35,9,42,19,16,34,28,21,40};
		for(int i:ar)
			System.out.print(i+" ");
		System.out.println();
		sort(ar,0,ar.length-1);
		for(int i:ar)
			System.out.print(i+" ");

	}
	
	static void sort(int[] arr, int l, int r)
	{
		if(l<r)
		{
			int mid=l+(r-l)/2;
			sort(arr,l,mid);
			sort(arr,mid+1,r);
			mergeit(arr,l,mid,r);
		}
	}
	static void mergeit(int[] arr, int l, int mid, int r)
	{
		int left=mid-l+1;//size of left subarray
		int right = r-mid;//size of right subarray
		
		//temporary subarrays initialization
		int[] temp_left=new int[left];
		int[] temp_right=new int[right];
		
		for(int i=0;i<left;i++)
		{
			temp_left[i]=arr[l+i];
		}
		for(int i=0;i<right;i++)
		{
			temp_right[i]=arr[mid+i+1];
		}
		//merge the 2 subarrays
		int i=0,j=0,k=l;
		while(i<left && j<right)
		{
			if(temp_left[i]<temp_right[j])
			{
				arr[k]=temp_left[i];
				i++;
				k++;
			}
			else
			{
				arr[k]=temp_right[j];
				j++;
				k++;
			}
		}
		//copy over remaining items in subarrays, if any left
		while(i<left)
		{
			arr[k]=temp_left[i];
			i++;
			k++;
		}
		while(j<right)
		{
			arr[k]=temp_right[j];
			j++;
			k++;
		}
	}

}
