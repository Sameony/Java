
public class GFGArrays {

	public static void main(String[] args) {
//		int marks[] = {83,88,90,73,64};
//		double nsum=0, sqsum=0;
//		for(int i=0;i<marks.length;i++)
//		{
//			nsum+=marks[i];
//			sqsum+=marks[i]*marks[i];
//		}
//		double avg=nsum/marks.length;
//		double stddeviation = Math.sqrt(sqsum/marks.length - avg*avg);
//		
//		System.out.println("Mean of marks : "+avg);
//		System.out.println("Standard deviation : "+stddeviation);
		
		
		int[] arr = {10,20,28,32,44,49,53,62,81,94,99};
		int k=binSearch(arr,0,arr.length-1,94);
		if(k==-1)
			System.out.println("Not found");
		else
			System.out.println("Found at index "+k);

	}
	static int binSearch(int[] arr, int l, int r, int key)
	{
		if(l<=r)
		{
			int mid=l+(r-l)/2;
			if(arr[mid]==key)
				return mid;
			else if(arr[mid]<key)
				return binSearch(arr, mid+1,r,key);
			else
				return binSearch(arr,l,mid-1,key);
		}
		
		return -1;
	}

}
