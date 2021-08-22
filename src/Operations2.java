
public class Operations2 {

	public static void main(String[] args) {
		//		MAXIMUM DIFFERENCE
//int a[] = {8,2,5,19,11,13,2,8,17,5,1,14,28};
//		int x=MaxDiff(a);
//		System.out.println(x);
	}
	public static int MaxDiff(int[] arr)
	{
		int min=arr[0],max=arr[1];
		int res=max-min;
		for(int i=1;i<arr.length;i++)
		{
			if(res<(arr[i]-min))
			{
				res=arr[i]-min;
			}
			if(min>arr[i])
				min=arr[i];
		}
		return res;
	}
}
