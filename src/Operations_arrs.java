
public class Operations_arrs {

	public static void main(String[] args) {
		int a[] = {8,2,5,1,19,13,2,8,17,5,11,14};
		int x=SecondLargest(a);
		System.out.println(x+" "+a[x]);
		

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

}
